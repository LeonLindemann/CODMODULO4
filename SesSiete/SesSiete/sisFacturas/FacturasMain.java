package SesSiete.sisFacturas;

public class FacturasMain {
    public static void main(String[] args) {
        FacturaConIva f1 = new FacturaConIva();
        f1.setId("1");
        f1.setImporte(100);
        System.out.println(f1.calcularTotal());

        FacturaSinIva f2 = new FacturaSinIva();
        f2.setId("2");
        f2.setImporte(100);
        System.out.println(f2.calcularTotal());
    }
}
