package entity.practivaClase;

public class Boletin extends Publicacion{

    private Integer sectorOrganizacion;

    public Boletin(String nombrePublicacion, String frecuenciaPublicacion, Integer codigoUnico, Integer sectorOrganizacion) {
        super(nombrePublicacion, frecuenciaPublicacion, codigoUnico);
        this.sectorOrganizacion = sectorOrganizacion;
    }
    //------------------------------------------------------------------------------------------------------------------
    //Get
    protected Integer getSectorOrganizacion() {return sectorOrganizacion;}

    //------------------------------------------------------------------------------------------------------------------
    //Set
    protected Integer setSectorOrganizacion(Integer nuevoSector){
        sectorOrganizacion = nuevoSector;
        return sectorOrganizacion;
    }


    //Sobreescribir ToString
    @Override
    public String toString() {
        return "Boletin{" +
                "sectorOrganizacion=" + sectorOrganizacion +
                '}';
    }
}
