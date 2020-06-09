package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.BadRequest;
import org.openapitools.client.model.ErrorLimited;
import org.openapitools.client.model.Forbidden;
import org.openapitools.client.model.GatewayTimeout;
import org.openapitools.client.model.GetUniverseAncestries200Ok;
import org.openapitools.client.model.GetUniverseAsteroidBeltsAsteroidBeltIdNotFound;
import org.openapitools.client.model.GetUniverseAsteroidBeltsAsteroidBeltIdOk;
import org.openapitools.client.model.GetUniverseBloodlines200Ok;
import org.openapitools.client.model.GetUniverseCategoriesCategoryIdNotFound;
import org.openapitools.client.model.GetUniverseCategoriesCategoryIdOk;
import org.openapitools.client.model.GetUniverseConstellationsConstellationIdNotFound;
import org.openapitools.client.model.GetUniverseConstellationsConstellationIdOk;
import org.openapitools.client.model.GetUniverseFactions200Ok;
import org.openapitools.client.model.GetUniverseGraphicsGraphicIdNotFound;
import org.openapitools.client.model.GetUniverseGraphicsGraphicIdOk;
import org.openapitools.client.model.GetUniverseGroupsGroupIdNotFound;
import org.openapitools.client.model.GetUniverseGroupsGroupIdOk;
import org.openapitools.client.model.GetUniverseMoonsMoonIdNotFound;
import org.openapitools.client.model.GetUniverseMoonsMoonIdOk;
import org.openapitools.client.model.GetUniversePlanetsPlanetIdNotFound;
import org.openapitools.client.model.GetUniversePlanetsPlanetIdOk;
import org.openapitools.client.model.GetUniverseRaces200Ok;
import org.openapitools.client.model.GetUniverseRegionsRegionIdNotFound;
import org.openapitools.client.model.GetUniverseRegionsRegionIdOk;
import org.openapitools.client.model.GetUniverseStargatesStargateIdNotFound;
import org.openapitools.client.model.GetUniverseStargatesStargateIdOk;
import org.openapitools.client.model.GetUniverseStarsStarIdOk;
import org.openapitools.client.model.GetUniverseStationsStationIdNotFound;
import org.openapitools.client.model.GetUniverseStationsStationIdOk;
import org.openapitools.client.model.GetUniverseStructuresStructureIdNotFound;
import org.openapitools.client.model.GetUniverseStructuresStructureIdOk;
import org.openapitools.client.model.GetUniverseSystemJumps200Ok;
import org.openapitools.client.model.GetUniverseSystemKills200Ok;
import org.openapitools.client.model.GetUniverseSystemsSystemIdNotFound;
import org.openapitools.client.model.GetUniverseSystemsSystemIdOk;
import org.openapitools.client.model.GetUniverseTypesTypeIdNotFound;
import org.openapitools.client.model.GetUniverseTypesTypeIdOk;
import org.openapitools.client.model.InternalServerError;
import org.openapitools.client.model.PostUniverseIdsOk;
import org.openapitools.client.model.PostUniverseNames200Ok;
import org.openapitools.client.model.PostUniverseNamesNotFound;
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
public class UniverseApi {
    private ApiClient apiClient;

    public UniverseApi() {
        this(new ApiClient());
    }

