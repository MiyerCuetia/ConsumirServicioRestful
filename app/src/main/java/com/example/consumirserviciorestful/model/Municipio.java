/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.consumirserviciorestful.model;

public class Municipio{

    private Integer munId;
    private String munNombre;
    private String munCodigo;
    private Integer fkDepartamento;


    public Municipio() {
    }

    public Municipio(Integer munId, String munNombre, String munCodigo, Integer fkDepartamento) {
        this.munId = munId;
        this.munNombre = munNombre;
        this.munCodigo = munCodigo;
        this.fkDepartamento = fkDepartamento;
    }

    public Integer getMunId() {
        return munId;
    }

    public void setMunId(Integer munId) {
        this.munId = munId;
    }

    public String getMunNombre() {
        return munNombre;
    }

    public void setMunNombre(String munNombre) {
        this.munNombre = munNombre;
    }

    public String getMunCodigo() {
        return munCodigo;
    }

    public void setMunCodigo(String munCodigo) {
        this.munCodigo = munCodigo;
    }

    public Integer getFkDepartamento() {
        return fkDepartamento;
    }

    public void setFkDepartamento(Integer fkDepartamento) {
        this.fkDepartamento = fkDepartamento;
    }
}
