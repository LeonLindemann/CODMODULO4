package PatronesDisenio.Adapter;

public class main {
    public static void main(String[] args) {
        EnchufeEuropeo europeo =  new EnchufeEuropeo();
        EnchufeMex adaptador = new AdaptadorEuropeo(europeo);
        adaptador.conectarMex();
    }
}
