package com.alemanal.logwinder.BBDD;

import java.io.Serializable;

public class Horno implements Serializable {
    private Integer id;
    private String horno;

    public Horno() {
    }

    public Horno(Integer id, String horno) {
        this.id = id;
        this.horno = horno;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHorno() {
        return horno;
    }

    public void setHorno(String horno) {
        this.horno = horno;
    }
}
