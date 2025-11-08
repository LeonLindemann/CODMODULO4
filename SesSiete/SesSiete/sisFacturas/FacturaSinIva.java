package SesSiete.sisFacturas;

public class FacturaSinIva extends Factura{

    public double calcularTotal(){
        return getImporte();
    }
}
