package PatronesDisenio.Strategy;

public class TransporteAutobus implements EstrategiaTransporte {

    @Override
    public void irAeropuerto() {
        System.out.println("Ir al aeropuerto en autobús. Tiempo estimado: una hora");
    }

}
