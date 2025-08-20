package entity;

import java.lang.runtime.SwitchBootstraps;

public class Clase1 {

    public static void main(String[] args) {


        //1)Creando las primeras variables en Java. En este caso serán cinco: nombre,
        // apellido,edad,peso y altura. Asignaremos un valor acorde a su tipo y se
        // visualizará por consola.

        String nombre = "salvador";
        String apellido = "Richard";
        int edad = 24;
        double peso = 73.0;
        double altura = 1.72;

        System.out.println("Nombre: " + nombre + "\n" + "Apellido: " + apellido + "\n" + "Edad: " + edad + "\n" + "Peso: " + peso + "\n" + "Altura: " + altura);

        //2)Imprimir por consola el nombre completo de la persona.

        System.out.println(nombre + " " + apellido);

        //3)En este caso necesitamos calcular el IMC de la persona( peso/altura^2), almacenar
        //el resultado con decimales y que se visualice en consola como un entero.

        double IMC = (peso / altura * altura);

        System.out.println(Math.round(IMC));

        //4)Utiliza una estructura if para comprobar si la edad es par y múltiplo de 4.

        if (edad % 2 == 0) {
            System.out.println(edad + " Es Par y multiplo de 4.");
        } else {
            System.out.println(edad + " Es Impar.");
        }

        //5)Escribí un programa que multiplique todos los números divisibles por 3 en el rango del 1 al 20.

        int i = 1;
        int multiplicar = 1;

        while (i <= 20) {
            if (i % 3 == 0) {
                multiplicar = multiplicar * i;
            }
            i++;
        }
        System.out.println(multiplicar);

        //6)Crea un programa que cuente cuántos números entre el 1 y el 32 son múltiplos de
        //3 y que al finalizar imprima el total.

        int i2 = 1;
        int total = 0;

        while (i2 <= 32) {
            if (i2 % 3 == 0) {
                total++;
            }
            i2++;
        }
        System.out.println("entre el 1 y el 32 hay " + total + " numeros que son multiplos de 3.");

        //7)Crea un programa que retorna un número de piso al ingresar un
        //determinado sector . El sector a corresponde al 2°, el b al 4°
        //y el c al 10°.

        String sector = "a";

        switch (sector) {

            case "a":
                System.out.println("El sector elegido corresponede al 2° piso.");
                break;

            case "b":
                System.out.println("El sector elegido corresponede al 4° piso.");
                break;

            case "c":
                System.out.println("El sector elegido corresponede al 10° piso.");
                break;

            default:
                System.out.println("Sector No Valido.");
        }

        //8)Adapta el punto 6 de la práctica en vivo utilizando el nombre, buscando todas las vocales.

        for (i=0; i < nombre.length(); i++) {

            char letra = nombre.charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                System.out.println(letra);
            }
        }
    }
}
