package Ses14.ModProt.Paquete2;

import Ses14.ModProt.Paquete1.ClasePadre;

public class ClaseClienteP2 {
    public static void main(String[] args) {
        ClasePadre padre = new ClasePadre();

        //Acceso en el mismo paquete 
        //System.out.println(padre.mensaje);
        //padre.mostrarMensaje();

        ClaseHija hija = new ClaseHija();
        hija.probarAcceso();
    }
}
