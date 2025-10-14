package entity.practivaClase;

public class Boletin extends Publicacion{

    private Integer sectorOrganizacion;

    public Boletin(String nombrePublicacion, String frecuenciaPublicacion, Integer codigoUnico, Integer sectorOrganizacion) {
        super(nombrePublicacion, frecuenciaPublicacion, codigoUnico);
        this.sectorOrganizacion = sectorOrganizacion;
    }

}
