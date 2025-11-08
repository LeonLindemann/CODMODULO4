package SesCinco.Alcances;

public class AmigoDeElias {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria(150, "Elías");
        
        System.out.println("Saldo antes del deposito: " + cuenta1.getSaldo());
        //Acceso controlado para modificar el saldo
        //Lo controlado es que no mande dinero negativo
        cuenta1.depositar(150);
        System.out.println("Saldo después del depósito: " + cuenta1.getSaldo());
    }
}
