package SesCuatro;

public class Persona {
    private String nombre;
    private int edad;
    // una persona tiene un libro
    private Libro libro;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    //Setter = modificar algun dato 
    void setNombre(String nombre){
        this.nombre = nombre;
    }

    //Getter = obtener un valor de un atributo
    public String getNombre(){
        return nombre;
    }
}
