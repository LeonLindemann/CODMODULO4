package Ses16.CentralAutobuses;

public class Main {
    public static void main(String[] args) {
    EmpresaTransporte emp1 =  new EmpresaTransporte("Transportes Del Sur");
    EmpresaTransporte emp2 =  new EmpresaTransporte("etn");

    Autobus a1 = new Autobus("ABC-123");
    Autobus a2 = new Autobus("DFG-456");

    emp1.agregarAutobus(a1);
    emp1.agregarAutobus(a2);
    emp1.listarAutobuses();

    emp1.quitarAutobus(a2);

//transferir autobuses a otra empresa (por que es una simulación de la independencia que hay en la agregación)
    emp2.agregarAutobus(a2);
    }
    

    
}
