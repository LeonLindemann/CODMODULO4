package PatronesDisenio.Singleton;

public class Login {

    private static Login instancia;

    private Login(){
        System.out.println("Creando objeto...");
    }

    public static Login getInstancia(){
        if (instancia == null) {
            instancia = new Login();
        }
        
        return instancia;
    }
}
