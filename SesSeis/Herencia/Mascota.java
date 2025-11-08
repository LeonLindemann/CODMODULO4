package SesSeis.Herencia;

public class Mascota {
    //Caracteristicas generales de una mascota
    public String nombre;
    public int edad;
    

    //Constructor
    public Mascota(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }


    //Comportamientos
    public void hacerSonido(){
        System.out.println(nombre + " esta haciendo sonido");
    }

    public void comer(){
        System.out.println(nombre + " esta comiendo");
    }
}
