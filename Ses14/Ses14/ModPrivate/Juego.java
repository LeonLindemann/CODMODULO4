package Ses14.ModPrivate;

public class Juego {
    public static void main(String[] args) {
        Personaje mario = new Personaje(5, 10);

        mario.mostrarEstado();
        mario.recibirDanio(30);

        //mario.puntosVida = 9999;
        

    }
}
