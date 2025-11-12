public class Simple extends Paquete{

    private Double descuentoAsociado = 0.25;
    private Double porcentajePorExcursion = 0.10;
    private String tieneCodigoDescuento;

    public Simple(Integer identificador, String titulo, Double precioBase, Integer cantDias,String tieneCodigoDescuento) {
        super(identificador, titulo, precioBase, cantDias);
        this.tieneCodigoDescuento = tieneCodigoDescuento;
    }

    //------------------------------------------------------------------------------------------------------------------

//    public Boolean tieneCodigoDescuento(String tieneCodigo){
//        if (tieneCodigo.toLowerCase() == "si"){
//            return true;
//        }else
//            return false;
//    }

    public String getTieneCodigoDescuento() {
        return tieneCodigoDescuento;
    }

    public void calcularPrecioFinal(){
        if (getTieneCodigoDescuento().toLowerCase() == "si"){
            System.out.println("Descuento aplicado. El precio final es de: " + (getPrecioBase() + porcentajePorExcursion * excursiones.size() - descuentoAsociado) );
        }else{
            System.out.println("El precio final es de: " + (getPrecioBase() + porcentajePorExcursion * excursiones.size()));

        }
    }

}
