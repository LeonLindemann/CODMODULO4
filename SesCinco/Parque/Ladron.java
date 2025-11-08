package SesCinco.Parque;

import SesCinco.Alcances.CuentaBancaria;

public class Ladron {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria(150, "Elías");

        //Ya no puede hacer nada malo
        cuenta1.depositar(80000000);
    }
}
