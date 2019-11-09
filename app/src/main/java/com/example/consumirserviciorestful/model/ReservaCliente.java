/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.consumirserviciorestful.model;

public class ReservaCliente{
    private Integer ruId;
    private Integer fkReserva;
    private Integer fkCliente;

    public ReservaCliente() {
    }

    public ReservaCliente(Integer ruId, Integer fkReserva, Integer fkCliente) {
        this.ruId = ruId;
        this.fkReserva = fkReserva;
        this.fkCliente = fkCliente;
    }

    public Integer getRuId() {
        return ruId;
    }

    public void setRuId(Integer ruId) {
        this.ruId = ruId;
    }

    public Integer getFkReserva() {
        return fkReserva;
    }

    public void setFkReserva(Integer fkReserva) {
        this.fkReserva = fkReserva;
    }

    public Integer getFkCliente() {
        return fkCliente;
    }

    public void setFkCliente(Integer fkCliente) {
        this.fkCliente = fkCliente;
    }
}
