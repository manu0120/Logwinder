package com.alemanal.logwinder;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.alemanal.logwinder.Utilidades.Utilidades;

import java.util.ArrayList;
import java.util.List;

public class SQLite extends SQLiteOpenHelper {

    Context context;

    public SQLite(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
        this.context=context;
    }




    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(Utilidades.CREAR_TABLA_FRIGORIFICO);
        db.execSQL(Utilidades.CREAR_TABLA_CONGELADOR);
        db.execSQL(Utilidades.CREAR_TABLA_VITRO);
        db.execSQL(Utilidades.CREAR_TABLA_LAVADORA);
        db.execSQL(Utilidades.CREAR_TABLA_VAJILLA);
        db.execSQL(Utilidades.CREAR_TABLA_SECADORA);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS "+Utilidades.TABLA_FRIGORIFICO);
        db.execSQL("DROP TABLE IF EXISTS "+Utilidades.TABLA_CONGELADOR);
        db.execSQL("DROP TABLE IF EXISTS "+Utilidades.TABLA_VITRO);
        db.execSQL("DROP TABLE IF EXISTS "+Utilidades.TABLA_LAVADORA);
        db.execSQL("DROP TABLE IF EXISTS "+Utilidades.TABLA_SECADORA);
        onCreate(db);
    }

    //TABLA USUARIOS
    //insertar datos de los usuarios en su tabla administrativa
    public Boolean insert_frig_db(String frig, String frigA3,String frigA2,String frigA1,String frigA,String frigB,String frigC){
        SQLite conn = new SQLite(this.context,Utilidades.TABLA_FRIGORIFICO, null, 1);
        SQLiteDatabase db = conn.getWritableDatabase();
        //SQLiteDatabase db = getWritableDatabase();
        if(db!=null){
            db.execSQL("INSERT INTO "+Utilidades.TABLA_FRIGORIFICO+" ("+Utilidades.CAMPO_FRIGORIFICO+","
                    +Utilidades.CAMPO_FRIGORIFICOA3+","+Utilidades.CAMPO_FRIGORIFICOA2+","
                    +Utilidades.CAMPO_FRIGORIFICOA1+","+Utilidades.CAMPO_FRIGORIFICOA+","
                    +Utilidades.CAMPO_FRIGORIFICOB+","+Utilidades.CAMPO_FRIGORIFICOC+") VALUES " +
                    "('"+frig+"','"+frigA3+"','"+frigA2+"','"+frigA1+"','"+frigA+"','"+frigB+"','"+frigC+"','"+frigA3+"')");
            db.close();
            return true;
        }else
            return false;
    }
    //extraer datos de la bases de datos
    public List<String> get_frig_db(String frig, String frigA3,String frigA2,String frigA1,String frigA,String frigB,String frigC){
        SQLite conn = new SQLite(this.context,Utilidades.TABLA_FRIGORIFICO, null, 1);
        SQLiteDatabase db = getReadableDatabase();
        List<String> data = new ArrayList<String>();

        //Cursor cursor = db.rawQuery("SELECT * FROM USUARIOS WHERE user='"+usuario+"'",null);
        Cursor cursor = db.rawQuery("SELECT * FROM USUARIOS",null);

        if(cursor.moveToFirst()){
            do{
                data.add(cursor.getString(1));
                data.add(cursor.getString(2));
                data.add(cursor.getString(3));
                data.add(cursor.getString(4));
                data.add(cursor.getString(5));
                data.add(cursor.getString(6));
            }while(cursor.moveToNext());
        }

        db.close();

        return data;
    }

}
