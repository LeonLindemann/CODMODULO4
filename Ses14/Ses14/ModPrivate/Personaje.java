package Ses14.ModPrivate;

public class Personaje {
    private int nivel;
    private int puntosVida;

    public Personaje(int nivel, int puntosVida){
        this.nivel = nivel;
        this.puntosVida = puntosVida;
    }

    //Método publico para recibir daño
    public void recibirDanio(int danio){
        puntosVida -= danio;
        if (puntosVida < 0) {
            puntosVida = 0;            
            System.out.println("El personaje recibió: "+danio+" de daño. Vida restante: "+puntosVida);
        }else{
            System.out.println("El personaje recibió: "+danio+" de daño. Vida restante: "+puntosVida);
        }
    }

    public void mostrarEstado(){
        System.out.println("Nivel: "+nivel+" | Puntos de Vida: "+puntosVida);
    }
}
