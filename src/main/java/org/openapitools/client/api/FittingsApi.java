package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.BadRequest;
import org.openapitools.client.model.ErrorLimited;
import org.openapitools.client.model.Forbidden;
import org.openapitools.client.model.GatewayTimeout;
import org.openapitools.client.model.GetCharactersCharacterIdFittings200Ok;
import org.openapitools.client.model.InternalServerError;
import org.openapitools.client.model.PostCharactersCharacterIdFittingsCreated;
import org.openapitools.client.model.PostCharactersCharacterIdFittingsFitting;
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
public class FittingsApi {
    private ApiClient apiClient;

    public FittingsApi() {
        this(new ApiClient());
    }

    @Autowired
    public FittingsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Delete fitting
     * Delete a fitting from a character  --- Alternate route: &#x60;/dev/characters/{character_id}/fittings/{fitting_id}/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/fittings/{fitting_id}/&#x60;  Alternate route: &#x60;/v1/characters/{character_id}/fittings/{fitting_id}/&#x60; 
     * <p><b>204</b> - Fitting deleted
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param characterId An EVE character ID
     * @param fittingId ID for a fitting of this character
     * @param datasource The server name you would like data from
     * @param token Access token to use if unable to set a header
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> deleteCharactersCharacterIdFittingsFittingId(Integer characterId, Integer fittingId, String datasource, String token) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'characterId' when calling deleteCharactersCharacterIdFittingsFittingId");
        }
        // verify the required parameter 'fittingId' is set
        if (fittingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fittingId' when calling deleteCharactersCharacterIdFittingsFittingId");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("character_id", characterId);
        pathParams.put("fitting_id", fittingId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "datasource", datasource));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "token", token));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "evesso" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/characters/{character_id}/fittings/{fitting_id}/", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get fittings
     * Return fittings of a character  --- Alternate route: &#x60;/dev/characters/{character_id}/fittings/&#x60;  Alternate route: &#x60;/v2/characters/{character_id}/fittings/&#x60;  --- This route is cached for up to 300 seconds
     * <p><b>200</b> - A list of fittings
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
     * @return List&lt;GetCharactersCharacterIdFittings200Ok&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<GetCharactersCharacterIdFittings200Ok> getCharactersCharacterIdFittings(Integer characterId, String datasource, String ifNoneMatch, String token) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'characterId' when calling getCharactersCharacterIdFittings");
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

        ParameterizedTypeReference<GetCharactersCharacterIdFittings200Ok> localVarReturnType = new ParameterizedTypeReference<GetCharactersCharacterIdFittings200Ok>() {};
        return apiClient.invokeFluxAPI("/characters/{character_id}/fittings/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Create fitting
     * Save a new fitting for a character  --- Alternate route: &#x60;/dev/characters/{character_id}/fittings/&#x60;  Alternate route: &#x60;/v2/characters/{character_id}/fittings/&#x60; 
     * <p><b>201</b> - A list of fittings
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param characterId An EVE character ID
     * @param fitting The fitting parameter
     * @param datasource The server name you would like data from
     * @param token Access token to use if unable to set a header
     * @return PostCharactersCharacterIdFittingsCreated
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<PostCharactersCharacterIdFittingsCreated> postCharactersCharacterIdFittings(Integer characterId, PostCharactersCharacterIdFittingsFitting fitting, String datasource, String token) throws RestClientException {
        Object postBody = fitting;
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'characterId' when calling postCharactersCharacterIdFittings");
        }
        // verify the required parameter 'fitting' is set
        if (fitting == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fitting' when calling postCharactersCharacterIdFittings");
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

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "evesso" };

        ParameterizedTypeReference<PostCharactersCharacterIdFittingsCreated> localVarReturnType = new ParameterizedTypeReference<PostCharactersCharacterIdFittingsCreated>() {};
        return apiClient.invokeAPI("/characters/{character_id}/fittings/", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
