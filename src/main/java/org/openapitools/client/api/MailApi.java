package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.BadRequest;
import org.openapitools.client.model.DeleteCharactersCharacterIdMailLabelsLabelIdUnprocessableEntity;
import org.openapitools.client.model.ErrorLimited;
import org.openapitools.client.model.Forbidden;
import org.openapitools.client.model.GatewayTimeout;
import org.openapitools.client.model.GetCharactersCharacterIdMail200Ok;
import org.openapitools.client.model.GetCharactersCharacterIdMailLabelsOk;
import org.openapitools.client.model.GetCharactersCharacterIdMailLists200Ok;
import org.openapitools.client.model.GetCharactersCharacterIdMailMailIdNotFound;
import org.openapitools.client.model.GetCharactersCharacterIdMailMailIdOk;
import org.openapitools.client.model.InternalServerError;
import org.openapitools.client.model.PostCharactersCharacterIdMailError520;
import org.openapitools.client.model.PostCharactersCharacterIdMailLabelsLabel;
import org.openapitools.client.model.PostCharactersCharacterIdMailMail;
import org.openapitools.client.model.PutCharactersCharacterIdMailMailIdContents;
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
public class MailApi {
    private ApiClient apiClient;

    public MailApi() {
        this(new ApiClient());
    }

