package exercicioInterface;

public interface ServicoPagamentoOnline {

    Double taxaPagamento(Double quantia);
    Double juros(Double quantia, int parcela);

}
