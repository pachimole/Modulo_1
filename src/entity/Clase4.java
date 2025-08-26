package entity;

public class Clase4 {
    public static void main(String[] args) {
        //1)Definir dos cadenas de texto. Comprobar si son
        //iguales o distintas e indicar mediante un
        //mensaje.

        String texto1 = "Salvador";
        String texto2 = "Salvador";

        System.out.println("¿Los textos son iguales?: " + texto1.equals(texto2));

        //2)Imprimir por consola la cantidad de caracteres de la primer frase.

        System.out.println("Cantidad de caracteres: " + texto1.length());

        //3)Crea una función en la que tengas que ingresar tu
        //nombre y apellido por separado, a partir de los
        //mismos obtener tus iniciales en mayúscula.

        iniciales("salvador","Richard");


    }

    public static void iniciales(String nombre , String apellido) {
        nombre = nombre.toUpperCase();
        apellido = apellido.toUpperCase();

        System.out.println(nombre.charAt(0) + "\n" + apellido.charAt(0));

        }
}
