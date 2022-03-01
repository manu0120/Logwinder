package com.alemanal.logwinder.BBDD;

import java.io.Serializable;

public class Frigorifico implements Serializable {
    private Integer id;
    private String frigorifico;
    private String frigorificoA3;
    private String frigorificoA2;
    private String frigorificoA1;
    private String frigorificoA;
    private String frigorificoB;
    private String frigorificoC;

    public Frigorifico() {

    }

    public Frigorifico(Integer id, String frigorifico, String frigorificoA3, String frigorificoA2, String frigorificoA1, String frigorificoA, String frigorificoB, String frigorificoC) {
        this.id = id;
        this.frigorifico = frigorifico;
        this.frigorificoA3 = frigorificoA3;
        this.frigorificoA2 = frigorificoA2;
        this.frigorificoA1 = frigorificoA1;
        this.frigorificoA = frigorificoA;
        this.frigorificoB = frigorificoB;
        this.frigorificoC = frigorificoC;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFrigorifico() {
        return frigorifico;
    }

    public void setFrigorifico(String frigorifico) {
        this.frigorifico = frigorifico;
    }

    public String getFrigorificoA3() {
        return frigorificoA3;
    }

    public void setFrigorificoA3(String frigorificoA3) {
        this.frigorificoA3 = frigorificoA3;
    }

    public String getFrigorificoA2() {
        return frigorificoA2;
    }

    public void setFrigorificoA2(String frigorificoA2) {
        this.frigorificoA2 = frigorificoA2;
    }

    public String getFrigorificoA1() {
        return frigorificoA1;
    }

    public void setFrigorificoA1(String frigorificoA1) {
        this.frigorificoA1 = frigorificoA1;
    }

    public String getFrigorificoA() {
        return frigorificoA;
    }

    public void setFrigorificoA(String frigorificoA) {
        this.frigorificoA = frigorificoA;
    }

    public String getFrigorificoB() {
        return frigorificoB;
    }

    public void setFrigorificoB(String frigorificoB) {
        this.frigorificoB = frigorificoB;
    }

    public String getFrigorificoC() {
        return frigorificoC;
    }

    public void setFrigorificoC(String frigorificoC) {
        this.frigorificoC = frigorificoC;
    }
}
