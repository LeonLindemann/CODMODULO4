package Practica1.DreamStore;

public class Producto {
    private String nombre;
    private double precio;
    private String categoria;
    private int stock;

    public Producto(String nombre, double precio, String categoria, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public boolean validarStock(int cantidad){
        if (cantidad > stock) {
            return false;
        }else{
            return true;
        }
    }

    public void reducirStock(int cantidad){
            stock = stock - cantidad; //stock -= cantidad;
    }

}
