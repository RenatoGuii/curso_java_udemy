package classes;

public class Aluno {
    
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double notaFinal () {
        return this.nota1 + this.nota2 + this.nota3;
    }

}
