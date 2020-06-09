package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.BadRequest;
import org.openapitools.client.model.DeleteFleetsFleetIdMembersMemberIdNotFound;
import org.openapitools.client.model.DeleteFleetsFleetIdSquadsSquadIdNotFound;
import org.openapitools.client.model.DeleteFleetsFleetIdWingsWingIdNotFound;
import org.openapitools.client.model.ErrorLimited;
import org.openapitools.client.model.Forbidden;
import org.openapitools.client.model.GatewayTimeout;
import org.openapitools.client.model.GetCharactersCharacterIdFleetNotFound;
import org.openapitools.client.model.GetCharactersCharacterIdFleetOk;
import org.openapitools.client.model.GetFleetsFleetIdMembers200Ok;
import org.openapitools.client.model.GetFleetsFleetIdMembersNotFound;
import org.openapitools.client.model.GetFleetsFleetIdNotFound;
import org.openapitools.client.model.GetFleetsFleetIdOk;
import org.openapitools.client.model.GetFleetsFleetIdWings200Ok;
import org.openapitools.client.model.GetFleetsFleetIdWingsNotFound;
import org.openapitools.client.model.InternalServerError;
import org.openapitools.client.model.PostFleetsFleetIdMembersInvitation;
import org.openapitools.client.model.PostFleetsFleetIdMembersNotFound;
import org.openapitools.client.model.PostFleetsFleetIdMembersUnprocessableEntity;
import org.openapitools.client.model.PostFleetsFleetIdWingsCreated;
import org.openapitools.client.model.PostFleetsFleetIdWingsNotFound;
import org.openapitools.client.model.PostFleetsFleetIdWingsWingIdSquadsCreated;
import org.openapitools.client.model.PostFleetsFleetIdWingsWingIdSquadsNotFound;
import org.openapitools.client.model.PutFleetsFleetIdMembersMemberIdMovement;
import org.openapitools.client.model.PutFleetsFleetIdMembersMemberIdNotFound;
import org.openapitools.client.model.PutFleetsFleetIdMembersMemberIdUnprocessableEntity;
import org.openapitools.client.model.PutFleetsFleetIdNewSettings;
import org.openapitools.client.model.PutFleetsFleetIdNotFound;
import org.openapitools.client.model.PutFleetsFleetIdSquadsSquadIdNaming;
import org.openapitools.client.model.PutFleetsFleetIdSquadsSquadIdNotFound;
import org.openapitools.client.model.PutFleetsFleetIdWingsWingIdNaming;
import org.openapitools.client.model.PutFleetsFleetIdWingsWingIdNotFound;
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
public class FleetsApi {
    private ApiClient apiClient;

    public FleetsApi() {
        this(new ApiClient());
    }

