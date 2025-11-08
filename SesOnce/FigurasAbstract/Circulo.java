package SesOnce.FigurasAbstract;

public class Circulo extends Figura {
    private double radio;

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    // Encapsulamiento: getters y setters
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    protected double calcularArea() {
        return Math.PI * radio * radio;
    }
}
