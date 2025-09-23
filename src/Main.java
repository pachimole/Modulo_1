import entity.BilleteraVirtual;

import java.util.ArrayList;

public class Main {
    //---------------------------------------------------------------------------------------------
    //crear arrayList
    static ArrayList<BilleteraVirtual> billeteras = new ArrayList<>();

    //---------------------------------------------------------------------------------------------
    //agregar villeteras, con un limite de 5.
    public static void agregarBilletera (BilleteraVirtual billeteraVirtual){
        if(billeteras.size() == 5){ //--> crea un limite de billeteras a agregar.
            System.out.println("se paso el limite permitido. ");
        }else if(billeteras.contains(billeteraVirtual)){  //--> verifica que la billetera no este registrada.
            System.out.println("ya esta registrada en el sistema.");
        }else{
            billeteras.add(billeteraVirtual); //--> agrega la billetera
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
    public static void consultarBilletera(){
        for (BilleteraVirtual billeteraVirtual:billeteras);
    }

    //---------------------------------------------------------------------------------------------
    public static void main(String[] args) {

        BilleteraVirtual billetera1 = new BilleteraVirtual(12345678,"Salvador",42470074,3000.0);
        BilleteraVirtual billetera2 = new BilleteraVirtual(87654321,"Pepito",12345678,5000.0);

        //Consultar num de cuenta
        System.out.println(billetera1.getNumCuenta());

        //Consultar saldo
        System.out.println(billetera1.saldoActual());

        //Retirar saldo
        System.out.println(billetera1.retirarSaldo(1000.0));

        //Recibir saldo
        System.out.println(billetera1.recibirSaldo(100.0));

        //Transferir saldo
        System.out.println(billetera1.transferirSaldo(1000.0,87654321));

        //Ver limite de extraccion
        System.out.println(billetera1.getLimiteExtraccion());

        //cambiar limite de extraccion


        //---------------------------------------------------------------------------------------------
        //agregar cuentas a ArrayList

        agregarBilletera(billetera1);
        agregarBilletera(billetera2);


    }

}