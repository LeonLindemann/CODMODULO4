package Ses15.Asociacion;

public class CasaCliente {
    public static void main(String[] args) {
         //Cliente llega a su casa
    Cliente oCliente = new Cliente("Elias");

    //cliente pide un paquete
    Repartidor oRepartidor = new Repartidor("nomRepartidor");
    oCliente.asignarRepartidor(oRepartidor);

    //Repartidor entrega paquete
    oCliente.asignarRepartidor(null);
    
    }
}
