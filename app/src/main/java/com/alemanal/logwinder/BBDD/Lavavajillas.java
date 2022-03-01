package com.alemanal.logwinder.BBDD;

import java.io.Serializable;

public class Lavavajillas implements Serializable {
    private Integer id;
    private String vaji;
    private String vajiA3;
    private String vajiA2;
    private String vajiA1;
    private String vajiA;
    private String vajiB;
    private String vajiC;

    public Lavavajillas() {

    }

    public Lavavajillas(Integer id, String vaji, String vajiA3, String vajiA2, String vajiA1, String vajiA, String vajiB, String vajiC) {
        this.id = id;
        this.vaji = vaji;
        this.vajiA3 = vajiA3;
        this.vajiA2 = vajiA2;
        this.vajiA1 = vajiA1;
        this.vajiA = vajiA;
        this.vajiB = vajiB;
        this.vajiC = vajiC;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVaji() {
        return vaji;
    }

    public void setVaji(String vaji) {
        this.vaji = vaji;
    }

    public String getVajiA3() {
        return vajiA3;
    }

    public void setVajiA3(String vajiA3) {
        this.vajiA3 = vajiA3;
    }

    public String getVajiA2() {
        return vajiA2;
    }

    public void setVajiA2(String vajiA2) {
        this.vajiA2 = vajiA2;
    }

    public String getVajiA1() {
        return vajiA1;
    }

    public void setVajiA1(String vajiA1) {
        this.vajiA1 = vajiA1;
    }

    public String getVajiA() {
        return vajiA;
    }

    public void setVajiA(String vajiA) {
        this.vajiA = vajiA;
    }

    public String getVajiB() {
        return vajiB;
    }

    public void setVajiB(String vajiB) {
        this.vajiB = vajiB;
    }

    public String getVajiC() {
        return vajiC;
    }

    public void setVajiC(String vajiC) {
        this.vajiC = vajiC;
    }
}
