package exercicioInterface;

import java.time.LocalDate;

public class Parcelamento {

    private LocalDate dataVencimento;
    private Double quantia;
    private Contrato contrato;

    public Parcelamento(LocalDate dataVencimento, Double quantia, Contrato contrato) {
        this.dataVencimento = dataVencimento;
        this.quantia = quantia;
        this.contrato = contrato;
    }

    @Override
    public String toString() {
        return this.dataVencimento + " - R$" + String.format("%.2f", this.quantia);
    }

}
