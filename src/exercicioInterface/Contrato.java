package exercicioInterface;

import java.time.LocalDate;
import java.util.ArrayList;

public class Contrato {

    private Integer numero;
    private LocalDate data;
    private Double valorContrato;

    private ArrayList<Parcelamento> parcelas = new ArrayList<>();

    public Contrato(Integer numero, LocalDate data, Double valorContrato) {
        this.numero = numero;
        this.data = data;
        this.valorContrato = valorContrato;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Double getValorContrato() {
        return valorContrato;
    }

    public void setValorContrato(Double valorContrato) {
        this.valorContrato = valorContrato;
    }

    public ArrayList<Parcelamento> getParcelas() {
        return parcelas;
    }

    public void setParcelas(ArrayList<Parcelamento> parcelas) {
        this.parcelas = parcelas;
    }

}
