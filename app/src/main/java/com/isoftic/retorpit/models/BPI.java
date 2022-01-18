package com.isoftic.retorpit.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BPI {
    @SerializedName("USD")
    @Expose
    private USD usd;
    @SerializedName("GBP")
    @Expose
    private GBP gbp;
    @SerializedName("EUR")
    @Expose
    private EUR eur;

    public USD getUsd() {
        return usd;
    }

    public GBP getGbp() {
        return gbp;
    }

    public EUR getEur() {
        return eur;
    }

}
