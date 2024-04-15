package exercicioInterface;

public class ServicoContratado {

    private ServicoPagamentoOnline servicoPagamentoOnline;

    public ServicoContratado(ServicoPagamentoOnline servicoPagamentoOnline) {
        this.servicoPagamentoOnline = servicoPagamentoOnline;
    }

    public void contratoProcesso(Contrato contrato, Integer meses) {

        Double valorParcelaSemJuros = contrato.getValorContrato() / meses;
        Double valorAux = 0.0;

        for (int i = 0; i < meses; i++) {

            valorAux = this.servicoPagamentoOnline.juros(valorParcelaSemJuros, (i + 1));

            Parcelamento parcela = new Parcelamento(contrato.getData().plusMonths(i + 1),
                    this.servicoPagamentoOnline.taxaPagamento(valorAux), contrato);

            contrato.getParcelas().add(parcela);

        }

    }

}
