package Ses14.ModFinal;

public class Vehiculo {
    //Variable que no puede cambiar
    public final int RUEDAS = 4;

    public final void encenderMotor(){
        System.out.println("\nMotor encendido");
        System.out.println("Ruedas: " + RUEDAS);
    }

    public void conducir(){
        System.out.println("El vehiculo se mueve");
    }
}
