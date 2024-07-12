import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import exercicioStream.Funcionario;

public class AppStream {
	public static void main(String[] args) throws Exception {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Funcionario> list = new ArrayList<>();

		String path = "C:\\Users\\renat\\OneDrive\\Documentos\\exercicioTextoProgramacao\\in.txt";

		System.out.print("Digite o salario base: ");
		Double salarioBase = sc.nextDouble();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String linha = br.readLine();

			while (linha != null) {
				String fields[] = linha.split(",");

				String nome = fields[0];
				String email = fields[1];
				Double salario = Double.parseDouble(fields[2]);

				list.add(new Funcionario(nome, email, salario));

				linha = br.readLine();
			}

			List<Funcionario> listFilter = list.stream().filter(f -> f.getSalario() > salarioBase)
					.sorted((f1, f2) -> f1.getNome().toUpperCase().compareTo(f2.getNome().toUpperCase()))
					.collect(Collectors.toList());

			List<Funcionario> listM = list.stream().filter(f -> f.getNome().charAt(0) == 'M')
					.collect(Collectors.toList());

			double soma = 0;

			for (Funcionario f : listM) {
				soma += f.getSalario();
			}

			System.out.println("Email dos funcionarios com o salario maior que 2000.00:");

			listFilter.forEach(System.out::println);

			System.out.printf("Soma dos salarios das pessoas cujo o nome inicia com a letra 'M': %.2f", soma);

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();

	}

}
