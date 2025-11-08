package SesNueve.Restaurante;

public class Chef {
    private String nombre;

    //Definir sus accionesc con distintos comportamientos
    //Pizza base
    public void prepararPizza(){
        System.out.println("Preparando una pizza sencilla");
    }

    public void prepararPizza(String ingredienteExtra){
        System.out.println("Preparando una pizza con: "+ingredienteExtra+".");
    }

    public void prepararPizza(String masa, boolean quieresExtraQueso){
        if (quieresExtraQueso) {
            System.out.println("Preparando pizza con la masa: "+masa+" y extra queso");
        }else{
            System.out.println("Preparando una pizza con la masa: "+masa+" sin extra queso");
        }
    }
}
