package net.redirectme.squirrelacademy.marketobserver;

import net.redirectme.squirrelacademy.marketobserver.services.MarketService;
import net.redirectme.squirrelacademy.marketobserver.services.oauth.MyOAuth2AuthorizedClientservice;
import org.openapitools.client.ApiClient;
import org.openapitools.client.model.GetMarketsStructuresStructureId200Ok;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientService;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.security.Principal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
public class BaseRouter {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @RestController
    public class MainController {

        @Autowired
        MarketService marketService;
        @Autowired
        ApiClient apiClient;
        @Autowired
        OAuth2AuthorizedClientService oAuth2AuthorizedClientService;

        @RequestMapping(value = "/test", produces = "application/json")
        @ResponseBody
        public List<GetMarketsStructuresStructureId200Ok> getList(OAuth2AuthenticationToken authentication) {
            //return something to browser
            // TODO This should be done automatically when oauth2 login callback is finished
            OAuth2AuthorizedClient client = oAuth2AuthorizedClientService
                    .loadAuthorizedClient(
                            authentication.getAuthorizedClientRegistrationId(),
                            authentication.getName());
            apiClient.setAccessToken(client.getAccessToken().getTokenValue());
            // end todo

            return marketService.getData(1027847403762l);
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
