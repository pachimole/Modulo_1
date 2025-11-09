package Zoo;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


    //Una de Animales general en la cual no puedan repetirse elementos.
    //Otra de Ornitorrincos que pueda ordenarse.
    //La tercera de Aves que permita buscar por id un Ave de forma rápida.
        Puma  puma1 = new Puma(1,"Pepe",2,0);
        Puma puma2 = new Puma(2,"Waton",80,2);
        Puma puma3 = new Puma(3,"Gordo",5,1);

    //------------------------------------------------------------------------------------------------------------------
    //Una de Animales general en la cual no puedan repetirse elementos.

        Set <Puma> pumas = new HashSet<>();
        pumas.add(puma1);
        pumas.add(puma2);
        pumas.add(puma3);

        //Visualizar Lista

        for (Puma a : pumas){
            System.out.println("ID: " + a.getId() + " Nombre: " + a.getNombre() + " Edad: " + a.getEdad() + " Crias: " + a.getCantidadCrias());
        }

    //incluir los métodos de Collection y Stream vistos.

        List<Puma> pumasFiltradosPorID=
                pumas.stream().filter(puma ->
                        puma.getId().equals(1)).toList();

        System.out.println("Pumas filtrados: " + pumasFiltradosPorID);

    //Consultar si hay algún mamífero en la colección de irrepetibles y crear una nueva lista a partir de ese filtro.

        System.out.println("Hay pumas en la lista: " + pumas.stream().anyMatch(puma -> puma.getClass().equals(puma1.getClass())));

        Stream <Puma> pumas2 = pumas.stream().filter(puma -> puma instanceof Puma);

    //------------------------------------------------------------------------------------------------------------------
    //Otra de Ornitorrincos que pueda ordenarse.
    //incluir los métodos de Collection y Stream vistos.

        Ornitorrinco ornito1 = new Ornitorrinco(1,"Perry",6,0);
        Ornitorrinco ornito2 = new Ornitorrinco(2,"Salame",2,2);
        Ornitorrinco ornito3 = new Ornitorrinco(3,"Chorizo",90,100);

        List <Animal> ornitosOrdenados= new ArrayList<>();
        ornitosOrdenados.addAll(Arrays.asList(ornito1,ornito2,ornito3));
        //Visualizar Lista

        System.out.println(ornitosOrdenados);

    //------------------------------------------------------------------------------------------------------------------
    //La tercera de Aves que permita buscar por id un Ave de forma rápida.

        Ave ave1 = new Ave(1,"Gallina",6,false);
        Ave ave2 = new Ave(2,"Pato",2,true);
        Ave ave3 = new Ave(3,"Pajaro",76,true);

        HashMap <Integer,Ave> aves = new HashMap<>();
        aves.put(ave1.getId(),ave1);
        aves.put(ave2.getId(),ave2);
        aves.put(ave3.getId(),ave3);

        //Visualizar Lista
        for (Integer id : aves.keySet()) {
            System.out.println(aves.get(id));
        }

        //System.out.println("Eliminar animales que empiecen con G: " + aves.remove());




    }
}
