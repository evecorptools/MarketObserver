package net.redirectme.squirrelacademy.marketobserver.character.data;

import org.openapitools.client.model.GetCharactersCharacterIdOk;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.OffsetDateTime;

@Entity
@Table(name="character_publicinfo")
public class PublicInfo {
    @Id
    int characterid;
    @Column(nullable = true)
    Integer allianceid;
    int ancestryid;
    OffsetDateTime birthday;
    int bloodlineid;
    int corporationid;
    @Column(columnDefinition = "TEXT", nullable = true)
    String description;
    @Column(nullable = true)
    Integer factionid;
    String gender;
    String name;
    int raceid;
    Float securitystatus;
    String title;

    public PublicInfo() {
    }

    public PublicInfo(GetCharactersCharacterIdOk getCharactersCharacterIdOk, int characterid) {
        this.characterid = characterid;
        this.allianceid = getCharactersCharacterIdOk.getAllianceId();
        this.ancestryid = getCharactersCharacterIdOk.getAncestryId();
        this.birthday = getCharactersCharacterIdOk.getBirthday();
        this.bloodlineid = getCharactersCharacterIdOk.getBloodlineId();
        this.corporationid = getCharactersCharacterIdOk.getCorporationId();
        this.description = getCharactersCharacterIdOk.getDescription();
        this.factionid = getCharactersCharacterIdOk.getFactionId();
        this.gender = getCharactersCharacterIdOk.getGender().getValue();
        this.name = getCharactersCharacterIdOk.getName();
        this.raceid = getCharactersCharacterIdOk.getRaceId();
        this.securitystatus = getCharactersCharacterIdOk.getSecurityStatus();
        this.title = getCharactersCharacterIdOk.getTitle();
    }

    public PublicInfo(int characterid, int allianceid, int ancestryid, OffsetDateTime birthday, int bloodlineid, int corporationid, String description, int factionid, String gender, String name, int raceid, Float securitystatus, String title) {
        this.characterid = characterid;
        this.allianceid = allianceid;
        this.ancestryid = ancestryid;
        this.birthday = birthday;
        this.bloodlineid = bloodlineid;
        this.corporationid = corporationid;
        this.description = description;
        this.factionid = factionid;
        this.gender = gender;
        this.name = name;
        this.raceid = raceid;
        this.securitystatus = securitystatus;
        this.title = title;
    }

    public int getCharacterid() {
        return characterid;
    }

    public void setCharacterid(int characterid) {
        this.characterid = characterid;
    }

    public int getAllianceid() {
        return allianceid;
    }

    public void setAllianceid(int allianceid) {
        this.allianceid = allianceid;
    }

    public int getAncestryid() {
        return ancestryid;
    }

    public void setAncestryid(int ancestryid) {
        this.ancestryid = ancestryid;
    }

    public OffsetDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(OffsetDateTime birthday) {
        this.birthday = birthday;
    }

    public int getBloodlineid() {
        return bloodlineid;
    }

    public void setBloodlineid(int bloodlineid) {
        this.bloodlineid = bloodlineid;
    }

    public int getCorporationid() {
        return corporationid;
    }

    public void setCorporationid(int corporationid) {
        this.corporationid = corporationid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getFactionid() {
        return factionid;
    }

    public void setFactionid(int factionid) {
        this.factionid = factionid;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRaceid() {
        return raceid;
    }

    public void setRaceid(int raceid) {
        this.raceid = raceid;
    }

    public Float getSecuritystatus() {
        return securitystatus;
    }

    public void setSecuritystatus(Float securitystatus) {
        this.securitystatus = securitystatus;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
