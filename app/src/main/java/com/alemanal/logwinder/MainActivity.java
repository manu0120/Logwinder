package com.alemanal.logwinder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
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
    ArrayList<Object> listaHoraI;
    ArrayList<Object> listaPorc;
    ArrayList<Object> listaPre;
    ListView listaMain;
    String dato;
    double media;
    double kilowatio;

    Object[] items;

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
       // listaInformacionn = new ArrayList<String>();
        //listaInformacionn.add(dato);

        /*ArrayAdapter adaptador = new ArrayAdapter(this, android.R.layout.simple_list_item_1,listaInformacionn);
        listaMain.setAdapter(adaptador);*/

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
                
                pvpc = response.body();
                
                
                dato = pvpc.get0001().getHour();
                System.out.println(dato);
                hora();
                porc();
                precioK();

                //customAdapter customAdapter = new customAdapter();

                //listaInformacionn = new ArrayList<String>();
                //listaInformacionn.add(dato);


//                ArrayAdapter adaptador = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,listaInformacion);
//                listaMain.setAdapter(adaptador);
                customAdapter customAdapter = new customAdapter();
                listaMain.setAdapter(customAdapter);
            }
            @Override
            public void onFailure(Call<Pvpc> call, Throwable t) {
                Toast.makeText(MainActivity.this,t.getMessage(),Toast.LENGTH_SHORT);
            }
        });
    }

    private void precioK() {
        listaPre = new ArrayList<Object>();
        listaPre.add(pvpc.get0001().getPrice());
        listaPre.add(pvpc.get0001().getPrice());
        listaPre.add(pvpc.get0102().getPrice());
        listaPre.add(pvpc.get0203().getPrice());
        listaPre.add(pvpc.get0304().getPrice());
        listaPre.add(pvpc.get0405().getPrice());
        listaPre.add(pvpc.get0506().getPrice());
        listaPre.add(pvpc.get0607().getPrice());
        listaPre.add(pvpc.get0708().getPrice());
        listaPre.add(pvpc.get0809().getPrice());
        listaPre.add(pvpc.get0910().getPrice());
        listaPre.add(pvpc.get1011().getPrice());
        listaPre.add(pvpc.get1112().getPrice());
        listaPre.add(pvpc.get1213().getPrice());
        listaPre.add(pvpc.get1314().getPrice());
        listaPre.add(pvpc.get1415().getPrice());
        listaPre.add(pvpc.get1516().getPrice());
        listaPre.add(pvpc.get1617().getPrice());
        listaPre.add(pvpc.get1718().getPrice());
        listaPre.add(pvpc.get1920().getPrice());
        listaPre.add(pvpc.get2021().getPrice());
        listaPre.add(pvpc.get2122().getPrice());
        listaPre.add(pvpc.get2223().getPrice());
        listaPre.add(pvpc.get2324().getPrice());
        double num=0;
        for (int i=0 ; i<listaPorc.size();i++){
            num = (double) listaPorc.get(i);
        }

    }

    private void hora() {
        listaHoraI = new ArrayList<Object>();
        listaHoraI.add(pvpc.get0001().getHour());
        listaHoraI.add(pvpc.get0102().getHour());
        listaHoraI.add(pvpc.get0203().getHour());
        listaHoraI.add(pvpc.get0304().getHour());
        listaHoraI.add(pvpc.get0405().getHour());
        listaHoraI.add(pvpc.get0506().getHour());
        listaHoraI.add(pvpc.get0607().getHour());
        listaHoraI.add(pvpc.get0708().getHour());
        listaHoraI.add(pvpc.get0809().getHour());
        listaHoraI.add(pvpc.get0910().getHour());
        listaHoraI.add(pvpc.get1011().getHour());
        listaHoraI.add(pvpc.get1112().getHour());
        listaHoraI.add(pvpc.get1213().getHour());
        listaHoraI.add(pvpc.get1314().getHour());
        listaHoraI.add(pvpc.get1415().getHour());
        listaHoraI.add(pvpc.get1516().getHour());
        listaHoraI.add(pvpc.get1617().getHour());
        listaHoraI.add(pvpc.get1718().getHour());
        listaHoraI.add(pvpc.get1920().getHour());
        listaHoraI.add(pvpc.get2021().getHour());
        listaHoraI.add(pvpc.get2122().getHour());
        listaHoraI.add(pvpc.get2223().getHour());
        listaHoraI.add(pvpc.get2324().getHour());
    }

    private void porc() {

        listaPorc = new ArrayList<Object>();
        listaPorc.add(pvpc.get0001().getPrice());
        listaPorc.add(pvpc.get0102().getPrice());
        listaPorc.add(pvpc.get0203().getPrice());
        listaPorc.add(pvpc.get0304().getPrice());
        listaPorc.add(pvpc.get0405().getPrice());
        listaPorc.add(pvpc.get0506().getPrice());
        listaPorc.add(pvpc.get0607().getPrice());
        listaPorc.add(pvpc.get0708().getPrice());
        listaPorc.add(pvpc.get0809().getPrice());
        listaPorc.add(pvpc.get0910().getPrice());
        listaPorc.add(pvpc.get1011().getPrice());
        listaPorc.add(pvpc.get1112().getPrice());
        listaPorc.add(pvpc.get1213().getPrice());
        listaPorc.add(pvpc.get1314().getPrice());
        listaPorc.add(pvpc.get1415().getPrice());
        listaPorc.add(pvpc.get1516().getPrice());
        listaPorc.add(pvpc.get1617().getPrice());
        listaPorc.add(pvpc.get1718().getPrice());
        listaPorc.add(pvpc.get1920().getPrice());
        listaPorc.add(pvpc.get2021().getPrice());
        listaPorc.add(pvpc.get2122().getPrice());
        listaPorc.add(pvpc.get2223().getPrice());
        listaPorc.add(pvpc.get2324().getPrice());

        double num;
        double sum=0;

        for (int i=0 ; i<listaPorc.size();i++){
            num = (double) listaPorc.get(i);
            sum+=num;
        }
        media = sum/listaPorc.size();

    }

    @Override
    protected void onStart() {
        super.onStart();
        getPosts();
    }

    class customAdapter extends BaseAdapter {

        @Override
        public int getCount() {

            return listaHoraI.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int pos, View convertView, ViewGroup parent) {
            View myView = getLayoutInflater().inflate(R.layout.lista_datos,null);
            TextView tvHora = myView.findViewById(R.id.tvFin);
            TextView tvporc = myView.findViewById(R.id.tvPorcentaje);
            TextView tvprecio = myView.findViewById(R.id.tvPrecio);
            tvHora.setSelected(true);
            tvHora.setText(listaHoraI.get(pos).toString());

            tvporc.setSelected(true);
            double porciento = (double) listaPorc.get(pos);
            int porcentaje= (int) ((porciento*100/media)-100);
            tvporc.setText(porcentaje+"%");

            tvprecio.setSelected(true);
            double precio = (double) listaPre.get(pos)/1000;
            String decimal = String.format("%.4f", precio);
            tvprecio.setText(decimal +" €/kWh");
            return myView;
        }
    }



}