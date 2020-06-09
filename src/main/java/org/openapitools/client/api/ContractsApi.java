package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.BadRequest;
import org.openapitools.client.model.ErrorLimited;
import org.openapitools.client.model.Forbidden;
import org.openapitools.client.model.GatewayTimeout;
import org.openapitools.client.model.GetCharactersCharacterIdContracts200Ok;
import org.openapitools.client.model.GetCharactersCharacterIdContractsContractIdBids200Ok;
import org.openapitools.client.model.GetCharactersCharacterIdContractsContractIdBidsNotFound;
import org.openapitools.client.model.GetCharactersCharacterIdContractsContractIdItems200Ok;
import org.openapitools.client.model.GetCharactersCharacterIdContractsContractIdItemsNotFound;
import org.openapitools.client.model.GetContractsPublicBidsContractId200Ok;
import org.openapitools.client.model.GetContractsPublicBidsContractIdForbidden;
import org.openapitools.client.model.GetContractsPublicBidsContractIdNotFound;
import org.openapitools.client.model.GetContractsPublicItemsContractId200Ok;
import org.openapitools.client.model.GetContractsPublicItemsContractIdForbidden;
import org.openapitools.client.model.GetContractsPublicItemsContractIdNotFound;
import org.openapitools.client.model.GetContractsPublicRegionId200Ok;
import org.openapitools.client.model.GetContractsPublicRegionIdNotFound;
import org.openapitools.client.model.GetCorporationsCorporationIdContracts200Ok;
import org.openapitools.client.model.GetCorporationsCorporationIdContractsContractIdBids200Ok;
import org.openapitools.client.model.GetCorporationsCorporationIdContractsContractIdBidsNotFound;
import org.openapitools.client.model.GetCorporationsCorporationIdContractsContractIdItems200Ok;
import org.openapitools.client.model.GetCorporationsCorporationIdContractsContractIdItemsError520;
import org.openapitools.client.model.GetCorporationsCorporationIdContractsContractIdItemsNotFound;
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
public class ContractsApi {
    private ApiClient apiClient;

    public ContractsApi() {
        this(new ApiClient());
    }

    @Autowired
    public ContractsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get contracts
     * Returns contracts available to a character, only if the character is issuer, acceptor or assignee. Only returns contracts no older than 30 days, or if the status is \&quot;in_progress\&quot;.  --- Alternate route: &#x60;/dev/characters/{character_id}/contracts/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/contracts/&#x60;  Alternate route: &#x60;/v1/characters/{character_id}/contracts/&#x60;  --- This route is cached for up to 300 seconds
     * <p><b>200</b> - A list of contracts
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
     * @return List&lt;GetCharactersCharacterIdContracts200Ok&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<GetCharactersCharacterIdContracts200Ok> getCharactersCharacterIdContracts(Integer characterId, String datasource, String ifNoneMatch, Integer page, String token) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'characterId' when calling getCharactersCharacterIdContracts");
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

