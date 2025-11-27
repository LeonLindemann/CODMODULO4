package PatronesDisenio.Strategy;

public class TransporteTaxi implements EstrategiaTransporte {

    @Override
    public void irAeropuerto() {
        System.out.println("Ir al aeropuerto en taxi. Tiempo estimado: 30 minutos");
    }

}
