package SesCinco.Alcances;

public class Auditor {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria(150, "Elías");
        //Acceso controlado

        //Auditoria Bancaria
        System.out.println("Acceso controlado por el auditor");
        System.out.println(cuenta1.getNombreDuenio());
        System.out.println(cuenta1.getSaldo());
        
    }
}
