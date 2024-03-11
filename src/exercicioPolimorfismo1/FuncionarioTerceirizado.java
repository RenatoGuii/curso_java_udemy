package exercicioPolimorfismo1;

public class FuncionarioTerceirizado extends Funcionario {

    private Double despesaAdicional;

    public FuncionarioTerceirizado(String nome, Integer horas, Double valorPorHora, Double despesaAdicional) {
        super(nome, horas, valorPorHora);
        this.despesaAdicional = despesaAdicional;
    }

    public Double getDespesaAdicional() {
        return despesaAdicional;
    }

    public void setDespesaAdicional(Double despesaAdicional) {
        this.despesaAdicional = despesaAdicional;
    }

    @Override
    public Double pagamento() {
        Double pagamento = super.pagamento() + (this.despesaAdicional * 1.1);
        return pagamento;
    }

}
