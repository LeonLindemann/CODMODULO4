package Practica1.DreamStore;

import java.util.ArrayList;

public class Venta {
    //private Producto producto;
    private Cliente cliente;
    private ArrayList<ItemCuenta> listaItems;//productos y su cantidad
    private double total;

    public Venta(Cliente cliente) {
        this.cliente = cliente;
        this.listaItems = new ArrayList<>(); // Esta lista se inicializa aquí solo una vez
    }
    
    /*Cada vez que se agrega un item, se inicializa la lista, por lo tanto solo queda el último item agregado, la solución que se implementa es inicializar la lista en el constructor de la clase Venta.
    public void agregarItem(ItemCuenta item){
        listaItems = new ArrayList<>();
        listaItems.add(item);
    }*/
    
    // Solución: El método agregarItem ya no inicializa la lista, solo agrega el item.
    public void agregarItem(ItemCuenta item){
        listaItems.add(item);
    }

    public void calcularTotal(){
        double total = 0;
        for (ItemCuenta itemCuenta : listaItems) {
            total += itemCuenta.calcularSubtotal();
        }
        this.total = total;
    }
    
    public void generarTicket(){
        System.out.println("\nEl cliente "+cliente.getNombre()+" compro: ");
        for (ItemCuenta itemCuenta : listaItems) {
            System.out.println("- " + itemCuenta.getProducto().getNombre() + " x " + itemCuenta.calcularSubtotal());
        }
        System.out.println("Total a pagar: $" + total);

    }

    @Override
    public String toString() {
        return "Venta [listaItems=" + listaItems + "]";
    }
    
}
