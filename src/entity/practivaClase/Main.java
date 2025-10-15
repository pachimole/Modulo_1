package entity.practivaClase;

import entity.clase20.Empleado;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        //------------------------------------------------------------------------------------------------------------------
        //Ediciones
        Edicion edicionA = new Edicion(1,2025-14-10,3000.0);



        //------------------------------------------------------------------------------------------------------------------
        //Ediciones

        Suscriptor Jorge = new Suscriptor("Jorge",123,"AAA");

        //------------------------------------------------------------------------------------------------------------------
        //Boletines

        Boletin boletin1 = new Boletin("Boletin n°1","semanal",1,1);


        //------------------------------------------------------------------------------------------------------------------
        //Revistas

        Revista revista1 = new Revista("revista n°1","mensual",1, edicionA, Jorge);


        //------------------------------------------------------------------------------------------------------------------
        //crear arrayList
        ArrayList<Revista> revistas = new ArrayList<>();

        //agrego revistas
        revistas.add(revista1);

        ArrayList<Edicion> ediciones = new ArrayList<>();

        //agrego ediciones
        ediciones.add(edicionA);

        System.out.println(boletin1.toString());

        System.out.println(revista1.toString());

        System.out.println(revista1.equals(boletin1));
















    }
}
