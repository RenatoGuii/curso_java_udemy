package classes;

public class Funcionario {
    
    public String nome;
    public double salarioBruto;
    public double imposto;

    public double salarioLiquido () {
        return this.salarioBruto - this.imposto;
    }

    public String aumento (double percentual) {
        double aumento = this.salarioBruto * (percentual / 100);
        
        double novoSalario = this.salarioLiquido() + aumento;

        return "Updated data: " + this.nome + ", $ " + novoSalario;
    }

}
