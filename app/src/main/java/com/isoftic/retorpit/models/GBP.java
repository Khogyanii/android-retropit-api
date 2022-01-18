package com.isoftic.retorpit.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GBP {

    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("symbol")
    @Expose
    private String symbol;
    @SerializedName("rate")
    @Expose
    private String rate;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("rate_float")
    @Expose
    private Double rateFloat;

    public String getCode() {
        return code;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getRate() {
        return rate;
    }

    public String getDescription() {
        return description;
    }

    public Double getRateFloat() {
        return rateFloat;
    }

}
