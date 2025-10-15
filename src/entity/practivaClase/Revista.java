package entity.practivaClase;

import java.util.ArrayList;

public class Revista extends Publicacion{

    private Edicion edicion;
    private Suscriptor suscriptor;

    private ArrayList <Edicion> ediciones = new ArrayList<>();
    private ArrayList <Suscriptor> suscriptores = new ArrayList<>();

    public Revista(String nombrePublicacion, String frecuenciaPublicacion, Integer codigoUnico, Edicion edicion, Suscriptor suscriptor) {
        super(nombrePublicacion, frecuenciaPublicacion, codigoUnico);
        this.edicion = edicion;
        this.suscriptor = suscriptor;
    }


    //sobreescribir toString
    @Override
    public String toString() {
        return "Revista{" +
                "edicion=" + edicion +
                ", suscriptor=" + suscriptor +
                ", ediciones=" + ediciones +
                ", suscriptores=" + suscriptores +
                '}';
    }












}
