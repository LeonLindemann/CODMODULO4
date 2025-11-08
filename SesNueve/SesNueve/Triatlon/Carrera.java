package SesNueve.Triatlon;

import java.util.ArrayList;

public class Carrera {
    public static void main(String[] args) {
        //Llegada de los competidores
        Deportista d1 = new Nadador("Michael Phelps");
        Deportista d2 = new Ciclista("Isaac Del Toro");
        Deportista d3 = new Corredor("Usain Bolt");
        ArrayList<Deportista> participantes = new ArrayList();
        participantes.add(d1); participantes.add(d2); participantes.add(d3);

        System.out.println("Inicia la carrera");
        //Estructura de ciclo (Repita las instrucciones hasta que mi contador sea igual que el tamaño de los participantes)
        for(int i = 0; i<=participantes.size()-1;i++){
            System.out.println("\n Participante "+participantes.get(i).nombre);
            participantes.get(i).nadar(); //d1.nadar();
            participantes.get(i).pedalear();    
            participantes.get(i).correr();
        }

        //Llega el nuevo competidor
        Deportista d4 = new Nadador("Katie Ledecky");
        d4.nadar();
        d4 = new Ciclista("Katie Ledecky");
        d4.pedalear();
        d4 =  new Corredor("Katie Ledecky");
        d4.correr();
    }
}
