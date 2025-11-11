package entity.TrabajoPractico;

import java.util.ArrayList;

public class Usuario {

    private Integer numeroIdentificacion;
    private String nombre;
    private String apellido;
    private Integer dni;

    private ArrayList<Cuenta> cuentas = new ArrayList<>();

    public Usuario(Integer numeroIdentificacion, String nombre, String apellido, Integer dni) {
        this.numeroIdentificacion = numeroIdentificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    //------------------------------------------------------------------------------------------------------------------
    public void agregarCuenta(Cuenta cuenta){
        if (cuentas.contains(cuenta)){
            System.out.println("La cuenta ya existe.");
        }else cuentas.add(cuenta);

        System.out.println("Cuenta agregada exitosamente.");
    }

    //------------------------------------------------------------------------------------------------------------------







}
package entity.TrabajoPractico;

import java.util.ArrayList;
import java.util.IllegalFormatWidthException;
import java.util.Objects;
import java.util.Scanner;

public class Usuario {

    private Integer numeroIdentificacion;
    private String nombre;
    private String apellido;
    private Integer dni;

    private ArrayList<Cuenta> cuentas = new ArrayList<>();

    public Usuario(Integer numeroIdentificacion, String nombre, String apellido, Integer dni) {
        this.numeroIdentificacion = numeroIdentificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    //------------------------------------------------------------------------------------------------------------------
    public void agregarCuenta(Cuenta cuenta){
        if (cuentas.contains(cuenta)){
            System.out.println("La cuenta ya existe.");
        }else {
            cuentas.add(cuenta);
            System.out.println("Cuenta agregada exitosamente.");
        }
    }

    public void consultarCuentas(){
        System.out.println("Cuentas de " + nombre + cuentas.toString());
    }

    public void eliminarCuenta(Cuenta cuenta){
        if (!cuentas.contains(cuenta)){
            System.out.println("la cuenta no existe en la lista. ");
        }else {cuentas.remove(cuenta);}
    }

    public void buscarCuentaPorNum (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero de cuenta a buscar: ");
        Integer numCuenta = scanner.nextInt();

        for (Cuenta cuenta:cuentas) {
            if (cuenta.getNumUnico().equals(numCuenta)){
                System.out.println(cuenta.toString());
            }else System.out.println("la cuenta no existe.");
        }
    }

    //------------------------------------------------------------------------------------------------------------------
    //OVERRIDE

    @Override
    public String toString() {
        return  "Usuario{" +
                "numeroIdentificacion=" + numeroIdentificacion +
                ",Nombre='" + nombre + '\'' +
                ", Apellido='" + apellido + '\'' +
                ", Dni=" + dni +
                ", Cuentas=" + cuentas +
                '}';
    }



    //------------------------------------------------------------------------------------------------------------------




}
