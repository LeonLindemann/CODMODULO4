package SesOnce.FigurasAbstract;

public class Main {
    public static void main(String[] args) {
        Circulo c = new Circulo("Círculo", 5);
        Rectangulo r = new Rectangulo("Rectángulo", 4, 6);
        Cuadrado q = new Cuadrado("Cuadrado", 4);
        Triangulo t = new Triangulo("Triángulo", 3, 7);

        Figura[] figuras = { c, r, q, t };

        for (Figura f : figuras) {
            f.mostrarTipo();
            System.out.println("Área: " + f.calcularArea());
            System.out.println("---------------------------");
        }
    }
}
