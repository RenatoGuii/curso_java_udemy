package exercicioClasseMetodoAbstrato;

public class PessoaJuridica extends Contribuinte {
    
    protected int numeroFuncionario;

    public PessoaJuridica(String nome, Double rendaAnual, int numeroFuncionario) {
        super(nome, rendaAnual);
        this.numeroFuncionario = numeroFuncionario;
    }

    public int getNumeroFuncionario() {
        return numeroFuncionario;
    }

    public void setNumeroFuncionario(int numeroFuncionario) {
        this.numeroFuncionario = numeroFuncionario;
    }

    @Override
    public Double imposto() {

        Double valorImposto = 0.0;

        if (this.numeroFuncionario > 10) {
            valorImposto = this.rendaAnual * 0.14;
        } else if (this.numeroFuncionario <= 10) {
            valorImposto = this.rendaAnual * 0.16;
        }

        return valorImposto;
    }

}
