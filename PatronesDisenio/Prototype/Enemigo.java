package PatronesDisenio.Prototype;

public class Enemigo implements Prototype{
    private String tipo;
    private int nivel;
    private int vida;

    public Enemigo(String tipo, int nivel, int vida) {
        this.tipo = tipo;
        this.nivel = nivel;
        this.vida = vida;
    }

    @Override
    public Prototype clonar() {
        return new Enemigo(this.tipo,this.nivel, this.vida);
    }
    public void mostrarInfo(){
        System.out.println("Enemigo tipo: "+tipo+ ", Nivel: "+nivel+", Vida: "+vida);
    }
    

}
