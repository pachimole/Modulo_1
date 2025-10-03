package entity.Clases;

import java.util.Scanner;

public class Clase8B {
    public static void main(String[] args) {
        //Utilizar la clase Scanner:
        //1)Debemos desarrollar una funcionalidad para una entidad de préstamos que indique si la
        //persona está habilitada a obtener uno en base a que el monto solicitado no supere el 35% de su sueldo.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese monto solicitado: ");
        double monto = scanner.nextDouble();

        System.out.println("Ingrese sueldo: ");
        double sueldo = scanner.nextDouble();

        System.out.println(sueldo * 0.35);

        if (monto <= sueldo * 0.35){
            System.out.println("Prestamo aceptado!");
        }else System.out.println("El monto solicitado es muy elevado.");

        //2)Escribir una función para calcular la cantidad de faltas disponibles de acuerdo a un porcentaje
        //de asistencia y cantidad de encuentros determinado¿Cuál es el resultado para una cursada de 23
        //encuentros que requiere un 75% de asistencia? ¿Y para el caso de este módulo? 47

        System.out.println("Ingrese cantidad de clases:");
        Integer clases = scanner.nextInt();

        System.out.println("Ingurese cantidad de faltas");
        Integer faltas = scanner.nextInt();

        System.out.println(calcularFaltas(clases,faltas));

        //3)En una jornada escolar se dictan varias materias.Todas tienen la misma duración en minutos.
        //Además, hay recreos de 15 minutos entre cada una. Si se dictan cierta cantidad de materias,
        //¿cuánto dura la jornada completa?

        System.out.println("Ingrese la cantidad de materias: ");
        Integer cantMaterias = scanner.nextInt();
        System.out.println("Ingrese la duracion de las materias: ");
        Double duracion = scanner.nextDouble();

        Double duracionMaterias = duracion * cantMaterias;

        Double recreo = 15.0;

        Double jornadaCompleta= duracionMaterias + recreo * (cantMaterias - 1);

        if (cantMaterias <= 1){
            System.out.println("No hay recreos, la jornada completa es de: " + duracion);
        }else {
            System.out.println("La jornada completa dura: " + jornadaCompleta);
        }

    }
    //2)
    public static String calcularFaltas (Integer encuentros, Integer asistencia){
        Integer totalFaltas = encuentros - encuentros * asistencia /100;
        return "la cantidad de faltas disponibles es de: " + totalFaltas;
    }

}
