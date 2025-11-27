package PatronesDisenio.Builder;

public class main {
    public static void main(String[] args) {
        
        Personaje guerrero = new Personaje.Builder()
                .conNombre("Aragorn")
                .conClase("Guerrero")
                .conSalud(150)
                .conFuerza(80)
                .conInteligencia(40)
                .build();

        Personaje mago = new Personaje.Builder()
                .conNombre("Gandalf")
                .conClase("Mago")
                .build();

        System.out.println("Personaje 1: " + guerrero);
        System.out.println("Personaje 2: " + mago);
    }
}
