import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import exercicioStream2.Produto;

public class AppStream2 {
	public static void main(String[] args) throws Exception {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String path = "C:\\Users\\renat\\OneDrive\\Documentos\\exercicioTextoProgramacao\\in2.txt";

		List<Produto> list = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String linha = br.readLine();

			while (linha != null) {

				String fields[] = linha.split(",");

				list.add(new Produto(fields[0], Double.parseDouble(fields[1])));

				linha = br.readLine();
			}

			Double precoMedio = list.stream().map(p -> p.getPreco()).reduce(0.0, (x, y) -> x + y) / list.size();

			List<String> nomes = list.stream().filter(p -> p.getPreco() < precoMedio).map(p -> p.getNome())
					.sorted(Comparator.reverseOrder()).collect(Collectors.toList());

			System.out.printf("Preco Medio: %.2f\n", precoMedio);

			nomes.forEach(System.out::println);

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
	}

}
