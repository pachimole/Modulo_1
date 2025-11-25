public class Guia {

    private String nombre;
    private Integer dni;
    private Integer numMatricula;

    public Guia(String nombre, Integer dni, Integer numMatricula) {
        this.nombre = nombre;
        this.dni = dni;
        this.numMatricula = numMatricula;
    }

    //------------------------------------------------------------------------------------------------------------------
    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Integer getDni(){
        return dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    //------------------------------------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return "Guia{" +
                "nombre='" + nombre + '\'' +
                ", dni=" + dni +
                ", numMatricula=" + numMatricula +
                '}';
    }
}
