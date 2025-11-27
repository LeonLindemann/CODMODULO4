package PatronesDisenio.Adapter;

public class AdaptadorEuropeo implements EnchufeMex{
    private EnchufeEuropeo europeo;

    public AdaptadorEuropeo(EnchufeEuropeo europeo){
        this.europeo = europeo;
    }

    @Override
    public void conectarMex() {
        europeo.conectarEuropeo();
    }
    
}
