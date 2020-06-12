package net.redirectme.squirrelacademy.marketobserver.config;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.security.web.authentication.HttpStatusEntryPoint;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;


@Configuration
@EnableOAuth2Client
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
//                .rememberMe().rememberMeServices(rememberMeServices())
//                .and()
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

//    @Bean
//    SpringSessionRememberMeServices rememberMeServices() {
//        SpringSessionRememberMeServices rememberMeServices = new SpringSessionRememberMeServices();
//        rememberMeServices.setAlwaysRemember(true);
//
//        return rememberMeServices;
//    }

//    @Bean
//    OAuth2RestTemplate restTemplate (OAuth2ProtectedResourceDetails oauth2RemoteResource) {
//        OAuth2RestTemplate oAuth2RestTemplate = new OAuth2RestTemplate(oauth2RemoteResource, oauth2ClientContext);
//        oAuth2RestTemplate.getAccessToken();
//        return oAuth2RestTemplate;
//    }


}
