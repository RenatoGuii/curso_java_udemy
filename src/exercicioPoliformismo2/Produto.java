package exercicioPoliformismo2;

public class Produto {

    protected String nome;
    protected Double preco;

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String etiquetaPreco() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.nome + " R$");
        sb.append(this.preco + "\n");
        return sb.toString();
    }

}
