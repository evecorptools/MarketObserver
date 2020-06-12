package net.redirectme.squirrelacademy.marketobserver.config;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.openapitools.client.ApiClient;
import org.openapitools.client.RFC3339DateFormat;
import org.openapitools.client.api.CharacterApi;
import org.openapitools.client.api.MarketApi;
import org.openapitools.jackson.nullable.JsonNullableModule;
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
}
