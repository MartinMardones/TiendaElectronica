package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        ArrayList<Cliente> clientes = new ArrayList<>();

        // Crear algunos productos y clientes de ejemplo
        Producto producto1 = new Producto("Cereal", "Cereal Chocapic", 200, "Cereales");
        Producto producto2 = new Producto("Zapatilla", "Zapatilla Nike", 14, "Calzado");
        Producto producto3 = new Producto("Agua", "Agua gasificada", 50, "Bebestibles");
        Producto producto4 = new Producto("Gomitas", "Gomitas acidas", 100, "Snacks");
        Producto producto5 = new Producto("Papel higienico", "Papel Higienico Scott", 10, "Higiene");
        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
        productos.add(producto4);
        productos.add(producto5);


        Cliente cliente1 = new Cliente("Cliente1", null);
        Cliente cliente2 = new Cliente("Cliente2", null);
        Cliente cliente3 = new Cliente("Cliente3", null);
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);

        Tienda tienda = new Tienda(productos, clientes);

        tienda.mostrarProductos();

        tienda.modificarNombre("Gomitas");

        tienda.modificarCategoria("Gomitas");

        tienda.modificarDescripcion("Gomitas");

        tienda.mostrarProductos();

        // Realizo compras
        tienda.comprar(cliente1, producto1);
        tienda.comprar(cliente1, producto3);
        tienda.comprar(cliente1, producto5);
        tienda.comprar(cliente2, producto1);
        tienda.comprar(cliente3, producto4);
        tienda.comprar(cliente3, producto5);

        tienda.mostrarProductos();

        tienda.borrarProducto("Zapatilla");

        tienda.mostrarProductos();
    }
}