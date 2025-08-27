package entity;

public class Clase3 {
    public static void main(String[] args) {
        //2)Escribir una función que evalúe si un estudiante cumple con los requisitos para promocionar y defina un
        // mensaje personalizado para cada caso. El estudiante debe contar con al menos el 80% de asistencia, haber
        // presentado los trabajos y obtener una notamayor o igual a seis en el examen final.

    requisitos(4,2,8);


    }

    public static void requisitos(int faltas,int trabajos,int NotaExamenFinal){

        int CargaHoraria = 150;
        double TiempoClase = 3.2;
        int TotalTrabajos = 6;

        int TotalClases = (int) (CargaHoraria/TiempoClase);

        int asistencias = TotalClases*80/100;



    }



}
