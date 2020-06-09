package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.BadRequest;
import org.openapitools.client.model.ErrorLimited;
import org.openapitools.client.model.Forbidden;
import org.openapitools.client.model.GatewayTimeout;
import org.openapitools.client.model.GetCharactersCharacterIdFwStatsOk;
import org.openapitools.client.model.GetCorporationsCorporationIdFwStatsOk;
import org.openapitools.client.model.GetFwLeaderboardsCharactersOk;
import org.openapitools.client.model.GetFwLeaderboardsCorporationsOk;
import org.openapitools.client.model.GetFwLeaderboardsOk;
import org.openapitools.client.model.GetFwStats200Ok;
import org.openapitools.client.model.GetFwSystems200Ok;
import org.openapitools.client.model.GetFwWars200Ok;
import org.openapitools.client.model.InternalServerError;
import org.openapitools.client.model.ServiceUnavailable;
import org.openapitools.client.model.Unauthorized;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-06-04T13:00:04.672Z[Etc/UTC]")
public class FactionWarfareApi {
    private ApiClient apiClient;

    public FactionWarfareApi() {
        this(new ApiClient());
    }

    @Autowired
    public FactionWarfareApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Overview of a character involved in faction warfare
     * Statistical overview of a character involved in faction warfare  --- Alternate route: &#x60;/dev/characters/{character_id}/fw/stats/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/fw/stats/&#x60;  Alternate route: &#x60;/v1/characters/{character_id}/fw/stats/&#x60;  Alternate route: &#x60;/v2/characters/{character_id}/fw/stats/&#x60;  --- This route expires daily at 11:05
     * <p><b>200</b> - Faction warfare statistics for a given character
     * <p><b>304</b> - Not modified
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param token Access token to use if unable to set a header
     * @return GetCharactersCharacterIdFwStatsOk
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<GetCharactersCharacterIdFwStatsOk> getCharactersCharacterIdFwStats(Integer characterId, String datasource, String ifNoneMatch, String token) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'characterId' when calling getCharactersCharacterIdFwStats");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("character_id", characterId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "datasource", datasource));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "token", token));

