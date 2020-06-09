package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.BadRequest;
import org.openapitools.client.model.ErrorLimited;
import org.openapitools.client.model.GatewayTimeout;
import org.openapitools.client.model.GetAlliancesAllianceIdIconsNotFound;
import org.openapitools.client.model.GetAlliancesAllianceIdIconsOk;
import org.openapitools.client.model.GetAlliancesAllianceIdNotFound;
import org.openapitools.client.model.GetAlliancesAllianceIdOk;
import org.openapitools.client.model.InternalServerError;
import org.openapitools.client.model.ServiceUnavailable;

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
public class AllianceApi {
    private ApiClient apiClient;

    public AllianceApi() {
        this(new ApiClient());
    }

    @Autowired
    public AllianceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * List all alliances
     * List all active player alliances  --- Alternate route: &#x60;/dev/alliances/&#x60;  Alternate route: &#x60;/legacy/alliances/&#x60;  Alternate route: &#x60;/v1/alliances/&#x60;  Alternate route: &#x60;/v2/alliances/&#x60;  --- This route is cached for up to 3600 seconds
     * <p><b>200</b> - List of Alliance IDs
     * <p><b>304</b> - Not modified
     * <p><b>400</b> - Bad request
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return List&lt;Integer&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<Integer> getAlliances(String datasource, String ifNoneMatch) throws RestClientException {
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

        ParameterizedTypeReference<Integer> localVarReturnType = new ParameterizedTypeReference<Integer>() {};
        return apiClient.invokeFluxAPI("/alliances/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get alliance information
     * Public information about an alliance  --- Alternate route: &#x60;/dev/alliances/{alliance_id}/&#x60;  Alternate route: &#x60;/v3/alliances/{alliance_id}/&#x60;  --- This route is cached for up to 3600 seconds
     * <p><b>200</b> - Public data about an alliance
     * <p><b>304</b> - Not modified
     * <p><b>400</b> - Bad request
     * <p><b>404</b> - Alliance not found
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param allianceId An EVE alliance ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return GetAlliancesAllianceIdOk
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<GetAlliancesAllianceIdOk> getAlliancesAllianceId(Integer allianceId, String datasource, String ifNoneMatch) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'allianceId' is set
        if (allianceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'allianceId' when calling getAlliancesAllianceId");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("alliance_id", allianceId);

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

        ParameterizedTypeReference<GetAlliancesAllianceIdOk> localVarReturnType = new ParameterizedTypeReference<GetAlliancesAllianceIdOk>() {};
        return apiClient.invokeAPI("/alliances/{alliance_id}/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * List alliance&#39;s corporations
     * List all current member corporations of an alliance  --- Alternate route: &#x60;/dev/alliances/{alliance_id}/corporations/&#x60;  Alternate route: &#x60;/legacy/alliances/{alliance_id}/corporations/&#x60;  Alternate route: &#x60;/v1/alliances/{alliance_id}/corporations/&#x60;  Alternate route: &#x60;/v2/alliances/{alliance_id}/corporations/&#x60;  --- This route is cached for up to 3600 seconds
     * <p><b>200</b> - List of corporation IDs
     * <p><b>304</b> - Not modified
     * <p><b>400</b> - Bad request
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param allianceId An EVE alliance ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return List&lt;Integer&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<Integer> getAlliancesAllianceIdCorporations(Integer allianceId, String datasource, String ifNoneMatch) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'allianceId' is set
        if (allianceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'allianceId' when calling getAlliancesAllianceIdCorporations");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("alliance_id", allianceId);

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

        ParameterizedTypeReference<Integer> localVarReturnType = new ParameterizedTypeReference<Integer>() {};
        return apiClient.invokeFluxAPI("/alliances/{alliance_id}/corporations/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get alliance icon
     * Get the icon urls for a alliance  --- Alternate route: &#x60;/legacy/alliances/{alliance_id}/icons/&#x60;  Alternate route: &#x60;/v1/alliances/{alliance_id}/icons/&#x60;  --- This route expires daily at 11:05  --- [Diff of the upcoming changes](https://esi.evetech.net/diff/latest/dev/#GET-/alliances/{alliance_id}/icons/)
     * <p><b>200</b> - Icon URLs for the given alliance id and server
     * <p><b>304</b> - Not modified
     * <p><b>400</b> - Bad request
     * <p><b>404</b> - No image server for this datasource
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param allianceId An EVE alliance ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return GetAlliancesAllianceIdIconsOk
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<GetAlliancesAllianceIdIconsOk> getAlliancesAllianceIdIcons(Integer allianceId, String datasource, String ifNoneMatch) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'allianceId' is set
        if (allianceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'allianceId' when calling getAlliancesAllianceIdIcons");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("alliance_id", allianceId);

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

        ParameterizedTypeReference<GetAlliancesAllianceIdIconsOk> localVarReturnType = new ParameterizedTypeReference<GetAlliancesAllianceIdIconsOk>() {};
        return apiClient.invokeAPI("/alliances/{alliance_id}/icons/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
