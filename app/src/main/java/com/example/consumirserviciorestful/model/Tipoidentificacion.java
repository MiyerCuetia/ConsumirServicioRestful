/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.consumirserviciorestful.model;

public class Tipoidentificacion{

    private Integer tidId;
    private String tipSigla;
    private String tipNombre;


    public Tipoidentificacion() {
    }

    public Tipoidentificacion(Integer tidId, String tipSigla, String tipNombre) {
        this.tidId = tidId;
        this.tipSigla = tipSigla;
        this.tipNombre = tipNombre;
    }

    public Integer getTidId() {
        return tidId;
    }

    public void setTidId(Integer tidId) {
        this.tidId = tidId;
    }

    public String getTipSigla() {
        return tipSigla;
    }

    public void setTipSigla(String tipSigla) {
        this.tipSigla = tipSigla;
    }

    public String getTipNombre() {
        return tipNombre;
    }

    public void setTipNombre(String tipNombre) {
        this.tipNombre = tipNombre;
    }
}
