package entity.practivaClase;

import java.util.ArrayList;

public class Revista extends Publicacion{

    private Edicion edicion;

    private ArrayList <Edicion> ediciones = new ArrayList<>();
    private ArrayList <Suscriptor> suscriptores = new ArrayList<>();

    public Revista(String nombrePublicacion, String frecuenciaPublicacion, Integer codigoUnico, Edicion edicion) {
        super(nombrePublicacion, frecuenciaPublicacion, codigoUnico);
        this.edicion = edicion;
    }






}
