package net.redirectme.squirrelacademy.marketobserver.clients;

import org.openapitools.client.model.GetCharactersCharacterIdCorporationhistory200Ok;
import org.openapitools.client.model.GetCharactersCharacterIdOk;
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
    private final CoreClient coreClient;
    public CharacterClient(CoreClient coreClient) {
        this.coreClient = coreClient;
    }

    public ResponseEntity<List<GetCharactersCharacterIdCorporationhistory200Ok>> getCharactersCharacterIdCorporationhistory(
            Integer characterId, String ifNoneMatch) throws RestClientException {
        Map<String, Object> pathParams = Map.of("character_id", characterId);
        Map<String, String> headerParams = null;
        if (ifNoneMatch != null) {
            headerParams = Collections.singletonMap("If-None-Match", ifNoneMatch);
        }
        return coreClient.performList(
                "/v1/characters/{character_id}/corporationhistory/", HttpMethod.GET, pathParams, headerParams, defaultQueryParams(esiDataSource), null,
                new ParameterizedTypeReference<GetCharactersCharacterIdCorporationhistory200Ok>() {}, false);
    }

    public ResponseEntity<GetCharactersCharacterIdOk> getCharactersCharacterId(Integer characterId, String ifNoneMatch) throws RestClientException {
        Map<String, Object> pathParams = Map.of("character_id", characterId);
        Map<String, String> headerParams = null;
        if (ifNoneMatch != null) {
            headerParams = Collections.singletonMap("If-None-Match", ifNoneMatch);
        }
        return coreClient.perform("/v4/characters/{character_id}/", HttpMethod.GET, pathParams, headerParams,
                defaultQueryParams(esiDataSource), null, GetCharactersCharacterIdOk.class, true);
    }

    private static MultiValueMap<String, String> defaultQueryParams(String datasource) {
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.put("datasource", Collections.singletonList(datasource));
        return queryParams;
    }

}