    @Autowired
    public FleetsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Kick fleet member
     * Kick a fleet member  --- Alternate route: &#x60;/dev/fleets/{fleet_id}/members/{member_id}/&#x60;  Alternate route: &#x60;/legacy/fleets/{fleet_id}/members/{member_id}/&#x60;  Alternate route: &#x60;/v1/fleets/{fleet_id}/members/{member_id}/&#x60; 
     * <p><b>204</b> - Fleet member kicked
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - The fleet does not exist or you don&#39;t have access to it
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param fleetId ID for a fleet
     * @param memberId The character ID of a member in this fleet
     * @param datasource The server name you would like data from
     * @param token Access token to use if unable to set a header
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> deleteFleetsFleetIdMembersMemberId(Long fleetId, Integer memberId, String datasource, String token) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'fleetId' is set
        if (fleetId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fleetId' when calling deleteFleetsFleetIdMembersMemberId");
        }
        // verify the required parameter 'memberId' is set
        if (memberId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'memberId' when calling deleteFleetsFleetIdMembersMemberId");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("fleet_id", fleetId);
        pathParams.put("member_id", memberId);

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
        return apiClient.invokeAPI("/fleets/{fleet_id}/members/{member_id}/", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Delete fleet squad
     * Delete a fleet squad, only empty squads can be deleted  --- Alternate route: &#x60;/dev/fleets/{fleet_id}/squads/{squad_id}/&#x60;  Alternate route: &#x60;/legacy/fleets/{fleet_id}/squads/{squad_id}/&#x60;  Alternate route: &#x60;/v1/fleets/{fleet_id}/squads/{squad_id}/&#x60; 
     * <p><b>204</b> - Squad deleted
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - The fleet does not exist or you don&#39;t have access to it
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param fleetId ID for a fleet
     * @param squadId The squad to delete
     * @param datasource The server name you would like data from
     * @param token Access token to use if unable to set a header
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> deleteFleetsFleetIdSquadsSquadId(Long fleetId, Long squadId, String datasource, String token) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'fleetId' is set
        if (fleetId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fleetId' when calling deleteFleetsFleetIdSquadsSquadId");
        }
        // verify the required parameter 'squadId' is set
        if (squadId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'squadId' when calling deleteFleetsFleetIdSquadsSquadId");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("fleet_id", fleetId);
        pathParams.put("squad_id", squadId);

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
        return apiClient.invokeAPI("/fleets/{fleet_id}/squads/{squad_id}/", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Delete fleet wing
     * Delete a fleet wing, only empty wings can be deleted. The wing may contain squads, but the squads must be empty  --- Alternate route: &#x60;/dev/fleets/{fleet_id}/wings/{wing_id}/&#x60;  Alternate route: &#x60;/legacy/fleets/{fleet_id}/wings/{wing_id}/&#x60;  Alternate route: &#x60;/v1/fleets/{fleet_id}/wings/{wing_id}/&#x60; 
     * <p><b>204</b> - Wing deleted
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - The fleet does not exist or you don&#39;t have access to it
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param fleetId ID for a fleet
     * @param wingId The wing to delete
     * @param datasource The server name you would like data from
     * @param token Access token to use if unable to set a header
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> deleteFleetsFleetIdWingsWingId(Long fleetId, Long wingId, String datasource, String token) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'fleetId' is set
        if (fleetId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fleetId' when calling deleteFleetsFleetIdWingsWingId");
        }
        // verify the required parameter 'wingId' is set
        if (wingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'wingId' when calling deleteFleetsFleetIdWingsWingId");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("fleet_id", fleetId);
        pathParams.put("wing_id", wingId);

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
        return apiClient.invokeAPI("/fleets/{fleet_id}/wings/{wing_id}/", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get character fleet info
     * Return the fleet ID the character is in, if any.  --- Alternate route: &#x60;/legacy/characters/{character_id}/fleet/&#x60;  Alternate route: &#x60;/v1/characters/{character_id}/fleet/&#x60;  --- This route is cached for up to 60 seconds  --- Warning: This route has an upgrade available  --- [Diff of the upcoming changes](https://esi.evetech.net/diff/latest/dev/#GET-/characters/{character_id}/fleet/)
     * <p><b>200</b> - Details about the character&#39;s fleet
     * <p><b>304</b> - Not modified
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - The character is not in a fleet
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param characterId An EVE character ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param token Access token to use if unable to set a header
     * @return GetCharactersCharacterIdFleetOk
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<GetCharactersCharacterIdFleetOk> getCharactersCharacterIdFleet(Integer characterId, String datasource, String ifNoneMatch, String token) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'characterId' when calling getCharactersCharacterIdFleet");
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

        ParameterizedTypeReference<GetCharactersCharacterIdFleetOk> localVarReturnType = new ParameterizedTypeReference<GetCharactersCharacterIdFleetOk>() {};
        return apiClient.invokeAPI("/characters/{character_id}/fleet/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get fleet information
     * Return details about a fleet  --- Alternate route: &#x60;/dev/fleets/{fleet_id}/&#x60;  Alternate route: &#x60;/legacy/fleets/{fleet_id}/&#x60;  Alternate route: &#x60;/v1/fleets/{fleet_id}/&#x60;  --- This route is cached for up to 5 seconds
     * <p><b>200</b> - Details about a fleet
     * <p><b>304</b> - Not modified
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - The fleet does not exist or you don&#39;t have access to it
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param fleetId ID for a fleet
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param token Access token to use if unable to set a header
     * @return GetFleetsFleetIdOk
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<GetFleetsFleetIdOk> getFleetsFleetId(Long fleetId, String datasource, String ifNoneMatch, String token) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'fleetId' is set
        if (fleetId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fleetId' when calling getFleetsFleetId");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("fleet_id", fleetId);

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

        ParameterizedTypeReference<GetFleetsFleetIdOk> localVarReturnType = new ParameterizedTypeReference<GetFleetsFleetIdOk>() {};
        return apiClient.invokeAPI("/fleets/{fleet_id}/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get fleet members
     * Return information about fleet members  --- Alternate route: &#x60;/dev/fleets/{fleet_id}/members/&#x60;  Alternate route: &#x60;/legacy/fleets/{fleet_id}/members/&#x60;  Alternate route: &#x60;/v1/fleets/{fleet_id}/members/&#x60;  --- This route is cached for up to 5 seconds
     * <p><b>200</b> - A list of fleet members
     * <p><b>304</b> - Not modified
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - The fleet does not exist or you don&#39;t have access to it
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param fleetId ID for a fleet
     * @param acceptLanguage Language to use in the response
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param language Language to use in the response, takes precedence over Accept-Language
     * @param token Access token to use if unable to set a header
     * @return List&lt;GetFleetsFleetIdMembers200Ok&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<GetFleetsFleetIdMembers200Ok> getFleetsFleetIdMembers(Long fleetId, String acceptLanguage, String datasource, String ifNoneMatch, String language, String token) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'fleetId' is set
        if (fleetId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fleetId' when calling getFleetsFleetIdMembers");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("fleet_id", fleetId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "datasource", datasource));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "language", language));
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

        ParameterizedTypeReference<GetFleetsFleetIdMembers200Ok> localVarReturnType = new ParameterizedTypeReference<GetFleetsFleetIdMembers200Ok>() {};
        return apiClient.invokeFluxAPI("/fleets/{fleet_id}/members/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get fleet wings
     * Return information about wings in a fleet  --- Alternate route: &#x60;/dev/fleets/{fleet_id}/wings/&#x60;  Alternate route: &#x60;/legacy/fleets/{fleet_id}/wings/&#x60;  Alternate route: &#x60;/v1/fleets/{fleet_id}/wings/&#x60;  --- This route is cached for up to 5 seconds
     * <p><b>200</b> - A list of fleet wings
     * <p><b>304</b> - Not modified
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - The fleet does not exist or you don&#39;t have access to it
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param fleetId ID for a fleet
     * @param acceptLanguage Language to use in the response
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param language Language to use in the response, takes precedence over Accept-Language
     * @param token Access token to use if unable to set a header
     * @return List&lt;GetFleetsFleetIdWings200Ok&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<GetFleetsFleetIdWings200Ok> getFleetsFleetIdWings(Long fleetId, String acceptLanguage, String datasource, String ifNoneMatch, String language, String token) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'fleetId' is set
        if (fleetId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fleetId' when calling getFleetsFleetIdWings");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("fleet_id", fleetId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "datasource", datasource));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "language", language));
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

        ParameterizedTypeReference<GetFleetsFleetIdWings200Ok> localVarReturnType = new ParameterizedTypeReference<GetFleetsFleetIdWings200Ok>() {};
        return apiClient.invokeFluxAPI("/fleets/{fleet_id}/wings/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Create fleet invitation
     * Invite a character into the fleet. If a character has a CSPA charge set it is not possible to invite them to the fleet using ESI  --- Alternate route: &#x60;/dev/fleets/{fleet_id}/members/&#x60;  Alternate route: &#x60;/legacy/fleets/{fleet_id}/members/&#x60;  Alternate route: &#x60;/v1/fleets/{fleet_id}/members/&#x60; 
     * <p><b>204</b> - Fleet invitation sent
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - The fleet does not exist or you don&#39;t have access to it
     * <p><b>420</b> - Error limited
     * <p><b>422</b> - Errors in invitation
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param fleetId ID for a fleet
     * @param invitation The invitation parameter
     * @param datasource The server name you would like data from
     * @param token Access token to use if unable to set a header
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> postFleetsFleetIdMembers(Long fleetId, PostFleetsFleetIdMembersInvitation invitation, String datasource, String token) throws RestClientException {
        Object postBody = invitation;
        // verify the required parameter 'fleetId' is set
        if (fleetId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fleetId' when calling postFleetsFleetIdMembers");
        }
        // verify the required parameter 'invitation' is set
        if (invitation == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'invitation' when calling postFleetsFleetIdMembers");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("fleet_id", fleetId);

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

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/fleets/{fleet_id}/members/", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Create fleet wing
     * Create a new wing in a fleet  --- Alternate route: &#x60;/dev/fleets/{fleet_id}/wings/&#x60;  Alternate route: &#x60;/legacy/fleets/{fleet_id}/wings/&#x60;  Alternate route: &#x60;/v1/fleets/{fleet_id}/wings/&#x60; 
     * <p><b>201</b> - Wing created
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - The fleet does not exist or you don&#39;t have access to it
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param fleetId ID for a fleet
     * @param datasource The server name you would like data from
     * @param token Access token to use if unable to set a header
     * @return PostFleetsFleetIdWingsCreated
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<PostFleetsFleetIdWingsCreated> postFleetsFleetIdWings(Long fleetId, String datasource, String token) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'fleetId' is set
        if (fleetId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fleetId' when calling postFleetsFleetIdWings");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("fleet_id", fleetId);

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

        ParameterizedTypeReference<PostFleetsFleetIdWingsCreated> localVarReturnType = new ParameterizedTypeReference<PostFleetsFleetIdWingsCreated>() {};
        return apiClient.invokeAPI("/fleets/{fleet_id}/wings/", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Create fleet squad
     * Create a new squad in a fleet  --- Alternate route: &#x60;/dev/fleets/{fleet_id}/wings/{wing_id}/squads/&#x60;  Alternate route: &#x60;/legacy/fleets/{fleet_id}/wings/{wing_id}/squads/&#x60;  Alternate route: &#x60;/v1/fleets/{fleet_id}/wings/{wing_id}/squads/&#x60; 
     * <p><b>201</b> - Squad created
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - The fleet does not exist or you don&#39;t have access to it
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param fleetId ID for a fleet
     * @param wingId The wing_id to create squad in
     * @param datasource The server name you would like data from
     * @param token Access token to use if unable to set a header
     * @return PostFleetsFleetIdWingsWingIdSquadsCreated
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<PostFleetsFleetIdWingsWingIdSquadsCreated> postFleetsFleetIdWingsWingIdSquads(Long fleetId, Long wingId, String datasource, String token) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'fleetId' is set
        if (fleetId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fleetId' when calling postFleetsFleetIdWingsWingIdSquads");
        }
        // verify the required parameter 'wingId' is set
        if (wingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'wingId' when calling postFleetsFleetIdWingsWingIdSquads");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("fleet_id", fleetId);
        pathParams.put("wing_id", wingId);

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

        ParameterizedTypeReference<PostFleetsFleetIdWingsWingIdSquadsCreated> localVarReturnType = new ParameterizedTypeReference<PostFleetsFleetIdWingsWingIdSquadsCreated>() {};
        return apiClient.invokeAPI("/fleets/{fleet_id}/wings/{wing_id}/squads/", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Update fleet
     * Update settings about a fleet  --- Alternate route: &#x60;/dev/fleets/{fleet_id}/&#x60;  Alternate route: &#x60;/legacy/fleets/{fleet_id}/&#x60;  Alternate route: &#x60;/v1/fleets/{fleet_id}/&#x60; 
     * <p><b>204</b> - Fleet updated
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - The fleet does not exist or you don&#39;t have access to it
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param fleetId ID for a fleet
     * @param newSettings The newSettings parameter
     * @param datasource The server name you would like data from
     * @param token Access token to use if unable to set a header
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> putFleetsFleetId(Long fleetId, PutFleetsFleetIdNewSettings newSettings, String datasource, String token) throws RestClientException {
        Object postBody = newSettings;
        // verify the required parameter 'fleetId' is set
        if (fleetId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fleetId' when calling putFleetsFleetId");
        }
        // verify the required parameter 'newSettings' is set
        if (newSettings == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'newSettings' when calling putFleetsFleetId");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("fleet_id", fleetId);

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

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/fleets/{fleet_id}/", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Move fleet member
     * Move a fleet member around  --- Alternate route: &#x60;/dev/fleets/{fleet_id}/members/{member_id}/&#x60;  Alternate route: &#x60;/legacy/fleets/{fleet_id}/members/{member_id}/&#x60;  Alternate route: &#x60;/v1/fleets/{fleet_id}/members/{member_id}/&#x60; 
     * <p><b>204</b> - Fleet invitation sent
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - The fleet does not exist or you don&#39;t have access to it
     * <p><b>420</b> - Error limited
     * <p><b>422</b> - Errors in invitation
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param fleetId ID for a fleet
     * @param memberId The character ID of a member in this fleet
     * @param movement The movement parameter
     * @param datasource The server name you would like data from
     * @param token Access token to use if unable to set a header
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> putFleetsFleetIdMembersMemberId(Long fleetId, Integer memberId, PutFleetsFleetIdMembersMemberIdMovement movement, String datasource, String token) throws RestClientException {
        Object postBody = movement;
        // verify the required parameter 'fleetId' is set
        if (fleetId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fleetId' when calling putFleetsFleetIdMembersMemberId");
        }
        // verify the required parameter 'memberId' is set
        if (memberId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'memberId' when calling putFleetsFleetIdMembersMemberId");
        }
        // verify the required parameter 'movement' is set
        if (movement == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'movement' when calling putFleetsFleetIdMembersMemberId");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("fleet_id", fleetId);
        pathParams.put("member_id", memberId);

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

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/fleets/{fleet_id}/members/{member_id}/", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Rename fleet squad
     * Rename a fleet squad  --- Alternate route: &#x60;/dev/fleets/{fleet_id}/squads/{squad_id}/&#x60;  Alternate route: &#x60;/legacy/fleets/{fleet_id}/squads/{squad_id}/&#x60;  Alternate route: &#x60;/v1/fleets/{fleet_id}/squads/{squad_id}/&#x60; 
     * <p><b>204</b> - Squad renamed
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - The fleet does not exist or you don&#39;t have access to it
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param fleetId ID for a fleet
     * @param squadId The squad to rename
     * @param naming The naming parameter
     * @param datasource The server name you would like data from
     * @param token Access token to use if unable to set a header
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> putFleetsFleetIdSquadsSquadId(Long fleetId, Long squadId, PutFleetsFleetIdSquadsSquadIdNaming naming, String datasource, String token) throws RestClientException {
        Object postBody = naming;
        // verify the required parameter 'fleetId' is set
        if (fleetId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fleetId' when calling putFleetsFleetIdSquadsSquadId");
        }
        // verify the required parameter 'squadId' is set
        if (squadId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'squadId' when calling putFleetsFleetIdSquadsSquadId");
        }
        // verify the required parameter 'naming' is set
        if (naming == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'naming' when calling putFleetsFleetIdSquadsSquadId");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("fleet_id", fleetId);
        pathParams.put("squad_id", squadId);

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

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/fleets/{fleet_id}/squads/{squad_id}/", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Rename fleet wing
     * Rename a fleet wing  --- Alternate route: &#x60;/dev/fleets/{fleet_id}/wings/{wing_id}/&#x60;  Alternate route: &#x60;/legacy/fleets/{fleet_id}/wings/{wing_id}/&#x60;  Alternate route: &#x60;/v1/fleets/{fleet_id}/wings/{wing_id}/&#x60; 
     * <p><b>204</b> - Wing renamed
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - The fleet does not exist or you don&#39;t have access to it
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param fleetId ID for a fleet
     * @param wingId The wing to rename
     * @param naming The naming parameter
     * @param datasource The server name you would like data from
     * @param token Access token to use if unable to set a header
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> putFleetsFleetIdWingsWingId(Long fleetId, Long wingId, PutFleetsFleetIdWingsWingIdNaming naming, String datasource, String token) throws RestClientException {
        Object postBody = naming;
        // verify the required parameter 'fleetId' is set
        if (fleetId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fleetId' when calling putFleetsFleetIdWingsWingId");
        }
        // verify the required parameter 'wingId' is set
        if (wingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'wingId' when calling putFleetsFleetIdWingsWingId");
        }
        // verify the required parameter 'naming' is set
        if (naming == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'naming' when calling putFleetsFleetIdWingsWingId");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("fleet_id", fleetId);
        pathParams.put("wing_id", wingId);

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

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/fleets/{fleet_id}/wings/{wing_id}/", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
