import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import exercicioComposicao1.contratoHora;
import exercicioComposicao1.departamento;
import exercicioComposicao1.funcionario;
import exercicioComposicao1.nivelFuncionario;

public class AppComposicao {
	public static void main(String[] args) throws Exception {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, horas;
		String nome, departamentoNome, data, lvlFuncionario;
		Double salarioBase, valorHora;

		System.out.println();
		System.out.print("Digite o nome do departamento: ");
		departamentoNome = sc.nextLine();
		departamento d = new departamento(departamentoNome);
		System.out.println();

		System.out.println("Dados do funcionario: ");
		System.out.print("Nome: ");
		nome = sc.nextLine();

		System.out.print("Nivel: ");
		lvlFuncionario = sc.next();

		System.out.print("Base Salarial: ");
		salarioBase = sc.nextDouble();
		System.out.println();

		funcionario f = new funcionario(nome, nivelFuncionario.valueOf(lvlFuncionario), salarioBase, d);

		System.out.print("Quantos contratos foram destinados ao funcionario? ");
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Informe os dados do contrato #" + (i + 1) + ":");

			System.out.print("Data (DD/MM/YYYY): ");
			data = sc.next();
			LocalDate dataContrato = LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

			System.out.print("Valor por hora: ");
			valorHora = sc.nextDouble();

			System.out.print("Duracao em horas: ");
			horas = sc.nextInt();

			System.out.println();

			contratoHora novoContrato = new contratoHora(dataContrato, valorHora, horas);

			f.addContrato(novoContrato);

		}

		System.out.print("Digite o mes e o ano para calcular renda do funcionario(MM/YYYY): ");
		data = sc.next();

		int mes = Integer.parseInt(data.substring(0, 2));
		int ano = Integer.parseInt(data.substring(3));

		Double renda = f.renda(mes, ano);

		System.out.println();
		
		System.out.print(f);
		System.out.printf("Renda de %d/%d: %.2f%n", mes, ano, renda);

		sc.close();
	}

}
