package SesNueve.Triatlon;

public class Deportista {
    protected String nombre;

    public Deportista(String nombre){
        this.nombre = nombre;
    }

    //Comportamiento de un deportista normal
    public void nadar(){
        System.out.println(nombre+" nada de forma regular");
    }
    public void correr(){
        System.out.println(nombre+" corre de forma regular");
    }
    public void pedalear(){
        System.out.println(nombre+" pedalea de forma regular");
    }
}
