package PatronesDisenio.AbstractFactory;

public class Nivel {
public static void main(String[] args) {
    FabricaEnemigo fabrica = new FabricaDeMundoLava();
    
    Enemigo enemigo1 = fabrica.crearCaminante();
    Enemigo enemigo2 = fabrica.crearVolador();
}
}