    @Autowired
    public UniverseApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get ancestries
     * Get all character ancestries  --- Alternate route: &#x60;/dev/universe/ancestries/&#x60;  Alternate route: &#x60;/legacy/universe/ancestries/&#x60;  Alternate route: &#x60;/v1/universe/ancestries/&#x60;  --- This route expires daily at 11:05
     * <p><b>200</b> - A list of ancestries
     * <p><b>304</b> - Not modified
     * <p><b>400</b> - Bad request
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param acceptLanguage Language to use in the response
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param language Language to use in the response, takes precedence over Accept-Language
     * @return List&lt;GetUniverseAncestries200Ok&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<GetUniverseAncestries200Ok> getUniverseAncestries(String acceptLanguage, String datasource, String ifNoneMatch, String language) throws RestClientException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "datasource", datasource));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "language", language));

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

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GetUniverseAncestries200Ok> localVarReturnType = new ParameterizedTypeReference<GetUniverseAncestries200Ok>() {};
        return apiClient.invokeFluxAPI("/universe/ancestries/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get asteroid belt information
     * Get information on an asteroid belt  --- Alternate route: &#x60;/dev/universe/asteroid_belts/{asteroid_belt_id}/&#x60;  Alternate route: &#x60;/legacy/universe/asteroid_belts/{asteroid_belt_id}/&#x60;  Alternate route: &#x60;/v1/universe/asteroid_belts/{asteroid_belt_id}/&#x60;  --- This route expires daily at 11:05
     * <p><b>200</b> - Information about an asteroid belt
     * <p><b>304</b> - Not modified
     * <p><b>400</b> - Bad request
     * <p><b>404</b> - Asteroid belt not found
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param asteroidBeltId asteroid_belt_id integer
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return GetUniverseAsteroidBeltsAsteroidBeltIdOk
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<GetUniverseAsteroidBeltsAsteroidBeltIdOk> getUniverseAsteroidBeltsAsteroidBeltId(Integer asteroidBeltId, String datasource, String ifNoneMatch) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'asteroidBeltId' is set
        if (asteroidBeltId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'asteroidBeltId' when calling getUniverseAsteroidBeltsAsteroidBeltId");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("asteroid_belt_id", asteroidBeltId);

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

        ParameterizedTypeReference<GetUniverseAsteroidBeltsAsteroidBeltIdOk> localVarReturnType = new ParameterizedTypeReference<GetUniverseAsteroidBeltsAsteroidBeltIdOk>() {};
        return apiClient.invokeAPI("/universe/asteroid_belts/{asteroid_belt_id}/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get bloodlines
     * Get a list of bloodlines  --- Alternate route: &#x60;/dev/universe/bloodlines/&#x60;  Alternate route: &#x60;/legacy/universe/bloodlines/&#x60;  Alternate route: &#x60;/v1/universe/bloodlines/&#x60;  --- This route expires daily at 11:05
     * <p><b>200</b> - A list of bloodlines
     * <p><b>304</b> - Not modified
     * <p><b>400</b> - Bad request
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param acceptLanguage Language to use in the response
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param language Language to use in the response, takes precedence over Accept-Language
     * @return List&lt;GetUniverseBloodlines200Ok&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<GetUniverseBloodlines200Ok> getUniverseBloodlines(String acceptLanguage, String datasource, String ifNoneMatch, String language) throws RestClientException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "datasource", datasource));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "language", language));

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

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GetUniverseBloodlines200Ok> localVarReturnType = new ParameterizedTypeReference<GetUniverseBloodlines200Ok>() {};
        return apiClient.invokeFluxAPI("/universe/bloodlines/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get item categories
     * Get a list of item categories  --- Alternate route: &#x60;/dev/universe/categories/&#x60;  Alternate route: &#x60;/legacy/universe/categories/&#x60;  Alternate route: &#x60;/v1/universe/categories/&#x60;  --- This route expires daily at 11:05
     * <p><b>200</b> - A list of item category ids
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
    public Flux<Integer> getUniverseCategories(String datasource, String ifNoneMatch) throws RestClientException {
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
        return apiClient.invokeFluxAPI("/universe/categories/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get item category information
     * Get information of an item category  --- Alternate route: &#x60;/dev/universe/categories/{category_id}/&#x60;  Alternate route: &#x60;/legacy/universe/categories/{category_id}/&#x60;  Alternate route: &#x60;/v1/universe/categories/{category_id}/&#x60;  --- This route expires daily at 11:05
     * <p><b>200</b> - Information about an item category
     * <p><b>304</b> - Not modified
     * <p><b>400</b> - Bad request
     * <p><b>404</b> - Category not found
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param categoryId An Eve item category ID
     * @param acceptLanguage Language to use in the response
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param language Language to use in the response, takes precedence over Accept-Language
     * @return GetUniverseCategoriesCategoryIdOk
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<GetUniverseCategoriesCategoryIdOk> getUniverseCategoriesCategoryId(Integer categoryId, String acceptLanguage, String datasource, String ifNoneMatch, String language) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'categoryId' is set
        if (categoryId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'categoryId' when calling getUniverseCategoriesCategoryId");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("category_id", categoryId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "datasource", datasource));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "language", language));

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

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GetUniverseCategoriesCategoryIdOk> localVarReturnType = new ParameterizedTypeReference<GetUniverseCategoriesCategoryIdOk>() {};
        return apiClient.invokeAPI("/universe/categories/{category_id}/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get constellations
     * Get a list of constellations  --- Alternate route: &#x60;/dev/universe/constellations/&#x60;  Alternate route: &#x60;/legacy/universe/constellations/&#x60;  Alternate route: &#x60;/v1/universe/constellations/&#x60;  --- This route expires daily at 11:05
     * <p><b>200</b> - A list of constellation ids
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
    public Flux<Integer> getUniverseConstellations(String datasource, String ifNoneMatch) throws RestClientException {
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
        return apiClient.invokeFluxAPI("/universe/constellations/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get constellation information
     * Get information on a constellation  --- Alternate route: &#x60;/dev/universe/constellations/{constellation_id}/&#x60;  Alternate route: &#x60;/legacy/universe/constellations/{constellation_id}/&#x60;  Alternate route: &#x60;/v1/universe/constellations/{constellation_id}/&#x60;  --- This route expires daily at 11:05
     * <p><b>200</b> - Information about a constellation
     * <p><b>304</b> - Not modified
     * <p><b>400</b> - Bad request
     * <p><b>404</b> - Constellation not found
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param constellationId constellation_id integer
     * @param acceptLanguage Language to use in the response
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param language Language to use in the response, takes precedence over Accept-Language
     * @return GetUniverseConstellationsConstellationIdOk
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<GetUniverseConstellationsConstellationIdOk> getUniverseConstellationsConstellationId(Integer constellationId, String acceptLanguage, String datasource, String ifNoneMatch, String language) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'constellationId' is set
        if (constellationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'constellationId' when calling getUniverseConstellationsConstellationId");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("constellation_id", constellationId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "datasource", datasource));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "language", language));

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

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GetUniverseConstellationsConstellationIdOk> localVarReturnType = new ParameterizedTypeReference<GetUniverseConstellationsConstellationIdOk>() {};
        return apiClient.invokeAPI("/universe/constellations/{constellation_id}/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get factions
     * Get a list of factions  --- Alternate route: &#x60;/dev/universe/factions/&#x60;  Alternate route: &#x60;/v2/universe/factions/&#x60;  --- This route expires daily at 11:05
     * <p><b>200</b> - A list of factions
     * <p><b>304</b> - Not modified
     * <p><b>400</b> - Bad request
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param acceptLanguage Language to use in the response
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param language Language to use in the response, takes precedence over Accept-Language
     * @return List&lt;GetUniverseFactions200Ok&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<GetUniverseFactions200Ok> getUniverseFactions(String acceptLanguage, String datasource, String ifNoneMatch, String language) throws RestClientException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "datasource", datasource));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "language", language));

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

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GetUniverseFactions200Ok> localVarReturnType = new ParameterizedTypeReference<GetUniverseFactions200Ok>() {};
        return apiClient.invokeFluxAPI("/universe/factions/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get graphics
     * Get a list of graphics  --- Alternate route: &#x60;/dev/universe/graphics/&#x60;  Alternate route: &#x60;/legacy/universe/graphics/&#x60;  Alternate route: &#x60;/v1/universe/graphics/&#x60;  --- This route expires daily at 11:05
     * <p><b>200</b> - A list of graphic ids
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
    public Flux<Integer> getUniverseGraphics(String datasource, String ifNoneMatch) throws RestClientException {
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
        return apiClient.invokeFluxAPI("/universe/graphics/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get graphic information
     * Get information on a graphic  --- Alternate route: &#x60;/dev/universe/graphics/{graphic_id}/&#x60;  Alternate route: &#x60;/legacy/universe/graphics/{graphic_id}/&#x60;  Alternate route: &#x60;/v1/universe/graphics/{graphic_id}/&#x60;  --- This route expires daily at 11:05
     * <p><b>200</b> - Information about a graphic
     * <p><b>304</b> - Not modified
     * <p><b>400</b> - Bad request
     * <p><b>404</b> - Graphic not found
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param graphicId graphic_id integer
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return GetUniverseGraphicsGraphicIdOk
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<GetUniverseGraphicsGraphicIdOk> getUniverseGraphicsGraphicId(Integer graphicId, String datasource, String ifNoneMatch) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'graphicId' is set
        if (graphicId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'graphicId' when calling getUniverseGraphicsGraphicId");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("graphic_id", graphicId);

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

        ParameterizedTypeReference<GetUniverseGraphicsGraphicIdOk> localVarReturnType = new ParameterizedTypeReference<GetUniverseGraphicsGraphicIdOk>() {};
        return apiClient.invokeAPI("/universe/graphics/{graphic_id}/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get item groups
     * Get a list of item groups  --- Alternate route: &#x60;/dev/universe/groups/&#x60;  Alternate route: &#x60;/legacy/universe/groups/&#x60;  Alternate route: &#x60;/v1/universe/groups/&#x60;  --- This route expires daily at 11:05
     * <p><b>200</b> - A list of item group ids
     * <p><b>304</b> - Not modified
     * <p><b>400</b> - Bad request
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page Which page of results to return
     * @return List&lt;Integer&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<Integer> getUniverseGroups(String datasource, String ifNoneMatch, Integer page) throws RestClientException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "datasource", datasource));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));

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
        return apiClient.invokeFluxAPI("/universe/groups/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get item group information
     * Get information on an item group  --- Alternate route: &#x60;/dev/universe/groups/{group_id}/&#x60;  Alternate route: &#x60;/legacy/universe/groups/{group_id}/&#x60;  Alternate route: &#x60;/v1/universe/groups/{group_id}/&#x60;  --- This route expires daily at 11:05
     * <p><b>200</b> - Information about an item group
     * <p><b>304</b> - Not modified
     * <p><b>400</b> - Bad request
     * <p><b>404</b> - Group not found
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param groupId An Eve item group ID
     * @param acceptLanguage Language to use in the response
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param language Language to use in the response, takes precedence over Accept-Language
     * @return GetUniverseGroupsGroupIdOk
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<GetUniverseGroupsGroupIdOk> getUniverseGroupsGroupId(Integer groupId, String acceptLanguage, String datasource, String ifNoneMatch, String language) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupId' when calling getUniverseGroupsGroupId");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("group_id", groupId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "datasource", datasource));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "language", language));

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

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GetUniverseGroupsGroupIdOk> localVarReturnType = new ParameterizedTypeReference<GetUniverseGroupsGroupIdOk>() {};
        return apiClient.invokeAPI("/universe/groups/{group_id}/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get moon information
     * Get information on a moon  --- Alternate route: &#x60;/dev/universe/moons/{moon_id}/&#x60;  Alternate route: &#x60;/legacy/universe/moons/{moon_id}/&#x60;  Alternate route: &#x60;/v1/universe/moons/{moon_id}/&#x60;  --- This route expires daily at 11:05
     * <p><b>200</b> - Information about a moon
     * <p><b>304</b> - Not modified
     * <p><b>400</b> - Bad request
     * <p><b>404</b> - Moon not found
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param moonId moon_id integer
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return GetUniverseMoonsMoonIdOk
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<GetUniverseMoonsMoonIdOk> getUniverseMoonsMoonId(Integer moonId, String datasource, String ifNoneMatch) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'moonId' is set
        if (moonId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'moonId' when calling getUniverseMoonsMoonId");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("moon_id", moonId);

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

        ParameterizedTypeReference<GetUniverseMoonsMoonIdOk> localVarReturnType = new ParameterizedTypeReference<GetUniverseMoonsMoonIdOk>() {};
        return apiClient.invokeAPI("/universe/moons/{moon_id}/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get planet information
     * Get information on a planet  --- Alternate route: &#x60;/dev/universe/planets/{planet_id}/&#x60;  Alternate route: &#x60;/legacy/universe/planets/{planet_id}/&#x60;  Alternate route: &#x60;/v1/universe/planets/{planet_id}/&#x60;  --- This route expires daily at 11:05
     * <p><b>200</b> - Information about a planet
     * <p><b>304</b> - Not modified
     * <p><b>400</b> - Bad request
     * <p><b>404</b> - Planet not found
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param planetId planet_id integer
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return GetUniversePlanetsPlanetIdOk
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<GetUniversePlanetsPlanetIdOk> getUniversePlanetsPlanetId(Integer planetId, String datasource, String ifNoneMatch) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'planetId' is set
        if (planetId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'planetId' when calling getUniversePlanetsPlanetId");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("planet_id", planetId);

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

        ParameterizedTypeReference<GetUniversePlanetsPlanetIdOk> localVarReturnType = new ParameterizedTypeReference<GetUniversePlanetsPlanetIdOk>() {};
        return apiClient.invokeAPI("/universe/planets/{planet_id}/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get character races
     * Get a list of character races  --- Alternate route: &#x60;/dev/universe/races/&#x60;  Alternate route: &#x60;/legacy/universe/races/&#x60;  Alternate route: &#x60;/v1/universe/races/&#x60;  --- This route expires daily at 11:05
     * <p><b>200</b> - A list of character races
     * <p><b>304</b> - Not modified
     * <p><b>400</b> - Bad request
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param acceptLanguage Language to use in the response
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param language Language to use in the response, takes precedence over Accept-Language
     * @return List&lt;GetUniverseRaces200Ok&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<GetUniverseRaces200Ok> getUniverseRaces(String acceptLanguage, String datasource, String ifNoneMatch, String language) throws RestClientException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "datasource", datasource));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "language", language));

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

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GetUniverseRaces200Ok> localVarReturnType = new ParameterizedTypeReference<GetUniverseRaces200Ok>() {};
        return apiClient.invokeFluxAPI("/universe/races/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get regions
     * Get a list of regions  --- Alternate route: &#x60;/dev/universe/regions/&#x60;  Alternate route: &#x60;/legacy/universe/regions/&#x60;  Alternate route: &#x60;/v1/universe/regions/&#x60;  --- This route expires daily at 11:05
     * <p><b>200</b> - A list of region ids
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
    public Flux<Integer> getUniverseRegions(String datasource, String ifNoneMatch) throws RestClientException {
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
        return apiClient.invokeFluxAPI("/universe/regions/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get region information
     * Get information on a region  --- Alternate route: &#x60;/dev/universe/regions/{region_id}/&#x60;  Alternate route: &#x60;/legacy/universe/regions/{region_id}/&#x60;  Alternate route: &#x60;/v1/universe/regions/{region_id}/&#x60;  --- This route expires daily at 11:05
     * <p><b>200</b> - Information about a region
     * <p><b>304</b> - Not modified
     * <p><b>400</b> - Bad request
     * <p><b>404</b> - Region not found
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param regionId region_id integer
     * @param acceptLanguage Language to use in the response
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param language Language to use in the response, takes precedence over Accept-Language
     * @return GetUniverseRegionsRegionIdOk
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<GetUniverseRegionsRegionIdOk> getUniverseRegionsRegionId(Integer regionId, String acceptLanguage, String datasource, String ifNoneMatch, String language) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'regionId' is set
        if (regionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'regionId' when calling getUniverseRegionsRegionId");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("region_id", regionId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "datasource", datasource));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "language", language));

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

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GetUniverseRegionsRegionIdOk> localVarReturnType = new ParameterizedTypeReference<GetUniverseRegionsRegionIdOk>() {};
        return apiClient.invokeAPI("/universe/regions/{region_id}/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get stargate information
     * Get information on a stargate  --- Alternate route: &#x60;/dev/universe/stargates/{stargate_id}/&#x60;  Alternate route: &#x60;/legacy/universe/stargates/{stargate_id}/&#x60;  Alternate route: &#x60;/v1/universe/stargates/{stargate_id}/&#x60;  --- This route expires daily at 11:05
     * <p><b>200</b> - Information about a stargate
     * <p><b>304</b> - Not modified
     * <p><b>400</b> - Bad request
     * <p><b>404</b> - Stargate not found
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param stargateId stargate_id integer
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return GetUniverseStargatesStargateIdOk
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<GetUniverseStargatesStargateIdOk> getUniverseStargatesStargateId(Integer stargateId, String datasource, String ifNoneMatch) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'stargateId' is set
        if (stargateId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'stargateId' when calling getUniverseStargatesStargateId");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("stargate_id", stargateId);

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

        ParameterizedTypeReference<GetUniverseStargatesStargateIdOk> localVarReturnType = new ParameterizedTypeReference<GetUniverseStargatesStargateIdOk>() {};
        return apiClient.invokeAPI("/universe/stargates/{stargate_id}/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get star information
     * Get information on a star  --- Alternate route: &#x60;/dev/universe/stars/{star_id}/&#x60;  Alternate route: &#x60;/legacy/universe/stars/{star_id}/&#x60;  Alternate route: &#x60;/v1/universe/stars/{star_id}/&#x60;  --- This route expires daily at 11:05
     * <p><b>200</b> - Information about a star
     * <p><b>304</b> - Not modified
     * <p><b>400</b> - Bad request
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param starId star_id integer
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return GetUniverseStarsStarIdOk
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<GetUniverseStarsStarIdOk> getUniverseStarsStarId(Integer starId, String datasource, String ifNoneMatch) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'starId' is set
        if (starId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'starId' when calling getUniverseStarsStarId");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("star_id", starId);

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

        ParameterizedTypeReference<GetUniverseStarsStarIdOk> localVarReturnType = new ParameterizedTypeReference<GetUniverseStarsStarIdOk>() {};
        return apiClient.invokeAPI("/universe/stars/{star_id}/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get station information
     * Get information on a station  --- Alternate route: &#x60;/dev/universe/stations/{station_id}/&#x60;  Alternate route: &#x60;/v2/universe/stations/{station_id}/&#x60;  --- This route expires daily at 11:05
     * <p><b>200</b> - Information about a station
     * <p><b>304</b> - Not modified
     * <p><b>400</b> - Bad request
     * <p><b>404</b> - Station not found
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param stationId station_id integer
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return GetUniverseStationsStationIdOk
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<GetUniverseStationsStationIdOk> getUniverseStationsStationId(Integer stationId, String datasource, String ifNoneMatch) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'stationId' is set
        if (stationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'stationId' when calling getUniverseStationsStationId");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("station_id", stationId);

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

        ParameterizedTypeReference<GetUniverseStationsStationIdOk> localVarReturnType = new ParameterizedTypeReference<GetUniverseStationsStationIdOk>() {};
        return apiClient.invokeAPI("/universe/stations/{station_id}/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * List all public structures
     * List all public structures  --- Alternate route: &#x60;/dev/universe/structures/&#x60;  Alternate route: &#x60;/legacy/universe/structures/&#x60;  Alternate route: &#x60;/v1/universe/structures/&#x60;  --- This route is cached for up to 3600 seconds
     * <p><b>200</b> - List of public structure IDs
     * <p><b>304</b> - Not modified
     * <p><b>400</b> - Bad request
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param datasource The server name you would like data from
     * @param filter Only list public structures that have this service online
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return List&lt;Long&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<Long> getUniverseStructures(String datasource, String filter, String ifNoneMatch) throws RestClientException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "datasource", datasource));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter", filter));

        if (ifNoneMatch != null)
        headerParams.add("If-None-Match", apiClient.parameterToString(ifNoneMatch));
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Long> localVarReturnType = new ParameterizedTypeReference<Long>() {};
        return apiClient.invokeFluxAPI("/universe/structures/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get structure information
     * Returns information on requested structure if you are on the ACL. Otherwise, returns \&quot;Forbidden\&quot; for all inputs.  --- Alternate route: &#x60;/dev/universe/structures/{structure_id}/&#x60;  Alternate route: &#x60;/v2/universe/structures/{structure_id}/&#x60;  --- This route is cached for up to 3600 seconds
     * <p><b>200</b> - Data about a structure
     * <p><b>304</b> - Not modified
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Structure not found
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param structureId An Eve structure ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param token Access token to use if unable to set a header
     * @return GetUniverseStructuresStructureIdOk
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<GetUniverseStructuresStructureIdOk> getUniverseStructuresStructureId(Long structureId, String datasource, String ifNoneMatch, String token) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'structureId' is set
        if (structureId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'structureId' when calling getUniverseStructuresStructureId");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("structure_id", structureId);

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

        ParameterizedTypeReference<GetUniverseStructuresStructureIdOk> localVarReturnType = new ParameterizedTypeReference<GetUniverseStructuresStructureIdOk>() {};
        return apiClient.invokeAPI("/universe/structures/{structure_id}/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get system jumps
     * Get the number of jumps in solar systems within the last hour ending at the timestamp of the Last-Modified header, excluding wormhole space. Only systems with jumps will be listed  --- Alternate route: &#x60;/dev/universe/system_jumps/&#x60;  Alternate route: &#x60;/legacy/universe/system_jumps/&#x60;  Alternate route: &#x60;/v1/universe/system_jumps/&#x60;  --- This route is cached for up to 3600 seconds
     * <p><b>200</b> - A list of systems and number of jumps
     * <p><b>304</b> - Not modified
     * <p><b>400</b> - Bad request
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return List&lt;GetUniverseSystemJumps200Ok&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<GetUniverseSystemJumps200Ok> getUniverseSystemJumps(String datasource, String ifNoneMatch) throws RestClientException {
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

        ParameterizedTypeReference<GetUniverseSystemJumps200Ok> localVarReturnType = new ParameterizedTypeReference<GetUniverseSystemJumps200Ok>() {};
        return apiClient.invokeFluxAPI("/universe/system_jumps/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get system kills
     * Get the number of ship, pod and NPC kills per solar system within the last hour ending at the timestamp of the Last-Modified header, excluding wormhole space. Only systems with kills will be listed  --- Alternate route: &#x60;/dev/universe/system_kills/&#x60;  Alternate route: &#x60;/v2/universe/system_kills/&#x60;  --- This route is cached for up to 3600 seconds
     * <p><b>200</b> - A list of systems and number of ship, pod and NPC kills
     * <p><b>304</b> - Not modified
     * <p><b>400</b> - Bad request
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return List&lt;GetUniverseSystemKills200Ok&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<GetUniverseSystemKills200Ok> getUniverseSystemKills(String datasource, String ifNoneMatch) throws RestClientException {
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

        ParameterizedTypeReference<GetUniverseSystemKills200Ok> localVarReturnType = new ParameterizedTypeReference<GetUniverseSystemKills200Ok>() {};
        return apiClient.invokeFluxAPI("/universe/system_kills/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get solar systems
     * Get a list of solar systems  --- Alternate route: &#x60;/dev/universe/systems/&#x60;  Alternate route: &#x60;/legacy/universe/systems/&#x60;  Alternate route: &#x60;/v1/universe/systems/&#x60;  --- This route expires daily at 11:05
     * <p><b>200</b> - A list of solar system ids
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
    public Flux<Integer> getUniverseSystems(String datasource, String ifNoneMatch) throws RestClientException {
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
        return apiClient.invokeFluxAPI("/universe/systems/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get solar system information
     * Get information on a solar system.  --- Alternate route: &#x60;/dev/universe/systems/{system_id}/&#x60;  Alternate route: &#x60;/v4/universe/systems/{system_id}/&#x60;  --- This route expires daily at 11:05
     * <p><b>200</b> - Information about a solar system
     * <p><b>304</b> - Not modified
     * <p><b>400</b> - Bad request
     * <p><b>404</b> - Solar system not found
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param systemId system_id integer
     * @param acceptLanguage Language to use in the response
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param language Language to use in the response, takes precedence over Accept-Language
     * @return GetUniverseSystemsSystemIdOk
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<GetUniverseSystemsSystemIdOk> getUniverseSystemsSystemId(Integer systemId, String acceptLanguage, String datasource, String ifNoneMatch, String language) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'systemId' is set
        if (systemId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'systemId' when calling getUniverseSystemsSystemId");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("system_id", systemId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "datasource", datasource));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "language", language));

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

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GetUniverseSystemsSystemIdOk> localVarReturnType = new ParameterizedTypeReference<GetUniverseSystemsSystemIdOk>() {};
        return apiClient.invokeAPI("/universe/systems/{system_id}/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get types
     * Get a list of type ids  --- Alternate route: &#x60;/dev/universe/types/&#x60;  Alternate route: &#x60;/legacy/universe/types/&#x60;  Alternate route: &#x60;/v1/universe/types/&#x60;  --- This route expires daily at 11:05
     * <p><b>200</b> - A list of type ids
     * <p><b>304</b> - Not modified
     * <p><b>400</b> - Bad request
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page Which page of results to return
     * @return List&lt;Integer&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<Integer> getUniverseTypes(String datasource, String ifNoneMatch, Integer page) throws RestClientException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "datasource", datasource));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));

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
        return apiClient.invokeFluxAPI("/universe/types/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get type information
     * Get information on a type  --- Alternate route: &#x60;/dev/universe/types/{type_id}/&#x60;  Alternate route: &#x60;/v3/universe/types/{type_id}/&#x60;  --- This route expires daily at 11:05
     * <p><b>200</b> - Information about a type
     * <p><b>304</b> - Not modified
     * <p><b>400</b> - Bad request
     * <p><b>404</b> - Type not found
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param typeId An Eve item type ID
     * @param acceptLanguage Language to use in the response
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param language Language to use in the response, takes precedence over Accept-Language
     * @return GetUniverseTypesTypeIdOk
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<GetUniverseTypesTypeIdOk> getUniverseTypesTypeId(Integer typeId, String acceptLanguage, String datasource, String ifNoneMatch, String language) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'typeId' is set
        if (typeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'typeId' when calling getUniverseTypesTypeId");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("type_id", typeId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "datasource", datasource));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "language", language));

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

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GetUniverseTypesTypeIdOk> localVarReturnType = new ParameterizedTypeReference<GetUniverseTypesTypeIdOk>() {};
        return apiClient.invokeAPI("/universe/types/{type_id}/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Bulk names to IDs
     * Resolve a set of names to IDs in the following categories: agents, alliances, characters, constellations, corporations factions, inventory_types, regions, stations, and systems. Only exact matches will be returned. All names searched for are cached for 12 hours  --- Alternate route: &#x60;/dev/universe/ids/&#x60;  Alternate route: &#x60;/legacy/universe/ids/&#x60;  Alternate route: &#x60;/v1/universe/ids/&#x60; 
     * <p><b>200</b> - List of id/name associations for a set of names divided by category. Any name passed in that did not have a match will be ommitted
     * <p><b>400</b> - Bad request
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param names The names to resolve
     * @param acceptLanguage Language to use in the response
     * @param datasource The server name you would like data from
     * @param language Language to use in the response, takes precedence over Accept-Language
     * @return PostUniverseIdsOk
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<PostUniverseIdsOk> postUniverseIds(List<String> names, String acceptLanguage, String datasource, String language) throws RestClientException {
        Object postBody = names;
        // verify the required parameter 'names' is set
        if (names == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'names' when calling postUniverseIds");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "datasource", datasource));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "language", language));

        if (acceptLanguage != null)
        headerParams.add("Accept-Language", apiClient.parameterToString(acceptLanguage));
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<PostUniverseIdsOk> localVarReturnType = new ParameterizedTypeReference<PostUniverseIdsOk>() {};
        return apiClient.invokeAPI("/universe/ids/", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get names and categories for a set of IDs
     * Resolve a set of IDs to names and categories. Supported ID&#39;s for resolving are: Characters, Corporations, Alliances, Stations, Solar Systems, Constellations, Regions, Types, Factions  --- Alternate route: &#x60;/dev/universe/names/&#x60;  Alternate route: &#x60;/v3/universe/names/&#x60; 
     * <p><b>200</b> - List of id/name associations for a set of IDs. All IDs must resolve to a name, or nothing will be returned
     * <p><b>400</b> - Bad request
     * <p><b>404</b> - Ensure all IDs are valid before resolving
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param ids The ids to resolve
     * @param datasource The server name you would like data from
     * @return List&lt;PostUniverseNames200Ok&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<PostUniverseNames200Ok> postUniverseNames(List<Integer> ids, String datasource) throws RestClientException {
        Object postBody = ids;
        // verify the required parameter 'ids' is set
        if (ids == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ids' when calling postUniverseNames");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "datasource", datasource));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<PostUniverseNames200Ok> localVarReturnType = new ParameterizedTypeReference<PostUniverseNames200Ok>() {};
        return apiClient.invokeFluxAPI("/universe/names/", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
