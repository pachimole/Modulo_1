import java.util.*;

public abstract class Paquete {

    private Integer identificador;
    private String titulo;
    private Double precioBase;
    private Integer cantDias;
    public Set <String> excursiones = new HashSet<>();

    public Paquete(Integer identificador, String titulo, Double precioBase, Integer cantDias) {
        this.identificador = identificador;
        this.titulo = titulo;
        this.precioBase = precioBase;
        this.cantDias = cantDias;
    }

    //------------------------------------------------------------------------------------------------------------------
    
    public Integer getExcursiones() {
        System.out.println("Nombre excursiones: ");

        for (String excursion : excursiones){
            System.out.println(excursion);
        }
        return excursiones.size();
    }

    public void agregarExcursion(String excursion){
        if (excursion != null && !excursion.trim().isEmpty()){
            this.excursiones.add(excursion);
            System.out.println("Excursion agregada: " + excursion);
        }else {
            System.out.println("Excursion invalida.");
        }
    }

    public void eliminarExcursion(String excursion){
        if (this.excursiones.remove(excursion)){
            System.out.println("Excursion eliminada: " + excursion);
        }else {
            System.out.println("La excursion no esta en la lista.");
        }
    }


    public Double getPrecioBase() {
        return precioBase;
    }

    public Double calcularPrecioFinal(){
        return getPrecioBase();
    }


    //------------------------------------------------------------------------------------------------------------------
    @Override
    public int hashCode() {
        return Objects.hashCode(titulo);
    }
}
