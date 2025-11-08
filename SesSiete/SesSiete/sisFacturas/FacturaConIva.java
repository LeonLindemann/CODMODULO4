package SesSiete.sisFacturas;

public class FacturaConIva extends Factura{

    @Override
    public double calcularTotal() {
        return getImporte() * 1.21;    
    }
    
}