        ParameterizedTypeReference<GetCharactersCharacterIdContracts200Ok> localVarReturnType = new ParameterizedTypeReference<GetCharactersCharacterIdContracts200Ok>() {};
        return apiClient.invokeFluxAPI("/characters/{character_id}/contracts/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get contract bids
     * Lists bids on a particular auction contract  --- Alternate route: &#x60;/dev/characters/{character_id}/contracts/{contract_id}/bids/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/contracts/{contract_id}/bids/&#x60;  Alternate route: &#x60;/v1/characters/{character_id}/contracts/{contract_id}/bids/&#x60;  --- This route is cached for up to 300 seconds
     * <p><b>200</b> - A list of bids
     * <p><b>304</b> - Not modified
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param characterId An EVE character ID
     * @param contractId ID of a contract
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param token Access token to use if unable to set a header
     * @return List&lt;GetCharactersCharacterIdContractsContractIdBids200Ok&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<GetCharactersCharacterIdContractsContractIdBids200Ok> getCharactersCharacterIdContractsContractIdBids(Integer characterId, Integer contractId, String datasource, String ifNoneMatch, String token) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'characterId' when calling getCharactersCharacterIdContractsContractIdBids");
        }
        // verify the required parameter 'contractId' is set
        if (contractId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'contractId' when calling getCharactersCharacterIdContractsContractIdBids");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("character_id", characterId);
        pathParams.put("contract_id", contractId);

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

        ParameterizedTypeReference<GetCharactersCharacterIdContractsContractIdBids200Ok> localVarReturnType = new ParameterizedTypeReference<GetCharactersCharacterIdContractsContractIdBids200Ok>() {};
        return apiClient.invokeFluxAPI("/characters/{character_id}/contracts/{contract_id}/bids/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get contract items
     * Lists items of a particular contract  --- Alternate route: &#x60;/dev/characters/{character_id}/contracts/{contract_id}/items/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/contracts/{contract_id}/items/&#x60;  Alternate route: &#x60;/v1/characters/{character_id}/contracts/{contract_id}/items/&#x60;  --- This route is cached for up to 3600 seconds
     * <p><b>200</b> - A list of items in this contract
     * <p><b>304</b> - Not modified
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param characterId An EVE character ID
     * @param contractId ID of a contract
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param token Access token to use if unable to set a header
     * @return List&lt;GetCharactersCharacterIdContractsContractIdItems200Ok&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<GetCharactersCharacterIdContractsContractIdItems200Ok> getCharactersCharacterIdContractsContractIdItems(Integer characterId, Integer contractId, String datasource, String ifNoneMatch, String token) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'characterId' when calling getCharactersCharacterIdContractsContractIdItems");
        }
        // verify the required parameter 'contractId' is set
        if (contractId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'contractId' when calling getCharactersCharacterIdContractsContractIdItems");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("character_id", characterId);
        pathParams.put("contract_id", contractId);

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

        ParameterizedTypeReference<GetCharactersCharacterIdContractsContractIdItems200Ok> localVarReturnType = new ParameterizedTypeReference<GetCharactersCharacterIdContractsContractIdItems200Ok>() {};
        return apiClient.invokeFluxAPI("/characters/{character_id}/contracts/{contract_id}/items/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get public contract bids
     * Lists bids on a public auction contract  --- Alternate route: &#x60;/dev/contracts/public/bids/{contract_id}/&#x60;  Alternate route: &#x60;/legacy/contracts/public/bids/{contract_id}/&#x60;  Alternate route: &#x60;/v1/contracts/public/bids/{contract_id}/&#x60;  --- This route is cached for up to 300 seconds
     * <p><b>200</b> - A list of bids
     * <p><b>204</b> - Contract expired or recently accepted by player
     * <p><b>304</b> - Not modified
     * <p><b>400</b> - Bad request
     * <p><b>403</b> - Not Authorized to see contract
     * <p><b>404</b> - Not found
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param contractId ID of a contract
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page Which page of results to return
     * @return List&lt;GetContractsPublicBidsContractId200Ok&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<GetContractsPublicBidsContractId200Ok> getContractsPublicBidsContractId(Integer contractId, String datasource, String ifNoneMatch, Integer page) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'contractId' is set
        if (contractId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'contractId' when calling getContractsPublicBidsContractId");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("contract_id", contractId);

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

        ParameterizedTypeReference<GetContractsPublicBidsContractId200Ok> localVarReturnType = new ParameterizedTypeReference<GetContractsPublicBidsContractId200Ok>() {};
        return apiClient.invokeFluxAPI("/contracts/public/bids/{contract_id}/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get public contract items
     * Lists items of a public contract  --- Alternate route: &#x60;/dev/contracts/public/items/{contract_id}/&#x60;  Alternate route: &#x60;/legacy/contracts/public/items/{contract_id}/&#x60;  Alternate route: &#x60;/v1/contracts/public/items/{contract_id}/&#x60;  --- This route is cached for up to 3600 seconds
     * <p><b>200</b> - A list of items in this contract
     * <p><b>204</b> - Contract expired or recently accepted by player
     * <p><b>304</b> - Not modified
     * <p><b>400</b> - Bad request
     * <p><b>403</b> - Not Authorized to see contract
     * <p><b>404</b> - Not found
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param contractId ID of a contract
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page Which page of results to return
     * @return List&lt;GetContractsPublicItemsContractId200Ok&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<GetContractsPublicItemsContractId200Ok> getContractsPublicItemsContractId(Integer contractId, String datasource, String ifNoneMatch, Integer page) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'contractId' is set
        if (contractId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'contractId' when calling getContractsPublicItemsContractId");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("contract_id", contractId);

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

        ParameterizedTypeReference<GetContractsPublicItemsContractId200Ok> localVarReturnType = new ParameterizedTypeReference<GetContractsPublicItemsContractId200Ok>() {};
        return apiClient.invokeFluxAPI("/contracts/public/items/{contract_id}/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get public contracts
     * Returns a paginated list of all public contracts in the given region  --- Alternate route: &#x60;/dev/contracts/public/{region_id}/&#x60;  Alternate route: &#x60;/legacy/contracts/public/{region_id}/&#x60;  Alternate route: &#x60;/v1/contracts/public/{region_id}/&#x60;  --- This route is cached for up to 1800 seconds
     * <p><b>200</b> - A list of contracts
     * <p><b>304</b> - Not modified
     * <p><b>400</b> - Bad request
     * <p><b>404</b> - Region not found
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param regionId An EVE region id
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page Which page of results to return
     * @return List&lt;GetContractsPublicRegionId200Ok&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<GetContractsPublicRegionId200Ok> getContractsPublicRegionId(Integer regionId, String datasource, String ifNoneMatch, Integer page) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'regionId' is set
        if (regionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'regionId' when calling getContractsPublicRegionId");
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

        ParameterizedTypeReference<GetContractsPublicRegionId200Ok> localVarReturnType = new ParameterizedTypeReference<GetContractsPublicRegionId200Ok>() {};
        return apiClient.invokeFluxAPI("/contracts/public/{region_id}/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get corporation contracts
     * Returns contracts available to a corporation, only if the corporation is issuer, acceptor or assignee. Only returns contracts no older than 30 days, or if the status is \&quot;in_progress\&quot;.  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/contracts/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/contracts/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/contracts/&#x60;  --- This route is cached for up to 300 seconds
     * <p><b>200</b> - A list of contracts
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
     * @return List&lt;GetCorporationsCorporationIdContracts200Ok&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<GetCorporationsCorporationIdContracts200Ok> getCorporationsCorporationIdContracts(Integer corporationId, String datasource, String ifNoneMatch, Integer page, String token) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'corporationId' is set
        if (corporationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'corporationId' when calling getCorporationsCorporationIdContracts");
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

        ParameterizedTypeReference<GetCorporationsCorporationIdContracts200Ok> localVarReturnType = new ParameterizedTypeReference<GetCorporationsCorporationIdContracts200Ok>() {};
        return apiClient.invokeFluxAPI("/corporations/{corporation_id}/contracts/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get corporation contract bids
     * Lists bids on a particular auction contract  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/contracts/{contract_id}/bids/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/contracts/{contract_id}/bids/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/contracts/{contract_id}/bids/&#x60;  --- This route is cached for up to 3600 seconds
     * <p><b>200</b> - A list of bids
     * <p><b>304</b> - Not modified
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param contractId ID of a contract
     * @param corporationId An EVE corporation ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page Which page of results to return
     * @param token Access token to use if unable to set a header
     * @return List&lt;GetCorporationsCorporationIdContractsContractIdBids200Ok&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<GetCorporationsCorporationIdContractsContractIdBids200Ok> getCorporationsCorporationIdContractsContractIdBids(Integer contractId, Integer corporationId, String datasource, String ifNoneMatch, Integer page, String token) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'contractId' is set
        if (contractId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'contractId' when calling getCorporationsCorporationIdContractsContractIdBids");
        }
        // verify the required parameter 'corporationId' is set
        if (corporationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'corporationId' when calling getCorporationsCorporationIdContractsContractIdBids");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("contract_id", contractId);
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

        ParameterizedTypeReference<GetCorporationsCorporationIdContractsContractIdBids200Ok> localVarReturnType = new ParameterizedTypeReference<GetCorporationsCorporationIdContractsContractIdBids200Ok>() {};
        return apiClient.invokeFluxAPI("/corporations/{corporation_id}/contracts/{contract_id}/bids/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get corporation contract items
     * Lists items of a particular contract  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/contracts/{contract_id}/items/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/contracts/{contract_id}/items/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/contracts/{contract_id}/items/&#x60;  --- This route is cached for up to 3600 seconds
     * <p><b>200</b> - A list of items in this contract
     * <p><b>304</b> - Not modified
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * <p><b>520</b> - Internal error thrown from the EVE server. Most of the time this means you have hit an EVE server rate limit
     * @param contractId ID of a contract
     * @param corporationId An EVE corporation ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param token Access token to use if unable to set a header
     * @return List&lt;GetCorporationsCorporationIdContractsContractIdItems200Ok&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<GetCorporationsCorporationIdContractsContractIdItems200Ok> getCorporationsCorporationIdContractsContractIdItems(Integer contractId, Integer corporationId, String datasource, String ifNoneMatch, String token) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'contractId' is set
        if (contractId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'contractId' when calling getCorporationsCorporationIdContractsContractIdItems");
        }
        // verify the required parameter 'corporationId' is set
        if (corporationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'corporationId' when calling getCorporationsCorporationIdContractsContractIdItems");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("contract_id", contractId);
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

        ParameterizedTypeReference<GetCorporationsCorporationIdContractsContractIdItems200Ok> localVarReturnType = new ParameterizedTypeReference<GetCorporationsCorporationIdContractsContractIdItems200Ok>() {};
        return apiClient.invokeFluxAPI("/corporations/{corporation_id}/contracts/{contract_id}/items/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
