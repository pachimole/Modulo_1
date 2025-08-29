package entity;

import java.util.Arrays;
import java.util.Scanner;

public class Clase7_EjemplosEnVivo {
    public static void main(String[] args) {
        //EJEMPLO EN VIVO

        String[] comidas = {"pizza","papa","hamburguesa","cebolla"};
        Arrays.sort(comidas);
        for(String elementos:comidas){
            System.out.println(elementos);
        }

        String[] comidasMayus = new String[comidas.length];

        for (int i = 0; i < comidas.length; i++) {
            String comidaM=comidas[i].toUpperCase();
            comidasMayus[i]=comidaM;

            System.out.println(comidasMayus[i]);
        }

        //variable para almacenar
        String valorBuscadoC = null;

        for(String comida:comidas){

            if(comida.charAt(0) == 'c' || comida.charAt(0) == 'C' && valorBuscadoC == null){
                valorBuscadoC = comida;
            }
        }

        System.out.println("veamos si existe en el array un elemento que comience con la letra c "+ valorBuscadoC);

        //1)Crear una función en la cual se solicite el ingreso por
        //consola de dos números enteros de forma separada,si son
        //divisibles por 3 y 5 convertirlos en String y
        //concatenarlos.

        numerosString();

        //2)Instanciar un objeto de la clase Scanner en el
        //método main para recibir dos cadenas de texto.

        //2A)Crear una función que reciba esas dos cadenas de
        //texto, compare si son iguales y luego su orden,
        //debe retornar un string.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese dos cadenas de texto");
        String cadena1 = scanner.nextLine();
        String cadena2 = scanner.nextLine();

        compararTexto(cadena1, cadena2);


    }

    //1)
    public static void numerosString(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese 2 n° separados.");
        Integer numIngresado1 = scanner.nextInt();
        Integer numIngresado2 = scanner.nextInt();

        if(numIngresado1 %3 == 0 && numIngresado2%5 == 0 &&
                numIngresado2%3 == 0 && numIngresado2 %5 ==0){

            String resultadoTexto = Integer.toString(numIngresado1)+" "+ String.valueOf(numIngresado2);

            System.out.println(resultadoTexto);

        }

    }
    //2A)
    public static void compararTexto(String texto1, String texto2){
        String resultado = "";

        if(texto1.equals(texto2)) resultado = "son iguales";

        int resultadoComparacion = texto1.compareTo(texto2);
        if (resultadoComparacion >= 1) resultado = "el primero es mayor, por tanto en el orden va despues";
        else if(resultadoComparacion <0) resultado = "el segundo es mayor, por lo tanto en el orden el primero va antes";

        System.out.println(resultado);
    }

}
