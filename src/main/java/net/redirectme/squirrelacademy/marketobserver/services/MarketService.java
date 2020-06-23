package net.redirectme.squirrelacademy.marketobserver.services;

import org.openapitools.client.api.MarketApi;
import org.openapitools.client.model.GetMarketsStructuresStructureId200Ok;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarketService {
    @Value("${esidatasource}")
    String esidatasource; // ="tranquility";

    @Autowired
    MarketApi marketApi;

    //TODO: Get marketData via provided Library with working WebCient
    public List<GetMarketsStructuresStructureId200Ok> getData(long structureId) {
        return marketApi.getMarketsStructuresStructureId(structureId, esidatasource, null, 1, null)
            .collectList().block();
    }

}
