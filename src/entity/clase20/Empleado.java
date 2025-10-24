package entity.clase20;

import java.util.Objects;

public abstract class Empleado implements Comparable<Empleado>{

    private String nombre;
    private Integer dni;
    private Double sueldoBase;

    public Empleado(String nombre, Integer dni, Double sueldoBase){
        this.nombre=nombre;
        this.dni=dni;
        this.sueldoBase=sueldoBase;
    }

    //------------------------------------------------------------------------------------------------------------------
    //Metodos
    public abstract Double calcularSueldo();

    protected Double getSueldoBase() {
        return sueldoBase;
    }

    protected String getNombre(){ return nombre;}

    //------------------------------------------------------------------------------------------------------------------
    //toString
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", dni=" + dni +
                ", sueldoBase=" + sueldoBase +
                ", hashCode=" + hashCode() +
                '}';
    }

    //hashcode
    @Override
    public int hashCode(){

        return Objects.hash(nombre,dni);
    }

    //equals
    @Override
    public boolean equals (Object o){
        if (o == null || this.getClass() != o.getClass()){
            return false;
        }
        //Casting
        Empleado empleadoTrasformado = (Empleado) o;
        return Objects.equals(empleadoTrasformado.dni, this.dni );

    }

    //------------------------------------------------------------------------------------------------------------------
    //metodo == en todas las instancias
    public final void registrarse(){
        System.out.println("registrarse. ");
    }

    //------------------------------------------------------------------------------------------------------------------


    @Override
    public int compareTo(Empleado o) {
        return dni.compareTo(o.dni);
    }
}