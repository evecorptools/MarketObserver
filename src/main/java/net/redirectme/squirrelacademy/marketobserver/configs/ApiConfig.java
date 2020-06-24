package net.redirectme.squirrelacademy.marketobserver.configs;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import net.redirectme.squirrelacademy.marketobserver.clients.CoreClient;
import org.openapitools.client.RFC3339DateFormat;
import org.openapitools.jackson.nullable.JsonNullableModule;
import org.springframework.beans.factory.annotation.Value;
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
    CoreClient coreClient(WebClient webClient, ObjectMapper objectMapper, DateFormat esiDateFormat,
                          @Value("${marketobserver.useragent}") String userAgent,
                          @Value("${marketobserver.esibasepath}") String basePath) {
        return new CoreClient(webClient, objectMapper, esiDateFormat, userAgent, basePath);
    }

}
