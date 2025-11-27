package PatronesDisenio.Factory.Mario;

public class FabricaKoopa extends FactoryEnemigo{

    @Override
    public Enemigo crearEnemigo() {
        return new Koopa();
    }

}
