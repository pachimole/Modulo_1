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

        //4)Crea una función que reciba un nombre y retorne la inicial del mismo.
        //Debe contar la cantidad de veces que se repite dicho carácter.

        FuncionNombre("Salvador");

        //5)Crear una función que reciba un int, lo convierta a String y
        // compare con otro String en caso de ser iguales debe incluirse un mensaje.

        converString(5);


        //6)Crear una función que reciba un String y un número, y
        // devuelva la letra que está en esa posición, junto con el largo total.

        StringYNum("Salvador",2);




    }
    //4)
    public static char FuncionNombre(String nombre) {
        char inicial = nombre.charAt(0);
        int contLetra = 0;

        for (int i = 0; i < nombre.length(); i++) {
            if (nombre.charAt(i) == inicial
            )
                contLetra++;
        }

        System.out.println(inicial);
        System.out.println("hay " + contLetra + " letras " + inicial);
        return inicial;
    }
    //5)
    public static void converString(int num) {
        String stringnum = String.valueOf(num);
        String string2 = "5";
        if (stringnum.equals(string2)) System.out.println("Los textos son identicos.");
    }

    //6)
    public static void StringYNum (String Nombre,int num) {
        if (num > Nombre.length()) System.out.println("El numero es mayor a la cantidad de letras.");
        else if(num<0) System.out.println("El numero es negativo.");
        else System.out.println("La letra en la posicion "+num+" es la: "+Nombre.charAt(num)+"\nEl nombre tiene "+Nombre.length()+" Letras.");
    }







}
