package entity.practivaClase;
import java.time.LocalDate;

public class Edicion{

    private Integer numEdicion;
    private int fechaPublicacion;
    private Double precioBase;
    private static final Double COMISION = 0.10;


    public Edicion(Integer numEdicion, int fechaPublicacion, Double precioBase) {
        this.numEdicion = numEdicion;
        this.fechaPublicacion = fechaPublicacion;
        this.precioBase = precioBase;
    }

    //------------------------------------------------------------------------------------------------------------------
    private Double calcularPrecioFinal(){

        System.out.println("El precio final es de: " + (precioBase - COMISION));
        Double precioFinal = (precioBase - COMISION);

        return  precioFinal;
    }

    //------------------------------------------------------------------------------------------------------------------
    //Get

    public Double getPrecioBase(){return precioBase;}

    //Set

    public Double setPrecioBase(Double nuevoPrecioBase){
        precioBase = nuevoPrecioBase;
        return precioBase;
    }


}
