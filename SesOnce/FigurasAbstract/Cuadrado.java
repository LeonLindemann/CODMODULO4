package SesOnce.FigurasAbstract;

public class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(String nombre, double lado) {
        super(nombre);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    protected double calcularArea() {
        return lado * lado;
    }
}
