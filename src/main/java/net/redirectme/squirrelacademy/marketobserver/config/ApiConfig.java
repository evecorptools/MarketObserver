package net.redirectme.squirrelacademy.marketobserver.config;

import org.openapitools.client.ApiClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiConfig {
    @Bean
    ApiClient apiClient() {
        return new ApiClient();
    }
}
