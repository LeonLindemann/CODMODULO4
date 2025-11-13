package Ses15.Asociacion;

public class Cliente {
    private String nombre;
    private Repartidor repartidorAsignado;

    public Cliente(String nombre){
        this.nombre = nombre;
    }

    public void asignarRepartidor(Repartidor r){
        repartidorAsignado = r;
    }
}
