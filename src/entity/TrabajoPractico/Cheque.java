package entity.TrabajoPractico;

import java.util.Date;

public class Cheque {

    private Double monto;
    private String bancoEmisor;
    private Date fecha;

    public Cheque(Double monto, String bancoEmisor, Date fecha) {
        this.monto = monto;
        this.bancoEmisor = bancoEmisor;
        this.fecha = fecha;
    }
}