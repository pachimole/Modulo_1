package entity.Clases;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //---------------------------------------------------------------------------------------------
    //crear arrayList
    static ArrayList<BilleteraVirtual> billeteras = new ArrayList<>();

    //---------------------------------------------------------------------------------------------
    //agregar villeteras, con un limite de 5.
    public static void agregarBilletera (BilleteraVirtual billeteraVirtual){
        //--> crea un limite de billeteras a agregar.
        if(billeteras.size() == 5){
            System.out.println("se paso el limite permitido. ");
        //--> verifica que la billetera no este registrada.
        }else if(billeteras.contains(billeteraVirtual)){
            System.out.println("ya esta registrada en el sistema.");
        //--> agrega la billetera
        }else{
            billeteras.add(billeteraVirtual);
            System.out.println("la Billetera "+ billeteraVirtual +" fue registrada.");
        }
    }
    //---------------------------------------------------------------------------------------------
    //Eliminar
    public void eliminarBilletera(BilleteraVirtual billeteraVirtual){
        if(billeteras.contains(billeteraVirtual)) billeteras.remove(billeteraVirtual);
        else {
            System.out.println("la Billetera no esta en la lista.");
        }
    }

    //---------------------------------------------------------------------------------------------
    //consultar
    public static void consultarBilletera(BilleteraVirtual billetera1){
        for (BilleteraVirtual c:billeteras){
            System.out.println(c.toString());
        }
    }

    //-----------------------------------------------------------------------------------------------
    //Crear otro método que permita buscar los datos
    //de una cuenta ingresando el dni y consultar si
    //se quiere actualizar el saldo, ingresar el
    //nuevo valor en caso de que se confirme.



    //---------------------------------------------------------------------------------------------
    //---------------------------------------------------------------------------------------------
    public static void main(String[] args) {

        BilleteraVirtual billetera1 = new BilleteraVirtual(12345678, "Salvador", 42470074, 3000.0);
        BilleteraVirtual billetera2 = new BilleteraVirtual(87654321, "Pepito", 12345678, 5000.0);

        //Consultar num de cuenta
        System.out.println(billetera1.getNumCuenta());

        //Consultar saldo
        System.out.println(billetera1.saldoActual());

        //Retirar saldo
        System.out.println(billetera1.retirarSaldo(1000.0));

        //Recibir saldo
        System.out.println(billetera1.recibirSaldo(100.0));

        //Transferir saldo
        System.out.println(billetera1.transferirSaldo(1000.0, 87654321));

        //Ver limite de extraccion
        System.out.println(billetera1.getLimiteExtraccion());

        //cambiar limite de extraccion
        BilleteraVirtual.setLimiteExtraccion(20000.0);

        //---------------------------------------------------------------------------------------------
        //agregar cuentas a ArrayList

        agregarBilletera(billetera1);
        agregarBilletera(billetera2);

        //consultar billeteras

        consultarBilletera(billetera1);

        agregarCuenta();

    }

    //-----------------------------------------------------------------------------------------------
    public static void agregarCuenta() {

        Boolean cargar= true;
        Scanner scanner = new Scanner(System.in);

        while(cargar) {
            System.out.println("Ingrese numero de cuenta: ");
            Integer numCuenta = scanner.nextInt();
            System.out.println("Ingrese nombre: ");
            scanner.nextLine();
            String nombre = scanner.nextLine();
            System.out.println("Ingrese DNI: ");
            Integer dni = scanner.nextInt();
            System.out.println("Ingrese saldo: ");
            Double saldo = scanner.nextDouble();
            System.out.println("Billetera agregada exitosamente. ");

            BilleteraVirtual nuevaBilletera = new BilleteraVirtual(numCuenta, nombre, dni, saldo);

            agregarBilletera(nuevaBilletera); //Agregar cuenta a Array
            System.out.println("desea agregar otra Billetera? ");
            cargar = scanner.nextBoolean();
            scanner.nextLine();
        }
        System.out.println("cuentas creadas: ");
        for (int i = 0; i < billeteras.size(); i++) {
            System.out.println(billeteras.get(i).toString());
        }
    }

}