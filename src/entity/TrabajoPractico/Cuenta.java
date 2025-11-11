package entity.TrabajoPractico;

public class Cuenta {

    private Integer numUnico;
    private Double saldoActual;

    public Cuenta(Double saldoActual, Integer numUnico) {
        this.saldoActual = saldoActual;
        this.numUnico = numUnico;
    }

    //------------------------------------------------------------------------------------------------------------------
    public Double getSaldoActual() {
        return saldoActual;
    }

    public Double setSaldoActual(Double saldo) {
        saldoActual = saldo;
        return saldoActual;
    }

    public Double depositarSaldo(Double saldo) {
        saldoActual = saldoActual + saldo;
        return saldo;
    }

    public Double extraerSaldo(Double saldo) {
        if (saldo > saldoActual) {
            System.out.println("saldo insuficiente.");
        }else { saldoActual = saldoActual-saldo; }
        return saldo;
    }
}

