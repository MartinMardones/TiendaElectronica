package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Tienda {
    public ArrayList<Producto> productos = new ArrayList<Producto>();
    public ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    public Tienda(ArrayList<Producto> productos, ArrayList<Cliente> clientes) {
        this.productos = productos;
        this.clientes = clientes;
    }

    public void mostrarProductos() {
        System.out.println("Lista de productos:");
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    public Producto buscarProductoNombre(String nombre) {
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return producto;
            }
        }
        return null;
    }

    public ArrayList<Producto> buscarProductoCategoria(String categoria) {
        ArrayList<Producto> productosEnCategoria = new ArrayList<>();
        for (Producto producto : productos) {
            if (producto.getCategoria().equalsIgnoreCase(categoria)) {
                productosEnCategoria.add(producto);
            }
        }
        return productosEnCategoria;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println("Producto agregado exitosamente");
    }

    public void modificarNombre(String nombre) {
        Scanner scanner = new Scanner(System.in);

        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Ingrese el nuevo nombre del producto:");
                String nuevoNombre = scanner.nextLine();
                producto.setNombre(nuevoNombre);
                System.out.println("Nombre del producto modificado");
                return;
            }
        }
        System.out.println("Producto no encontrado");
    }



    public void modificarCategoria(String nombre) {
        Scanner scanner = new Scanner(System.in);

        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Ingrese la nueva categoría del producto:");
                String nuevaCategoria = scanner.nextLine();
                producto.setCategoria(nuevaCategoria);
                System.out.println("Categoría del producto modificada");
                return;
            }
        }
        System.out.println("Producto no encontrado");
    }

    public void modificarDescripcion(String nombre) {
        Scanner scanner = new Scanner(System.in);

        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Ingrese la nueva descripción del producto:");
                String nuevaDescripcion = scanner.nextLine();
                producto.setDescripcion(nuevaDescripcion);
                System.out.println("Descripción del producto modificada");
                return;
            }
        }
        System.out.println("Producto no encontrado");
    }



    public void borrarProducto(String nombre) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getNombre().equalsIgnoreCase(nombre)) {
                productos.remove(i);
                System.out.println("Producto eliminado");
                return;
            }
        }
        System.out.println("Producto no encontrado");
    }

    public void comprar(Cliente cliente, Producto producto) {
        if (clientes.contains(cliente) && productos.contains(producto)) {
            int productoIndice = productos.indexOf(producto);
            if (productoIndice != -1 && productos.get(productoIndice).getStock() > 0) {
                productos.get(productoIndice).setStock(productos.get(productoIndice).getStock() - 1);
                System.out.println("Compra realizada con éxito. Stock actualizado.");
            } else {
                System.out.println("Producto sin stock");
            }
        } else {
            System.out.println("Cliente o producto no encontrado");
        }
    }
}