package net.redirectme.squirrelacademy.marketobserver.services;

import org.openapitools.client.ApiException;
import org.openapitools.client.api.MarketApi;
import org.openapitools.client.model.GetMarketsStructuresStructureId200Ok;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class MarketService {
    @Value("${esidatasource}")
    String esidatasourceesidatasource; // ="tranquility";

    @Autowired
    MarketApi marketApi;

    //TODO: Get marketData via provided Library with working WebCient
    public List<GetMarketsStructuresStructureId200Ok> getData(long structureId) {
        try {
            return marketApi.getMarketsStructuresStructureId(structureId, esidatasource, null, 1, null);
        } catch (ApiException e) {
            // TODO create error handler
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

}
