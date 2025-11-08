package SesCinco.Alcances;

public class EntidadExternaMaliciosa {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria(150, "Elías");
        System.out.println();
        System.out.println(cuenta1.getNombreDuenio());
        System.out.println(cuenta1.getSaldo());
        
        //Modificando valores de forma maliciosa
        cuenta1.setNombreDuenio("Antonio");
        //cuenta1.setSaldo(-1000);

        System.out.println(cuenta1.getNombreDuenio());
        System.out.println(cuenta1.getSaldo());
    }
}
