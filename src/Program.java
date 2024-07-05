import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);

		Map<String, Integer> votos = new LinkedHashMap<>();

		String path = "C:\\Users\\renat\\OneDrive\\Documentos\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String linha = br.readLine();
			while (linha != null) {

				String[] fields = linha.split(",");
				String nome = fields[0];
				int contagem = Integer.parseInt(fields[1]);

				if (votos.containsKey(nome)) {
					int votosAtuais = votos.get(nome);
					votos.put(nome, contagem + votosAtuais);
				} else {
					votos.put(nome, contagem);
				}

				linha = br.readLine();
			}

			for (String key : votos.keySet()) {
				System.out.println(key + ": " + votos.get(key));
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
	}
}