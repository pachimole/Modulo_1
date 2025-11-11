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
