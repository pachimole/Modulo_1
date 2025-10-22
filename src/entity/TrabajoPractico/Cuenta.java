package entity.TrabajoPractico;

import java.util.Objects;

public class Cuenta {

    //------------------------------------------------------------------------------------------------------------------
    //CONSTRUCTOR

    private final Integer numUnico;
    private Double saldoActual;

    public Cuenta(Double saldoActual, Integer numUnico) {
        this.saldoActual = saldoActual;
        this.numUnico = numUnico;
    }

    //------------------------------------------------------------------------------------------------------------------
    //CONSULTAS

    public Double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(Double saldo) {
        saldoActual = saldo;
    }

    public Integer getNumUnico(){
        return numUnico;
    }

    public void depositarSaldo(Double saldo) {
        saldoActual = saldoActual + saldo;
    }

    public void extraerSaldo(Double saldo) {
        if (saldo > saldoActual) {
            System.out.println("saldo insuficiente.");
        }else { saldoActual = saldoActual-saldo; }
    }

    //------------------------------------------------------------------------------------------------------------------
    //OVERRIDE

    @Override
    public String toString() {
        return "Cuenta{" +
                "numUnico=" + numUnico +
                ", saldoActual=" + saldoActual +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cuenta cuenta = (Cuenta) o;
        return Objects.equals(numUnico, cuenta.numUnico);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numUnico, saldoActual);
    }
}

