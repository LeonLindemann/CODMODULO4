package SesNueve.Triatlon;

public class Nadador extends Deportista{

    public Nadador(String nombre) {
        super(nombre);
    }
    
    @Override
    public void nadar(){
        System.out.println(nombre+" nada de forma experta");
    }

    @Override
    public void correr(){
        System.out.println(nombre+" corre con dificultad");
    }

    @Override
    public void pedalear(){
        System.out.println(nombre+" pedalea despacio");
    }
}
