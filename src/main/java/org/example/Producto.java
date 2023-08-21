package org.example;

public class Producto {
    private String nombre;
    private String descripcion;
    private int stock;
    private String categoria;
    public Producto(String nombre, String descripcion, int stock, String categoria){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.stock = stock;
        this.categoria = categoria;
    }
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String toString() {
        return "Nombre: " + nombre + "\n" +
                "Descripción: " + descripcion + "\n" +
                "Stock: " + stock + "\n" +
                "Categoría: " + categoria;
    }
}