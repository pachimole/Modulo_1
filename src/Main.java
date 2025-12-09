import java.util.*;

public class Main {
    public static void main(String[] args) {

    Guia guia1 = new Guia("Pepe",142567,1);
    Guia guia2 = new Guia("Raul",753424,2);

    Premium paquetePremium1 = new Premium(1,"Cataratas",1000.0,2,2, guia2);
    Simple paqueteSimple1 = new Simple(2,"Peru",2000.0,5,"si", guia1);

    //------------------------------------------------------------
    //lista Paquetes
    List <Paquete> paquetes = new ArrayList<>();

    paquetes.add(paquetePremium1);
    paquetes.add(paqueteSimple1);

    //recorrer lista
    for (Paquete i : paquetes){
        System.out.println(i);
    }

    //------------------------------------------------------------
    //lista Guias

    Map <Integer,Guia> guias = new HashMap<>();

    guias.put(guia1.getDni(),guia1);
    guias.put(guia2.getDni(),guia1);

    //buscar guia
    guias.put(guia1.getDni(), guia1);
    System.out.println(guias.get(guia1.getDni()));

    //recorrer gias
    for(Guia i: guias.values()){
        System.out.println(i);
    }

    // CompareTo() ordenar por precio
    Collections.sort(paquetes);

    for (Paquete p : paquetes){
        System.out.println(p.getTitulo()+ "/ $" + p.calcularPrecioFinal());
    }

    paquetePremium1.calcularPrecioFinal();

    //------------------------------------------------------------
    paqueteSimple1.agregarExcursion("Peru");
    paqueteSimple1.agregarExcursion("Bolivia");

    paqueteSimple1.getExcursiones();

    paqueteSimple1.eliminarExcursion("Peru");

    paqueteSimple1.calcularPrecioFinal();

    //------------------------------------------------------------

    //Visualizar informacion paquetes disponibles
    Scanner scanner = new Scanner(System.in);

    try{
        System.out.println("Ingrese un index.");
        Integer index = scanner.nextInt();
        System.out.println( paquetes.get(index) );}
    catch (IndexOutOfBoundsException | InputMismatchException e){
        System.err.println(e);
    }

        System.out.println("El programa continua.");

    }
}
