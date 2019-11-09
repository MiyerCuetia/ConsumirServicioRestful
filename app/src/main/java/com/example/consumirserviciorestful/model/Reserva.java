/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.consumirserviciorestful.model;

import java.util.Date;

public class Reserva  {

    private Integer resId;
    private Date resFechaRegistro;
    private Date resFechaLlegada;
    private Date resFechaSalida;
    private String resFechaChecking;
    private String resFechaCheckout;
    private String resEstado;
    private Double resPago;
    private Integer fkAlojamiento;
    private Integer fkCliente;
    private Integer fkUsuarioChecking;
    private Integer fkUsuarioCheckout;

    public Reserva() {
    }

    public Reserva(Integer resId, Date resFechaRegistro, Date resFechaLlegada, Date resFechaSalida, String resFechaChecking, String resFechaCheckout, String resEstado, Double resPago, Integer fkAlojamiento, Integer fkCliente, Integer fkUsuarioChecking, Integer fkUsuarioCheckout) {
        this.resId = resId;
        this.resFechaRegistro = resFechaRegistro;
        this.resFechaLlegada = resFechaLlegada;
        this.resFechaSalida = resFechaSalida;
        this.resFechaChecking = resFechaChecking;
        this.resFechaCheckout = resFechaCheckout;
        this.resEstado = resEstado;
        this.resPago = resPago;
        this.fkAlojamiento = fkAlojamiento;
        this.fkCliente = fkCliente;
        this.fkUsuarioChecking = fkUsuarioChecking;
        this.fkUsuarioCheckout = fkUsuarioCheckout;
    }

    public Integer getResId() {
        return resId;
    }

    public void setResId(Integer resId) {
        this.resId = resId;
    }

    public Date getResFechaRegistro() {
        return resFechaRegistro;
    }

    public void setResFechaRegistro(Date resFechaRegistro) {
        this.resFechaRegistro = resFechaRegistro;
    }

    public Date getResFechaLlegada() {
        return resFechaLlegada;
    }

    public void setResFechaLlegada(Date resFechaLlegada) {
        this.resFechaLlegada = resFechaLlegada;
    }

    public Date getResFechaSalida() {
        return resFechaSalida;
    }

    public void setResFechaSalida(Date resFechaSalida) {
        this.resFechaSalida = resFechaSalida;
    }

    public String getResFechaChecking() {
        return resFechaChecking;
    }

    public void setResFechaChecking(String resFechaChecking) {
        this.resFechaChecking = resFechaChecking;
    }

    public String getResFechaCheckout() {
        return resFechaCheckout;
    }

    public void setResFechaCheckout(String resFechaCheckout) {
        this.resFechaCheckout = resFechaCheckout;
    }

    public String getResEstado() {
        return resEstado;
    }

    public void setResEstado(String resEstado) {
        this.resEstado = resEstado;
    }

    public Double getResPago() {
        return resPago;
    }

    public void setResPago(Double resPago) {
        this.resPago = resPago;
    }

    public Integer getFkAlojamiento() {
        return fkAlojamiento;
    }

    public void setFkAlojamiento(Integer fkAlojamiento) {
        this.fkAlojamiento = fkAlojamiento;
    }

    public Integer getFkCliente() {
        return fkCliente;
    }

    public void setFkCliente(Integer fkCliente) {
        this.fkCliente = fkCliente;
    }

    public Integer getFkUsuarioChecking() {
        return fkUsuarioChecking;
    }

    public void setFkUsuarioChecking(Integer fkUsuarioChecking) {
        this.fkUsuarioChecking = fkUsuarioChecking;
    }

    public Integer getFkUsuarioCheckout() {
        return fkUsuarioCheckout;
    }

    public void setFkUsuarioCheckout(Integer fkUsuarioCheckout) {
        this.fkUsuarioCheckout = fkUsuarioCheckout;
    }
}
