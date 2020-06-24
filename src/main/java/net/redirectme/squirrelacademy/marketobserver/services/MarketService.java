package net.redirectme.squirrelacademy.marketobserver.services;

import net.redirectme.squirrelacademy.marketobserver.clients.MarketClient;
import org.openapitools.client.model.GetMarketsStructuresStructureId200Ok;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarketService {
    @Autowired
    MarketClient marketClient;

    //TODO: Get marketData via provided Library with working WebCient
    public List<GetMarketsStructuresStructureId200Ok> getData(long structureId) {
        return marketClient.getMarketsStructuresStructureId(structureId, null, 1)
                .getBody();
    }

}
