package com.alex.bean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table COMMODITY_BEAN.
 */
public class CommodityBean {

    private Long id;
    private String accountID;
    private String actorId;
    private String bigImagePath;
    private String commodityDesc;
    private String commodityId;
    private String commodityImagePath;
    private String commodityName;
    private String currency;
    private String linkPath;
    private String name;
    private String nickName;
    private String price;
    private String productionId;
    private Integer themeId;

    public CommodityBean() {
    }

    public CommodityBean(Long id) {
        this.id = id;
    }

    public CommodityBean(Long id, String accountID, String actorId, String bigImagePath, String commodityDesc, String commodityId, String commodityImagePath, String commodityName, String currency, String linkPath, String name, String nickName, String price, String productionId, Integer themeId) {
        this.id = id;
        this.accountID = accountID;
        this.actorId = actorId;
        this.bigImagePath = bigImagePath;
        this.commodityDesc = commodityDesc;
        this.commodityId = commodityId;
        this.commodityImagePath = commodityImagePath;
        this.commodityName = commodityName;
        this.currency = currency;
        this.linkPath = linkPath;
        this.name = name;
        this.nickName = nickName;
        this.price = price;
        this.productionId = productionId;
        this.themeId = themeId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public String getActorId() {
        return actorId;
    }

    public void setActorId(String actorId) {
        this.actorId = actorId;
    }

    public String getBigImagePath() {
        return bigImagePath;
    }

    public void setBigImagePath(String bigImagePath) {
        this.bigImagePath = bigImagePath;
    }

    public String getCommodityDesc() {
        return commodityDesc;
    }

    public void setCommodityDesc(String commodityDesc) {
        this.commodityDesc = commodityDesc;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public String getCommodityImagePath() {
        return commodityImagePath;
    }

    public void setCommodityImagePath(String commodityImagePath) {
        this.commodityImagePath = commodityImagePath;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getLinkPath() {
        return linkPath;
    }

    public void setLinkPath(String linkPath) {
        this.linkPath = linkPath;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getProductionId() {
        return productionId;
    }

    public void setProductionId(String productionId) {
        this.productionId = productionId;
    }

    public Integer getThemeId() {
        return themeId;
    }

    public void setThemeId(Integer themeId) {
        this.themeId = themeId;
    }

}
