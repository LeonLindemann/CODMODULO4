package SesSeis.Herencia;

public class Tortuga extends Mascota{
    private String formaCaparazon;

    public Tortuga(String nombre, int edad, String formaCaparazon){
        super(nombre, edad);
        this.formaCaparazon = formaCaparazon;
    }

    public void esconderese(){
        System.out.println(nombre + " se esta escondiendo en su caparazon");
    }
}
