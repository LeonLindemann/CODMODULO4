package SesTrece.InversionDependencias;

public class Clon {
    private Arma arma;

    public Clon(Arma arma) {
        this.arma = arma;
    }

    void atacar(){
        arma.accionar();
    }
}
