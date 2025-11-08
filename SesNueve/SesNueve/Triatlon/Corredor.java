package SesNueve.Triatlon;

public class Corredor extends Deportista{

    public Corredor(String nombre) {
        super(nombre);
    }

    @Override
    public void nadar(){
        System.out.println(nombre+" se cansa en el agua");
    }

    @Override
    public void correr(){
        System.out.println(nombre+" corre con excelente resistencia");
    }

    @Override
    public void pedalear(){
        System.out.println(nombre+" pedalea despacio");
    }
    
}
