package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.BadRequest;
import org.openapitools.client.model.ErrorLimited;
import org.openapitools.client.model.Forbidden;
import org.openapitools.client.model.GatewayTimeout;
import org.openapitools.client.model.GetCharactersCharacterIdOrders200Ok;
import org.openapitools.client.model.GetCharactersCharacterIdOrdersHistory200Ok;
import org.openapitools.client.model.GetCorporationsCorporationIdOrders200Ok;
import org.openapitools.client.model.GetCorporationsCorporationIdOrdersHistory200Ok;
import org.openapitools.client.model.GetMarketsGroupsMarketGroupIdNotFound;
import org.openapitools.client.model.GetMarketsGroupsMarketGroupIdOk;
import org.openapitools.client.model.GetMarketsPrices200Ok;
import org.openapitools.client.model.GetMarketsRegionIdHistory200Ok;
import org.openapitools.client.model.GetMarketsRegionIdHistoryError520;
import org.openapitools.client.model.GetMarketsRegionIdHistoryNotFound;
import org.openapitools.client.model.GetMarketsRegionIdHistoryUnprocessableEntity;
import org.openapitools.client.model.GetMarketsRegionIdOrders200Ok;
import org.openapitools.client.model.GetMarketsRegionIdOrdersNotFound;
import org.openapitools.client.model.GetMarketsRegionIdOrdersUnprocessableEntity;
import org.openapitools.client.model.GetMarketsStructuresStructureId200Ok;
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
public class MarketApi {
    private ApiClient apiClient;

    public MarketApi() {
        this(new ApiClient());
    }

    @Autowired
    public MarketApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * List open orders from a character
     * List open market orders placed by a character  --- Alternate route: &#x60;/dev/characters/{character_id}/orders/&#x60;  Alternate route: &#x60;/v2/characters/{character_id}/orders/&#x60;  --- This route is cached for up to 1200 seconds
     * <p><b>200</b> - Open market orders placed by a character
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
     * @return List&lt;GetCharactersCharacterIdOrders200Ok&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<GetCharactersCharacterIdOrders200Ok> getCharactersCharacterIdOrders(Integer characterId, String datasource, String ifNoneMatch, String token) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'characterId' when calling getCharactersCharacterIdOrders");
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

