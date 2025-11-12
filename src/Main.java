import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

    Premium paquetePremium1 = new Premium(1,"Cataratas",1000.0,2,2);
    Simple paqueteSimple1 = new Simple(2,"Peru",2000.0,5,"si");

    Guia guia1 = new Guia("Pepe",142567,1);
    Guia guia2 = new Guia("Raul",753424,2);

    //------------------------------------------------------------
    //lista Paquetes

    Set<Paquete> paquetesPremium = new HashSet<>();

    paquetesPremium.add(paquetePremium1);
    paquetesPremium.add(paqueteSimple1);

    //------------------------------------------------------------
    //lista Guias

    HashMap <Integer,Guia> guias = new HashMap<>();

    guias.put(guia1.getDni(),guia1);
    guias.put(guia2.getDni(),guia1);

    paqueteSimple1.agregarExcursion("Peru");
    paqueteSimple1.agregarExcursion("Bolivia");

    paqueteSimple1.getExcursiones();

    paqueteSimple1.eliminarExcursion("Peru");

    //------------------------------------------------------------

    paqueteSimple1.calcularPrecioFinal();


    }
}
