import java.util.Scanner;

import exercicioExcecoes.ContaBancaria;
import exercicioExcecoes.DomainException;

public class AppExcecoes {
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		try {

			int numeroConta;
			String nomeTitular;
			Double saldoInicial, limiteSaque, valorSaque;

			System.out.println();
			System.out.println("Informe os dados da conta:");
			System.out.print("Numero da conta: ");
			numeroConta = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome do Titular: ");
			nomeTitular = sc.nextLine();
			System.out.print("Saldo Inicial: ");
			saldoInicial = sc.nextDouble();
			System.out.print("Limite de Saque: ");
			limiteSaque = sc.nextDouble();

			ContaBancaria conta = new ContaBancaria(numeroConta, nomeTitular, saldoInicial, limiteSaque);

			System.out.println();
			System.out.print("Digite o valor a ser sacado: ");
			valorSaque = sc.nextDouble();
			conta.saque(valorSaque);

			System.out.printf("Saldo Atualizado: %.2f%n", conta.getSaldo());

		} catch (DomainException e) {
			System.out.println("Foi detectado um erro: " + e.getMessage());
		}

		sc.close();

	}

}
