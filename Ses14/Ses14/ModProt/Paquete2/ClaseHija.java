package Ses14.ModProt.Paquete2;

import Ses14.ModProt.Paquete1.ClasePadre;

public class ClaseHija extends ClasePadre{
    public void probarAcceso(){
        //Atributo de la clase padre
        System.out.println(mensaje);

        //Método de clase padre
        mostrarMensaje();
    }
}
