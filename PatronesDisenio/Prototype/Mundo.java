package PatronesDisenio.Prototype;

public class Mundo {
    public static void main(String[] args) {
        Enemigo enemigoBase = new Enemigo("Lava", 1, 10);

        //Clonar enemigo
        Enemigo enemigoClonado1 = (Enemigo) enemigoBase.clonar();
        Enemigo enemigoClonado2 = (Enemigo) enemigoBase.clonar();

        enemigoClonado1.mostrarInfo();
        enemigoClonado2.mostrarInfo();
    }
}
