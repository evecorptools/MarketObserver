package net.redirectme.squirrelacademy.marketobserver.config;

import org.openapitools.client.ApiClient;
import org.openapitools.client.api.CharacterApi;
import org.openapitools.client.api.MarketApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiConfig {
    @Bean
    ApiClient apiClient() {
        ApiClient apiClient = new ApiClient();
        apiClient.getServers().get(0).URL = "https://esi.evetech.net";
        return apiClient;
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
