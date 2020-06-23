package net.redirectme.squirrelacademy.marketobserver.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientManager;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientProvider;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientProviderBuilder;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.web.DefaultOAuth2AuthorizedClientManager;
import org.springframework.security.oauth2.client.web.OAuth2AuthorizedClientRepository;
import org.springframework.security.oauth2.client.web.reactive.function.client.ServletOAuth2AuthorizedClientExchangeFilterFunction;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Bean
    public OAuth2AuthorizedClientManager auth2AuthorizedClientManager(
            ClientRegistrationRepository clientRegistrationRepository,
            OAuth2AuthorizedClientRepository authorizedClientRepository) {
        OAuth2AuthorizedClientProvider auth2AuthorizedClientProvider = OAuth2AuthorizedClientProviderBuilder
                .builder()
                .authorizationCode()
                .refreshToken()
                .build();
        DefaultOAuth2AuthorizedClientManager auth2AuthorizedClientManager = new DefaultOAuth2AuthorizedClientManager(
                clientRegistrationRepository, authorizedClientRepository);
        auth2AuthorizedClientManager.setAuthorizedClientProvider(auth2AuthorizedClientProvider);
        return auth2AuthorizedClientManager;
    }

    @Bean
    public WebClient webClient(OAuth2AuthorizedClientManager auth2AuthorizedClientManager) {
        ServletOAuth2AuthorizedClientExchangeFilterFunction oauth2Client =
                new ServletOAuth2AuthorizedClientExchangeFilterFunction(auth2AuthorizedClientManager);
        oauth2Client.setDefaultClientRegistrationId("evesso");
        return WebClient.builder()
                .apply(oauth2Client.oauth2Configuration())
                .build();
    }
}