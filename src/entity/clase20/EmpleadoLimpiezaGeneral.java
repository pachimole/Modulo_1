package entity.clase20;

public class EmpleadoLimpiezaGeneral extends Empleado{

    private Integer horasExtrasRealizadas;
    private static Double precioHorasExtra = 3500.0;
    private static final Integer CANTIDAD_HS_EXTRA_MAX = 20;

    //CONSTRUCTOR
    public EmpleadoLimpiezaGeneral(String nombre, Integer dni, Integer horasExtrasRealizadas) {
        super(nombre, dni);
        this.horasExtrasRealizadas = horasExtrasRealizadas;

    }

    public void realizarHorasExtra(Integer horasNuevas) {
        if (20 < horasExtrasRealizadas + horasNuevas) {
            System.out.println("Exede el limite de horas extra.");
        } else {
            this.horasExtrasRealizadas += horasNuevas;
        }
    }
    public Double calcularAdicionalHorasExtra(){
        System.out.println("\nPrecio de horas extra: " + precioHorasExtra + "\nHoras extra realizadas: " + horasExtrasRealizadas + "\nTotal: " + precioHorasExtra * horasExtrasRealizadas);
        return precioHorasExtra * horasExtrasRealizadas;
    }

    @Override
    public Double calcularSueldo(){
        return this.getSueldoBase() + calcularAdicionalHorasExtra();
    }

}