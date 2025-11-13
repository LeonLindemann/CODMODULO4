package Ses15.Agregacion;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nombre;
    private List<Empleado> listaEmpleados;

    public Departamento(String nombre){
        this.nombre = nombre;
        this.listaEmpleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado){        
        listaEmpleados.add(empleado);
    }
    
    //Mostrar los empleados
    //Aunque la lista este vacia
    public void mostrarEmpleados(){
        System.out.println("Departamento: "+nombre);
        if (listaEmpleados.isEmpty()) {
            System.out.println("No hay empleados registrados en este departamento");
        }else{
            System.out.println("Lista de empleados:");
            for (Empleado empleado : listaEmpleados) {
                System.out.println("\n"+empleado.getNombre()+"\n");
            }
        }
    }


}
