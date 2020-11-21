package com.example.retrofitrc;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RequestInterface {
    @GET("albums")
    Call<List<model>> getModelJson();
}
