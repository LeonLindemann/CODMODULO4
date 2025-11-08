package SesTres;
public class Practica4A {
// Descripción: Ejemplo de sistema simple para registrar productos, clientes y ventas.

class Producto {
    // Atributos
    private String nombre;
    private double precio;
    private String categoria;
    private int stock;

    // Constructor
    public Producto(String nombre, double precio, String categoria, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.stock = stock;
    }

    // Métodos
    public boolean verificarStock(int cantidad) {
        return stock >= cantidad;
    }

    public void disminuirStock(int cantidad) {
        if (verificarStock(cantidad)) {
            stock -= cantidad;
        } else {
            System.out.println("No hay suficiente stock del producto: " + nombre);
        }
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarInfo() {
        System.out.println("Producto: " + nombre + " | Categoría: " + categoria + " | Precio: $" + precio + " | Stock: " + stock);
    }
}


class Cliente {
    // Atributos
    private String nombre;
    private String correo;

    // Constructor
    public Cliente(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    // Métodos
    public void mostrarInfo() {
        System.out.println("Cliente: " + nombre + " | Correo: " + correo);
    }

    public String getNombre() {
        return nombre;
    }
}


class Venta {
    // Atributos
    private Cliente cliente;
    private Producto producto;
    private int cantidad;

    // Constructor
    public Venta(Cliente cliente, Producto producto, int cantidad) {
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    // Métodos
    public boolean realizarVenta() {
        if (producto.verificarStock(cantidad)) {
            producto.disminuirStock(cantidad);
            System.out.println("Venta realizada con éxito.");
            return true;
        } else {
            System.out.println("No se pudo realizar la venta. Stock insuficiente.");
            return false;
        }
    }

    public double calcularTotal() {
        return producto.getPrecio() * cantidad;
    }

    public void mostrarDetalle() {
        System.out.println("------ Detalle de Venta ------");
        cliente.mostrarInfo();
        System.out.println("Producto: " + producto.getNombre());
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Total: $" + calcularTotal());
        System.out.println("------------------------------");
    }
}


public class Main {
    public static void main(String[] args) {
        // Crear productos
        Producto p1 = new Producto("Laptop", 15000.00, "Electrónica", 10);
        Producto p2 = new Producto("Mouse", 250.00, "Accesorios", 30);

        // Crear clientes
        Cliente c1 = new Cliente("Ana López", "ana@example.com");
        Cliente c2 = new Cliente("Carlos Ruiz", "carlos@example.com");

        // Mostrar información inicial
        p1.mostrarInfo();
        p2.mostrarInfo();
        System.out.println();

        // Registrar una venta
        Venta v1 = new Venta(c1, p1, 2);
        if (v1.realizarVenta()) {
            v1.mostrarDetalle();
        }

        System.out.println();

        // Otra venta
        Venta v2 = new Venta(c2, p2, 5);
        if (v2.realizarVenta()) {
            v2.mostrarDetalle();
        }

        System.out.println();

        // Mostrar stock actualizado
        p1.mostrarInfo();
        p2.mostrarInfo();
    }
}

}
