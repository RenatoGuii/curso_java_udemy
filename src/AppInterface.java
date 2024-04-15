import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import exercicioInterface.Contrato;
import exercicioInterface.Parcelamento;
import exercicioInterface.ServicoContratado;
import exercicioInterface.ServicoPaypal;

public class AppInterface {
	public static void main(String[] args) throws Exception {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("Entre os dados do contrato: ");
		System.out.print("Numero: ");
		int numero = sc.nextInt();
		sc.nextLine();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate data = LocalDate.parse(sc.next(), fmt);
		System.out.print("Valor do contrato: ");
		Double valorContrato = sc.nextDouble();
		System.out.print("Entre com o numero de parcelas: ");
		int parcelas = sc.nextInt();

		Contrato novoContrato = new Contrato(numero, data, valorContrato);
		ServicoContratado servicoContratado = new ServicoContratado(new ServicoPaypal());
		servicoContratado.contratoProcesso(novoContrato, parcelas);

		System.out.println(data);

		System.out.println("Parcelas: ");
		for (Parcelamento parcela : novoContrato.getParcelas()) {
			System.out.println(parcela);
		}

		sc.close();
	}

}
