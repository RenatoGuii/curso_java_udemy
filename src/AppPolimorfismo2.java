import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import exercicioPoliformismo2.Produto;
import exercicioPoliformismo2.ProdutoImportado;
import exercicioPoliformismo2.ProdutoUsado;

public class AppPolimorfismo2 {
	public static void main(String[] args) throws Exception {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;
		char tipoProduto;
		String nome;
		Double preco, taxaAlfandegaria;
		LocalDate dataFabricacao;
		List<Produto> produtos = new ArrayList<>();

		System.out.println();
		System.out.print("Digite o numero de produtos: ");
		n = sc.nextInt();
		System.out.println();

		for (int i = 0; i < n; i++) {
			System.out.printf("Dados do produto #%d: %n", (i + 1));

			System.out.print("Comum, usado ou importado (c/u/i)? ");
			tipoProduto = sc.next().charAt(0);
			sc.nextLine();

			if (tipoProduto == 'c') {

				System.out.print("Nome: ");
				nome = sc.nextLine();
				System.out.print("Preco: ");
				preco = sc.nextDouble();

				Produto produto = new Produto(nome, preco);
				produtos.add(produto);

			} else if (tipoProduto == 'u') {

				System.out.print("Nome: ");
				nome = sc.nextLine();
				System.out.print("Preco: ");
				preco = sc.nextDouble();
				System.out.print("Data de fabricacao(DD/MM/YYYY): ");
				DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				dataFabricacao = LocalDate.parse(sc.next(), fmt);

				Produto produto = new ProdutoUsado(nome, preco, dataFabricacao);
				produtos.add(produto);

			} else if (tipoProduto == 'i') {

				System.out.print("Nome: ");
				nome = sc.nextLine();
				System.out.print("Preco: ");
				preco = sc.nextDouble();
				System.out.print("Valor da taxa alfandegaria: ");
				taxaAlfandegaria = sc.nextDouble();

				Produto produto = new ProdutoImportado(nome, preco, taxaAlfandegaria);
				produtos.add(produto);

			}
			;

		}

		System.out.println();
		System.out.println("VALORES DE ETIQUETA:");

		for (Produto p : produtos) {
			System.out.print(p.etiquetaPreco());
		}

		sc.close();
	}

}