        if (ifNoneMatch != null)
        headerParams.add("If-None-Match", apiClient.parameterToString(ifNoneMatch));
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "evesso" };

        ParameterizedTypeReference<GetCharactersCharacterIdFwStatsOk> localVarReturnType = new ParameterizedTypeReference<GetCharactersCharacterIdFwStatsOk>() {};
        return apiClient.invokeAPI("/characters/{character_id}/fw/stats/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Overview of a corporation involved in faction warfare
     * Statistics about a corporation involved in faction warfare  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/fw/stats/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/fw/stats/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/fw/stats/&#x60;  Alternate route: &#x60;/v2/corporations/{corporation_id}/fw/stats/&#x60;  --- This route expires daily at 11:05
     * <p><b>200</b> - Faction warfare statistics for a given corporation
     * <p><b>304</b> - Not modified
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param corporationId An EVE corporation ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param token Access token to use if unable to set a header
     * @return GetCorporationsCorporationIdFwStatsOk
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<GetCorporationsCorporationIdFwStatsOk> getCorporationsCorporationIdFwStats(Integer corporationId, String datasource, String ifNoneMatch, String token) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'corporationId' is set
        if (corporationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'corporationId' when calling getCorporationsCorporationIdFwStats");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("corporation_id", corporationId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "datasource", datasource));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "token", token));

        if (ifNoneMatch != null)
        headerParams.add("If-None-Match", apiClient.parameterToString(ifNoneMatch));
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "evesso" };

        ParameterizedTypeReference<GetCorporationsCorporationIdFwStatsOk> localVarReturnType = new ParameterizedTypeReference<GetCorporationsCorporationIdFwStatsOk>() {};
        return apiClient.invokeAPI("/corporations/{corporation_id}/fw/stats/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * List of the top factions in faction warfare
     * Top 4 leaderboard of factions for kills and victory points separated by total, last week and yesterday  --- Alternate route: &#x60;/dev/fw/leaderboards/&#x60;  Alternate route: &#x60;/legacy/fw/leaderboards/&#x60;  Alternate route: &#x60;/v1/fw/leaderboards/&#x60;  Alternate route: &#x60;/v2/fw/leaderboards/&#x60;  --- This route expires daily at 11:05
     * <p><b>200</b> - Corporation leaderboard of kills and victory points within faction warfare
     * <p><b>304</b> - Not modified
     * <p><b>400</b> - Bad request
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return GetFwLeaderboardsOk
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<GetFwLeaderboardsOk> getFwLeaderboards(String datasource, String ifNoneMatch) throws RestClientException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "datasource", datasource));

        if (ifNoneMatch != null)
        headerParams.add("If-None-Match", apiClient.parameterToString(ifNoneMatch));
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GetFwLeaderboardsOk> localVarReturnType = new ParameterizedTypeReference<GetFwLeaderboardsOk>() {};
        return apiClient.invokeAPI("/fw/leaderboards/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * List of the top pilots in faction warfare
     * Top 100 leaderboard of pilots for kills and victory points separated by total, last week and yesterday  --- Alternate route: &#x60;/dev/fw/leaderboards/characters/&#x60;  Alternate route: &#x60;/legacy/fw/leaderboards/characters/&#x60;  Alternate route: &#x60;/v1/fw/leaderboards/characters/&#x60;  Alternate route: &#x60;/v2/fw/leaderboards/characters/&#x60;  --- This route expires daily at 11:05
     * <p><b>200</b> - Character leaderboard of kills and victory points within faction warfare
     * <p><b>304</b> - Not modified
     * <p><b>400</b> - Bad request
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return GetFwLeaderboardsCharactersOk
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<GetFwLeaderboardsCharactersOk> getFwLeaderboardsCharacters(String datasource, String ifNoneMatch) throws RestClientException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "datasource", datasource));

        if (ifNoneMatch != null)
        headerParams.add("If-None-Match", apiClient.parameterToString(ifNoneMatch));
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GetFwLeaderboardsCharactersOk> localVarReturnType = new ParameterizedTypeReference<GetFwLeaderboardsCharactersOk>() {};
        return apiClient.invokeAPI("/fw/leaderboards/characters/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * List of the top corporations in faction warfare
     * Top 10 leaderboard of corporations for kills and victory points separated by total, last week and yesterday  --- Alternate route: &#x60;/dev/fw/leaderboards/corporations/&#x60;  Alternate route: &#x60;/legacy/fw/leaderboards/corporations/&#x60;  Alternate route: &#x60;/v1/fw/leaderboards/corporations/&#x60;  Alternate route: &#x60;/v2/fw/leaderboards/corporations/&#x60;  --- This route expires daily at 11:05
     * <p><b>200</b> - Corporation leaderboard of kills and victory points within faction warfare
     * <p><b>304</b> - Not modified
     * <p><b>400</b> - Bad request
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return GetFwLeaderboardsCorporationsOk
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<GetFwLeaderboardsCorporationsOk> getFwLeaderboardsCorporations(String datasource, String ifNoneMatch) throws RestClientException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "datasource", datasource));

        if (ifNoneMatch != null)
        headerParams.add("If-None-Match", apiClient.parameterToString(ifNoneMatch));
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GetFwLeaderboardsCorporationsOk> localVarReturnType = new ParameterizedTypeReference<GetFwLeaderboardsCorporationsOk>() {};
        return apiClient.invokeAPI("/fw/leaderboards/corporations/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * An overview of statistics about factions involved in faction warfare
     * Statistical overviews of factions involved in faction warfare  --- Alternate route: &#x60;/dev/fw/stats/&#x60;  Alternate route: &#x60;/legacy/fw/stats/&#x60;  Alternate route: &#x60;/v1/fw/stats/&#x60;  Alternate route: &#x60;/v2/fw/stats/&#x60;  --- This route expires daily at 11:05
     * <p><b>200</b> - Per faction breakdown of faction warfare statistics
     * <p><b>304</b> - Not modified
     * <p><b>400</b> - Bad request
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return List&lt;GetFwStats200Ok&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<GetFwStats200Ok> getFwStats(String datasource, String ifNoneMatch) throws RestClientException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "datasource", datasource));

        if (ifNoneMatch != null)
        headerParams.add("If-None-Match", apiClient.parameterToString(ifNoneMatch));
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GetFwStats200Ok> localVarReturnType = new ParameterizedTypeReference<GetFwStats200Ok>() {};
        return apiClient.invokeFluxAPI("/fw/stats/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Ownership of faction warfare systems
     * An overview of the current ownership of faction warfare solar systems  --- Alternate route: &#x60;/dev/fw/systems/&#x60;  Alternate route: &#x60;/legacy/fw/systems/&#x60;  Alternate route: &#x60;/v2/fw/systems/&#x60;  Alternate route: &#x60;/v3/fw/systems/&#x60;  --- This route is cached for up to 1800 seconds
     * <p><b>200</b> - All faction warfare solar systems
     * <p><b>304</b> - Not modified
     * <p><b>400</b> - Bad request
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return List&lt;GetFwSystems200Ok&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<GetFwSystems200Ok> getFwSystems(String datasource, String ifNoneMatch) throws RestClientException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "datasource", datasource));

        if (ifNoneMatch != null)
        headerParams.add("If-None-Match", apiClient.parameterToString(ifNoneMatch));
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GetFwSystems200Ok> localVarReturnType = new ParameterizedTypeReference<GetFwSystems200Ok>() {};
        return apiClient.invokeFluxAPI("/fw/systems/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Data about which NPC factions are at war
     * Data about which NPC factions are at war  --- Alternate route: &#x60;/dev/fw/wars/&#x60;  Alternate route: &#x60;/legacy/fw/wars/&#x60;  Alternate route: &#x60;/v1/fw/wars/&#x60;  Alternate route: &#x60;/v2/fw/wars/&#x60;  --- This route expires daily at 11:05
     * <p><b>200</b> - A list of NPC factions at war
     * <p><b>304</b> - Not modified
     * <p><b>400</b> - Bad request
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return List&lt;GetFwWars200Ok&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<GetFwWars200Ok> getFwWars(String datasource, String ifNoneMatch) throws RestClientException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "datasource", datasource));

        if (ifNoneMatch != null)
        headerParams.add("If-None-Match", apiClient.parameterToString(ifNoneMatch));
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GetFwWars200Ok> localVarReturnType = new ParameterizedTypeReference<GetFwWars200Ok>() {};
        return apiClient.invokeFluxAPI("/fw/wars/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
