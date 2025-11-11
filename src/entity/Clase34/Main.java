package entity.Clase34;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    //Scanner
        Scanner scanner = new Scanner(System.in);

    //------------------------------------------------------------------------------------------------------------------
    //1) Escribir un programa que solicite dos números al usuario e intente dividir el primer número por el segundo.
    //Utiliza un bloque try-catch para manejar la excepción ArithmeticException ,ocurre si el segundo número es igual a cero.
    //Muestra un mensaje de error apropiado en caso de división por cero.

        System.out.println("Ingrese un numero: ");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese otro numero: ");
        int num2 = scanner.nextInt();

    //tryCatch

        try {
            int resultado = (num1/num2);
            System.out.println("Resultado: " + resultado);
        } catch (Exception e){
            System.out.println("ERROR - No se puede dividir por cero. ");
        }

    //------------------------------------------------------------------------------------------------------------------
    //2) Escribir un programa que solicite al usuario ingresar un número como una cadena y luego intente convertir esa cadena a un número entero.
    //Utiliza un bloque try-catch para manejar la excepción NumberFormatException. Ocurre si el usuario ingresa una cadena que no es un número válido.
    //Debe mostrar un mensaje de error en caso de que la conversión falle.

        System.out.println("Ingrese un numero: ");
        String numeroString = scanner.nextLine();

    //tryCatch

        try {
            int numero = Integer.parseInt(numeroString);
            System.out.println("El numero es: " + numero);
        } catch (NumberFormatException e){
            System.out.println("ERROR - El numero no es valido.");
        }

    //------------------------------------------------------------------------------------------------------------------
    //3)Agrega una excepción personalizada al ejercicio de la clase anterior o crea una nueva lista ¿Qué pasa si buscamos un index fuera del rango en la colección List?

        List frutas= new ArrayList<>();

        frutas.addAll(Arrays.asList("Banana","Manzana","Pera"));

    //tryCatch

        System.out.println("Ingrese un numero de index: ");
        Integer numIndex = scanner.nextInt();

        try {
            System.out.println(frutas.get(numIndex));
        }catch (IndexRango | IndexOutOfBoundsException e ){
            throw new IndexRango("Index inexistente. ");
        }
    }
}
