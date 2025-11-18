public class Premium extends Paquete{

    private Integer puntosExcursion;
    private String voucherDescuento;
    private Double porcentajePorExcursion = 0.15;

    public Premium(Integer identificador, String titulo, Double precioBase, Integer cantDias, Integer puntosExcursion) {
        super(identificador, titulo, precioBase, cantDias);
        this.puntosExcursion = puntosExcursion;
    }

    @Override
    public Double calcularPrecioFinal(){

        Double adicional = getPrecioBase()*porcentajePorExcursion*excursiones.size();
        System.out.println("El precio final es de: " + (getPrecioBase() + adicional) +
                "(Precio: " + getPrecioBase() + " + totalexcursiones: " + excursiones.size() + ")");
        return getPrecioBase() + adicional;
    }

}
