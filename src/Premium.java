public class Premium extends Paquete{

    private Integer puntosExcursion;
    private String voucherDescuento;
    private Double porcentajePorExcursion = 0.15;

    public Premium(Integer identificador, String titulo, Double precioBase, Integer cantDias, Integer puntosExcursion) {
        super(identificador, titulo, precioBase, cantDias);
        this.puntosExcursion = puntosExcursion;
    }

    public void calcularPrecioFinal(){
        Double precioFinal = getPrecioBase();
        System.out.println("El precio final es de: " + (precioFinal + porcentajePorExcursion * excursiones.size()) +
                "(Precio: " + precioFinal + " + totalexcursiones: " + excursiones.size() + ")");
    }

}
