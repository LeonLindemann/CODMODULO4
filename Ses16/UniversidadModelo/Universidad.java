package Ses16.UniversidadModelo;

import java.util.ArrayList;
import java.util.List;

//Universidad es el todo//
public class Universidad {
    //Nombre de la universidad es un atributo propio
    private String nombre;

    private List<Profesor> profesores; //Agregación
    private List<Edificio> edificios; //Composición

    public Universidad(String nombre){
        this.nombre = nombre;
        profesores = new ArrayList<>();
        edificios = new ArrayList<>();

        //COMPOSICIÓN: Los edificios se crean dentro de la universidad
        edificios.add(new Edificio("Biblioteca"));
        edificios.add(new Edificio("Lab. de Computo"));
        edificios.add(new Edificio("Centro de idiomas"));
    }

    //AGREGACIÓN: Los profesores se agregan desde fuera
    public void agregarProfesor(Profesor p){
        profesores.add(p);
    }

    public void mostrarInfo(){
        System.out.println("\nUniversidad"+nombre);
        System.out.println("\nAgregación - Profesores:");
        for (Profesor profe : profesores) {
            System.out.println(" - "+profe.getNombre());
        }

        System.out.println("\nComposición - Edificios:");
        for (Edificio e : edificios) {
            e.mostrarInfo();
        }
    }
}