    @Autowired
    public MailApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Delete a mail label
     * Delete a mail label  --- Alternate route: &#x60;/dev/characters/{character_id}/mail/labels/{label_id}/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/mail/labels/{label_id}/&#x60;  Alternate route: &#x60;/v1/characters/{character_id}/mail/labels/{label_id}/&#x60; 
     * <p><b>204</b> - Label deleted
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>420</b> - Error limited
     * <p><b>422</b> - Default labels cannot be deleted
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param characterId An EVE character ID
     * @param labelId An EVE label id
     * @param datasource The server name you would like data from
     * @param token Access token to use if unable to set a header
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> deleteCharactersCharacterIdMailLabelsLabelId(Integer characterId, Integer labelId, String datasource, String token) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'characterId' when calling deleteCharactersCharacterIdMailLabelsLabelId");
        }
        // verify the required parameter 'labelId' is set
        if (labelId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'labelId' when calling deleteCharactersCharacterIdMailLabelsLabelId");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("character_id", characterId);
        pathParams.put("label_id", labelId);

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
        return apiClient.invokeAPI("/characters/{character_id}/mail/labels/{label_id}/", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Delete a mail
     * Delete a mail  --- Alternate route: &#x60;/dev/characters/{character_id}/mail/{mail_id}/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/mail/{mail_id}/&#x60;  Alternate route: &#x60;/v1/characters/{character_id}/mail/{mail_id}/&#x60; 
     * <p><b>204</b> - Mail deleted
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param characterId An EVE character ID
     * @param mailId An EVE mail ID
     * @param datasource The server name you would like data from
     * @param token Access token to use if unable to set a header
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> deleteCharactersCharacterIdMailMailId(Integer characterId, Integer mailId, String datasource, String token) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'characterId' when calling deleteCharactersCharacterIdMailMailId");
        }
        // verify the required parameter 'mailId' is set
        if (mailId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailId' when calling deleteCharactersCharacterIdMailMailId");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("character_id", characterId);
        pathParams.put("mail_id", mailId);

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
        return apiClient.invokeAPI("/characters/{character_id}/mail/{mail_id}/", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Return mail headers
     * Return the 50 most recent mail headers belonging to the character that match the query criteria. Queries can be filtered by label, and last_mail_id can be used to paginate backwards  --- Alternate route: &#x60;/dev/characters/{character_id}/mail/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/mail/&#x60;  Alternate route: &#x60;/v1/characters/{character_id}/mail/&#x60;  --- This route is cached for up to 30 seconds
     * <p><b>200</b> - The requested mail
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
     * @param labels Fetch only mails that match one or more of the given labels
     * @param lastMailId List only mail with an ID lower than the given ID, if present
     * @param token Access token to use if unable to set a header
     * @return List&lt;GetCharactersCharacterIdMail200Ok&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<GetCharactersCharacterIdMail200Ok> getCharactersCharacterIdMail(Integer characterId, String datasource, String ifNoneMatch, List<Integer> labels, Integer lastMailId, String token) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'characterId' when calling getCharactersCharacterIdMail");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("character_id", characterId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "datasource", datasource));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "labels", labels));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "last_mail_id", lastMailId));
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

        ParameterizedTypeReference<GetCharactersCharacterIdMail200Ok> localVarReturnType = new ParameterizedTypeReference<GetCharactersCharacterIdMail200Ok>() {};
        return apiClient.invokeFluxAPI("/characters/{character_id}/mail/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get mail labels and unread counts
     * Return a list of the users mail labels, unread counts for each label and a total unread count.  --- Alternate route: &#x60;/dev/characters/{character_id}/mail/labels/&#x60;  Alternate route: &#x60;/v3/characters/{character_id}/mail/labels/&#x60;  --- This route is cached for up to 30 seconds
     * <p><b>200</b> - A list of mail labels and unread counts
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
     * @return GetCharactersCharacterIdMailLabelsOk
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<GetCharactersCharacterIdMailLabelsOk> getCharactersCharacterIdMailLabels(Integer characterId, String datasource, String ifNoneMatch, String token) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'characterId' when calling getCharactersCharacterIdMailLabels");
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

        ParameterizedTypeReference<GetCharactersCharacterIdMailLabelsOk> localVarReturnType = new ParameterizedTypeReference<GetCharactersCharacterIdMailLabelsOk>() {};
        return apiClient.invokeAPI("/characters/{character_id}/mail/labels/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Return mailing list subscriptions
     * Return all mailing lists that the character is subscribed to  --- Alternate route: &#x60;/dev/characters/{character_id}/mail/lists/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/mail/lists/&#x60;  Alternate route: &#x60;/v1/characters/{character_id}/mail/lists/&#x60;  --- This route is cached for up to 120 seconds
     * <p><b>200</b> - Mailing lists
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
     * @return List&lt;GetCharactersCharacterIdMailLists200Ok&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<GetCharactersCharacterIdMailLists200Ok> getCharactersCharacterIdMailLists(Integer characterId, String datasource, String ifNoneMatch, String token) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'characterId' when calling getCharactersCharacterIdMailLists");
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

        ParameterizedTypeReference<GetCharactersCharacterIdMailLists200Ok> localVarReturnType = new ParameterizedTypeReference<GetCharactersCharacterIdMailLists200Ok>() {};
        return apiClient.invokeFluxAPI("/characters/{character_id}/mail/lists/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Return a mail
     * Return the contents of an EVE mail  --- Alternate route: &#x60;/dev/characters/{character_id}/mail/{mail_id}/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/mail/{mail_id}/&#x60;  Alternate route: &#x60;/v1/characters/{character_id}/mail/{mail_id}/&#x60;  --- This route is cached for up to 30 seconds
     * <p><b>200</b> - Contents of a mail
     * <p><b>304</b> - Not modified
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Mail not found
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param characterId An EVE character ID
     * @param mailId An EVE mail ID
     * @param datasource The server name you would like data from
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param token Access token to use if unable to set a header
     * @return GetCharactersCharacterIdMailMailIdOk
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<GetCharactersCharacterIdMailMailIdOk> getCharactersCharacterIdMailMailId(Integer characterId, Integer mailId, String datasource, String ifNoneMatch, String token) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'characterId' when calling getCharactersCharacterIdMailMailId");
        }
        // verify the required parameter 'mailId' is set
        if (mailId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailId' when calling getCharactersCharacterIdMailMailId");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("character_id", characterId);
        pathParams.put("mail_id", mailId);

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

        ParameterizedTypeReference<GetCharactersCharacterIdMailMailIdOk> localVarReturnType = new ParameterizedTypeReference<GetCharactersCharacterIdMailMailIdOk>() {};
        return apiClient.invokeAPI("/characters/{character_id}/mail/{mail_id}/", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Send a new mail
     * Create and send a new mail  --- Alternate route: &#x60;/dev/characters/{character_id}/mail/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/mail/&#x60;  Alternate route: &#x60;/v1/characters/{character_id}/mail/&#x60; 
     * <p><b>201</b> - Mail created
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * <p><b>520</b> - Internal error thrown from the EVE server. Most of the time this means you have hit an EVE server rate limit
     * @param characterId An EVE character ID
     * @param mail The mail parameter
     * @param datasource The server name you would like data from
     * @param token Access token to use if unable to set a header
     * @return Integer
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Integer> postCharactersCharacterIdMail(Integer characterId, PostCharactersCharacterIdMailMail mail, String datasource, String token) throws RestClientException {
        Object postBody = mail;
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'characterId' when calling postCharactersCharacterIdMail");
        }
        // verify the required parameter 'mail' is set
        if (mail == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mail' when calling postCharactersCharacterIdMail");
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

        ParameterizedTypeReference<Integer> localVarReturnType = new ParameterizedTypeReference<Integer>() {};
        return apiClient.invokeAPI("/characters/{character_id}/mail/", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Create a mail label
     * Create a mail label  --- Alternate route: &#x60;/dev/characters/{character_id}/mail/labels/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/mail/labels/&#x60;  Alternate route: &#x60;/v2/characters/{character_id}/mail/labels/&#x60; 
     * <p><b>201</b> - Label created
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param characterId An EVE character ID
     * @param label The label parameter
     * @param datasource The server name you would like data from
     * @param token Access token to use if unable to set a header
     * @return Integer
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Integer> postCharactersCharacterIdMailLabels(Integer characterId, PostCharactersCharacterIdMailLabelsLabel label, String datasource, String token) throws RestClientException {
        Object postBody = label;
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'characterId' when calling postCharactersCharacterIdMailLabels");
        }
        // verify the required parameter 'label' is set
        if (label == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'label' when calling postCharactersCharacterIdMailLabels");
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

        ParameterizedTypeReference<Integer> localVarReturnType = new ParameterizedTypeReference<Integer>() {};
        return apiClient.invokeAPI("/characters/{character_id}/mail/labels/", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Update metadata about a mail
     * Update metadata about a mail  --- Alternate route: &#x60;/dev/characters/{character_id}/mail/{mail_id}/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/mail/{mail_id}/&#x60;  Alternate route: &#x60;/v1/characters/{character_id}/mail/{mail_id}/&#x60; 
     * <p><b>204</b> - Mail updated
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>420</b> - Error limited
     * <p><b>500</b> - Internal server error
     * <p><b>503</b> - Service unavailable
     * <p><b>504</b> - Gateway timeout
     * @param characterId An EVE character ID
     * @param mailId An EVE mail ID
     * @param contents The contents parameter
     * @param datasource The server name you would like data from
     * @param token Access token to use if unable to set a header
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> putCharactersCharacterIdMailMailId(Integer characterId, Integer mailId, PutCharactersCharacterIdMailMailIdContents contents, String datasource, String token) throws RestClientException {
        Object postBody = contents;
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'characterId' when calling putCharactersCharacterIdMailMailId");
        }
        // verify the required parameter 'mailId' is set
        if (mailId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailId' when calling putCharactersCharacterIdMailMailId");
        }
        // verify the required parameter 'contents' is set
        if (contents == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'contents' when calling putCharactersCharacterIdMailMailId");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("character_id", characterId);
        pathParams.put("mail_id", mailId);

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
        return apiClient.invokeAPI("/characters/{character_id}/mail/{mail_id}/", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
