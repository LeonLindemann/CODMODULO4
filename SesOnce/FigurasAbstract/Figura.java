package SesOnce.FigurasAbstract;

// Clase abstracta general
public abstract class Figura {
    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto a implementar por cada subclase
    protected abstract double calcularArea();

    // Método común para mostrar el tipo de figura
    public void mostrarTipo() {
        System.out.println("Soy una figura del tipo: " + nombre);
    }
}