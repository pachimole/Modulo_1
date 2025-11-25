public class Simple extends Paquete{

    private Double descuentoAsociado = 0.25;
    private Double porcentajePorExcursion = 0.10;
    private String tieneCodigoDescuento;

    public Simple(Integer identificador, String titulo, Double precioBase, Integer cantDias,String tieneCodigoDescuento) {
        super(identificador, titulo, precioBase, cantDias);
        this.tieneCodigoDescuento = tieneCodigoDescuento;
    }

    //------------------------------------------------------------------------------------------------------------------

    public String getTieneCodigoDescuento() {
        return tieneCodigoDescuento;
    }

    @Override
    public Double calcularPrecioFinal() {

        Double adicional = getPrecioBase() * porcentajePorExcursion * excursiones.size();

        if (getTieneCodigoDescuento().toLowerCase() == "si") {
            System.out.println("Descuento aplicado. El precio final es de: " + (getPrecioBase() + adicional - descuentoAsociado));
            return (getPrecioBase() + adicional - descuentoAsociado);
        } else {
            System.out.println("El precio final es de: " + (getPrecioBase() + adicional));
            return (getPrecioBase() + adicional);
        }
    }

    @Override
    public String toString() {
        return "Simple{" +
                "descuentoAsociado=" + descuentoAsociado +
                ", porcentajePorExcursion=" + porcentajePorExcursion +
                ", tieneCodigoDescuento='" + tieneCodigoDescuento + '\'' +
                '}';
    }
}
