package net.redirectme.squirrelacademy.market;

import org.openapitools.client.model.GetMarketsStructuresStructureId200Ok;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@PropertySource("classpath:eveesi.properties")
public class MarketApi_Functions {
    @Value("${esidatasource}")
    String esidatasource; // ="tranquility";

    //@Autowired MarketApi marketApi;

    //TODO: Get marketData via provided Library with working WebCient
    public List<GetMarketsStructuresStructureId200Ok> getData(long locationId) {
        return new ArrayList<>();
    }

}
