package Practica1.DreamStore;

public class ItemCuenta {
    private Producto producto;
    private int cantidad;

    public ItemCuenta(Producto producto, int cantidad){
        if(!producto.validarStock(cantidad)){
            // Si no hay stock suficiente, se muestra un mensaje y no se registra la venta
            System.out.println("No hay suficiente producto de "+ producto.getNombre());
        }else {
            // Si hay stock, se confirma la adición del producto
            System.out.println("Se agrego correctamente: " + producto.getNombre());
            // Asigna el producto y la cantidad al ítem
            this.producto = producto;
            this.cantidad = cantidad;
            // Reduce el stock disponible del producto
            producto.reducirStock(cantidad);
        }
    }

    public double calcularSubtotal(){
        return producto.getPrecio() * cantidad;
    }

    public Producto getProducto() {
        return producto;
    }
}
