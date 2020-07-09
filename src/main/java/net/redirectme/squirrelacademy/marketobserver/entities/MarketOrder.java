package net.redirectme.squirrelacademy.marketobserver.entities;

import net.redirectme.squirrelacademy.marketobserver.entities.compositekeyclasses.MarketOrderKeys;
import org.openapitools.client.model.GetMarketsRegionIdOrders200Ok;
import org.openapitools.client.model.GetMarketsStructuresStructureId200Ok;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity
@IdClass(MarketOrderKeys.class)
@Table(name="api_marketorders")
public class MarketOrder {
    @Id
    @Column(name="order_id")
    long order_id;

    @Column(name="type_id")
    int type_id;

    @Column (name = "location_id")
    long location_id;

    @Column(name="volume_total")
    long volume_total;

    @Column(name="volume_remain")
    long volume_remain;

    @Column(name = "volume_min")
    long min_volume;

    @Column(name = "price")
    double price;

    @Column(name = "is_buy_order")
    Boolean is_buy_order;

    @Column(name = "duration")
    int duration;

    @Column(name = "issued")
    String issued;

    @Column(name = "order_range")
    String range;

    @Column(name = "system_id")
    int system_id;

    @Column(name="request_location")
    long requestlocation;

    @Id
    @Column
    int characterID;

    public MarketOrder(GetMarketsRegionIdOrders200Ok order, long requestedlocation, int character_id) {
        order_id = order.getOrderId();
        type_id = order.getTypeId();
        location_id = order.getLocationId();
        volume_total = order.getVolumeTotal();
        volume_remain = order.getVolumeRemain();
        min_volume = order.getMinVolume();
        price = order.getPrice();
        is_buy_order = order.getIsBuyOrder();
        duration = order.getDuration();
        issued = order.getIssued().toString();
        range = order.getRange().getValue();
        system_id = order.getSystemId();
        requestlocation = requestedlocation;
        characterID = character_id;
    }
    public MarketOrder(GetMarketsStructuresStructureId200Ok order, long requestedlocation, int character_id) {
        order_id = order.getOrderId();
        type_id = order.getTypeId();
        location_id = order.getLocationId();
        volume_total = order.getVolumeTotal();
        volume_remain = order.getVolumeRemain();
        min_volume = order.getMinVolume();
        price = order.getPrice();
        is_buy_order = order.getIsBuyOrder();
        duration = order.getDuration();
        issued = order.getIssued().toString();
        range = order.getRange().getValue();

        requestlocation = requestedlocation;
        characterID = character_id;
    }

    public MarketOrder() {
    }

    public long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(long order_id) {
        this.order_id = order_id;
    }

    public int getType_id() {
        return type_id;
    }

    public void setType_id(int type_id) {
        this.type_id = type_id;
    }

    public long getLocation_id() {
        return location_id;
    }

    public void setLocation_id(long location_id) {
        this.location_id = location_id;
    }

    public long getVolume_total() {
        return volume_total;
    }

    public void setVolume_total(long volume_total) {
        this.volume_total = volume_total;
    }

    public long getVolume_remain() {
        return volume_remain;
    }

    public void setVolume_remain(long volume_remain) {
        this.volume_remain = volume_remain;
    }

    public long getMin_volume() {
        return min_volume;
    }

    public void setMin_volume(long min_volume) {
        this.min_volume = min_volume;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Boolean getIs_buy_order() {
        return is_buy_order;
    }

    public void setIs_buy_order(Boolean is_buy_order) {
        this.is_buy_order = is_buy_order;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getIssued() {
        return issued;
    }

    public void setIssued(String issued) {
        this.issued = issued;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public int getSystem_id() {
        return system_id;
    }

    public void setSystem_id(int system_id) {
        this.system_id = system_id;
    }

    public long getRequestlocation() {
        return requestlocation;
    }

    public void setRequestlocation(long requestlocation) {
        this.requestlocation = requestlocation;
    }
}
