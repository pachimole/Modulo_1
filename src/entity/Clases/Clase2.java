package entity.Clases;

public class Clase2 {
    public static void main(String[] args) {
    //PRACTICA EN VIVO

        //Vamos a crear nuestras primeras variables en Java. En este caso serán cuatro:
        //nombre del trayecto, nombre del módulo, carga horaria(150) y tiempo de
        //clase(3.2). Asignaremos un valor acorde a su tipo y se visualizará por consola.

        String NombreTrayecto = "Programador";
        String Modulo = "Programacion Orientada a Objetos";
        int CargaHoraria = 150;
        double TiempoClase = 3.2;

        //Imprimí por consola la información del curso.

        System.out.println("Nombre del Trayecto: "+NombreTrayecto + "\n" +
                "Modulo: " + Modulo + "\n"+
                "Carga Horaria: " + CargaHoraria + "\n" +
                "Tiempo de Clase: " + TiempoClase + "\n");

        //Necesitamos saber cuantas clases tendría este módulo. A continuación, declara una
        //variable de tipo double para guardar el resultado. Imprimirlo como número entero.

        double CantClases = CargaHoraria/TiempoClase;

        System.out.println(Math.round(CantClases));

        //Definir un número entero y asignarle un valor. Utiliza una estructura if para
        //comprobar si es un número impar y menor a la cantidad de clases.

        int num = 3;

        // VV|VF|FV|FF
        if (num%2 != 0 && num <= CantClases){
            System.out.println("El numero es impar y menor a la cantidad de clases.");
        }else{
            System.out.println("a");
        }




    }
}
