package com.alemanal.logwinder.BBDD;

import java.io.Serializable;

public class Lavadora implements Serializable {
    private Integer id;
    private String lava;
    private String lavaA3;
    private String lavaA2;
    private String lavaA1;
    private String lavaA;
    private String lavaB;
    private String lavaC;

    public Lavadora() {

    }

    public Lavadora(Integer id, String lava, String lavaA3, String lavaA2, String lavaA1, String lavaA, String lavaB, String lavaC) {
        this.id = id;
        this.lava = lava;
        this.lavaA3 = lavaA3;
        this.lavaA2 = lavaA2;
        this.lavaA1 = lavaA1;
        this.lavaA = lavaA;
        this.lavaB = lavaB;
        this.lavaC = lavaC;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLava() {
        return lava;
    }

    public void setLava(String lava) {
        this.lava = lava;
    }

    public String getLavaA3() {
        return lavaA3;
    }

    public void setLavaA3(String lavaA3) {
        this.lavaA3 = lavaA3;
    }

    public String getLavaA2() {
        return lavaA2;
    }

    public void setLavaA2(String lavaA2) {
        this.lavaA2 = lavaA2;
    }

    public String getLavaA1() {
        return lavaA1;
    }

    public void setLavaA1(String lavaA1) {
        this.lavaA1 = lavaA1;
    }

    public String getLavaA() {
        return lavaA;
    }

    public void setLavaA(String lavaA) {
        this.lavaA = lavaA;
    }

    public String getLavaB() {
        return lavaB;
    }

    public void setLavaB(String lavaB) {
        this.lavaB = lavaB;
    }

    public String getLavaC() {
        return lavaC;
    }

    public void setLavaC(String lavaC) {
        this.lavaC = lavaC;
    }
}
