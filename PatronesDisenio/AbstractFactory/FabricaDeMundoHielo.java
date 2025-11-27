package PatronesDisenio.AbstractFactory;

public class FabricaDeMundoHielo implements FabricaEnemigo{

    @Override
    public Enemigo crearCaminante() {
        return new GoombaHielo();
    }

    @Override
    public Enemigo crearVolador() {
        return new KoopaHielo();
    }

}
