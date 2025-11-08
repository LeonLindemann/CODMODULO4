package SesOcho;

//clase abstracta
public abstract class FiguraGeometrica {
    // metodo abstracto: cada figura debe saber calcular su area
    public abstract double calcularArea();

    // metodo concreto: comportamiento comun
    public void mostrarTipo() {
        System.out.println("Soy una figura geometrica.");
    }
}

// sublcase concreta: circulo
class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

class MainFiguras {
    public static void main(String[] arg) {
        // implementacion
        Circulo c = new Circulo(4.5);
        Rectangulo r = new Rectangulo(5, 6.5);

        c.mostrarTipo(); // metodo heredado
        System.out.println("Area del circulo: " + c.calcularArea());

        r.mostrarTipo(); // metodo heredado
        System.out.println("Area del rectangulo: " + r.calcularArea());
    }
}
