package com.alemanal.logwinder.BBDD;

import java.io.Serializable;

public class Congelador implements Serializable {
    private Integer id;
    private String cong;
    private String congA2;
    private String congA1;
    private String congA;
    private String congB;
    private String congC;
    private String congD;

    public Congelador() {

    }

    public Congelador(Integer id, String cong, String congA2, String congA1, String congA, String congB, String congC, String congD) {
        this.id = id;
        this.cong = cong;
        this.congA2 = congA2;
        this.congA1 = congA1;
        this.congA = congA;
        this.congB = congB;
        this.congC = congC;
        this.congD = congD;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCong() {
        return cong;
    }

    public void setCong(String cong) {
        this.cong = cong;
    }

    public String getCongA2() {
        return congA2;
    }

    public void setCongA2(String congA2) {
        this.congA2 = congA2;
    }

    public String getCongA1() {
        return congA1;
    }

    public void setCongA1(String congA1) {
        this.congA1 = congA1;
    }

    public String getCongA() {
        return congA;
    }

    public void setCongA(String congA) {
        this.congA = congA;
    }

    public String getCongB() {
        return congB;
    }

    public void setCongB(String congB) {
        this.congB = congB;
    }

    public String getCongC() {
        return congC;
    }

    public void setCongC(String congC) {
        this.congC = congC;
    }

    public String getCongD() {
        return congD;
    }

    public void setCongD(String congD) {
        this.congD = congD;
    }
}
