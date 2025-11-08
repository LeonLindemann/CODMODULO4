package SesOcho;

//clase abstracta
public abstract class Animal {
    //metodo abstracto: NO TIENE CUERPO
    public abstract void hacerSonido();

    //metodo abstracto: SI TIENE CUERPO
    public void respirar() {
        System.out.println("El animal esta respirando...");
    }
}

//subclase concreta
class Perro extends Animal {
    //@Override
    public void hacerSonido() {
        System.out.println("Guau guau");
    }
    //podemos agregar mas metodos propios del perro
    public void moverCola() {
        System.out.println("El perro mueve la cola.");
    }

    //main para probar
    public static void main(String[] args) {
        //Animal a = new Animal(); //ESTO NO SE PUEDE HACER, ES ABSTRACTO

        //pero si podemos crear un perro
        Perro solovino = new Perro();
        solovino.hacerSonido(); //metodo implementado
        solovino.respirar(); //metodo heredado de animal
        solovino.moverCola();//metodo propio
    }
}