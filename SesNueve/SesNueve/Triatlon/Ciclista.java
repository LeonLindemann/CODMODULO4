package SesNueve.Triatlon;

public class Ciclista extends Deportista{

    public Ciclista(String nombre) {
        super(nombre);
    }

    @Override
    public void nadar(){
        System.out.println(nombre+" se cansa en el agua");
    }

    @Override
    public void correr(){
        System.out.println(nombre+" corre con paso pesado");
    }

    @Override
    public void pedalear(){
        System.out.println(nombre+" domina la bici con precisión");
    }

}
