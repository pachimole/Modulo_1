package entity;

import java.util.Scanner;

public class Clase8 {
    public static void main(String[] args) {
        //Necesitamos una función similar a la de la diapositiva anterior pero
        // que en cada cadena de texto tenga dos lugares turísticos separados por una coma.

        // → Texto de la diapositiva anterior: “Necesitamos una función que reciba dos cadenas
        // de texto, cada una debe tener dos películas separadas por una coma.
        //1)Utilizar Scanner.
        //2)Debe retornar la que tenga mayor cantidad de caracteres.
        //3)Debe generar un array de cuatro elementos para guardar las cuatro películas, ordenarlas e imprimirlas.”

        System.out.println("Ingrese 2 lugares turisticos con coma");
        Scanner scanner=new Scanner(System.in);

        String lugar1 =scanner.nextLine();
        String lugar2 =scanner.nextLine();

        LugaresTuristicos(lugar1,lugar2);

    }

    public static String LugaresTuristicos(String lugar1, String lugar2){
        String[] pelisSeparadas1= lugar1.split(",");
        String[] pelisSeparadas2= lugar2.split(",");


        return "hola";
    }
}