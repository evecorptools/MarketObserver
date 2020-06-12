package net.redirectme.squirrelacademy.marketobserver.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.user.DefaultOAuth2User;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/***
 *
 * Used to limit Access to allowed alliance/corporation only
 *
 */
@Service
public class OAuth2UserService extends DefaultOAuth2UserService {

    @Value("${allowed_corporations}")
    String allowed_corporations; // ="tranquility";
    @Autowired
    CharacterService noAuthcharacterApi;

    @Override
    public OAuth2User loadUser(OAuth2UserRequest userRequest) throws OAuth2AuthenticationException {
        OAuth2User user = super.loadUser(userRequest);
        Map<String, Object> attributes = user.getAttributes();
        Set<GrantedAuthority> authorities = new HashSet<>(user.getAuthorities());

        int charId = user.getAttribute("CharacterID");
        Integer corpId = noAuthcharacterApi.getCurrentCorpId(charId);
        for (String corp : allowed_corporations.split(",")) {
            if (corpId.equals(Integer.valueOf(corp))) {
                authorities.add(new SimpleGrantedAuthority("ROLE_ALLOWED"));
            }
        }
        //authorities.add(new OAuth2UserAuthority("ROLE_ADMIN"));
        return new DefaultOAuth2User(authorities, attributes, "CharacterName");
    }

}
