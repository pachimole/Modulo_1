package entity;

public class Clase15_BilleteraVirtual {

    private Integer numCuenta;
    private String nombre;
    private Integer dni;
    private Double saldo;
    private static final Double COMISION= 0.05;
    private static Double limiteExtraccion= 50.000;

    //Constructor
    public static void cuenta1 ( Integer numCuenta, String nombre, Integer dni, Double saldo){

    }

    //Consultas
    //consultar numero de cuenta
    public Integer getNumCuenta(){
        return this.numCuenta;
    }

    //consultar saldo
    public Double saldoActual(){
        return this.saldo;
    }

    //retirar saldo
    public String saldoRetirar (Double num){
        if (num >= saldo && num<=limiteExtraccion){
            this.saldo = this.saldo - num;
            return "Retiro exitoso, tu saldo actual es de: " + saldo;
        }else return "Fondos insuficientes.";
    }

    //recibir saldo
    public Double saldoRecibir ( Double monto ){
        return monto-COMISION;
    }

    //transferir saldo
    public String saldoTransferir (Double num, Integer cbu){
        if (num >= saldo && num<=limiteExtraccion) {
            this.saldo = this.saldo - num;
            return "Transferencia exitosa, tu saldo actual es de: " + saldo;
        }else return "Fondos insuficientes.";
    }




}
