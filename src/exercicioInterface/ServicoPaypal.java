package exercicioInterface;

public class ServicoPaypal implements ServicoPagamentoOnline {

    public Double taxaPagamento(Double quantia) {
        Double valor = quantia + (quantia * 0.02);
        return valor;
    }

    public Double juros(Double quantia, int parcela) {
        Double valor = quantia + (quantia * (0.01 * parcela));
        return valor;
    }

}
