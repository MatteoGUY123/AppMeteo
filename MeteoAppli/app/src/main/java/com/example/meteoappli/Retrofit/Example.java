package com.example.meteoappli.Retrofit;

import com.google.gson.annotations.SerializedName;

import java.io.Serial;

public class Example {
    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    @SerializedName("main")
    private Main main;


}
