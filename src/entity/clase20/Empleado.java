package entity.clase20;

public class Empleado {
    private String nombre;
    private Integer dni;
    private Double sueldoBase;

    public Empleado(String nombre, Integer dni, Double sueldoBase){
        this.nombre=nombre;
        this.dni=dni;
        this.sueldoBase=sueldoBase;
    }
    public Empleado(String nombre, Integer dni){
        this.nombre = nombre;
        this.dni = dni;
    }
    public Double calcularSueldo(){
        return this.sueldoBase;
    }

    protected Double getSueldoBase() {
        return sueldoBase;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", dni=" + dni +
                ", sueldoBase=" + sueldoBase +
                '}';
    }
}