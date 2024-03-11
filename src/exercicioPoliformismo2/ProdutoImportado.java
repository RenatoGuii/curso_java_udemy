package exercicioPoliformismo2;

import java.text.DecimalFormat;

public class ProdutoImportado extends Produto {

    private Double taxaAlfandegaria;

    public ProdutoImportado(String nome, Double preco, Double taxaAlfandegaria) {
        super(nome, preco);
        this.taxaAlfandegaria = taxaAlfandegaria;
    }

    public Double getTaxaAlfandegaria() {
        return taxaAlfandegaria;
    }

    public void setTaxaAlfandegaria(Double taxaAlfandegaria) {
        this.taxaAlfandegaria = taxaAlfandegaria;
    }

    @Override
    public String etiquetaPreco() {
        DecimalFormat df = new DecimalFormat("#.##");
        StringBuilder sb = new StringBuilder();
        sb.append(this.nome + " R$");
        sb.append(this.preco + this.taxaAlfandegaria);
        sb.append(" (Taxa Alfandegaria: R$ ");
        sb.append(df.format(this.taxaAlfandegaria) + ")" + "\n");
        return sb.toString();
    }

}
