package SesSiete.sisFacturas;

//Esta clase tiene métodos que se implementan en las clases hijas
public abstract class Factura {
    private String id;
    private double importe;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public double getImporte() {
        return importe;
    }
    public void setImporte(double importe) {
        this.importe = importe;
    }

    //Método abstracto - Se implementará en las subclases
    public abstract double calcularTotal();

}
