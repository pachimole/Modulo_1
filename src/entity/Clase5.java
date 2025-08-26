package entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Clase5 {
    public static void main(String[] args) {
        //1)Definir dos Integer y determinar cuál es mayor, cuál es menor o si son
        //iguales. Imprimir el resultado obtenido.

        Integer num1 = 2;
        Integer num2 = 4;

        int resultado = num1.compareTo(num2);

        if (resultado == 0) System.out.println("Son iguales.");
        else if (resultado>0) System.out.println("num1(" + num1 + ")es mayor que num2(" + num2 + ")");
        else System.out.println("num1(" + num1 + ")es menor que num2(" + num2 + ")");

        //2)Crea una fecha de nacimiento y calcula la edad. Además imprimí por
        //consola la edad, junto con la fecha formateada de esta forma “YY MM DD”.

        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaNacimiento = LocalDate.of(2000,6,29);

        System.out.println("La edad actual es de "+ (fechaActual.getYear()-fechaNacimiento.getYear()) + " años.");

        DateTimeFormatter fechaPersonalizada = DateTimeFormatter.ofPattern("YY MM DD");
        String fechaString = fechaPersonalizada.format(fechaNacimiento);
        System.out.println(fechaString);

        //3)Convertir las variables Integer anteriores en String e imprimirlas por
        //consola indicando su clase.

        String Stringnum1 = String.valueOf(num1);
        String Stringnum2 = String.valueOf(num2);

        System.out.println(Stringnum1 + " " + Stringnum1.getClass() + "\n" + Stringnum2 + " " + Stringnum2.getClass());






    }
}
