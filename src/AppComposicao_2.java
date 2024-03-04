
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import exercicioComposicao2.Client;
import exercicioComposicao2.OrderItem;
import exercicioComposicao2.Pedido;
import exercicioComposicao2.Product;
import exercicioComposicao2.OrderStatus;

public class AppComposicao_2 {
	public static void main(String[] args) throws Exception {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// DADOS CLIENTE

		String nome, email, data_string;

		System.out.println();
		System.out.println("Informe os dados do cliente: ");
		System.out.print("Nome: ");
		nome = sc.nextLine();
		System.out.print("Email: ");
		email = sc.next();
		System.out.print("Data de nascimento (DD/MM/YYYY): ");
		data_string = sc.next();

		LocalDate data = LocalDate.parse(data_string, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

		Client cliente = new Client(nome, email, data);

		// DADOS PEDIDO

		int n_pedidos, quantidade;
		String nomeProduto, statusPedido;
		Double precoProduto;

		System.out.println();
		System.out.println("Informe os dados do pedido: ");
		System.out.print("Status: ");
		statusPedido = sc.next();
		System.out.print("Quantos items no pedido? ");
		n_pedidos = sc.nextInt();

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

		Pedido pedido = new Pedido(LocalDateTime.now().format(fmt), OrderStatus.valueOf(statusPedido), cliente);

		for (int i = 0; i < n_pedidos; i++) {

			System.out.println();

			System.out.println("Informe os dados do item #" + (i + 1));
			System.out.print("Nome do produto: ");
			nomeProduto = sc.next();
			System.out.print("Preco do produto: ");
			precoProduto = sc.nextDouble();
			System.out.print("Quantidade: ");
			quantidade = sc.nextInt();

			Product produto = new Product(nomeProduto, precoProduto);

			OrderItem itemPedido = new OrderItem(produto, quantidade, produto.getPrice());

			pedido.addItem(itemPedido);

		}

		System.out.println();
		System.out.println(pedido);

		sc.close();
	}

}
