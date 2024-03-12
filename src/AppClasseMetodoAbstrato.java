import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exercicioClasseMetodoAbstrato.Contribuinte;
import exercicioClasseMetodoAbstrato.PessoaFisica;
import exercicioClasseMetodoAbstrato.PessoaJuridica;

public class AppClasseMetodoAbstrato {
	public static void main(String[] args) throws Exception {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, numeroFuncionarios;
		char tipoContribuinte;
		String nome;
		Double rendaAnual, gastoSaude;

		List<Contribuinte> contribuintes = new ArrayList<>();

		System.out.println();
		System.out.print("Digite o numero de contribuintes: ");
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.printf("Dados do contribuinte #%d: %n", (i + 1));

			System.out.print("Pessoa fisica ou juridica (f/j)? ");
			tipoContribuinte = sc.next().charAt(0);
			sc.nextLine();

			if (tipoContribuinte == 'f') {

				System.out.print("Nome: ");
				nome = sc.nextLine();
				System.out.print("Renda Anual: ");
				rendaAnual = sc.nextDouble();
				System.out.print("Gasto com saude: ");
				gastoSaude = sc.nextDouble();

				Contribuinte contribuinte = new PessoaFisica(nome, rendaAnual, gastoSaude);

				contribuintes.add(contribuinte);

			} else if (tipoContribuinte == 'j') {

				System.out.print("Nome: ");
				nome = sc.nextLine();
				System.out.print("Renda Anual: ");
				rendaAnual = sc.nextDouble();
				System.out.print("Numero de funcionarios: ");
				numeroFuncionarios = sc.nextInt();

				Contribuinte contribuinte = new PessoaJuridica(nome, rendaAnual, numeroFuncionarios);

				contribuintes.add(contribuinte);

			}

		}

		Double impostoTotal = 0.0;

		System.out.println();
		System.out.println("IMPOSTOS PAGOS:");

		for (Contribuinte c : contribuintes) {
			System.out.println(c);
			impostoTotal += c.imposto();
		}

		System.out.println();
		System.out.printf("IMPOSTOS TOTAIS: R$%.2f", impostoTotal);

		sc.close();
	}

}
