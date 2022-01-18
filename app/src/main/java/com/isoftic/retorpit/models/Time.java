package com.isoftic.retorpit.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Time {

    @SerializedName("updated")
    @Expose
    private String updated;
    @SerializedName("updatedISO")
    @Expose
    private String updatedISO;
    @SerializedName("updateduk")
    @Expose
    private String updateduk;

    public String getUpdated() {
        return updated;
    }

    public String getUpdatedISO() {
        return updatedISO;
    }


    public String getUpdateduk() {
        return updateduk;
    }

}
