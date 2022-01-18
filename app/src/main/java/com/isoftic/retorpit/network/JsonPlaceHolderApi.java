package com.isoftic.retorpit.network;

import com.isoftic.retorpit.models.BaseModel;
import com.isoftic.retorpit.models.Time;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {

    @GET("currentprice.json")
    Call <BaseModel> getAll();

}
