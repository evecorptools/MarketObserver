package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.BadRequest;
import org.openapitools.client.model.ErrorLimited;
import org.openapitools.client.model.Forbidden;
import org.openapitools.client.model.GatewayTimeout;
import org.openapitools.client.model.GetCharactersCharacterIdKillmailsRecent200Ok;
import org.openapitools.client.model.GetCorporationsCorporationIdKillmailsRecent200Ok;
import org.openapitools.client.model.GetKillmailsKillmailIdKillmailHashOk;
import org.openapitools.client.model.GetKillmailsKillmailIdKillmailHashUnprocessableEntity;
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
public class KillmailsApi {
    private ApiClient apiClient;

    public KillmailsApi() {
        this(new ApiClient());
    }

    @Autowired
    public KillmailsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get a character&#39;s recent kills and losses
     * Return a list of a character&#39;s kills and losses going back 90 days  --- Alternate route: &#x60;/dev/characters/{character_id}/killmails/recent/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/killmails/recent/&#x60;  Alternate route: &#x60;/v1/characters/{character_id}/killmails/recent/&#x60;  --- This route is cached for up to 300 seconds
     * <p><b>200</b> - A list of killmail IDs and hashes
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
     * @param page Which page of results to return
     * @param token Access token to use if unable to set a header
     * @return List&lt;GetCharactersCharacterIdKillmailsRecent200Ok&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<GetCharactersCharacterIdKillmailsRecent200Ok> getCharactersCharacterIdKillmailsRecent(Integer characterId, String datasource, String ifNoneMatch, Integer page, String token) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'characterId' when calling getCharactersCharacterIdKillmailsRecent");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("character_id", characterId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "datasource", datasource));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
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

        ParameterizedTypeReference<GetCharactersCharacterIdKillmailsRecent200Ok> localVarReturnType = new ParameterizedTypeReference<GetCharactersCharacterIdKillmailsRecent200Ok>() {};
        return apiClient.invokeFluxAPI("/characters/{character_id}/killmails/recent/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get a corporation&#39;s recent kills and losses
     * Get a list of a corporation&#39;s kills and losses going back 90 days  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/killmails/recent/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/killmails/recent/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/killmails/recent/&#x60;  --- This route is cached for up to 300 seconds  --- Requires one of the following EVE corporation role(s): Director 
     * <p><b>200</b> - A list of killmail IDs and hashes
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
     * @param page Which page of results to return
     * @param token Access token to use if unable to set a header
     * @return List&lt;GetCorporationsCorporationIdKillmailsRecent200Ok&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<GetCorporationsCorporationIdKillmailsRecent200Ok> getCorporationsCorporationIdKillmailsRecent(Integer corporationId, String datasource, String ifNoneMatch, Integer page, String token) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'corporationId' is set
        if (corporationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'corporationId' when calling getCorporationsCorporationIdKillmailsRecent");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("corporation_id", corporationId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "datasource", datasource));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
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

        ParameterizedTypeReference<GetCorporationsCorporationIdKillmailsRecent200Ok> localVarReturnType = new ParameterizedTypeReference<GetCorporationsCorporationIdKillmailsRecent200Ok>() {};
        return apiClient.invokeFluxAPI("/corporations/{corporation_id}/killmails/recent/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get a single killmail
     * Return a single killmail from its ID and hash  --- Alternate route: &#x60;/dev/killmails/{killmail_id}/{killmail_hash}/&#x60;  Alternate route: &#x60;/legacy/killmails/{killmail_id}/{killmail_hash}/&#x60;  Alternate route: &#x60;/v1/killmails/{killmail_id}/{killmail_hash}/&#x60;  --- This route is cached for up to 30758400 seconds
     * <p><b>200</b> - A killmail
     * <p><b>304</b> - Not modified
     * <p><b>400</b> - Bad request
     * <p><b>420</b> - Error limited
     * <p><b>422</b> - Invalid killmail_id and/or killmail_hash
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param killmailHash The killmail hash for verification
     * @param killmailId The killmail ID to be queried
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return GetKillmailsKillmailIdKillmailHashOk
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<GetKillmailsKillmailIdKillmailHashOk> getKillmailsKillmailIdKillmailHash(String killmailHash, Integer killmailId, String datasource, String ifNoneMatch) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'killmailHash' is set
        if (killmailHash == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'killmailHash' when calling getKillmailsKillmailIdKillmailHash");
        }
        // verify the required parameter 'killmailId' is set
        if (killmailId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'killmailId' when calling getKillmailsKillmailIdKillmailHash");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("killmail_hash", killmailHash);
        pathParams.put("killmail_id", killmailId);

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

        ParameterizedTypeReference<GetKillmailsKillmailIdKillmailHashOk> localVarReturnType = new ParameterizedTypeReference<GetKillmailsKillmailIdKillmailHashOk>() {};
        return apiClient.invokeAPI("/killmails/{killmail_id}/{killmail_hash}/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
