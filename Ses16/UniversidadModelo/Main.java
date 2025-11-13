package Ses16.UniversidadModelo;

public class Main {
    public static void main(String[] args) {
        //Profesores creados de manera independiente (AGREGACIÓN)
        Profesor prof1 =  new Profesor("Elías");
        Profesor prof2 =  new Profesor("Alejandro");

        //Creación de la Universidad (COMPOSICIÓN + AGREGACIÓN)
        Universidad uni =  new Universidad("Universidad Infotec");
        Universidad uni2 =  new Universidad("cenidet");

        uni2.agregarProfesor(prof2);

        //Agregar profesores (AGREGACIÓN)
        uni.agregarProfesor(prof1);
        uni.agregarProfesor(prof2);

        uni.mostrarInfo();

    }
}
