package net.redirectme.squirrelacademy.MarketObserver.oauth2;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientService;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.filter.OAuth2ClientContextFilter;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.security.web.authentication.HttpStatusEntryPoint;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import org.springframework.session.security.web.authentication.SpringSessionRememberMeServices;

import javax.sql.DataSource;


@Configuration
@EnableWebSecurity
@EnableOAuth2Client
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private MyCustomOAuth2UserService userService;

    @Autowired OAuth2AuthorizedClientService authorizedClientService;

    @Autowired
    ClientRegistrationRepository clientRegistrationRepository;

    @Autowired
    private OAuth2ClientContext oauth2ClientContext;

    @Autowired
    private OAuth2ClientContextFilter oauth2ClientContextFilter;
    @Autowired
    DataSource dataSource;


    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                .rememberMe().rememberMeServices(rememberMeServices())
                .and()
                .authorizeRequests(a -> a
                        .antMatchers("/", "/error", "/webjars/**").permitAll()
                        .anyRequest().authenticated()
                )
                .exceptionHandling(e -> e
                        .authenticationEntryPoint(new HttpStatusEntryPoint(HttpStatus.UNAUTHORIZED))
                )
                .csrf(c -> c
                                .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
                        //.disable()
                )
                .logout(l -> l
                        .logoutSuccessUrl("/").permitAll()
                        //authorizedClientService.removeAuthorizedClient(userService.)
                        .invalidateHttpSession(true)
                )
                .oauth2Login(o -> o
                        .failureHandler((request, response, exception) -> {
                            request.getSession().setAttribute("error.message", exception.getMessage());
                            //handler.onAuthenticationFailure(request, response, exception);
                        })

                )
        .oauth2Client()

        ;

    }



    @Bean
    SpringSessionRememberMeServices rememberMeServices() {
        SpringSessionRememberMeServices rememberMeServices = new SpringSessionRememberMeServices();
        rememberMeServices.setAlwaysRemember(true);

        return rememberMeServices;
    }

    @Bean
    OAuth2RestTemplate restTemplate (OAuth2ProtectedResourceDetails oauth2RemoteResource) {
        OAuth2RestTemplate oAuth2RestTemplate = new OAuth2RestTemplate(oauth2RemoteResource, oauth2ClientContext);
        //oAuth2RestTemplate.getAccessToken();
        return oAuth2RestTemplate;
    }


}
