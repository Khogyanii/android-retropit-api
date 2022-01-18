package com.isoftic.retorpit.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BaseModel {

    @SerializedName("time")
    @Expose
    private Time time;

    @SerializedName("disclaimer")
    @Expose
    private String disclaimer;

    @SerializedName("chartName")
    @Expose
    private String chartName;

    @SerializedName("bpi")
    @Expose
    private BPI bpi;

    public Time getTime() {
        return time;
    }

    public String getDisclaimer() {
        return disclaimer;
    }

    public String getChartName() {
        return chartName;
    }

    public BPI getBpi() {
        return bpi;
    }


}
