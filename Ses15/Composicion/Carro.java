package Ses15.Composicion;

import java.util.ArrayList;
import java.util.List;

public class Carro {
    private Motor motor;
    private List<Puerta> puertas;

    public Carro(){
        //El carro crea sus propias partes
        this.motor = new Motor();
        this.puertas = new ArrayList<>();
        for(int i = 0; i<4;i++){
            puertas.add(new Puerta("Puerta"+i));
        }
    }

    public void mostrarPartes(){
        System.out.println("Motor: "+motor.getDesc());
        for (Puerta puerta : puertas) {
            System.out.println(puerta.getDescription());
        }
    }

}
