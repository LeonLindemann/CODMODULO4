package PatronesDisenio.Strategy;

public class Viajero {
    private EstrategiaTransporte estrategiaTransporte;

    public Viajero(EstrategiaTransporte estrategiaTransporte){
        this.estrategiaTransporte = estrategiaTransporte;
    }

    public void setEstrategia(EstrategiaTransporte estrategiaTransporte){
        this.estrategiaTransporte = estrategiaTransporte;
    }

    public void viajar(){
        estrategiaTransporte.irAeropuerto();
    }
}
