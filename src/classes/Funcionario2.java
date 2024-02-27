package classes;

public class Funcionario2 {
    
    private int id;
    private String nome;
    private Double salario;

    public Funcionario2 (int id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void aumento (Double percentual) {
        Double percentualDecimal = percentual / 100;
        this.salario = this.salario + (this.salario * percentualDecimal);
    }

    @Override
    public String toString() {
        return this.id
        + ", " 
        + this.nome
        + ", "
        + String.format("%.2f", this.salario);
    }

}
