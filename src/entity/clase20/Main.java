package entity.clase20;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        EmpleadoLimpiezaGeneral empleado1 = new EmpleadoLimpiezaGeneral("Roberto",1234,8);
        EmpleadoLimpiezaGeneral empleado2 = new EmpleadoLimpiezaGeneral("El Sapo",5678,2);
        EmpleadoLimpiezaGeneral empleado3 = new EmpleadoLimpiezaGeneral("Pepiyo Griyo",91011,2);
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







    }
}
