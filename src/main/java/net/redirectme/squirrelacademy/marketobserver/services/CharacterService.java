package net.redirectme.squirrelacademy.marketobserver.services;

import net.redirectme.squirrelacademy.marketobserver.clients.CharacterClient;
import net.redirectme.squirrelacademy.marketobserver.entities.PublicInfo;
import net.redirectme.squirrelacademy.marketobserver.repositories.PublicInfoRepository;
import org.openapitools.client.model.GetCharactersCharacterIdCorporationhistory200Ok;
import org.openapitools.client.model.GetCharactersCharacterIdOk;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/***
 *
 * Get Public Information for Characters (like Corporation and and Alliance)
 * Changed to WebClient for testing purposes
 *
 */
@Service
public class CharacterService {

    @Autowired
    PublicInfoRepository publicInfoRepository;
    @Autowired
    CharacterClient characterClient;

    private PublicInfo getPublicInfo(int characterId) throws Exception {
        GetCharactersCharacterIdOk charactersCharacterId =
                characterClient.getCharactersCharacterId(characterId, null).getBody();
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
        ResponseEntity<List<GetCharactersCharacterIdCorporationhistory200Ok>> historyResponse = characterClient.getCharactersCharacterIdCorporationhistory(characterId, null);
        List<GetCharactersCharacterIdCorporationhistory200Ok> corps = historyResponse.getBody();
        if (corps != null && corps.size() > 0) {
            return corps.get(0).getCorporationId();
        }
        return null;
    }

}
