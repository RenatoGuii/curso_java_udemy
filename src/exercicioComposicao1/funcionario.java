package exercicioComposicao1;

import java.util.ArrayList;
import java.util.List;

public class funcionario {

    private String nome;
    private nivelFuncionario nivel;
    private Double baseSalarial;

    private departamento departamento;
    private List<contratoHora> contratos = new ArrayList<>();

    public departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(departamento departamento) {
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public nivelFuncionario getNivel() {
        return nivel;
    }

    public void setNivel(nivelFuncionario nivel) {
        this.nivel = nivel;
    }

    public Double getBaseSalarial() {
        return baseSalarial;
    }

    public void setBaseSalarial(Double baseSalarial) {
        this.baseSalarial = baseSalarial;
    }

    public funcionario(String nome, nivelFuncionario nivel, Double baseSalarial, departamento departamento) {
        this.nome = nome;
        this.nivel = nivel;
        this.baseSalarial = baseSalarial;
        this.departamento = departamento;
    }

    public void addContrato(contratoHora contrato) {
        this.contratos.add(contrato);
    }

    public void removerContrato(contratoHora contrato) {
        this.contratos.remove(contrato);
    }

    public Double renda(int mes, int ano) {

        Double rendaFinal = this.baseSalarial;

        for (contratoHora c : contratos) {

            int ano_c = c.getData().getYear();
            int mes_c = c.getData().getMonthValue();

            if (ano == ano_c && mes == mes_c) {
                rendaFinal += c.subTotal();
            }

        }

        return rendaFinal;

    }

    public String toString() {
        return "Name: "
                + this.nome
                + String.format("%n")
                + "Departamento: "
                + this.departamento.getNome()
                + String.format("%n");
    }

}
