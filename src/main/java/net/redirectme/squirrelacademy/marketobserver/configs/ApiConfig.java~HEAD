package net.redirectme.squirrelacademy.marketobserver.configs;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.openapitools.client.ApiClient;
import org.openapitools.client.RFC3339DateFormat;
import org.openapitools.client.api.CharacterApi;
import org.openapitools.client.api.MarketApi;
import org.openapitools.jackson.nullable.JsonNullableModule;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

import java.text.DateFormat;
import java.util.TimeZone;

@Configuration
public class ApiConfig {

    @Bean
    DateFormat esiDateFormat() {
        DateFormat dateFormat = new RFC3339DateFormat();
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return dateFormat;
    }

    @Bean
    ObjectMapper objectMapper(DateFormat esiDateFormat) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setDateFormat(esiDateFormat);
        mapper.registerModule(new JavaTimeModule());
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        JsonNullableModule jnm = new JsonNullableModule();
        mapper.registerModule(jnm);
        return mapper;
    }

    @Bean
    ApiClient apiClient(WebClient webClient, ObjectMapper objectMapper, DateFormat esiDateFormat) {
        return new ApiClient(webClient, objectMapper, esiDateFormat);
    }

    @Bean
    CharacterApi characterApi(ApiClient apiClient) {
        return new CharacterApi(apiClient);
    }

    @Bean
    MarketApi marketApi(ApiClient apiClient) {
        return new MarketApi(apiClient);
    }

    // It seems it is not possible to call "public" apis since the client will complain about missing authorization
    // So use this work around where we create a client without auth settings.
    @Bean
    @Qualifier("noAuth")
    ApiClient noAuthApiClient() {
        return new ApiClient();
    }

    @Bean
    @Qualifier("noAuth")
    CharacterApi noAuthcharacterApi(@Qualifier("noAuth") ApiClient noAuthApiClient) {
        return new CharacterApi(noAuthApiClient);
    }
}
