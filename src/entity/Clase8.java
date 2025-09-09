package entity;

import java.util.Arrays;
import java.util.Scanner;

public class Clase8 {
    public static void main(String[] args) {
        //Necesitamos una función que reciba dos cadenas
        // de texto, cada una debe tener dos lugares turisticos separadas por una coma.

        //1)Utilizar Scanner.
        //2)Debe retornar la que tenga mayor cantidad de caracteres.
        //3)Debe generar un array de cuatro elementos para guardar las cuatro lugares turisticos, ordenarlas e imprimirlas.”

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese dos lugares turisticos separados por una coma, dos veces.");

        String lugarTuristico1 = scanner.nextLine();
        String lugarTuristico2 = scanner.nextLine();

        LugaresTuristicos (lugarTuristico1,lugarTuristico2);



    }

    public static String LugaresTuristicos (String lugarTuristico1, String lugarTuristico2){

        String[] lugaresIngresados= new String[4];



        String[] lugaresSeparados1= lugarTuristico1.split(",");
        String[] lugaresSeparados2= lugarTuristico2.split(",");

        lugaresIngresados[0]=lugaresSeparados1[0];
        lugaresIngresados[1]=lugaresSeparados1[1];
        lugaresIngresados[2]=lugaresSeparados2[0];
        lugaresIngresados[3]=lugaresSeparados2[1];

        Arrays.sort(lugaresIngresados,String.CASE_INSENSITIVE_ORDER); //Ordena la lista

        for (String lugar : lugaresIngresados){
            System.out.println(lugar);
        }


       if (lugarTuristico1.length() > lugarTuristico2.length()){
           return lugarTuristico1;
       }else if (lugarTuristico1.length()==lugarTuristico2.length()){
           return "son iguales";
       }else{
           return lugarTuristico2;
       }

    }

}

