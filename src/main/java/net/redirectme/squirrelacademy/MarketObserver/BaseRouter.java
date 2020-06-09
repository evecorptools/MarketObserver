package net.redirectme.squirrelacademy.MarketObserver;


import net.redirectme.squirrelacademy.character.CharacterApi_Functions;
import net.redirectme.squirrelacademy.character.data.PublicInfo;
import org.openapitools.client.ApiClient;
import org.openapitools.client.api.CharacterApi;
import org.openapitools.client.model.GetCharactersCharacterIdStandings200Ok;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.client.*;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;
import org.springframework.security.oauth2.client.token.grant.code.AuthorizationCodeResourceDetails;

import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.security.Principal;
import java.util.*;

@RestController
@EnableOAuth2Client
public class BaseRouter {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired WebClient webClient;

    @Autowired OAuth2RestTemplate restTemplate;

    @Autowired
    OAuth2AuthorizedClientService authorizedClientService;

    @Autowired
    CharacterApi_Functions characterApi_functions;

    //@Autowired ApiClient apiClient;
    //@Autowired CharacterApi characterApi;

    @RestController
    public class MainController {

        @Bean
        protected OAuth2ProtectedResourceDetails eve()
        {
            return new AuthorizationCodeResourceDetails();
        }

        @RequestMapping(value = "/test", produces = "application/json")
        @ResponseBody
        public List<Object> getList(OAuth2AuthenticationToken authentication) {


            try {

                OAuth2User principal = authentication.getPrincipal();
                int id = principal.getAttribute("CharacterID");


                //Works, no AccessToken necessary
                PublicInfo info = characterApi_functions.getPublicInfoCached(id);


                // Works, WebClient auto-updates tokens
                String url = "https://esi.evetech.net/latest/characters/91270824/standings";
                Flux<GetCharactersCharacterIdStandings200Ok> body = webClient
                //String body = webClient
                        .get()
                        .uri(url)
                        .retrieve()
                        .bodyToFlux(GetCharactersCharacterIdStandings200Ok.class)
                        ;
                List<GetCharactersCharacterIdStandings200Ok> list = body.collectList().block();
                logger.info(list.toString());




                // TODO: Does not work. Question: How to set the generated Api to use won Webclient, which uses already existing tokens from login
                // TODO: Use Autowire? But how :)

                ApiClient apiClient = new ApiClient();
                CharacterApi characterApi = new CharacterApi(apiClient);
                Flux<GetCharactersCharacterIdStandings200Ok> standings = characterApi.getCharactersCharacterIdStandings(
                        91270824,
                        "tranquility",
                        null,
                        null
                );
                List<GetCharactersCharacterIdStandings200Ok> standingslist = standings.collectList().block();
                logger.info(standingslist.toString());


                //Resttemplate test, but not intended to be used - webclient prefered
                OAuth2AccessToken newtoken = restTemplate.getAccessToken();


            }catch (Exception e) {
                logger.error(e.getMessage());
            }




            //return something to browser
            List<Object> returnlist = new ArrayList<>();

            OAuth2AuthorizedClient client = authorizedClientService
                    .loadAuthorizedClient(
                            authentication.getAuthorizedClientRegistrationId(),
                            authentication.getName());
            client.getAccessToken();

            returnlist.add(client.getPrincipalName());
            returnlist.add(client.getAccessToken());
            returnlist.add(authentication.getPrincipal().getAttribute("CharacterID"));
            returnlist.add(authentication.getPrincipal().getAttributes());


            return returnlist;
        }



        @GetMapping("/user")
        public Map<String, Object> user(@AuthenticationPrincipal OAuth2User principal) {
            return Collections.singletonMap("name", principal.getAttribute("CharacterName"));
        }



        @RequestMapping(value="/logout", method = RequestMethod.GET)
        public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
            Authentication auth = SecurityContextHolder.getContext().getAuthentication();
            if (auth != null){
                new SecurityContextLogoutHandler().logout(request, response, auth);
            }
            return "redirect:/login?logout=true";
        }
        @GetMapping("/error")
        public String error(HttpServletRequest request) {
            String message = (String) request.getSession().getAttribute("error.message");
            request.getSession().removeAttribute("error.message");
            return message;
        }

        @GetMapping("/user2")
        public String user2 (Principal principal) {
            return "Principal: "+principal.getName();
        }


    }


}
