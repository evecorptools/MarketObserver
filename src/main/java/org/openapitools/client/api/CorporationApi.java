package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.BadRequest;
import org.openapitools.client.model.ErrorLimited;
import org.openapitools.client.model.Forbidden;
import org.openapitools.client.model.GatewayTimeout;
import org.openapitools.client.model.GetCorporationsCorporationIdAlliancehistory200Ok;
import org.openapitools.client.model.GetCorporationsCorporationIdBlueprints200Ok;
import org.openapitools.client.model.GetCorporationsCorporationIdContainersLogs200Ok;
import org.openapitools.client.model.GetCorporationsCorporationIdDivisionsOk;
import org.openapitools.client.model.GetCorporationsCorporationIdFacilities200Ok;
import org.openapitools.client.model.GetCorporationsCorporationIdIconsNotFound;
import org.openapitools.client.model.GetCorporationsCorporationIdIconsOk;
import org.openapitools.client.model.GetCorporationsCorporationIdMedals200Ok;
import org.openapitools.client.model.GetCorporationsCorporationIdMedalsIssued200Ok;
import org.openapitools.client.model.GetCorporationsCorporationIdMembersTitles200Ok;
import org.openapitools.client.model.GetCorporationsCorporationIdMembertracking200Ok;
import org.openapitools.client.model.GetCorporationsCorporationIdNotFound;
import org.openapitools.client.model.GetCorporationsCorporationIdOk;
import org.openapitools.client.model.GetCorporationsCorporationIdRoles200Ok;
import org.openapitools.client.model.GetCorporationsCorporationIdRolesHistory200Ok;
import org.openapitools.client.model.GetCorporationsCorporationIdShareholders200Ok;
import org.openapitools.client.model.GetCorporationsCorporationIdStandings200Ok;
import org.openapitools.client.model.GetCorporationsCorporationIdStarbases200Ok;
import org.openapitools.client.model.GetCorporationsCorporationIdStarbasesStarbaseIdOk;
import org.openapitools.client.model.GetCorporationsCorporationIdStructures200Ok;
import org.openapitools.client.model.GetCorporationsCorporationIdTitles200Ok;
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
public class CorporationApi {
    private ApiClient apiClient;

    public CorporationApi() {
        this(new ApiClient());
    }

