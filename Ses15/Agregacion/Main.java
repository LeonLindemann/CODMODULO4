package Ses15.Agregacion;

public class Main {
    public static void main(String[] args) {
        Departamento dep = new Departamento("Recursos Humanos");

        //No hay empleados
        dep.mostrarEmpleados();

        //Llegan empleados nuevos al nuevo departamento
        Empleado emp1 = new Empleado("Elías");
        Empleado emp2 = new Empleado("Alejandrp");

        //Se les asigna su nuevo departamento
        dep.agregarEmpleado(emp1);
        dep.agregarEmpleado(emp2);

        dep.mostrarEmpleados();
    }
}
