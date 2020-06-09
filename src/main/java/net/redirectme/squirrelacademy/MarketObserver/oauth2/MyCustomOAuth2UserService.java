package net.redirectme.squirrelacademy.MarketObserver.oauth2;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.user.DefaultOAuth2User;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

import java.util.*;

/***
 *
 * Used to limit Access to allowed alliance/corporation only
 *
 */


@Service
@PropertySource("classpath:eveesi.properties")
public class MyCustomOAuth2UserService extends DefaultOAuth2UserService {


    //@Autowired
    //CharacterApi_Functions characterApi_functions;



    @Value("${allowed_corporations}")
    String allowed_corporations; // ="tranquility";

    @Override
    public OAuth2User loadUser(OAuth2UserRequest userRequest) throws OAuth2AuthenticationException {
        OAuth2User user = super.loadUser(userRequest);
        Map<String, Object> attributes = user.getAttributes();
        Set<GrantedAuthority> authorities = new HashSet<>(user.getAuthorities());


        userRequest.getClientRegistration();
        userRequest.getAccessToken();

        /*
        int charId = user.getAttribute("CharacterID");
        try {
            PublicInfo publicInfo = characterApi_functions.getPublicInfoCached(charId);
            //user.getAttributes().put("CorporationID", publicInfo.getCorporationid());
            //attributes.put("CorporationID", publicInfo.getCorporationid());
            //attributes.put("AllianceID", publicInfo.getAllianceid());
            for (String corp : allowed_corporations.split(",")) {
                if (publicInfo.getCorporationid() == Integer.valueOf(corp)) {
                    authorities.add(new SimpleGrantedAuthority("ROLE_ALLOWED"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

*/
        //authorities.add(new OAuth2UserAuthority("ROLE_ADMIN"));

        return new DefaultOAuth2User(authorities, attributes, "CharacterName");
    }

}
