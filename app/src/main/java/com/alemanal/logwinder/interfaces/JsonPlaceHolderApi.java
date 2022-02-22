package com.alemanal.logwinder.interfaces;

import com.alemanal.logwinder.api.Pvpc;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {
    @GET ("/v1/prices/all?zone=PCB")
    Call<Pvpc> getData();

}


