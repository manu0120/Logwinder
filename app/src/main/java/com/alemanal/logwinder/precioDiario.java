package com.alemanal.logwinder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.alemanal.logwinder.api.Posts;
import android.os.Bundle;
import android.widget.Toast;

import com.alemanal.logwinder.api.Pvpc;
import com.alemanal.logwinder.interfaces.JsonPlaceHolderApi;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class precioDiario extends AppCompatActivity {
    private SwipeRefreshLayout swrl;
    Pvpc pvpc;
    ArrayList<Object> listaInformacion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_precio_diario);
        //Listener para obtener los datos si se refresca la pantalla.
        swrl = new SwipeRefreshLayout(getApplicationContext());
        swrl.setOnRefreshListener(
                new SwipeRefreshLayout.OnRefreshListener() {
                    @Override
                    public void onRefresh() {
                        getPosts();
                    }
                }
        );

        //pvpc.get0001().getHour();

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
                    Toast.makeText(precioDiario.this,"Código: " + response.code(),Toast.LENGTH_SHORT);
                    pvpc = response.body();

                    return;
                }
            }
            @Override
            public void onFailure(Call<Pvpc> call, Throwable t) {
                Toast.makeText(precioDiario.this,t.getMessage(),Toast.LENGTH_SHORT);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        getPosts();
    }
}