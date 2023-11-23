package com.example.meteoappli.Retrofit;

import com.google.gson.annotations.SerializedName;

public class Main {

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    @SerializedName("temp")
    String temp;

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getFeels_like() {
        return feels_like;
    }

    public void setFeels_like(String feels_like) {
        this.feels_like = feels_like;
    }

    @SerializedName("humidity")
    String humidity;

    @SerializedName("feels_like")
    String feels_like;

}
