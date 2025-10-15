package entity.practivaClase;

public class Publicacion {

    private String nombrePublicacion;
    private String frecuenciaPublicacion;
    private Integer codigoUnico;

    public Publicacion (String nombrePublicacion, String frecuenciaPublicacion, Integer codigoUnico){
        this.nombrePublicacion = nombrePublicacion;
        this.frecuenciaPublicacion = frecuenciaPublicacion;
        this.codigoUnico = codigoUnico;

    }

    //------------------------------------------------------------------------------------------------------------------
    //Get
    protected String getNombrePublicacion() {
        return nombrePublicacion;
    }

    //------------------------------------------------------------------------------------------------------------------
    //Set
    protected String setNombrePublicacion(String nuevoNombre){
        nombrePublicacion = nuevoNombre;
        return nombrePublicacion;
    }

    //------------------------------------------------------------------------------------------------------------------
    //equals







    // geter, setters, toString, equals

}
