package SesNueve.EjemploAnimales;

public class Zoo {
    public static void main(String[] args) {
        Animal animalGenerico = new Animal();
        Animal perro = new Perro();
        Animal gato = new Gato();

        animalGenerico.hacerSonido();
        perro.hacerSonido();
        gato.hacerSonido();
    }
}
