package net.redirectme.squirrelacademy.marketobserver.services;

import net.redirectme.squirrelacademy.marketobserver.entities.PublicInfo;
import net.redirectme.squirrelacademy.marketobserver.repositories.PublicInfoRepository;
import org.openapitools.client.api.CharacterApi;
import org.openapitools.client.model.GetCharactersCharacterIdCorporationhistory200Ok;
import org.openapitools.client.model.GetCharactersCharacterIdOk;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.List;
import java.util.Optional;

/***
 *
 * Get Public Information for Characters (like Corporation and and Alliance)
 * Changed to WebClient for testing purposes
 *
 */
@Service
public class CharacterService {

    @Value("${esidatasource}")
    String esidatasource; // ="tranquility";

    @Autowired
    PublicInfoRepository publicInfoRepository;
    @Autowired
    CharacterApi characterApi;

    @Autowired
    @Qualifier("noAuth")
    CharacterApi noAuthCharacterApi;

    private PublicInfo getPublicInfo(int characterId) throws Exception {
        GetCharactersCharacterIdOk charactersCharacterId =
                characterApi.getCharactersCharacterId(characterId, esidatasource, null).block();
        return new PublicInfo(charactersCharacterId, characterId);
    }

    public PublicInfo getPublicInfoCached(int characterId) throws Exception {
        PublicInfo publicInfo = publicInfoRepository.findById((long) characterId).orElse(null);
        if (publicInfo == null) {
            publicInfo = getPublicInfo(characterId);
            publicInfoRepository.save(publicInfo);
        }
        return publicInfo;
    }

    /**
     * TODO This function relies on that the most recent corp is the first one returned. This is not a good way.
     */
    public Integer getCurrentCorpId(int characterId) {
        Flux<GetCharactersCharacterIdCorporationhistory200Ok> history = noAuthCharacterApi.getCharactersCharacterIdCorporationhistory(characterId, esidatasource, null);
        List<GetCharactersCharacterIdCorporationhistory200Ok> corps = history.collectList().block();
        if (corps != null && corps.size() > 0) {
            return corps.get(0).getCorporationId();
        }
        return null;
    }

}
