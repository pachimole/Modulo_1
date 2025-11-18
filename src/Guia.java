public class Guia {

    private String nombre;
    private Integer dni;
    private Integer numMatricula;

    public Guia(String nombre, Integer dni, Integer numMatricula) {
        this.nombre = nombre;
        this.dni = dni;
        this.numMatricula = numMatricula;
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

}
