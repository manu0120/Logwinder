package com.alemanal.logwinder.BBDD;

import java.io.Serializable;

public class Secadora implements Serializable {
    private Integer id;
    private String seca;
    private String secaA3;
    private String secaA2;
    private String secaA1;
    private String secaA;
    private String secaB;
    private String secaC;

    public Secadora() {

    }

    public Secadora(Integer id, String seca, String secaA3, String secaA2, String secaA1, String secaA, String secaB, String secaC) {
        this.id = id;
        this.seca = seca;
        this.secaA3 = secaA3;
        this.secaA2 = secaA2;
        this.secaA1 = secaA1;
        this.secaA = secaA;
        this.secaB = secaB;
        this.secaC = secaC;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSeca() {
        return seca;
    }

    public void setSeca(String seca) {
        this.seca = seca;
    }

    public String getSecaA3() {
        return secaA3;
    }

    public void setSecaA3(String secaA3) {
        this.secaA3 = secaA3;
    }

    public String getSecaA2() {
        return secaA2;
    }

    public void setSecaA2(String secaA2) {
        this.secaA2 = secaA2;
    }

    public String getSecaA1() {
        return secaA1;
    }

    public void setSecaA1(String secaA1) {
        this.secaA1 = secaA1;
    }

    public String getSecaA() {
        return secaA;
    }

    public void setSecaA(String secaA) {
        this.secaA = secaA;
    }

    public String getSecaB() {
        return secaB;
    }

    public void setSecaB(String secaB) {
        this.secaB = secaB;
    }

    public String getSecaC() {
        return secaC;
    }

    public void setSecaC(String secaC) {
        this.secaC = secaC;
    }
}
