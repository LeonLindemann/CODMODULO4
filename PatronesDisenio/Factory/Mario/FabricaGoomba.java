package PatronesDisenio.Factory.Mario;

public class FabricaGoomba extends FactoryEnemigo{

    @Override
    public Enemigo crearEnemigo() {
        return new Goomba();
    }

}
