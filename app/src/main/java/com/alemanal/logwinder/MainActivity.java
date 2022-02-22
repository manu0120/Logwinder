package com.alemanal.logwinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.alemanal.logwinder.api.Posts;
import com.alemanal.logwinder.api.Pvpc;
import com.alemanal.logwinder.interfaces.JsonPlaceHolderApi;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    //union rama
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getPosts();

    }
    private void getPosts(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.preciodelaluz.org")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        JsonPlaceHolderApi jsonPlaceHolderApi = retrofit.create(JsonPlaceHolderApi.class);
        Call<Pvpc> call = jsonPlaceHolderApi.getData();
        call.enqueue(new Callback<Pvpc>() {
            @Override
            public void onResponse(Call<Pvpc> call, Response<Pvpc> response) {
                if (!response.isSuccessful()) {
                    Toast.makeText(MainActivity.this,"Código: " + response.code(),Toast.LENGTH_SHORT);
                    return;
                }

            }

            @Override
            public void onFailure(Call<Pvpc> call, Throwable t) {
                Toast.makeText(MainActivity.this,t.getMessage(),Toast.LENGTH_SHORT);
            }
        });
    }
}