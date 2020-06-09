/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * The version of the OpenAPI document: 1.3.8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * market object
 */
@ApiModel(description = "market object")
@JsonPropertyOrder({
  GetCharactersCharacterIdStatsMarket.JSON_PROPERTY_ACCEPT_CONTRACTS_COURIER,
  GetCharactersCharacterIdStatsMarket.JSON_PROPERTY_ACCEPT_CONTRACTS_ITEM_EXCHANGE,
  GetCharactersCharacterIdStatsMarket.JSON_PROPERTY_BUY_ORDERS_PLACED,
  GetCharactersCharacterIdStatsMarket.JSON_PROPERTY_CANCEL_MARKET_ORDER,
  GetCharactersCharacterIdStatsMarket.JSON_PROPERTY_CREATE_CONTRACTS_AUCTION,
  GetCharactersCharacterIdStatsMarket.JSON_PROPERTY_CREATE_CONTRACTS_COURIER,
  GetCharactersCharacterIdStatsMarket.JSON_PROPERTY_CREATE_CONTRACTS_ITEM_EXCHANGE,
  GetCharactersCharacterIdStatsMarket.JSON_PROPERTY_DELIVER_COURIER_CONTRACT,
  GetCharactersCharacterIdStatsMarket.JSON_PROPERTY_ISK_GAINED,
  GetCharactersCharacterIdStatsMarket.JSON_PROPERTY_ISK_SPENT,
  GetCharactersCharacterIdStatsMarket.JSON_PROPERTY_MODIFY_MARKET_ORDER,
  GetCharactersCharacterIdStatsMarket.JSON_PROPERTY_SEARCH_CONTRACTS,
  GetCharactersCharacterIdStatsMarket.JSON_PROPERTY_SELL_ORDERS_PLACED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-06-04T13:00:04.672Z[Etc/UTC]")
public class GetCharactersCharacterIdStatsMarket implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ACCEPT_CONTRACTS_COURIER = "accept_contracts_courier";
  private Long acceptContractsCourier;

  public static final String JSON_PROPERTY_ACCEPT_CONTRACTS_ITEM_EXCHANGE = "accept_contracts_item_exchange";
  private Long acceptContractsItemExchange;

  public static final String JSON_PROPERTY_BUY_ORDERS_PLACED = "buy_orders_placed";
  private Long buyOrdersPlaced;

  public static final String JSON_PROPERTY_CANCEL_MARKET_ORDER = "cancel_market_order";
  private Long cancelMarketOrder;

  public static final String JSON_PROPERTY_CREATE_CONTRACTS_AUCTION = "create_contracts_auction";
  private Long createContractsAuction;

  public static final String JSON_PROPERTY_CREATE_CONTRACTS_COURIER = "create_contracts_courier";
  private Long createContractsCourier;

  public static final String JSON_PROPERTY_CREATE_CONTRACTS_ITEM_EXCHANGE = "create_contracts_item_exchange";
  private Long createContractsItemExchange;

  public static final String JSON_PROPERTY_DELIVER_COURIER_CONTRACT = "deliver_courier_contract";
  private Long deliverCourierContract;

  public static final String JSON_PROPERTY_ISK_GAINED = "isk_gained";
  private Long iskGained;

  public static final String JSON_PROPERTY_ISK_SPENT = "isk_spent";
  private Long iskSpent;

  public static final String JSON_PROPERTY_MODIFY_MARKET_ORDER = "modify_market_order";
  private Long modifyMarketOrder;

  public static final String JSON_PROPERTY_SEARCH_CONTRACTS = "search_contracts";
  private Long searchContracts;

  public static final String JSON_PROPERTY_SELL_ORDERS_PLACED = "sell_orders_placed";
  private Long sellOrdersPlaced;


  public GetCharactersCharacterIdStatsMarket acceptContractsCourier(Long acceptContractsCourier) {
    
    this.acceptContractsCourier = acceptContractsCourier;
    return this;
  }

   /**
   * accept_contracts_courier integer
   * @return acceptContractsCourier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "accept_contracts_courier integer")
  @JsonProperty(JSON_PROPERTY_ACCEPT_CONTRACTS_COURIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAcceptContractsCourier() {
    return acceptContractsCourier;
  }


  public void setAcceptContractsCourier(Long acceptContractsCourier) {
    this.acceptContractsCourier = acceptContractsCourier;
  }


  public GetCharactersCharacterIdStatsMarket acceptContractsItemExchange(Long acceptContractsItemExchange) {
    
    this.acceptContractsItemExchange = acceptContractsItemExchange;
    return this;
  }

   /**
   * accept_contracts_item_exchange integer
   * @return acceptContractsItemExchange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "accept_contracts_item_exchange integer")
  @JsonProperty(JSON_PROPERTY_ACCEPT_CONTRACTS_ITEM_EXCHANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAcceptContractsItemExchange() {
    return acceptContractsItemExchange;
  }


  public void setAcceptContractsItemExchange(Long acceptContractsItemExchange) {
    this.acceptContractsItemExchange = acceptContractsItemExchange;
  }


  public GetCharactersCharacterIdStatsMarket buyOrdersPlaced(Long buyOrdersPlaced) {
    
    this.buyOrdersPlaced = buyOrdersPlaced;
    return this;
  }

   /**
   * buy_orders_placed integer
   * @return buyOrdersPlaced
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "buy_orders_placed integer")
  @JsonProperty(JSON_PROPERTY_BUY_ORDERS_PLACED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getBuyOrdersPlaced() {
    return buyOrdersPlaced;
  }


  public void setBuyOrdersPlaced(Long buyOrdersPlaced) {
    this.buyOrdersPlaced = buyOrdersPlaced;
  }


  public GetCharactersCharacterIdStatsMarket cancelMarketOrder(Long cancelMarketOrder) {
    
    this.cancelMarketOrder = cancelMarketOrder;
    return this;
  }

   /**
   * cancel_market_order integer
   * @return cancelMarketOrder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "cancel_market_order integer")
  @JsonProperty(JSON_PROPERTY_CANCEL_MARKET_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCancelMarketOrder() {
    return cancelMarketOrder;
  }


  public void setCancelMarketOrder(Long cancelMarketOrder) {
    this.cancelMarketOrder = cancelMarketOrder;
  }


  public GetCharactersCharacterIdStatsMarket createContractsAuction(Long createContractsAuction) {
    
    this.createContractsAuction = createContractsAuction;
    return this;
  }

   /**
   * create_contracts_auction integer
   * @return createContractsAuction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "create_contracts_auction integer")
  @JsonProperty(JSON_PROPERTY_CREATE_CONTRACTS_AUCTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCreateContractsAuction() {
    return createContractsAuction;
  }


  public void setCreateContractsAuction(Long createContractsAuction) {
    this.createContractsAuction = createContractsAuction;
  }


  public GetCharactersCharacterIdStatsMarket createContractsCourier(Long createContractsCourier) {
    
    this.createContractsCourier = createContractsCourier;
    return this;
  }

   /**
   * create_contracts_courier integer
   * @return createContractsCourier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "create_contracts_courier integer")
  @JsonProperty(JSON_PROPERTY_CREATE_CONTRACTS_COURIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCreateContractsCourier() {
    return createContractsCourier;
  }


  public void setCreateContractsCourier(Long createContractsCourier) {
    this.createContractsCourier = createContractsCourier;
  }


  public GetCharactersCharacterIdStatsMarket createContractsItemExchange(Long createContractsItemExchange) {
    
    this.createContractsItemExchange = createContractsItemExchange;
    return this;
  }

   /**
   * create_contracts_item_exchange integer
   * @return createContractsItemExchange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "create_contracts_item_exchange integer")
  @JsonProperty(JSON_PROPERTY_CREATE_CONTRACTS_ITEM_EXCHANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCreateContractsItemExchange() {
    return createContractsItemExchange;
  }


  public void setCreateContractsItemExchange(Long createContractsItemExchange) {
    this.createContractsItemExchange = createContractsItemExchange;
  }


  public GetCharactersCharacterIdStatsMarket deliverCourierContract(Long deliverCourierContract) {
    
    this.deliverCourierContract = deliverCourierContract;
    return this;
  }

   /**
   * deliver_courier_contract integer
   * @return deliverCourierContract
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "deliver_courier_contract integer")
  @JsonProperty(JSON_PROPERTY_DELIVER_COURIER_CONTRACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getDeliverCourierContract() {
    return deliverCourierContract;
  }


  public void setDeliverCourierContract(Long deliverCourierContract) {
    this.deliverCourierContract = deliverCourierContract;
  }


  public GetCharactersCharacterIdStatsMarket iskGained(Long iskGained) {
    
    this.iskGained = iskGained;
    return this;
  }

   /**
   * isk_gained integer
   * @return iskGained
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "isk_gained integer")
  @JsonProperty(JSON_PROPERTY_ISK_GAINED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getIskGained() {
    return iskGained;
  }


  public void setIskGained(Long iskGained) {
    this.iskGained = iskGained;
  }


  public GetCharactersCharacterIdStatsMarket iskSpent(Long iskSpent) {
    
    this.iskSpent = iskSpent;
    return this;
  }

   /**
   * isk_spent integer
   * @return iskSpent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "isk_spent integer")
  @JsonProperty(JSON_PROPERTY_ISK_SPENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getIskSpent() {
    return iskSpent;
  }


  public void setIskSpent(Long iskSpent) {
    this.iskSpent = iskSpent;
  }


  public GetCharactersCharacterIdStatsMarket modifyMarketOrder(Long modifyMarketOrder) {
    
    this.modifyMarketOrder = modifyMarketOrder;
    return this;
  }

   /**
   * modify_market_order integer
   * @return modifyMarketOrder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "modify_market_order integer")
  @JsonProperty(JSON_PROPERTY_MODIFY_MARKET_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getModifyMarketOrder() {
    return modifyMarketOrder;
  }


  public void setModifyMarketOrder(Long modifyMarketOrder) {
    this.modifyMarketOrder = modifyMarketOrder;
  }


  public GetCharactersCharacterIdStatsMarket searchContracts(Long searchContracts) {
    
    this.searchContracts = searchContracts;
    return this;
  }

   /**
   * search_contracts integer
   * @return searchContracts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "search_contracts integer")
  @JsonProperty(JSON_PROPERTY_SEARCH_CONTRACTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSearchContracts() {
    return searchContracts;
  }


  public void setSearchContracts(Long searchContracts) {
    this.searchContracts = searchContracts;
  }


  public GetCharactersCharacterIdStatsMarket sellOrdersPlaced(Long sellOrdersPlaced) {
    
    this.sellOrdersPlaced = sellOrdersPlaced;
    return this;
  }

   /**
   * sell_orders_placed integer
   * @return sellOrdersPlaced
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "sell_orders_placed integer")
  @JsonProperty(JSON_PROPERTY_SELL_ORDERS_PLACED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSellOrdersPlaced() {
    return sellOrdersPlaced;
  }


  public void setSellOrdersPlaced(Long sellOrdersPlaced) {
    this.sellOrdersPlaced = sellOrdersPlaced;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdStatsMarket getCharactersCharacterIdStatsMarket = (GetCharactersCharacterIdStatsMarket) o;
    return Objects.equals(this.acceptContractsCourier, getCharactersCharacterIdStatsMarket.acceptContractsCourier) &&
        Objects.equals(this.acceptContractsItemExchange, getCharactersCharacterIdStatsMarket.acceptContractsItemExchange) &&
        Objects.equals(this.buyOrdersPlaced, getCharactersCharacterIdStatsMarket.buyOrdersPlaced) &&
        Objects.equals(this.cancelMarketOrder, getCharactersCharacterIdStatsMarket.cancelMarketOrder) &&
        Objects.equals(this.createContractsAuction, getCharactersCharacterIdStatsMarket.createContractsAuction) &&
        Objects.equals(this.createContractsCourier, getCharactersCharacterIdStatsMarket.createContractsCourier) &&
        Objects.equals(this.createContractsItemExchange, getCharactersCharacterIdStatsMarket.createContractsItemExchange) &&
        Objects.equals(this.deliverCourierContract, getCharactersCharacterIdStatsMarket.deliverCourierContract) &&
        Objects.equals(this.iskGained, getCharactersCharacterIdStatsMarket.iskGained) &&
        Objects.equals(this.iskSpent, getCharactersCharacterIdStatsMarket.iskSpent) &&
        Objects.equals(this.modifyMarketOrder, getCharactersCharacterIdStatsMarket.modifyMarketOrder) &&
        Objects.equals(this.searchContracts, getCharactersCharacterIdStatsMarket.searchContracts) &&
        Objects.equals(this.sellOrdersPlaced, getCharactersCharacterIdStatsMarket.sellOrdersPlaced);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptContractsCourier, acceptContractsItemExchange, buyOrdersPlaced, cancelMarketOrder, createContractsAuction, createContractsCourier, createContractsItemExchange, deliverCourierContract, iskGained, iskSpent, modifyMarketOrder, searchContracts, sellOrdersPlaced);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdStatsMarket {\n");
    sb.append("    acceptContractsCourier: ").append(toIndentedString(acceptContractsCourier)).append("\n");
    sb.append("    acceptContractsItemExchange: ").append(toIndentedString(acceptContractsItemExchange)).append("\n");
    sb.append("    buyOrdersPlaced: ").append(toIndentedString(buyOrdersPlaced)).append("\n");
    sb.append("    cancelMarketOrder: ").append(toIndentedString(cancelMarketOrder)).append("\n");
    sb.append("    createContractsAuction: ").append(toIndentedString(createContractsAuction)).append("\n");
    sb.append("    createContractsCourier: ").append(toIndentedString(createContractsCourier)).append("\n");
    sb.append("    createContractsItemExchange: ").append(toIndentedString(createContractsItemExchange)).append("\n");
    sb.append("    deliverCourierContract: ").append(toIndentedString(deliverCourierContract)).append("\n");
    sb.append("    iskGained: ").append(toIndentedString(iskGained)).append("\n");
    sb.append("    iskSpent: ").append(toIndentedString(iskSpent)).append("\n");
    sb.append("    modifyMarketOrder: ").append(toIndentedString(modifyMarketOrder)).append("\n");
    sb.append("    searchContracts: ").append(toIndentedString(searchContracts)).append("\n");
    sb.append("    sellOrdersPlaced: ").append(toIndentedString(sellOrdersPlaced)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

