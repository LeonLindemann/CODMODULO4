public class PistaCarreras {
    public static void main(String[] args) {
        //instanciar un objeto
        Coche versa = new Coche();
        versa.color = "Rojo";
        versa.velocidad = 10;

        Coche formula = new Coche("Azul",300);

        //Coche formula2 = new Coche(300, "Azul");

        versa.mostrarDatos();
        versa.acelerar(20);

        formula.mostrarDatos();
        formula.acelerar(100);

        //Clase reunión de carros
        Coche tuneado = new Coche();
    }
}
