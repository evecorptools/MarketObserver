package net.redirectme.squirrelacademy.marketobserver.entities;

import net.redirectme.squirrelacademy.marketobserver.entities.compositekeyclasses.MarketOrderKeys;
import net.redirectme.squirrelacademy.marketobserver.entities.compositekeyclasses.RequestedItemsKeys;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="marketobserver_requesteditems")
@IdClass(RequestedItemsKeys.class)
public class RequestedItem {


    @Id
    @Column(name="character_id_insert")
    Integer character_id_insert;

    @Column(name="character_id_update")
    Integer character_id_update;

    @Column(name="personal")
    Boolean personal;


    @Column(name="location_id")
    BigDecimal location_id;

    @Id
    @Column(name="type_id")
    Integer type_id;


    @Column(name="amount_quota")
    Integer amount_quota;


    public RequestedItem() {
    }

    public RequestedItem(Integer character_id_insert, Integer character_id_update, Boolean personal, BigDecimal location_id, Integer type_id, Integer amount_quota) {
        this.character_id_insert = character_id_insert;
        this.character_id_update = character_id_update;
        this.personal = personal;
        this.location_id = location_id;
        this.type_id = type_id;
        this.amount_quota = amount_quota;
    }

    public Integer getCharacter_id_insert() {
        return character_id_insert;
    }

    public void setCharacter_id_insert(Integer character_id_insert) {
        this.character_id_insert = character_id_insert;
    }

    public Integer getCharacter_id_update() {
        return character_id_update;
    }

    public void setCharacter_id_update(Integer character_id_update) {
        this.character_id_update = character_id_update;
    }

    public Boolean getPersonal() {
        return personal;
    }

    public void setPersonal(Boolean personal) {
        this.personal = personal;
    }

    public BigDecimal getLocation_id() {
        return location_id;
    }

    public void setLocation_id(BigDecimal location_id) {
        this.location_id = location_id;
    }

    public Integer getType_id() {
        return type_id;
    }

    public void setType_id(Integer type_id) {
        this.type_id = type_id;
    }

    public Integer getAmount_quota() {
        return amount_quota;
    }

    public void setAmount_quota(Integer amount_quota) {
        this.amount_quota = amount_quota;
    }
}
