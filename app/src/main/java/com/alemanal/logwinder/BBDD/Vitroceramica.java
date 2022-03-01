package com.alemanal.logwinder.BBDD;

import java.io.Serializable;

public class Vitroceramica implements Serializable {
    private Integer id;
    private String vitro;
    private String vitroRad;
    private String virtoEle;
    private String virtoInd;


    public Vitroceramica() {

    }

    public Vitroceramica(Integer id, String vitro, String vitroRad, String virtoEle, String virtoInd) {
        this.id = id;
        this.vitro = vitro;
        this.vitroRad = vitroRad;
        this.virtoEle = virtoEle;
        this.virtoInd = virtoInd;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVitro() {
        return vitro;
    }

    public void setVitro(String vitro) {
        this.vitro = vitro;
    }

    public String getVitroRad() {
        return vitroRad;
    }

    public void setVitroRad(String vitroRad) {
        this.vitroRad = vitroRad;
    }

    public String getVirtoEle() {
        return virtoEle;
    }

    public void setVirtoEle(String virtoEle) {
        this.virtoEle = virtoEle;
    }

    public String getVirtoInd() {
        return virtoInd;
    }

    public void setVirtoInd(String virtoInd) {
        this.virtoInd = virtoInd;
    }
}
