public class SintaxisBasica {
    public static void main(String[] args) {
        //Primera instrucción en java
        //Imprimir sin salto de linea
        //System.out.print("");
        //Imprimir con salto de linea
        System.out.println("Hola Mundo");

        //Tipos de datos primitivos 
        //Integer
        int edad = 27;
        double salario = 1250.50;
        char inicial = 'E';
        //boolean = true o false
        boolean esProgramador = true;

        //Tipos de datos no primitivos
        String nombre = "Eduardo";
        int[] numeros = {1,2,3,4,5}; //Existe una libreria para manejar arreglos
        //Clases = Podemos definir nuestros propios tipos de datos
        int a = 5, b = 10;
        //int suma = a+b;
        //System.out.println("Resultado: " + suma);
        boolean resultado1 = (a<b) && (b>0); //True and True = true
        boolean resultado2 = (a > b) || (b > 0); //False or True = true
/* 
        int edadPersona = 20;
        if (edad >= 18){
            System.out.println("Eres mayor de edad");
        }else if(edad >= 13){
            System.out.println("Eres adolecente");
        }else{
            System.out.println("Eres menor de edad");
        }
*/
        //while
        int contador = 1;
        while (contador <= 5) {
            System.out.println("Contador: "+contador);
            contador++;
        }

        //For 
        for (int i = 1; i <= 5;i++){
            System.out.println("Iteración del for Num "+i);
        }
    }
}