package entity.TrabajoPractico;

public class CuentaCorriente extends Cuenta{

    private final Double MONTO_DESCUBIERTO = 70000.0;
    private Double limiteMinimo = 30000.0;

    public CuentaCorriente(Double saldoActual, Integer numUnico) {
        super(saldoActual, numUnico);
    }

    //------------------------------------------------------------------------------------------------------------------

    public void depositarCheque (Cheque cheque){
        System.out.println("Cheque depositado con exito");
    }

    /*public Double extraerSaldoCuentaCorriente (Double saldo){
        if (saldo >= limiteMinimo || saldo <= setSaldoActual()+MONTO_DESCUBIERTO) {

        }else { extraerSaldo(saldo) ;}
        return saldo;
    }
*/

    @Override
    public Double extraerSaldo(Double saldo) {
        if (saldo <= getSaldoActual()){
            setSaldoActual(getSaldoActual()-saldo);
        }

        }else if (saldo >= limiteMinimo || saldo <= getSaldoActual()+MONTO_DESCUBIERTO){

        Double saldoNegativo = getSaldoActual()+MONTO_DESCUBIERTO;
        setSaldoActual(getSaldoActual());


        return super.extraerSaldo(saldo);
    }
}
package entity.TrabajoPractico;

public class CuentaCorriente extends Cuenta {

    private final Double MONTO_DESCUBIERTO = 70000.0;
    private Double limiteMinimo = 30000.0;
    private Double extraer;

    public CuentaCorriente(Double saldoActual, Integer numUnico) {
        super(saldoActual, numUnico);
    }

    //------------------------------------------------------------------------------------------------------------------
    //CONSULTAS

    public void depositarCheque(Cheque cheque) {
        setSaldoActual(getSaldoActual() + cheque.getMonto());
        System.out.println("Cheque depositado con exito, saldo actual: " + getSaldoActual());
    }



    //------------------------------------------------------------------------------------------------------------------
    //OVERRIDE

    public Double extraerSaldoCuentaCorriente (Double saldo){
        if (saldo >= limiteMinimo || saldo <= getSaldoActual()+MONTO_DESCUBIERTO) {

        }else { extraerSaldo(saldo) ;}
        return saldo;
    }


    @Override
    public void extraerSaldo(Double saldo) {
        if (saldo >= limiteMinimo && saldo <= getSaldoActual() + MONTO_DESCUBIERTO) {
            if (saldo <= getSaldoActual()) {
                setSaldoActual(getSaldoActual() - saldo); //actualizo saldo actual (queda en saldo positivo)
                System.out.println("saldo extraido con exito, saldo actual: " + getSaldoActual());
            } else { setSaldoActual((getSaldoActual()-saldo)); //actualizo saldo actual (queda en saldo negativo)
                System.out.println("saldo extraido con exito, saldo actual: " + getSaldoActual());
            }

        } else { System.out.println("saldo insuficiente"); }
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "NumUnico= " + getNumUnico() +
                ", SaldoActual= " + getSaldoActual() +
                '}';
    }


}
