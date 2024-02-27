package classes;

public class QuartoAluguel {
    
    private String nomeAluno;
    private String emailAluno;

    public QuartoAluguel (String nome, String email) {
        this.nomeAluno = nome;
        this.emailAluno = email;
    }

    public String toString (int n) {
        return String.format("%d", n)
        + ": "
        + this.nomeAluno
        + ", "
        + this.emailAluno;
    }

}
