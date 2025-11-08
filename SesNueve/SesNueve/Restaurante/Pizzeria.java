package SesNueve.Restaurante;

public class Pizzeria {
    
    public static void main(String[] args) {
        Chef ramsey = new Chef();
        ramsey.prepararPizza();
        ramsey.prepararPizza("Peperoni");
        ramsey.prepararPizza("Sarten", false);
    }
}
