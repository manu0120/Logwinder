package com.alemanal.logwinder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.alemanal.logwinder.api.Pvpc;
import com.alemanal.logwinder.interfaces.JsonPlaceHolderApi;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private SwipeRefreshLayout swrl;
    Pvpc pvpc;
    ArrayList<String> listaInformacionn;
    ListView listaMain;
    String dato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listaMain = (ListView) findViewById(R.id.listaMain);
        pvpc = new Pvpc();
        /*datos = new ArrayList<String>();
        datos.add("hola");*/

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
        /*public ArrayList<Object> datos() {
        listaInformacion = new ArrayList<Object>();
        listaInformacion.add(pvpc.get0001());
        listaInformacion.add(pvpc.get0102());
        listaInformacion.add(pvpc.get0203());
        listaInformacion.add(pvpc.get0304());
        listaInformacion.add(pvpc.get0405());

        return listaInformacion;
    }*/
        listaInformacionn = new ArrayList<String>();
        listaInformacionn.add(dato);

        ArrayAdapter adaptador = new ArrayAdapter(this, android.R.layout.simple_list_item_1,listaInformacionn);
        listaMain.setAdapter(adaptador);

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
                    pvpc = response.body();
                    dato = pvpc.get0001().getHour();
                    System.out.println(dato);



                    return;
                }
            }
            @Override
            public void onFailure(Call<Pvpc> call, Throwable t) {
                Toast.makeText(MainActivity.this,t.getMessage(),Toast.LENGTH_SHORT);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        getPosts();
    }



}