    @Autowired
    public CorporationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get corporation information
     * Public information about a corporation  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/&#x60;  Alternate route: &#x60;/v4/corporations/{corporation_id}/&#x60;  --- This route is cached for up to 3600 seconds
     * <p><b>200</b> - Public information about a corporation
     * <p><b>304</b> - Not modified
     * <p><b>400</b> - Bad request
     * <p><b>404</b> - Corporation not found
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param corporationId An EVE corporation ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return GetCorporationsCorporationIdOk
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<GetCorporationsCorporationIdOk> getCorporationsCorporationId(Integer corporationId, String datasource, String ifNoneMatch) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'corporationId' is set
        if (corporationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'corporationId' when calling getCorporationsCorporationId");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("corporation_id", corporationId);

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

        ParameterizedTypeReference<GetCorporationsCorporationIdOk> localVarReturnType = new ParameterizedTypeReference<GetCorporationsCorporationIdOk>() {};
        return apiClient.invokeAPI("/corporations/{corporation_id}/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get alliance history
     * Get a list of all the alliances a corporation has been a member of  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/alliancehistory/&#x60;  Alternate route: &#x60;/v2/corporations/{corporation_id}/alliancehistory/&#x60;  --- This route is cached for up to 3600 seconds
     * <p><b>200</b> - Alliance history for the given corporation
     * <p><b>304</b> - Not modified
     * <p><b>400</b> - Bad request
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param corporationId An EVE corporation ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return List&lt;GetCorporationsCorporationIdAlliancehistory200Ok&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<GetCorporationsCorporationIdAlliancehistory200Ok> getCorporationsCorporationIdAlliancehistory(Integer corporationId, String datasource, String ifNoneMatch) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'corporationId' is set
        if (corporationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'corporationId' when calling getCorporationsCorporationIdAlliancehistory");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("corporation_id", corporationId);

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

        ParameterizedTypeReference<GetCorporationsCorporationIdAlliancehistory200Ok> localVarReturnType = new ParameterizedTypeReference<GetCorporationsCorporationIdAlliancehistory200Ok>() {};
        return apiClient.invokeFluxAPI("/corporations/{corporation_id}/alliancehistory/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get corporation blueprints
     * Returns a list of blueprints the corporation owns  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/blueprints/&#x60;  Alternate route: &#x60;/v2/corporations/{corporation_id}/blueprints/&#x60;  --- This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Director 
     * <p><b>200</b> - List of corporation blueprints
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
     * @return List&lt;GetCorporationsCorporationIdBlueprints200Ok&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<GetCorporationsCorporationIdBlueprints200Ok> getCorporationsCorporationIdBlueprints(Integer corporationId, String datasource, String ifNoneMatch, Integer page, String token) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'corporationId' is set
        if (corporationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'corporationId' when calling getCorporationsCorporationIdBlueprints");
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

        ParameterizedTypeReference<GetCorporationsCorporationIdBlueprints200Ok> localVarReturnType = new ParameterizedTypeReference<GetCorporationsCorporationIdBlueprints200Ok>() {};
        return apiClient.invokeFluxAPI("/corporations/{corporation_id}/blueprints/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get all corporation ALSC logs
     * Returns logs recorded in the past seven days from all audit log secure containers (ALSC) owned by a given corporation  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/containers/logs/&#x60;  Alternate route: &#x60;/v2/corporations/{corporation_id}/containers/logs/&#x60;  --- This route is cached for up to 600 seconds  --- Requires one of the following EVE corporation role(s): Director 
     * <p><b>200</b> - List of corporation ALSC logs
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
     * @return List&lt;GetCorporationsCorporationIdContainersLogs200Ok&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<GetCorporationsCorporationIdContainersLogs200Ok> getCorporationsCorporationIdContainersLogs(Integer corporationId, String datasource, String ifNoneMatch, Integer page, String token) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'corporationId' is set
        if (corporationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'corporationId' when calling getCorporationsCorporationIdContainersLogs");
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

        ParameterizedTypeReference<GetCorporationsCorporationIdContainersLogs200Ok> localVarReturnType = new ParameterizedTypeReference<GetCorporationsCorporationIdContainersLogs200Ok>() {};
        return apiClient.invokeFluxAPI("/corporations/{corporation_id}/containers/logs/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get corporation divisions
     * Return corporation hangar and wallet division names, only show if a division is not using the default name  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/divisions/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/divisions/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/divisions/&#x60;  --- This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Director 
     * <p><b>200</b> - List of corporation division names
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
     * @return GetCorporationsCorporationIdDivisionsOk
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<GetCorporationsCorporationIdDivisionsOk> getCorporationsCorporationIdDivisions(Integer corporationId, String datasource, String ifNoneMatch, String token) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'corporationId' is set
        if (corporationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'corporationId' when calling getCorporationsCorporationIdDivisions");
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

        ParameterizedTypeReference<GetCorporationsCorporationIdDivisionsOk> localVarReturnType = new ParameterizedTypeReference<GetCorporationsCorporationIdDivisionsOk>() {};
        return apiClient.invokeAPI("/corporations/{corporation_id}/divisions/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get corporation facilities
     * Return a corporation&#39;s facilities  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/facilities/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/facilities/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/facilities/&#x60;  --- This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Factory_Manager 
     * <p><b>200</b> - List of corporation facilities
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
     * @return List&lt;GetCorporationsCorporationIdFacilities200Ok&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<GetCorporationsCorporationIdFacilities200Ok> getCorporationsCorporationIdFacilities(Integer corporationId, String datasource, String ifNoneMatch, String token) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'corporationId' is set
        if (corporationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'corporationId' when calling getCorporationsCorporationIdFacilities");
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

        ParameterizedTypeReference<GetCorporationsCorporationIdFacilities200Ok> localVarReturnType = new ParameterizedTypeReference<GetCorporationsCorporationIdFacilities200Ok>() {};
        return apiClient.invokeFluxAPI("/corporations/{corporation_id}/facilities/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get corporation icon
     * Get the icon urls for a corporation  --- Alternate route: &#x60;/legacy/corporations/{corporation_id}/icons/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/icons/&#x60;  --- This route is cached for up to 3600 seconds  --- [Diff of the upcoming changes](https://esi.evetech.net/diff/latest/dev/#GET-/corporations/{corporation_id}/icons/)
     * <p><b>200</b> - Urls for icons for the given corporation id and server
     * <p><b>304</b> - Not modified
     * <p><b>400</b> - Bad request
     * <p><b>404</b> - No image server for this datasource
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param corporationId An EVE corporation ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return GetCorporationsCorporationIdIconsOk
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<GetCorporationsCorporationIdIconsOk> getCorporationsCorporationIdIcons(Integer corporationId, String datasource, String ifNoneMatch) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'corporationId' is set
        if (corporationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'corporationId' when calling getCorporationsCorporationIdIcons");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("corporation_id", corporationId);

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

        ParameterizedTypeReference<GetCorporationsCorporationIdIconsOk> localVarReturnType = new ParameterizedTypeReference<GetCorporationsCorporationIdIconsOk>() {};
        return apiClient.invokeAPI("/corporations/{corporation_id}/icons/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get corporation medals
     * Returns a corporation&#39;s medals  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/medals/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/medals/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/medals/&#x60;  --- This route is cached for up to 3600 seconds
     * <p><b>200</b> - A list of medals
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
     * @return List&lt;GetCorporationsCorporationIdMedals200Ok&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<GetCorporationsCorporationIdMedals200Ok> getCorporationsCorporationIdMedals(Integer corporationId, String datasource, String ifNoneMatch, Integer page, String token) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'corporationId' is set
        if (corporationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'corporationId' when calling getCorporationsCorporationIdMedals");
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

        ParameterizedTypeReference<GetCorporationsCorporationIdMedals200Ok> localVarReturnType = new ParameterizedTypeReference<GetCorporationsCorporationIdMedals200Ok>() {};
        return apiClient.invokeFluxAPI("/corporations/{corporation_id}/medals/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get corporation issued medals
     * Returns medals issued by a corporation  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/medals/issued/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/medals/issued/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/medals/issued/&#x60;  --- This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Director 
     * <p><b>200</b> - A list of issued medals
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
     * @return List&lt;GetCorporationsCorporationIdMedalsIssued200Ok&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<GetCorporationsCorporationIdMedalsIssued200Ok> getCorporationsCorporationIdMedalsIssued(Integer corporationId, String datasource, String ifNoneMatch, Integer page, String token) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'corporationId' is set
        if (corporationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'corporationId' when calling getCorporationsCorporationIdMedalsIssued");
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

        ParameterizedTypeReference<GetCorporationsCorporationIdMedalsIssued200Ok> localVarReturnType = new ParameterizedTypeReference<GetCorporationsCorporationIdMedalsIssued200Ok>() {};
        return apiClient.invokeFluxAPI("/corporations/{corporation_id}/medals/issued/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get corporation members
     * Return the current member list of a corporation, the token&#39;s character need to be a member of the corporation.  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/members/&#x60;  Alternate route: &#x60;/v3/corporations/{corporation_id}/members/&#x60;  --- This route is cached for up to 3600 seconds
     * <p><b>200</b> - List of member character IDs
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
     * @return List&lt;Integer&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<Integer> getCorporationsCorporationIdMembers(Integer corporationId, String datasource, String ifNoneMatch, String token) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'corporationId' is set
        if (corporationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'corporationId' when calling getCorporationsCorporationIdMembers");
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

        ParameterizedTypeReference<Integer> localVarReturnType = new ParameterizedTypeReference<Integer>() {};
        return apiClient.invokeFluxAPI("/corporations/{corporation_id}/members/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get corporation member limit
     * Return a corporation&#39;s member limit, not including CEO himself  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/members/limit/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/members/limit/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/members/limit/&#x60;  --- This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Director 
     * <p><b>200</b> - The corporation&#39;s member limit
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
     * @return Integer
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Integer> getCorporationsCorporationIdMembersLimit(Integer corporationId, String datasource, String ifNoneMatch, String token) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'corporationId' is set
        if (corporationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'corporationId' when calling getCorporationsCorporationIdMembersLimit");
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

        ParameterizedTypeReference<Integer> localVarReturnType = new ParameterizedTypeReference<Integer>() {};
        return apiClient.invokeAPI("/corporations/{corporation_id}/members/limit/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get corporation&#39;s members&#39; titles
     * Returns a corporation&#39;s members&#39; titles  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/members/titles/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/members/titles/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/members/titles/&#x60;  --- This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Director 
     * <p><b>200</b> - A list of members and theirs titles
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
     * @return List&lt;GetCorporationsCorporationIdMembersTitles200Ok&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<GetCorporationsCorporationIdMembersTitles200Ok> getCorporationsCorporationIdMembersTitles(Integer corporationId, String datasource, String ifNoneMatch, String token) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'corporationId' is set
        if (corporationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'corporationId' when calling getCorporationsCorporationIdMembersTitles");
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

        ParameterizedTypeReference<GetCorporationsCorporationIdMembersTitles200Ok> localVarReturnType = new ParameterizedTypeReference<GetCorporationsCorporationIdMembersTitles200Ok>() {};
        return apiClient.invokeFluxAPI("/corporations/{corporation_id}/members/titles/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Track corporation members
     * Returns additional information about a corporation&#39;s members which helps tracking their activities  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/membertracking/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/membertracking/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/membertracking/&#x60;  --- This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Director 
     * <p><b>200</b> - List of member character IDs
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
     * @return List&lt;GetCorporationsCorporationIdMembertracking200Ok&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<GetCorporationsCorporationIdMembertracking200Ok> getCorporationsCorporationIdMembertracking(Integer corporationId, String datasource, String ifNoneMatch, String token) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'corporationId' is set
        if (corporationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'corporationId' when calling getCorporationsCorporationIdMembertracking");
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

        ParameterizedTypeReference<GetCorporationsCorporationIdMembertracking200Ok> localVarReturnType = new ParameterizedTypeReference<GetCorporationsCorporationIdMembertracking200Ok>() {};
        return apiClient.invokeFluxAPI("/corporations/{corporation_id}/membertracking/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get corporation member roles
     * Return the roles of all members if the character has the personnel manager role or any grantable role.  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/roles/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/roles/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/roles/&#x60;  --- This route is cached for up to 3600 seconds
     * <p><b>200</b> - List of member character ID&#39;s and roles
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
     * @return List&lt;GetCorporationsCorporationIdRoles200Ok&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<GetCorporationsCorporationIdRoles200Ok> getCorporationsCorporationIdRoles(Integer corporationId, String datasource, String ifNoneMatch, String token) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'corporationId' is set
        if (corporationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'corporationId' when calling getCorporationsCorporationIdRoles");
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

        ParameterizedTypeReference<GetCorporationsCorporationIdRoles200Ok> localVarReturnType = new ParameterizedTypeReference<GetCorporationsCorporationIdRoles200Ok>() {};
        return apiClient.invokeFluxAPI("/corporations/{corporation_id}/roles/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get corporation member roles history
     * Return how roles have changed for a coporation&#39;s members, up to a month  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/roles/history/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/roles/history/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/roles/history/&#x60;  --- This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Director 
     * <p><b>200</b> - List of role changes
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
     * @return List&lt;GetCorporationsCorporationIdRolesHistory200Ok&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<GetCorporationsCorporationIdRolesHistory200Ok> getCorporationsCorporationIdRolesHistory(Integer corporationId, String datasource, String ifNoneMatch, Integer page, String token) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'corporationId' is set
        if (corporationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'corporationId' when calling getCorporationsCorporationIdRolesHistory");
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

        ParameterizedTypeReference<GetCorporationsCorporationIdRolesHistory200Ok> localVarReturnType = new ParameterizedTypeReference<GetCorporationsCorporationIdRolesHistory200Ok>() {};
        return apiClient.invokeFluxAPI("/corporations/{corporation_id}/roles/history/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get corporation shareholders
     * Return the current shareholders of a corporation.  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/shareholders/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/shareholders/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/shareholders/&#x60;  --- This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Director 
     * <p><b>200</b> - List of shareholders
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
     * @return List&lt;GetCorporationsCorporationIdShareholders200Ok&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<GetCorporationsCorporationIdShareholders200Ok> getCorporationsCorporationIdShareholders(Integer corporationId, String datasource, String ifNoneMatch, Integer page, String token) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'corporationId' is set
        if (corporationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'corporationId' when calling getCorporationsCorporationIdShareholders");
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

        ParameterizedTypeReference<GetCorporationsCorporationIdShareholders200Ok> localVarReturnType = new ParameterizedTypeReference<GetCorporationsCorporationIdShareholders200Ok>() {};
        return apiClient.invokeFluxAPI("/corporations/{corporation_id}/shareholders/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get corporation standings
     * Return corporation standings from agents, NPC corporations, and factions  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/standings/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/standings/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/standings/&#x60;  --- This route is cached for up to 3600 seconds
     * <p><b>200</b> - A list of standings
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
     * @return List&lt;GetCorporationsCorporationIdStandings200Ok&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<GetCorporationsCorporationIdStandings200Ok> getCorporationsCorporationIdStandings(Integer corporationId, String datasource, String ifNoneMatch, Integer page, String token) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'corporationId' is set
        if (corporationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'corporationId' when calling getCorporationsCorporationIdStandings");
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

        ParameterizedTypeReference<GetCorporationsCorporationIdStandings200Ok> localVarReturnType = new ParameterizedTypeReference<GetCorporationsCorporationIdStandings200Ok>() {};
        return apiClient.invokeFluxAPI("/corporations/{corporation_id}/standings/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get corporation starbases (POSes)
     * Returns list of corporation starbases (POSes)  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/starbases/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/starbases/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/starbases/&#x60;  --- This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Director 
     * <p><b>200</b> - List of starbases (POSes)
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
     * @return List&lt;GetCorporationsCorporationIdStarbases200Ok&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<GetCorporationsCorporationIdStarbases200Ok> getCorporationsCorporationIdStarbases(Integer corporationId, String datasource, String ifNoneMatch, Integer page, String token) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'corporationId' is set
        if (corporationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'corporationId' when calling getCorporationsCorporationIdStarbases");
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

        ParameterizedTypeReference<GetCorporationsCorporationIdStarbases200Ok> localVarReturnType = new ParameterizedTypeReference<GetCorporationsCorporationIdStarbases200Ok>() {};
        return apiClient.invokeFluxAPI("/corporations/{corporation_id}/starbases/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get starbase (POS) detail
     * Returns various settings and fuels of a starbase (POS)  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/starbases/{starbase_id}/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/starbases/{starbase_id}/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/starbases/{starbase_id}/&#x60;  --- This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Director 
     * <p><b>200</b> - List of starbases (POSes)
     * <p><b>304</b> - Not modified
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param corporationId An EVE corporation ID
     * @param starbaseId An EVE starbase (POS) ID
     * @param systemId The solar system this starbase (POS) is located in,
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param token Access token to use if unable to set a header
     * @return GetCorporationsCorporationIdStarbasesStarbaseIdOk
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<GetCorporationsCorporationIdStarbasesStarbaseIdOk> getCorporationsCorporationIdStarbasesStarbaseId(Integer corporationId, Long starbaseId, Integer systemId, String datasource, String ifNoneMatch, String token) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'corporationId' is set
        if (corporationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'corporationId' when calling getCorporationsCorporationIdStarbasesStarbaseId");
        }
        // verify the required parameter 'starbaseId' is set
        if (starbaseId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'starbaseId' when calling getCorporationsCorporationIdStarbasesStarbaseId");
        }
        // verify the required parameter 'systemId' is set
        if (systemId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'systemId' when calling getCorporationsCorporationIdStarbasesStarbaseId");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("corporation_id", corporationId);
        pathParams.put("starbase_id", starbaseId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "datasource", datasource));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "system_id", systemId));
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

        ParameterizedTypeReference<GetCorporationsCorporationIdStarbasesStarbaseIdOk> localVarReturnType = new ParameterizedTypeReference<GetCorporationsCorporationIdStarbasesStarbaseIdOk>() {};
        return apiClient.invokeAPI("/corporations/{corporation_id}/starbases/{starbase_id}/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get corporation structures
     * Get a list of corporation structures. This route&#39;s version includes the changes to structures detailed in this blog: https://www.eveonline.com/article/upwell-2.0-structures-changes-coming-on-february-13th  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/structures/&#x60;  Alternate route: &#x60;/v3/corporations/{corporation_id}/structures/&#x60;  --- This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Station_Manager 
     * <p><b>200</b> - List of corporation structures&#39; information
     * <p><b>304</b> - Not modified
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param corporationId An EVE corporation ID
     * @param acceptLanguage Language to use in the response
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param language Language to use in the response, takes precedence over Accept-Language
     * @param page Which page of results to return
     * @param token Access token to use if unable to set a header
     * @return List&lt;GetCorporationsCorporationIdStructures200Ok&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<GetCorporationsCorporationIdStructures200Ok> getCorporationsCorporationIdStructures(Integer corporationId, String acceptLanguage, String datasource, String ifNoneMatch, String language, Integer page, String token) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'corporationId' is set
        if (corporationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'corporationId' when calling getCorporationsCorporationIdStructures");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("corporation_id", corporationId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "datasource", datasource));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "language", language));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "token", token));

        if (acceptLanguage != null)
        headerParams.add("Accept-Language", apiClient.parameterToString(acceptLanguage));
        if (ifNoneMatch != null)
        headerParams.add("If-None-Match", apiClient.parameterToString(ifNoneMatch));
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "evesso" };

        ParameterizedTypeReference<GetCorporationsCorporationIdStructures200Ok> localVarReturnType = new ParameterizedTypeReference<GetCorporationsCorporationIdStructures200Ok>() {};
        return apiClient.invokeFluxAPI("/corporations/{corporation_id}/structures/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get corporation titles
     * Returns a corporation&#39;s titles  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/titles/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/titles/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/titles/&#x60;  --- This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Director 
     * <p><b>200</b> - A list of titles
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
     * @return List&lt;GetCorporationsCorporationIdTitles200Ok&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<GetCorporationsCorporationIdTitles200Ok> getCorporationsCorporationIdTitles(Integer corporationId, String datasource, String ifNoneMatch, String token) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'corporationId' is set
        if (corporationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'corporationId' when calling getCorporationsCorporationIdTitles");
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

        ParameterizedTypeReference<GetCorporationsCorporationIdTitles200Ok> localVarReturnType = new ParameterizedTypeReference<GetCorporationsCorporationIdTitles200Ok>() {};
        return apiClient.invokeFluxAPI("/corporations/{corporation_id}/titles/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get npc corporations
     * Get a list of npc corporations  --- Alternate route: &#x60;/dev/corporations/npccorps/&#x60;  Alternate route: &#x60;/legacy/corporations/npccorps/&#x60;  Alternate route: &#x60;/v1/corporations/npccorps/&#x60;  --- This route expires daily at 11:05
     * <p><b>200</b> - A list of npc corporation ids
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
    public Flux<Integer> getCorporationsNpccorps(String datasource, String ifNoneMatch) throws RestClientException {
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
        return apiClient.invokeFluxAPI("/corporations/npccorps/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
