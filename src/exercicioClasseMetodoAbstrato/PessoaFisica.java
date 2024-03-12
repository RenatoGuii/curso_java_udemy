package exercicioClasseMetodoAbstrato;

public class PessoaFisica extends Contribuinte {

    private Double gastoSaude;

    public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
        super(nome, rendaAnual);
        this.gastoSaude = gastoSaude;
    }

    public Double getGastoSaude() {
        return gastoSaude;
    }

    public void setGastoSaude(Double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }

    @Override
    public Double imposto() {

        Double valorImposto = 0.0;

        if (this.rendaAnual < 20000.00) {
            valorImposto = (this.rendaAnual * 0.15) - (gastoSaude * 0.5);
        } else if (this.rendaAnual >= 20000.00) {
            valorImposto = (this.rendaAnual * 0.25) - (gastoSaude * 0.5);
        }

        return valorImposto;
    }

}
