//Nombre de la entidad a modelar
public class Coche {
    //Atributos (propiedades o características)
    String color;
    String marca;
    int velocidad;

    //Constructores
    //Constructor por defecto
    public Coche(){
        color = "";
        velocidad = 0;
        marca = "";
    }

    public Coche(String color){        
        this.color = color;
    }

    public Coche(int vel){        
        this.velocidad = vel;
    }

    public Coche(String color, int velocidad){        
        this.color = color;
        this.velocidad = velocidad;
    }

    //Métodos (acciones o comportamientos del objeto)
    //void = métodos que no devuelven datos
    public void acelerar(int incremento){
        //velocidad = velocidad + incremento;
        velocidad += incremento;
        System.out.println("El coche "+ color +" acelera a "+velocidad+" km/h");
    }

    public void mostrarDatos(){
        System.out.print("Color: " + this.color);
        System.out.println(", Velocidad: " + velocidad);
    }
}