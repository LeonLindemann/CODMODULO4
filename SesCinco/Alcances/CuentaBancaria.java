package SesCinco.Alcances;

public class CuentaBancaria {
    //Atibuto friendly o default
    //Aplicar un modificador de acceso privado
    private double saldo;
    private String nombreDuenio;


    //Constructor
    public CuentaBancaria(double saldo, String nombreDuenio) {
        this.saldo = saldo;
        this.nombreDuenio = nombreDuenio;
    }

    //Getter y setters
    //friendly o default
    double getSaldo() {
        return saldo;
    }

    String getNombreDuenio() {
        return nombreDuenio;
    }
    void setNombreDuenio(String nombreDuenio) {
        this.nombreDuenio = nombreDuenio;
    }



    //Métodos
    void transferir(){
        System.out.println("Hacemos una transacción de A hacia B");
    }


    void depositar(double nuevoDinero){
        if (nuevoDinero <= 0) {
            System.out.println("No puedes depositar 0 o menos");
        } else {
            //saldo = saldo + nuevoDinero;
            saldo += nuevoDinero;
        }
        
    }
}
