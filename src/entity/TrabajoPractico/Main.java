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
