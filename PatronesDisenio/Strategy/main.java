package PatronesDisenio.Strategy;

public class main {
    public static void main(String[] args) {
        Viajero viajero = new Viajero(new TransporteAutobus());
        viajero.viajar();

        viajero.setEstrategia(new TransporteTaxi());
        viajero.viajar();
    }
}
