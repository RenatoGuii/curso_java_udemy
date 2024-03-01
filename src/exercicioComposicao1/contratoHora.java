package exercicioComposicao1;

import java.time.LocalDate;

public class contratoHora {

    private LocalDate data;
    private Double valorPorHora;
    private Integer horas;

    public Double subTotal() {
        return this.valorPorHora * this.horas;
    }

    public LocalDate getData() {
        return data;
    }

    public contratoHora(LocalDate data, Double valorPorHora, Integer horas) {
        this.data = data;
        this.valorPorHora = valorPorHora;
        this.horas = horas;
    }

}
