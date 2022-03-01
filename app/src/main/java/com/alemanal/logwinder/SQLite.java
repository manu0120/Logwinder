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
                    "('"+frig+"','"+frigA3+"','"+frigA2+"','"+frigA1+"','"+frigA+"','"+frigB+"','"+frigC+"')");
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
                data.add(cursor.getString(0));
                data.add(cursor.getString(1));
                data.add(cursor.getString(2));
                data.add(cursor.getString(3));
                data.add(cursor.getString(4));
                data.add(cursor.getString(5));
            }while(cursor.moveToNext());
        }

        db.close();

        return data;
    }
    public Boolean insert_conge_db(String conge, String congeA2, String congeA1,String congeA,String congeB,String congeC,String congeD){
        SQLite conn = new SQLite(this.context,Utilidades.TABLA_CONGELADOR, null, 1);
        SQLiteDatabase db = conn.getWritableDatabase();
        //SQLiteDatabase db = getWritableDatabase();
        if(db!=null){
            db.execSQL("INSERT INTO "+Utilidades.TABLA_CONGELADOR+" ("+Utilidades.CAMPO_CONG+","
                    +Utilidades.CAMPO_CONGA2+","+Utilidades.CAMPO_CONGA1+","
                    +Utilidades.CAMPO_CONGA+","+Utilidades.CAMPO_CONGB+","
                    +Utilidades.CAMPO_CONGC+","+Utilidades.CAMPO_CONGD+") VALUES " +
                    "('"+conge+"','"+congeA2+"','"+congeA1+"','"+congeA+"','"+congeB+"','"+congeC+"','"+congeD+"')");
            db.close();
            return true;
        }else
            return false;
    }
    public Boolean insert_vitro_db(String vitro, String vitrorad, String vitroele,String vitroind){
        SQLite conn = new SQLite(this.context,Utilidades.TABLA_VITRO, null, 1);
        SQLiteDatabase db = conn.getWritableDatabase();
        //SQLiteDatabase db = getWritableDatabase();
        if(db!=null){
            db.execSQL("INSERT INTO "+Utilidades.TABLA_VITRO+" ("+Utilidades.CAMPO_VITRO+","
                    +Utilidades.CAMPO_VITRORAD+","+Utilidades.CAMPO_VITROELE+","
                    +Utilidades.CAMPO_VITROIND+") VALUES " +
                    "('"+vitro+"','"+vitrorad+"','"+vitroele+"','"+vitroind+"')");
            db.close();
            return true;
        }else
            return false;
    }
    public Boolean insert_lavadora_db(String lava, String lavaA3, String lavaA2,String lavaA1,String lavaA,String lavaB,String lavaC){
        SQLite conn = new SQLite(this.context,Utilidades.TABLA_LAVADORA, null, 1);
        SQLiteDatabase db = conn.getWritableDatabase();
        //SQLiteDatabase db = getWritableDatabase();
        if(db!=null){
            db.execSQL("INSERT INTO "+Utilidades.TABLA_LAVADORA+" ("+Utilidades.CAMPO_LAVA+","
                    +Utilidades.CAMPO_LAVAA3+","+Utilidades.CAMPO_LAVAA2+","
                    +Utilidades.CAMPO_LAVAA1+","+Utilidades.CAMPO_LAVAA+","
                    +Utilidades.CAMPO_LAVAB+","+Utilidades.CAMPO_LAVAC+") VALUES " +
                    "('"+lava+"','"+lavaA3+"','"+lavaA2+"','"+lavaA1+"','"+lavaA+"','"+lavaB+"','"+lavaC+"')");
            db.close();
            return true;
        }else
            return false;
    }
    public Boolean insert_vaji_db(String vaji, String vajiA3, String vajiA2,String vajiA1,String vajiA,String vajiB,String vajiC){
        SQLite conn = new SQLite(this.context,Utilidades.TABLA_VAJILLA, null, 1);
        SQLiteDatabase db = conn.getWritableDatabase();
        //SQLiteDatabase db = getWritableDatabase();
        if(db!=null){
            db.execSQL("INSERT INTO "+Utilidades.TABLA_VAJILLA+" ("+Utilidades.CAMPO_VAJI+","
                    +Utilidades.CAMPO_VAJIA3+","+Utilidades.CAMPO_VAJIA2+","
                    +Utilidades.CAMPO_VAJIA1+","+Utilidades.CAMPO_VAJIA+","
                    +Utilidades.CAMPO_VAJIB+","+Utilidades.CAMPO_VAJIC+") VALUES " +
                    "('"+vaji+"','"+vajiA3+"','"+vajiA2+"','"+vajiA1+"','"+vajiA+"','"+vajiB+"','"+vajiC+"')");
            db.close();
            return true;
        }else
            return false;
    }
    public Boolean insert_seca_db(String seca, String secaA3, String secaA2,String secaA1,String secaA,String secaB,String secaC){
        SQLite conn = new SQLite(this.context,Utilidades.TABLA_SECADORA, null, 1);
        SQLiteDatabase db = conn.getWritableDatabase();
        //SQLiteDatabase db = getWritableDatabase();
        if(db!=null){
            db.execSQL("INSERT INTO "+Utilidades.TABLA_SECADORA+" ("+Utilidades.CAMPO_SECA+","
                    +Utilidades.CAMPO_SECAA3+","+Utilidades.CAMPO_SECAA2+","
                    +Utilidades.CAMPO_SECAA1+","+Utilidades.CAMPO_SECAA+","
                    +Utilidades.CAMPO_SECAB+","+Utilidades.CAMPO_SECAC+") VALUES " +
                    "('"+seca+"','"+secaA3+"','"+secaA2+"','"+secaA1+"','"+secaA+"','"+secaB+"','"+secaC+"')");
            db.close();
            return true;
        }else
            return false;
    }
}
