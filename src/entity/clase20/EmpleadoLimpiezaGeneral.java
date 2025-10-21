package entity.clase20;

public class EmpleadoLimpiezaGeneral extends Empleado{

    private Integer horasExtrasRealizadas;
    private static Double precioHorasExtra = 3500.0;
    private static final Integer CANTIDAD_HS_EXTRA_MAX = 20;


    //CONSTRUCTOR
    public EmpleadoLimpiezaGeneral(String nombre, Integer dni, Double sueldoBase, Integer horasExtrasRealizadas) {
        super(nombre, dni, sueldoBase);
        this.horasExtrasRealizadas = horasExtrasRealizadas;
    }

    //------------------------------------------------------------------------------------------------------------------
    public void realizarHorasExtra(Integer horasNuevas) {
        if (20 < horasExtrasRealizadas + horasNuevas) {
            System.out.println("Exede el limite de horas extra.");
        } else {
            this.horasExtrasRealizadas += horasNuevas;
        }
    }
    //------------------------------------------------------------------------------------------------------------------
    public Double calcularAdicionalHorasExtra(){
        System.out.println("Calcular horas extra de " + getNombre() +"\n-Precio de horas extra: " + precioHorasExtra + "\n-Horas extra realizadas: " + horasExtrasRealizadas + "\n-Total: " + precioHorasExtra * horasExtrasRealizadas + "\n");
        return precioHorasExtra * horasExtrasRealizadas;
    }

    //------------------------------------------------------------------------------------------------------------------
    @Override
    public Double calcularSueldo(){
        System.out.println("El sueldo de " + getNombre() + " es de: " + (this.getSueldoBase() + precioHorasExtra * horasExtrasRealizadas + "\n"));
        return (this.getSueldoBase() + precioHorasExtra * horasExtrasRealizadas);
    }

}