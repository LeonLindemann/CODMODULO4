package SesSeis.Herencia;

public class Gato extends Mascota{
    private String color;
    

    //Constructor
    public Gato (String nombre, int edad, String color){
        super(nombre, edad);
        this.color = color;
    }


    public void maullar(){
        System.out.println(nombre + " esta maullando");
    }

 
}
