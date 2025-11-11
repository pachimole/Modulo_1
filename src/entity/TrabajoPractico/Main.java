package entity.TrabajoPractico;

public class Main {
    public static void main(String[] args) {

    Usuario pepe = new Usuario(1,"Pepe","Grillo",1842851);

    //Cuenta cuenta1 = new Cuenta(2000.0,1);

    CajaDeAhorro cajaDeAhorro1 = new CajaDeAhorro(5000.0,2);

    //------------------------------------------------------------------------------------------------------------------

    cajaDeAhorro1.depositarSaldo(200.0);



    }
}
package entity.TrabajoPractico;

public class Main {
    public static void main(String[] args) {

        Usuario pepe = new Usuario(1,"Pepe","Grillo",1842851);

        CajaDeAhorro cajaDeAhorro1 = new CajaDeAhorro(5000.0,2);


        CuentaCorriente cuentaCorriente1 = new CuentaCorriente(40000.0,1);
        CuentaCorriente cuentaCorriente2 = new CuentaCorriente(40000.0,1);

        //------------------------------------------------------------------------------------------------------------------
        //get, set, depositar, extraer

        System.out.println(cajaDeAhorro1.getSaldoActual());

        cajaDeAhorro1.setSaldoActual(4000.0);

        cajaDeAhorro1.depositarSaldo(1000.0);

        cajaDeAhorro1.extraerSaldo(1000.0);

        System.out.println(cajaDeAhorro1.getSaldoActual());

        //------------------------------------------------------------------------------------------------------------------
        //crear y depositar cheque

        Cheque cheque1 = new Cheque(10000.0,"Banco Provincia","22/10/2025");

        cuentaCorriente1.depositarCheque(cheque1);

        //retirar saldo

        cuentaCorriente1.extraerSaldo(120000.0);

        //--------------------------------------------------------------------------------------------------------------
        //agregar, eliminar y consultar cuenta

        //probar que no se puedan agregar cuentas iguales por numero unico
        pepe.agregarCuenta(cuentaCorriente1);
        pepe.agregarCuenta(cuentaCorriente2);

        pepe.agregarCuenta(cajaDeAhorro1);

        pepe.consultarCuentas();

        pepe.eliminarCuenta(cajaDeAhorro1);

        pepe.consultarCuentas(); //ver si se elimino Cuenta

        //------------------------------------------------------------------------------------------------------------------
        //visualizar informacion de cuentas

        System.out.println(cuentaCorriente1.toString());

        System.out.println(cajaDeAhorro1.toString());

        System.out.println(pepe.toString());

        //buscar cuenta por n°
        pepe.buscarCuentaPorNum();

    }

}
