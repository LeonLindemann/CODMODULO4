package PatronesDisenio.Factory.Mario;

public class GeneradorEnemigos {
    public Enemigo generarEnemigo(String tipo){
        if (tipo == "Koopa"){
            return new Koopa();
        }else if(tipo == "Goomba") {
            return new Goomba();
        }else if(tipo == "Boo"){
            return  new Boo();
        }
        return null;
    }
}
