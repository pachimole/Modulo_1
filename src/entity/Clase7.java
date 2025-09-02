package entity;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Clase7 {
    public static void main(String[] args) {
        //1)Crea un array de cuatro películas e imprimirlas
        //por orden alfabético utilizando for-each.

        String[] peliculas = {"Como entrenar a tu dragon 1", "como entrenar a tu dragon 2", "Como entrenar a tu dragon 3", "Estado Electrico"};

        Arrays.sort(peliculas);

        for (String Peliculas : peliculas) {
            System.out.println(Peliculas);
        }

        //2)Crea un nuevo array que contenga la lista de
        //películas en mayúscula.

        String[] peliculasMayus = new String[peliculas.length];

        for (int i = 0; i < peliculas.length; i++) {
            String peliculaMayus = peliculas[i].toUpperCase();
            peliculasMayus[i] = peliculaMayus;

            System.out.println(peliculasMayus[i]);
        }


        //3)Crea una variable que guardará la primera película
        //que comience con “L”, se debe recorrer el array

        String valorBuscadoL = null;

        for(String pelicula:peliculas) {

            if (valorBuscadoL == null && pelicula.charAt(0) == 'l' || pelicula.charAt(0) == 'L') {
                valorBuscadoL = pelicula;
            }
        }
        System.out.println(valorBuscadoL + " Comienza con la letra L");

        //4)Pedir 3 notas(Scanner), guardarlas en un array y
        //calcular el promedio. A continuación mostrar el
        //mayor y el menor.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 3 notas para calcular el promedio");
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        int numero3 = scanner.nextInt();

        int[] Notas = {numero1, numero2, numero3};
        Arrays.sort(Notas); //Ordena la lista de mayor a menor

        int promedio = (numero1 + numero2 + numero3)/3;

        System.out.println("promedio: " +promedio+ "\nNumero Menor: " + Notas[0]+ "\nNumero Mayor: "+ Notas[2]);

    }
}
