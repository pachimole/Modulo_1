import javax.swing.plaf.PanelUI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Paquete {

    private Integer identificador;
    private String titulo;
    private Double precioBase;
    private Integer cantDias;
    public List excursiones = new ArrayList<>();

    public Paquete(Integer identificador, String titulo, Double precioBase, Integer cantDias) {
        this.identificador = identificador;
        this.titulo = titulo;
        this.precioBase = precioBase;
        this.cantDias = cantDias;
    }

    //------------------------------------------------------------------------------------------------------------------
    
    public void getExcursiones() {
        System.out.println("Excursiones: ");
        for (int i = 0; i < excursiones.size(); i++) {
            System.out.println(excursiones.get(i).toString());
        }
    }

    public void agregarExcursion(String nombreExcursion){
        excursiones.add(nombreExcursion);
    }

    public void eliminarExcursion(String nombreExcursion){
        excursiones.removeIf(excursion->excursion.equals(nombreExcursion));
    }


    public Double getPrecioBase() {
        return precioBase;
    }


    //------------------------------------------------------------------------------------------------------------------
    @Override
    public int hashCode() {
        return Objects.hashCode(titulo);
    }
}
