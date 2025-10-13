package entity.Clases;

public class Clase3 {
    public static void main(String[] args) {
        //2)Escribir una función que evalúe si un estudiante cumple con los requisitos para promocionar y defina un
        // mensaje personalizado para cada caso. El estudiante debe contar con al menos el 80% de asistencia, haber
        // presentado los trabajos y obtener una notamayor o igual a seis en el examen final.

    requisitos(4,2,8);
    contadorLetras("Programacion Orientada a Objetos");

    contadorLetrasA("Programacion Orientada a Objetos");


    }

    public static void requisitos(int faltas,int trabajos,int NotaExamenFinal){

        int CargaHoraria = 150;
        double TiempoClase = 3.2;
        int TotalTrabajos = 6;

        int TotalClases = (int) (CargaHoraria/TiempoClase);

        int asistencias = TotalClases*80/100;
    }
    //------------------------------------------------------------------------------------------------------------------
    //Crea un programa que cuente cuantas letras tiene el trayecto y que al finalizar imprima el total.

    public static int contadorLetras(String nombreTrayecto){
        int totalLetras = (nombreTrayecto.length());
        System.out.println("El nombre del trayecto tiene: " + totalLetras + " letras.");

        return totalLetras;
    }
    //------------------------------------------------------------------------------------------------------------------
    //Actualizarlo para que retorne la cantidad del carácter ‘a’.

    public static int contadorLetrasA(String nombreTrayecto){
        int contadorLetraA=0;

        for(int c=0;c<nombreTrayecto.length();c++){
            if(nombreTrayecto.charAt(c) == 'a'){
                contadorLetraA ++;
            }
        }

        System.out.println("El nombre del trayecto tiene: " + contadorLetraA + " letras A.");

        return contadorLetraA;
    }



}
