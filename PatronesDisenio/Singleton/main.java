package PatronesDisenio.Singleton;

public class main {
    public static void main(String[] args) {
        Login logger1 = Login.getInstancia();
    
        Login logger2 = Login.getInstancia();

        if (logger1==logger2) {
            System.out.println("Son la misma instancia" );
        }else{
            System.out.println("No son la misma instancia" );
        }
    }
}
