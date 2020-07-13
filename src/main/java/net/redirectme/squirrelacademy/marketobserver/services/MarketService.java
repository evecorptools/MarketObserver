package net.redirectme.squirrelacademy.marketobserver.services;

import net.redirectme.squirrelacademy.marketobserver.clients.MarketClient;
import net.redirectme.squirrelacademy.marketobserver.entities.MarketOrder;
import net.redirectme.squirrelacademy.marketobserver.repositories.MarketOrdersRepository;
import org.openapitools.client.model.GetMarketsStructuresStructureId200Ok;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MarketService {
    @Autowired
    MarketClient marketClient;

    @Autowired
    MarketOrdersRepository marketOrdersRepository;

    Logger logger = LoggerFactory.getLogger(this.getClass());

    //TODO: Get marketData via provided Library with working WebCient
    public List<GetMarketsStructuresStructureId200Ok> getData_firstPage(long structureId) {
        return marketClient.getMarketsStructuresStructureId(structureId, null, 1)
                .getBody();
    }

    public List<GetMarketsStructuresStructureId200Ok> getData(long structureId, int characterId) {
        List<GetMarketsStructuresStructureId200Ok> resultlist = new ArrayList<>();
        int page = 1;

        ResponseEntity<List<GetMarketsStructuresStructureId200Ok>> responseEntity = marketClient.getMarketsStructuresStructureId(structureId, null, page);
        if (responseEntity.getStatusCode()== HttpStatus.OK) {
            int pages = Integer.parseInt(responseEntity.getHeaders().get("X-Pages").get(0));
            resultlist.addAll(responseEntity.getBody());

            if (pages > 1) {
                for (page = 2; page<=pages; page++) {
                    ResponseEntity<List<GetMarketsStructuresStructureId200Ok>> responseEntity_page = marketClient.getMarketsStructuresStructureId(structureId, null, page);
                    resultlist.addAll(responseEntity_page.getBody());
                    System.out.print("Page: "+page+"\tSize:" +responseEntity.getBody().size()+"\n");
                }
            }

        }
        System.out.print("Size TOTAL:" +resultlist.size()+"\n");
        saveAll(resultlist, structureId, characterId);
        return resultlist;
    }

    private void saveAll(List<GetMarketsStructuresStructureId200Ok> orderlist,long  location_id , int character_id) {
        logger.info("Start delete");
        marketOrdersRepository.deleteByRequestlocationAndCharacterID(location_id, character_id);
        logger.info("Start creation list\t"+character_id);
        List<MarketOrder> resultlist = new ArrayList<>();

        orderlist.forEach(o -> resultlist.add(new MarketOrder(o, location_id, character_id)));
        logger.info("Start insert\t"+character_id);
        //orderlist.forEach(o -> resultlist.add(marketOrdersRepository.save(new MarketOrder(o, location_id, character_id))));
        marketOrdersRepository.saveAll(resultlist);
        logger.info("End insert\t"+character_id);
    }



}
