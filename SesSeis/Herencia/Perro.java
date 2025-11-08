package SesSeis.Herencia;

public class Perro extends Mascota{
    private String raza;

    //Constructor
    public Perro(String nombre, int edad, String raza){
        super(nombre, edad);
        this.raza = raza;
    }

    public void ladrar(){
        System.out.println(nombre+" esta ladrando..");
    }
}
