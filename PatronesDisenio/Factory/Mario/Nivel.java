package PatronesDisenio.Factory.Mario;

public class Nivel {
    public static void main(String[] args) {
        FactoryEnemigo fabrica = new FabricaKoopa();
        Enemigo enemigo = fabrica.crearEnemigo();
        enemigo.atacar();
        fabrica = new FabricaGoomba();        
    }
}
