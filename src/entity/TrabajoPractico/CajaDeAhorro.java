package entity.TrabajoPractico;

public class CajaDeAhorro extends Cuenta{

    private Double tasaInteres = 0.01;

    public CajaDeAhorro(Double saldoActual, Integer numUnico) {
        super(saldoActual, numUnico);
    }




}
package entity.TrabajoPractico;

public class CajaDeAhorro extends Cuenta{

    private Double tasaInteres = 0.01;

    public CajaDeAhorro(Double saldoActual, Integer numUnico) {
        super(saldoActual, numUnico);
    }

    //------------------------------------------------------------------------------------------------------------------
    //OVERRIDE

    @Override
    public String toString() {
        return "CajaDeAhorro{" +
                "NumUnico= " + getNumUnico() +
                ", SaldoActual= " + getSaldoActual() +
                ", TasaInteres= " + tasaInteres +
                '}';
    }
}
