package com.alemanal.logwinder.Utilidades;

import android.database.sqlite.SQLiteDatabase;


public class Utilidades {

    //Constantes campos tabla Frigorifico
    public static final String TABLA_FRIGORIFICO = "FRIGORIFICO";
    public static final String CAMPO_ID_FRIGORIFICO = "id_frigorifico";
    public static final String CAMPO_FRIGORIFICO = "frigorifico";
    public static final String CAMPO_FRIGORIFICOA3 = "frigorificoA3";
    public static final String CAMPO_FRIGORIFICOA2 = "frigorificoA2";
    public static final String CAMPO_FRIGORIFICOA1 = "frigorificoA1";
    public static final String CAMPO_FRIGORIFICOA = "frigorificoA";
    public static final String CAMPO_FRIGORIFICOB = "frigorificoB";
    public static final String CAMPO_FRIGORIFICOC = "frigorificoC";


    public static final String CREAR_TABLA_FRIGORIFICO = "CREATE TABLE "+TABLA_FRIGORIFICO+"("
            +CAMPO_ID_FRIGORIFICO+" INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, "
            +CAMPO_FRIGORIFICO+" TEXT,"
            +CAMPO_FRIGORIFICOA3+" TEXT,"
            +CAMPO_FRIGORIFICOA2+" TEXT,"
            +CAMPO_FRIGORIFICOA1+" TEXT,"
            +CAMPO_FRIGORIFICOA+" TEXT,"
            +CAMPO_FRIGORIFICOB+" TEXT,"
            +CAMPO_FRIGORIFICOC+" TEXT)";

    //Constantes campos tabla Congelador
    public static final String TABLA_CONGELADOR = "CONGELADOR";
    public static final String CAMPO_ID_CONG = "id_cong";
    public static final String CAMPO_CONG = "cong";
    public static final String CAMPO_CONGA2 = "congA2";
    public static final String CAMPO_CONGA1 = "congA1";
    public static final String CAMPO_CONGA = "congA";
    public static final String CAMPO_CONGB = "congB";
    public static final String CAMPO_CONGC = "congC";
    public static final String CAMPO_CONGD = "congD";

    public static final String CREAR_TABLA_CONGELADOR = "CREATE TABLE "+TABLA_CONGELADOR+"("
            +CAMPO_ID_CONG+" INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, "
            +CAMPO_CONG+" TEXT,"
            +CAMPO_CONGA2+" TEXT,"
            +CAMPO_CONGA1+" TEXT,"
            +CAMPO_CONGA+" TEXT,"
            +CAMPO_CONGB+" TEXT,"
            +CAMPO_CONGC+" TEXT,"
            +CAMPO_CONGD+" TEXT)";


    //Constantes campos tabla vitro
    public static final String TABLA_VITRO = "VITRO";
    public static final String CAMPO_ID_VITRO = "id_vitro";
    public static final String CAMPO_VITRO = "vitro";
    public static final String CAMPO_VITRORAD = "vitroRad";
    public static final String CAMPO_VITROELE = "vitroEle";
    public static final String CAMPO_VITROIND = "vitroInd";

    public static final String CREAR_TABLA_VITRO = "CREATE TABLE "+TABLA_VITRO+"("
            +CAMPO_ID_VITRO+" INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, "
            +CAMPO_VITRO+" TEXT,"
            +CAMPO_VITRORAD+" TEXT,"
            +CAMPO_VITROELE+" TEXT,"
            +CAMPO_VITROIND+" TEXT)";

    //Constantes campos tabla Lava
    public static final String TABLA_LAVADORA = "LAVADORA";
    public static final String CAMPO_ID_LAVA = "id_lava";
    public static final String CAMPO_LAVA = "lava";
    public static final String CAMPO_LAVAA3 = "lavaA3";
    public static final String CAMPO_LAVAA2 = "lavaA2";
    public static final String CAMPO_LAVAA1 = "lavaA1";
    public static final String CAMPO_LAVAA = "lavaA";
    public static final String CAMPO_LAVAB = "lavaB";
    public static final String CAMPO_LAVAC = "lavaC";


    public static final String CREAR_TABLA_LAVADORA = "CREATE TABLE "+TABLA_LAVADORA+"("
            +CAMPO_ID_LAVA+" INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, "
            +CAMPO_LAVA+" TEXT,"
            +CAMPO_LAVAA3+" TEXT,"
            +CAMPO_LAVAA2+" TEXT,"
            +CAMPO_LAVAA1+" TEXT,"
            +CAMPO_LAVAA+" TEXT,"
            +CAMPO_LAVAB+" TEXT,"
            +CAMPO_LAVAC+" TEXT)";

    //Constantes campos tabla Lavavajilla
    public static final String TABLA_VAJILLA = "LAVAVAJILLA";
    public static final String CAMPO_ID_VAJI = "id_vaji";
    public static final String CAMPO_VAJI = "vaji";
    public static final String CAMPO_VAJIA3 = "vajiA3";
    public static final String CAMPO_VAJIA2 = "vajiA2";
    public static final String CAMPO_VAJIA1 = "vajiA1";
    public static final String CAMPO_VAJIA = "vajiA";
    public static final String CAMPO_VAJIB = "vajiB";
    public static final String CAMPO_VAJIC = "vajiC";

    public static final String CREAR_TABLA_VAJILLA = "CREATE TABLE "+TABLA_VAJILLA+"("
            +CAMPO_ID_VAJI+" INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, "
            +CAMPO_VAJI+" TEXT,"
            +CAMPO_VAJIA3+" TEXT,"
            +CAMPO_VAJIA2+" TEXT,"
            +CAMPO_VAJIA1+" TEXT,"
            +CAMPO_VAJIA+" TEXT,"
            +CAMPO_VAJIB+" TEXT,"
            +CAMPO_VAJIC+" TEXT)";

    //Constantes campos tabla Secadora
    public static final String TABLA_SECADORA = "SECADORA";
    public static final String CAMPO_ID_SECA = "id_seca";
    public static final String CAMPO_SECA = "seca";
    public static final String CAMPO_SECAA3 = "secaA3";
    public static final String CAMPO_SECAA2 = "secaA2";
    public static final String CAMPO_SECAA1 = "secaA1";
    public static final String CAMPO_SECAA = "secaA";
    public static final String CAMPO_SECAB = "secaB";
    public static final String CAMPO_SECAC = "secaC";

    public static final String CREAR_TABLA_SECADORA = "CREATE TABLE "+TABLA_SECADORA+"("
            +CAMPO_ID_SECA+" INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, "
            +CAMPO_SECA+" TEXT,"
            +CAMPO_SECAA3+" TEXT,"
            +CAMPO_SECAA2+" TEXT,"
            +CAMPO_SECAA1+" TEXT,"
            +CAMPO_SECAA+" TEXT,"
            +CAMPO_SECAB+" TEXT,"
            +CAMPO_SECAC+" TEXT)";
}
