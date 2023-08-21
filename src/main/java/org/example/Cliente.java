package org.example;

public class Cliente {
    private String rut;
    public Tienda tienda;
    public Cliente(String rut, Tienda tienda){
        this.rut = rut;
        this.tienda = tienda;
    }

    public String getRut() {
        return this.rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }
}