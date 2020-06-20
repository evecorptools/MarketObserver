package net.redirectme.squirrelacademy.marketobserver.clients;

import org.openapitools.client.model.GetCharactersCharacterIdCorporationhistory200Ok;
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
public class CharacterClient {
    @Value("${esidatasource}")
    private String esiDataSource;
    private final CoreClient esidatasource;
    public CharacterClient(CoreClient esidatasource) {
        this.esidatasource = esidatasource;
    }

    public ResponseEntity<List<GetCharactersCharacterIdCorporationhistory200Ok>> getCharactersCharacterIdCorporationhistory(
            Integer characterId, String ifNoneMatch) throws RestClientException {
        Map<String, Object> pathParams = Map.of("character_id", characterId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        queryParams.put("datasource", Collections.singletonList(esiDataSource));

        if (ifNoneMatch != null) {
            headerParams.add("If-None-Match", "" + ifNoneMatch);
        }
        return esidatasource.performList(
                "/v1/characters/{character_id}/corporationhistory/", HttpMethod.GET, pathParams, queryParams, null,
                new ParameterizedTypeReference<GetCharactersCharacterIdCorporationhistory200Ok>() {}, false);
    }

}
