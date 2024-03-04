package exercicioComposicao1;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {

    private String nome;
    private NivelFuncionario nivel;
    private Double baseSalarial;

    private Departamento departamento;
    private List<ContratoHora> contratos = new ArrayList<>();

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NivelFuncionario getNivel() {
        return nivel;
    }

    public void setNivel(NivelFuncionario nivel) {
        this.nivel = nivel;
    }

    public Double getBaseSalarial() {
        return baseSalarial;
    }

    public void setBaseSalarial(Double baseSalarial) {
        this.baseSalarial = baseSalarial;
    }

    public Funcionario(String nome, NivelFuncionario nivel, Double baseSalarial, Departamento departamento) {
        this.nome = nome;
        this.nivel = nivel;
        this.baseSalarial = baseSalarial;
        this.departamento = departamento;
    }

    public void addContrato(ContratoHora contrato) {
        this.contratos.add(contrato);
    }

    public void removerContrato(ContratoHora contrato) {
        this.contratos.remove(contrato);
    }

    public Double renda(int mes, int ano) {

        Double rendaFinal = this.baseSalarial;

        for (ContratoHora c : contratos) {

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
