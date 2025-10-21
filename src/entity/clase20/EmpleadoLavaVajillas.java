package entity.clase20;

public class EmpleadoLavaVajillas extends Empleado{

    private Integer contadorVajillaRota;
    private static final Double PRECIO_VAJILLA_ROTA = 2000.0;

    //CONSTRUCTOR
    public EmpleadoLavaVajillas(String nombre, Integer dni, Double sueldoBase, Integer contadorVajillaRota) {
        super(nombre, dni, sueldoBase);
        this.contadorVajillaRota = contadorVajillaRota;
    }

    //------------------------------------------------------------------------------------------------------------------
    public void actualizarCantidadVajillaRota(Integer nuevasVajillasRotas){
        this.contadorVajillaRota = contadorVajillaRota + nuevasVajillasRotas;
    }

    public Double calcularDescuentoVajillaRota(){
        if(contadorVajillaRota<=1){
            return null;
        }else{
            return contadorVajillaRota * PRECIO_VAJILLA_ROTA - PRECIO_VAJILLA_ROTA;
        }
    }

    //------------------------------------------------------------------------------------------------------------------
    @Override
    public Double calcularSueldo(){
        System.out.println("El sueldo de " + getNombre() + " es de: " + (getSueldoBase() - calcularDescuentoVajillaRota()) + "\n");
        return (this.getSueldoBase() - calcularDescuentoVajillaRota());
    }









}
