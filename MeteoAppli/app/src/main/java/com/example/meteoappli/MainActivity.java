package com.example.meteoappli;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.meteoappli.Retrofit.ApiClient;
import com.example.meteoappli.Retrofit.ApiInterface;
import com.example.meteoappli.Retrofit.Example;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    ImageView search;
    TextView temp, description, humidite;
    EditText textField;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        search = findViewById(R.id.search);
        temp = findViewById(R.id.temp);
        description = findViewById(R.id.description);
        humidite = findViewById(R.id.humidite);
        textField = findViewById(R.id.textField);

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getWeatherData(textField.getText().toString().trim());
            }
        });

    }
    private  void getWeatherData(String name){
        ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);

        Call<Example> call = apiInterface.getWeatherData(name);

        call.enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {

            temp.setText("temperature : "+response.body().getMain().getTemp()+" °C");
            description.setText("Resentit : "+response.body().getMain().getFeels_like());
            humidite.setText("Humidite :"+response.body().getMain().getHumidity());
            }

            @Override
            public void onFailure(Call<Example> call, Throwable t) {

            }
        });
    }
}