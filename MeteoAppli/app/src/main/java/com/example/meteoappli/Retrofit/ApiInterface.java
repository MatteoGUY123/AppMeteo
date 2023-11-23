package com.example.meteoappli.Retrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("weather?lat=65.04&lon=65.04&appid=3767ecb23a1b783f7fa880a10ba6c3f2&units=metric")
    Call<Example> getWeatherData(@Query("q") String name);
}
