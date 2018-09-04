package com.example.android.apigithub.api;

import com.example.android.apigithub.model.ItemResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Service {

    @GET("/search/users?q=language:java+location:sp")
    Call<ItemResponse> getItems();

}


