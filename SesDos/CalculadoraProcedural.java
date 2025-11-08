//Entidad a modelar
public class CalculadoraProcedural {
    //Definir atributos
    int a;
    int b;
    //Definir constructor
    CalculadoraProcedural(){
        a = 10;
        b = 5;
    }
    //Construir métodos
    public int sumar_numeros(){
        int sumar_numeros = a + b;
        return sumar_numeros;
    }
    public int restar_numeros(){
        int restar_numeros = a - b;
        return restar_numeros;
    }
    public static void main(String[] args){
        CalculadoraProcedural calculadora = new CalculadoraProcedural();
        System.out.println("Suma: " + calculadora.sumar_numeros());
        System.out.println("Resta: "+ calculadora.restar_numeros());
    }
}

/*public static void main(String[] args){
    int a = 10, b = 5;
    int suma = a + b;
    int resta = a - b;
    System.out.println("Suma: " + suma);
    System.out.println("Resta: " + resta);
}*/