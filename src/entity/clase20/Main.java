package entity.clase20;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        EmpleadoLimpiezaGeneral empleado1 = new EmpleadoLimpiezaGeneral("Roberto",1234,2000.0,1);
        EmpleadoLimpiezaGeneral empleado2 = new EmpleadoLimpiezaGeneral("El Sapo",5678,3000.0,2);
        EmpleadoLimpiezaGeneral empleado3 = new EmpleadoLimpiezaGeneral("Pepiyo Griyo",91011,1000.0,0);

        EmpleadoLavaVajillas empleado4 = new EmpleadoLavaVajillas("Pou", 4521,1000.0,2);

        //crear arrayList
        ArrayList<Empleado> empleados = new ArrayList<>();

        empleados.add(empleado1);
        empleados.add(empleado2);
        empleados.add(empleado3);
        empleados.add(empleado4);

        //Crear una primera instancia de la clase padre para practicar
        //casting utilizando los métodos específicos de las clases hijas.

        empleado1.calcularAdicionalHorasExtra();

        empleado1.calcularSueldo();

        empleado4.calcularSueldo();

        //ver si un empleado esta en la lista

        verificarEmpleado(empleados, empleado1);

        //ver informacion de empleado
        System.out.println(empleado1);

        System.out.println("Lista ordenada: ");Collections.sort(empleados);

        for (Empleado e : empleados){
            System.out.println(e);
        }


    }

    //ver si un empleado esta en la lista
    public static void verificarEmpleado ( ArrayList <Empleado> lista, Empleado empleadoX){
        System.out.println(lista.contains(empleadoX));
    }




}
