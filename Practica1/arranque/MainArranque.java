package Practica1.arranque;

import Practica1.DreamStore.Cliente;
import Practica1.DreamStore.ItemCuenta;
import Practica1.DreamStore.Producto;
import Practica1.DreamStore.Venta;

public class MainArranque {
    public static void main(String[] args) {
        //La tienda tiene su estante lleno
        Producto producto1 = new Producto("Camisa", 250.0, "Ropa", 10);
        Producto producto2 = new Producto("Laptop",15000,"Electronica",5);
        Producto producto3 = new Producto("Mouse",300,"Accesorios",15);

        //Llega el cliente a la tienda
        Cliente c1 = new Cliente("Leonardo","leonardo@mail.com");

        //Elias va eligiendo productos
        ItemCuenta item1 = new ItemCuenta(producto1, 2);
        ItemCuenta item2 = new ItemCuenta(producto2, 1);
        ItemCuenta item3 = new ItemCuenta(producto3, 2);

        //Voy a pasar los productos en la banda del super
        Venta venta = new Venta(c1);
        venta.agregarItem(item1);
        venta.agregarItem(item2);
        venta.agregarItem(item3);

        //Se efectua el cobro
        venta.calcularTotal();

        //Imprimir el ticket
        venta.generarTicket();
    }
}