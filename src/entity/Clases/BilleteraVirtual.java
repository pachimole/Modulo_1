package entity.Clases;

public class BilleteraVirtual {

    private Integer numCuenta;
    private String nombre;
    private Integer dni;
    private Double saldo;
    private static final Double COMISION= 0.05;
    private static Double limiteExtraccion= 50000.0;

    //-----------------------------------------------------------------------------------------------
    //CONSTRUCTOR
    public BilleteraVirtual ( Integer numCuenta, String nombre, Integer dni, Double saldo){
        this.numCuenta=numCuenta;
        this.nombre=nombre;
        this.dni=dni;
        this.saldo=saldo;
    }

    //-----------------------------------------------------------------------------------------------
    //CONSULTAS
    //consutlar limite de extraccion
    public Double getLimiteExtraccion() {return  this.limiteExtraccion; }
    //consultar numero de cuenta
    public Integer getNumCuenta(){
        return this.numCuenta;
    }

    //consultar saldo
    public Double saldoActual(){
        return this.saldo;
    }

    public Integer consultarDni(){ return this.dni; }

    //-----------------------------------------------------------------------------------------------
    //retirar saldo
    public String retirarSaldo (Double num){
        if (num <= saldo && num<=limiteExtraccion){
            this.saldo = this.saldo - num;
            return "Retiro exitoso, tu saldo actual es de: " + saldo;
        }else return "Fondos insuficientes.";
    }

    //recibir saldo
    public String recibirSaldo ( Double monto ){
        this.saldo = this.saldo + (monto-(monto*COMISION));
        return "Saldo recibido: " + (monto-(monto*COMISION)) + " Saldo actual: " + this.saldo;
    }

    //transferir saldo
    public String transferirSaldo (Double num, Integer numCuenta){
        if (num <= saldo && num<=limiteExtraccion) {
            this.saldo = this.saldo - num;
            return "Transferencia exitosa, tu saldo actual es de: " + saldo;
        }else return "Fondos insuficientes.";
    }
    //-----------------------------------------------------------------------------------------------
    // Cambiar limite de extraccion

    public static void setLimiteExtraccion(Double nuevoLimite){
        limiteExtraccion = nuevoLimite;
    }

    //-----------------------------------------------------------------------------------------------
    //cambio toString
    @Override
    public String toString() {
        return "BilleteraVirtual{" +
                "numCuenta=" + numCuenta +
                ", nombre='" + nombre + '\'' +
                ", dni=" + dni +
                ", saldo=" + saldo +
                '}';
    }








}
