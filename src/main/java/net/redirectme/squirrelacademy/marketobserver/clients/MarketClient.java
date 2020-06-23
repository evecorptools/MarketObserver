package net.redirectme.squirrelacademy.marketobserver.clients;

import org.openapitools.client.model.GetMarketsStructuresStructureId200Ok;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@Service
public class MarketClient {
    @Value("${esidatasource}")
    private String esiDataSource;
    private final CoreClient esidatasource;

    public MarketClient(CoreClient esidatasource) {
        this.esidatasource = esidatasource;
    }

    public ResponseEntity<List<GetMarketsStructuresStructureId200Ok>> getMarketsStructuresStructureId(
            Long structureId, String ifNoneMatch, Integer page) throws RestClientException {
        Map<String, Object> pathParams = Map.of("structure_id", structureId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        queryParams.put("datasource", Collections.singletonList(esiDataSource));
        queryParams.put("page", Collections.singletonList(""+page));

        if (ifNoneMatch != null) {
            headerParams.add("If-None-Match", "" + ifNoneMatch);
        }
        return esidatasource.performList(
                "/v1/markets/structures/{structure_id}/", HttpMethod.GET, pathParams, queryParams, null,
                new ParameterizedTypeReference<GetMarketsStructuresStructureId200Ok>() {}, true);
    }
}
