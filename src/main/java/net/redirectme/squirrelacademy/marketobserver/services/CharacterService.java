package net.redirectme.squirrelacademy.marketobserver.services;

import net.redirectme.squirrelacademy.marketobserver.entities.PublicInfo;
import net.redirectme.squirrelacademy.marketobserver.repositories.PublicInfoRepository;
import org.openapitools.client.api.CharacterApi;
import org.openapitools.client.model.GetCharactersCharacterIdOk;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

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

    private PublicInfo getPublicInfo(int characterId) throws Exception {
        GetCharactersCharacterIdOk charactersCharacterId =
                characterApi.getCharactersCharacterId(characterId, esidatasource, null);
        return new PublicInfo(charactersCharacterId, characterId);
    }

    public PublicInfo getPublicInfoCached(int characterId) throws Exception {
        PublicInfo publicInfo = publicInfoRepository.findByCharacterid(characterId);
        if (publicInfo ==null) {
            publicInfo = getPublicInfo(characterId);
            publicInfoRepository.save(publicInfo);
        }
        return publicInfo;
    }


}
