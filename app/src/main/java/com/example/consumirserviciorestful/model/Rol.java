/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.consumirserviciorestful.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Rol {
    @SerializedName("rolId")
    @Expose
    private Integer rolId;
    @SerializedName("rolNombre")
    @Expose
    private String rolNombre;


    public Rol() {
    }

    public Rol(String rolNombre) {
        this.rolNombre = rolNombre;
    }

    public Integer getRolId() {
        return rolId;
    }

    public void setRolId(Integer rolId) {
        this.rolId = rolId;
    }

    public String getRolNombre() {
        return rolNombre;
    }

    public void setRolNombre(String rolNombre) {
        this.rolNombre = rolNombre;
    }

    @Override
    public String toString() {
        return "Rol{" +
                "rolId=" + rolId +
                ", rolNombre='" + rolNombre + '\'' +
                '}';
    }
}
