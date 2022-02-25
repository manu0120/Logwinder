package com.alemanal.logwinder.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Posts {
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("hour")
    @Expose
    private String hour;
    @SerializedName("is-cheap")
    @Expose
    private Boolean isCheap;
    @SerializedName("is-under-avg")
    @Expose
    private Boolean isUnderAvg;
    @SerializedName("market")
    @Expose
    private String market;
    @SerializedName("price")
    @Expose
    private Double price;
    @SerializedName("units")
    @Expose
    private String units;
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getHour() {
        return hour;
    }
    public void setHour(String hour) {
        this.hour = hour;
    }
    public Boolean getIsCheap() {
        return isCheap;
    }
    public void setIsCheap(Boolean isCheap) {
        this.isCheap = isCheap;
    }
    public Boolean getIsUnderAvg() {
        return isUnderAvg;
    }
    public void setIsUnderAvg(Boolean isUnderAvg) {
        this.isUnderAvg = isUnderAvg;
    }
    public String getMarket() {
        return market;
    }
    public void setMarket(String market) {
        this.market = market;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public String getUnits() {
        return units;
    }
    public void setUnits(String units) {
        this.units = units;
    }
}
