import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exercicioPolimorfismo1.Funcionario;
import exercicioPolimorfismo1.FuncionarioTerceirizado;

public class AppPolimorfismo1 {
	public static void main(String[] args) throws Exception {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, horas;
		Double valorPorHora, despesaAdicional;
		String nome;
		char terceirizado;
		List<Funcionario> funcionarios = new ArrayList<>();

		System.out.println();
		System.out.print("Digite o numero de empregados: ");
		n = sc.nextInt();
		System.out.println();

		for (int i = 0; i < n; i++) {

			System.out.printf("Dados do funcionario #%d: %n", (i + 1));

			System.out.print("Terceirizado?(s/n): ");
			terceirizado = sc.next().charAt(0);
			sc.nextLine();

			if (terceirizado == 'n') {

				System.out.print("Nome: ");
				nome = sc.nextLine();
				System.out.print("Horas trabalhadas: ");
				horas = sc.nextInt();
				System.out.print("Valor por hora: ");
				valorPorHora = sc.nextDouble();

				Funcionario funcionario = new Funcionario(nome, horas, valorPorHora);

				funcionarios.add(funcionario);

			} else if (terceirizado == 's') {

				System.out.print("Nome: ");
				nome = sc.nextLine();
				System.out.print("Horas trabalhadas: ");
				horas = sc.nextInt();
				System.out.print("Valor por hora: ");
				valorPorHora = sc.nextDouble();
				System.out.print("Despesa adicional: ");
				despesaAdicional = sc.nextDouble();

				Funcionario funcionario = new FuncionarioTerceirizado(nome, horas, valorPorHora, despesaAdicional);

				funcionarios.add(funcionario);

			}

		}

		System.out.println();
		System.out.println("PAGAMENTOS: ");

		for (Funcionario f : funcionarios) {
			System.out.println(f);
		}

		sc.close();
	}

}
