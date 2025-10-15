package entity.practivaClase;

public class Suscriptor {

    private String nombre;
    private Integer telefono;
    private String direccion;


    public Suscriptor(String nombre, Integer telefono, String direccion){
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    //------------------------------------------------------------------------------------------------------------------
    //GET
    public String getNombre(){return nombre;}

    public Integer getTelefono(){return telefono;}

    public String getDireccion(){return direccion;}

    //------------------------------------------------------------------------------------------------------------------
    //SET
    public String setNombre(String nuevoNombre){
        nombre = nuevoNombre;
        return nombre;
    }

    public Integer setTelefono(Integer nuevoTelefono){
        telefono = nuevoTelefono;
        return telefono;
    }

    public String setDireccion(String nuevaDireccion){
        direccion = nuevaDireccion;
        return direccion;
    }









}
