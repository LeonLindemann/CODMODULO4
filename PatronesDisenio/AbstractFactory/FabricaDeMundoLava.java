package PatronesDisenio.AbstractFactory;

public class FabricaDeMundoLava implements FabricaEnemigo{

    @Override
    public Enemigo crearCaminante() {
        return new GoombaLava();
    }

    @Override
    public Enemigo crearVolador() {
        return new KoopaFuego();
    }

}
