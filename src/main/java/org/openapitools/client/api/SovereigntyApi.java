package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.BadRequest;
import org.openapitools.client.model.ErrorLimited;
import org.openapitools.client.model.GatewayTimeout;
import org.openapitools.client.model.GetSovereigntyCampaigns200Ok;
import org.openapitools.client.model.GetSovereigntyMap200Ok;
import org.openapitools.client.model.GetSovereigntyStructures200Ok;
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
public class SovereigntyApi {
    private ApiClient apiClient;

    public SovereigntyApi() {
        this(new ApiClient());
    }

    @Autowired
    public SovereigntyApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * List sovereignty campaigns
     * Shows sovereignty data for campaigns.  --- Alternate route: &#x60;/dev/sovereignty/campaigns/&#x60;  Alternate route: &#x60;/legacy/sovereignty/campaigns/&#x60;  Alternate route: &#x60;/v1/sovereignty/campaigns/&#x60;  --- This route is cached for up to 5 seconds
     * <p><b>200</b> - A list of sovereignty campaigns
     * <p><b>304</b> - Not modified
     * <p><b>400</b> - Bad request
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return List&lt;GetSovereigntyCampaigns200Ok&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<GetSovereigntyCampaigns200Ok> getSovereigntyCampaigns(String datasource, String ifNoneMatch) throws RestClientException {
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

        ParameterizedTypeReference<GetSovereigntyCampaigns200Ok> localVarReturnType = new ParameterizedTypeReference<GetSovereigntyCampaigns200Ok>() {};
        return apiClient.invokeFluxAPI("/sovereignty/campaigns/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * List sovereignty of systems
     * Shows sovereignty information for solar systems  --- Alternate route: &#x60;/dev/sovereignty/map/&#x60;  Alternate route: &#x60;/legacy/sovereignty/map/&#x60;  Alternate route: &#x60;/v1/sovereignty/map/&#x60;  --- This route is cached for up to 3600 seconds
     * <p><b>200</b> - A list of sovereignty information for solar systems in New Eden
     * <p><b>304</b> - Not modified
     * <p><b>400</b> - Bad request
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return List&lt;GetSovereigntyMap200Ok&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<GetSovereigntyMap200Ok> getSovereigntyMap(String datasource, String ifNoneMatch) throws RestClientException {
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

        ParameterizedTypeReference<GetSovereigntyMap200Ok> localVarReturnType = new ParameterizedTypeReference<GetSovereigntyMap200Ok>() {};
        return apiClient.invokeFluxAPI("/sovereignty/map/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * List sovereignty structures
     * Shows sovereignty data for structures.  --- Alternate route: &#x60;/dev/sovereignty/structures/&#x60;  Alternate route: &#x60;/legacy/sovereignty/structures/&#x60;  Alternate route: &#x60;/v1/sovereignty/structures/&#x60;  --- This route is cached for up to 120 seconds
     * <p><b>200</b> - A list of sovereignty structures
     * <p><b>304</b> - Not modified
     * <p><b>400</b> - Bad request
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @return List&lt;GetSovereigntyStructures200Ok&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<GetSovereigntyStructures200Ok> getSovereigntyStructures(String datasource, String ifNoneMatch) throws RestClientException {
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

        ParameterizedTypeReference<GetSovereigntyStructures200Ok> localVarReturnType = new ParameterizedTypeReference<GetSovereigntyStructures200Ok>() {};
        return apiClient.invokeFluxAPI("/sovereignty/structures/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
