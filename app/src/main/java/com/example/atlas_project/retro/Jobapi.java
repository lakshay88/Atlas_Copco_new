package com.example.atlas_project.retro;

import com.example.atlas_project.configurator.Configuration;
import com.example.atlas_project.jobdata.ItemList;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;


public interface Jobapi {
    @GET("list")
    Call<List<ItemList>> getJob(@Query("csvfilename") String csvfilename) ;

    @POST("items_picked")
    Call<String> setItems(@Body List<ItemList> itemLists) ;

    @GET("layout")
    Call<Configuration> getLayout();
}
