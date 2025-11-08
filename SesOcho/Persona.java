package SesOcho;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        }

    public void saludar() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
    }

    public static void main(String[] args) {
        //crear un objeto de la clase concreta
        Persona p1 = new Persona("Pedro", 26);
        p1.saludar();

        Persona p2 = new Persona("Maria", 27);
        p2.saludar();
    }
}