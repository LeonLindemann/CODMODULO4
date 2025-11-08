package SesOcho;
// Declaramos el archivo principal con el nombre FiguraGeometrica.java
// En este archivo estarán la clase abstracta y las dos subclases (Círculo y Rectángulo)

// Clase abstracta que representa una figura geométrica genérica
abstract class FiguraGeometrica {
    // Método abstracto: todas las figuras deben poder calcular su área,
    // pero la fórmula depende de cada figura (por eso no se implementa aquí)
    public abstract double calcularArea();

    // Método concreto: comportamiento común a todas las figuras
    // Este método imprime el tipo de figura, usando el nombre de la clase
    public void mostrarTipo() {
        System.out.println("Soy una figura del tipo: " + this.getClass().getSimpleName());
    }
}

// Subclase concreta que representa un Círculo
class Circulo extends FiguraGeometrica {

    // Atributo que almacena el radio del círculo
    private double radio;

    // Constructor que recibe el valor del radio
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Sobrescribimos (implementamos) el método abstracto de la clase padre
    @Override
    public double calcularArea() {
        // Fórmula del área de un círculo: π * radio^2
        return Math.PI * radio * radio;
    }
}

// Subclase concreta que representa un Rectángulo
class Rectangulo extends FiguraGeometrica {

    // Atributos que almacenan el ancho y la altura del rectángulo
    private double ancho;
    private double alto;

    // Constructor que recibe el ancho y alto del rectángulo
    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    // Implementamos el método abstracto calcularArea() de la clase padre
    @Override
    public double calcularArea() {
        // Fórmula del área del rectángulo: base * altura
        return ancho * alto;
    }
}

// Clase principal (puede estar al final del mismo archivo)
// Esta clase sirve para probar las demás
public class FiguraGeometricaTest {
    public static void main(String[] args) {

        // Creamos un objeto de tipo Círculo con radio 5
        FiguraGeometrica circulo = new Circulo(5);

        // Creamos un objeto de tipo Rectángulo con ancho 4 y alto 3
        FiguraGeometrica rectangulo = new Rectangulo(4, 3);

        // Mostramos el tipo de figura y su área
        circulo.mostrarTipo();
        System.out.println("Área del círculo: " + circulo.calcularArea());

        rectangulo.mostrarTipo();
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
    }
}
