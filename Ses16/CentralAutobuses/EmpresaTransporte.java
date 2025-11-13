package Ses16.CentralAutobuses;

import java.util.ArrayList;
import java.util.List;

public class EmpresaTransporte {
    private String nombre;
    private List<Autobus> autobuses;

    public EmpresaTransporte(String nombre) {
        this.nombre = nombre;
        autobuses = new ArrayList<>();
    }

    public void agregarAutobus(Autobus a){
        autobuses.add(a);
        System.out.println("Autobus añadido: "+ a);
    }

    public void quitarAutobus(Autobus a){
        autobuses.remove(a);
        System.out.println("Se eliminó el autobus: "+a);
    }
    
    public void listarAutobuses(){
        System.out.println("Autobuses de la empresa" + nombre);
        if (autobuses.isEmpty()) {
            System.out.println("No hay autobuses registrados");
        }else{
            for (Autobus a : autobuses) {
                System.out.println("\nAutobus: "+a.getMatricula());
            }
        }

    }

}
