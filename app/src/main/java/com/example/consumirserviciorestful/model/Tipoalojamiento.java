

package com.example.consumirserviciorestful.model;

public class Tipoalojamiento{

    private Integer talId;
    private String talNombre;

    public Tipoalojamiento() {
    }

    public Tipoalojamiento(Integer talId, String talNombre) {
        this.talId = talId;
        this.talNombre = talNombre;
    }

    public Integer getTalId() {
        return talId;
    }

    public void setTalId(Integer talId) {
        this.talId = talId;
    }

    public String getTalNombre() {
        return talNombre;
    }

    public void setTalNombre(String talNombre) {
        this.talNombre = talNombre;
    }
}
