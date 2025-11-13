package Ses16.UniversidadModelo;

//Edificio es una parte//
//Edificio forma parte de una relación de COMPOSICIÓN
public class Edificio {
    private String nombre;

    public Edificio(String nombre){
        this.nombre = nombre;
    }

    public void mostrarInfo(){
        System.out.println("\nEdificio: "+nombre);
    }
}