        ParameterizedTypeReference<GetCharactersCharacterIdOrders200Ok> localVarReturnType = new ParameterizedTypeReference<GetCharactersCharacterIdOrders200Ok>() {};
        return apiClient.invokeFluxAPI("/characters/{character_id}/orders/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * List historical orders by a character
     * List cancelled and expired market orders placed by a character up to 90 days in the past.  --- Alternate route: &#x60;/dev/characters/{character_id}/orders/history/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/orders/history/&#x60;  Alternate route: &#x60;/v1/characters/{character_id}/orders/history/&#x60;  --- This route is cached for up to 3600 seconds
     * <p><b>200</b> - Expired and cancelled market orders placed by a character
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
     * @return List&lt;GetCharactersCharacterIdOrdersHistory200Ok&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<GetCharactersCharacterIdOrdersHistory200Ok> getCharactersCharacterIdOrdersHistory(Integer characterId, String datasource, String ifNoneMatch, Integer page, String token) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'characterId' when calling getCharactersCharacterIdOrdersHistory");
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

        ParameterizedTypeReference<GetCharactersCharacterIdOrdersHistory200Ok> localVarReturnType = new ParameterizedTypeReference<GetCharactersCharacterIdOrdersHistory200Ok>() {};
        return apiClient.invokeFluxAPI("/characters/{character_id}/orders/history/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * List open orders from a corporation
     * List open market orders placed on behalf of a corporation  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/orders/&#x60;  Alternate route: &#x60;/v3/corporations/{corporation_id}/orders/&#x60;  --- This route is cached for up to 1200 seconds  --- Requires one of the following EVE corporation role(s): Accountant, Trader 
     * <p><b>200</b> - A list of open market orders
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
     * @return List&lt;GetCorporationsCorporationIdOrders200Ok&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<GetCorporationsCorporationIdOrders200Ok> getCorporationsCorporationIdOrders(Integer corporationId, String datasource, String ifNoneMatch, Integer page, String token) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'corporationId' is set
        if (corporationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'corporationId' when calling getCorporationsCorporationIdOrders");
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

        ParameterizedTypeReference<GetCorporationsCorporationIdOrders200Ok> localVarReturnType = new ParameterizedTypeReference<GetCorporationsCorporationIdOrders200Ok>() {};
        return apiClient.invokeFluxAPI("/corporations/{corporation_id}/orders/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * List historical orders from a corporation
     * List cancelled and expired market orders placed on behalf of a corporation up to 90 days in the past.  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/orders/history/&#x60;  Alternate route: &#x60;/v2/corporations/{corporation_id}/orders/history/&#x60;  --- This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Accountant, Trader 
     * <p><b>200</b> - Expired and cancelled market orders placed on behalf of a corporation
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
     * @return List&lt;GetCorporationsCorporationIdOrdersHistory200Ok&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<GetCorporationsCorporationIdOrdersHistory200Ok> getCorporationsCorporationIdOrdersHistory(Integer corporationId, String datasource, String ifNoneMatch, Integer page, String token) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'corporationId' is set
        if (corporationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'corporationId' when calling getCorporationsCorporationIdOrdersHistory");
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

        ParameterizedTypeReference<GetCorporationsCorporationIdOrdersHistory200Ok> localVarReturnType = new ParameterizedTypeReference<GetCorporationsCorporationIdOrdersHistory200Ok>() {};
        return apiClient.invokeFluxAPI("/corporations/{corporation_id}/orders/history/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get item groups
     * Get a list of item groups  --- Alternate route: &#x60;/dev/markets/groups/&#x60;  Alternate route: &#x60;/legacy/markets/groups/&#x60;  Alternate route: &#x60;/v1/markets/groups/&#x60;  --- This route expires daily at 11:05
     * <p><b>200</b> - A list of item group ids
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
    public Flux<Integer> getMarketsGroups(String datasource, String ifNoneMatch) throws RestClientException {
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
        return apiClient.invokeFluxAPI("/markets/groups/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get item group information
     * Get information on an item group  --- Alternate route: &#x60;/dev/markets/groups/{market_group_id}/&#x60;  Alternate route: &#x60;/legacy/markets/groups/{market_group_id}/&#x60;  Alternate route: &#x60;/v1/markets/groups/{market_group_id}/&#x60;  --- This route expires daily at 11:05
     * <p><b>200</b> - Information about an item group
     * <p><b>304</b> - Not modified
     * <p><b>400</b> - Bad request
     * <p><b>404</b> - Market group not found
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param marketGroupId An Eve item group ID
     * @param acceptLanguage Language to use in the response
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param language Language to use in the response, takes precedence over Accept-Language
     * @return GetMarketsGroupsMarketGroupIdOk
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<GetMarketsGroupsMarketGroupIdOk> getMarketsGroupsMarketGroupId(Integer marketGroupId, String acceptLanguage, String datasource, String ifNoneMatch, String language) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'marketGroupId' is set
        if (marketGroupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'marketGroupId' when calling getMarketsGroupsMarketGroupId");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("market_group_id", marketGroupId);

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

        ParameterizedTypeReference<GetMarketsGroupsMarketGroupIdOk> localVarReturnType = new ParameterizedTypeReference<GetMarketsGroupsMarketGroupIdOk>() {};
        return apiClient.invokeAPI("/markets/groups/{market_group_id}/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * List market prices
     * Return a list of prices  --- Alternate route: &#x60;/dev/markets/prices/&#x60;  Alternate route: &#x60;/legacy/markets/prices/&#x60;  Alternate route: &#x60;/v1/markets/prices/&#x60;  --- This route is cached for up to 3600 seconds
     * <p><b>200</b> - A list of prices
     * <p><b>304</b> - Not modified
     * <p><b>400</b> - Bad request
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return List&lt;GetMarketsPrices200Ok&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<GetMarketsPrices200Ok> getMarketsPrices(String datasource, String ifNoneMatch) throws RestClientException {
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

        ParameterizedTypeReference<GetMarketsPrices200Ok> localVarReturnType = new ParameterizedTypeReference<GetMarketsPrices200Ok>() {};
        return apiClient.invokeFluxAPI("/markets/prices/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * List historical market statistics in a region
     * Return a list of historical market statistics for the specified type in a region  --- Alternate route: &#x60;/dev/markets/{region_id}/history/&#x60;  Alternate route: &#x60;/legacy/markets/{region_id}/history/&#x60;  Alternate route: &#x60;/v1/markets/{region_id}/history/&#x60;  --- This route expires daily at 11:05
     * <p><b>200</b> - A list of historical market statistics
     * <p><b>304</b> - Not modified
     * <p><b>400</b> - Bad request
     * <p><b>404</b> - Type not found
     * <p><b>420</b> - Error limited
     * <p><b>422</b> - Not found
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * <p><b>520</b> - Internal error thrown from the EVE server
     * @param regionId Return statistics in this region
     * @param typeId Return statistics for this type
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return List&lt;GetMarketsRegionIdHistory200Ok&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<GetMarketsRegionIdHistory200Ok> getMarketsRegionIdHistory(Integer regionId, Integer typeId, String datasource, String ifNoneMatch) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'regionId' is set
        if (regionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'regionId' when calling getMarketsRegionIdHistory");
        }
        // verify the required parameter 'typeId' is set
        if (typeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'typeId' when calling getMarketsRegionIdHistory");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("region_id", regionId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "datasource", datasource));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "type_id", typeId));

        if (ifNoneMatch != null)
        headerParams.add("If-None-Match", apiClient.parameterToString(ifNoneMatch));
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GetMarketsRegionIdHistory200Ok> localVarReturnType = new ParameterizedTypeReference<GetMarketsRegionIdHistory200Ok>() {};
        return apiClient.invokeFluxAPI("/markets/{region_id}/history/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * List orders in a region
     * Return a list of orders in a region  --- Alternate route: &#x60;/dev/markets/{region_id}/orders/&#x60;  Alternate route: &#x60;/legacy/markets/{region_id}/orders/&#x60;  Alternate route: &#x60;/v1/markets/{region_id}/orders/&#x60;  --- This route is cached for up to 300 seconds
     * <p><b>200</b> - A list of orders
     * <p><b>304</b> - Not modified
     * <p><b>400</b> - Bad request
     * <p><b>404</b> - Not found
     * <p><b>420</b> - Error limited
     * <p><b>422</b> - Not found
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param orderType Filter buy/sell orders, return all orders by default. If you query without type_id, we always return both buy and sell orders
     * @param regionId Return orders in this region
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page Which page of results to return
     * @param typeId Return orders only for this type
     * @return List&lt;GetMarketsRegionIdOrders200Ok&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<GetMarketsRegionIdOrders200Ok> getMarketsRegionIdOrders(String orderType, Integer regionId, String datasource, String ifNoneMatch, Integer page, Integer typeId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'orderType' is set
        if (orderType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'orderType' when calling getMarketsRegionIdOrders");
        }
        // verify the required parameter 'regionId' is set
        if (regionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'regionId' when calling getMarketsRegionIdOrders");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("region_id", regionId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "datasource", datasource));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "order_type", orderType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "type_id", typeId));

        if (ifNoneMatch != null)
        headerParams.add("If-None-Match", apiClient.parameterToString(ifNoneMatch));
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GetMarketsRegionIdOrders200Ok> localVarReturnType = new ParameterizedTypeReference<GetMarketsRegionIdOrders200Ok>() {};
        return apiClient.invokeFluxAPI("/markets/{region_id}/orders/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * List type IDs relevant to a market
     * Return a list of type IDs that have active orders in the region, for efficient market indexing.  --- Alternate route: &#x60;/dev/markets/{region_id}/types/&#x60;  Alternate route: &#x60;/legacy/markets/{region_id}/types/&#x60;  Alternate route: &#x60;/v1/markets/{region_id}/types/&#x60;  --- This route is cached for up to 600 seconds
     * <p><b>200</b> - A list of type IDs
     * <p><b>304</b> - Not modified
     * <p><b>400</b> - Bad request
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param regionId Return statistics in this region
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page Which page of results to return
     * @return List&lt;Integer&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<Integer> getMarketsRegionIdTypes(Integer regionId, String datasource, String ifNoneMatch, Integer page) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'regionId' is set
        if (regionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'regionId' when calling getMarketsRegionIdTypes");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("region_id", regionId);

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
        return apiClient.invokeFluxAPI("/markets/{region_id}/types/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * List orders in a structure
     * Return all orders in a structure  --- Alternate route: &#x60;/dev/markets/structures/{structure_id}/&#x60;  Alternate route: &#x60;/legacy/markets/structures/{structure_id}/&#x60;  Alternate route: &#x60;/v1/markets/structures/{structure_id}/&#x60;  --- This route is cached for up to 300 seconds
     * <p><b>200</b> - A list of orders
     * <p><b>304</b> - Not modified
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param structureId Return orders in this structure
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page Which page of results to return
     * @param token Access token to use if unable to set a header
     * @return List&lt;GetMarketsStructuresStructureId200Ok&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<GetMarketsStructuresStructureId200Ok> getMarketsStructuresStructureId(Long structureId, String datasource, String ifNoneMatch, Integer page, String token) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'structureId' is set
        if (structureId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'structureId' when calling getMarketsStructuresStructureId");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("structure_id", structureId);

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

        ParameterizedTypeReference<GetMarketsStructuresStructureId200Ok> localVarReturnType = new ParameterizedTypeReference<GetMarketsStructuresStructureId200Ok>() {};
        return apiClient.invokeFluxAPI("/markets/structures/{structure_id}/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
