package com.alemanal.logwinder.BBDD;

import java.io.Serializable;

public class Microondas implements Serializable {
    private Integer id;
    private String micro;

    public Microondas() {
    }

    public Microondas(Integer id, String horno) {
        this.id = id;
        this.micro = horno;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMicro() {
        return micro;
    }

    public void setMicro(String horno) {
        this.micro = horno;
    }
}
