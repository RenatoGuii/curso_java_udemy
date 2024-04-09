import java.io.File;

import java.util.Scanner;

public class AppArquivo6 {
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a URL do arquivo: ");
		String strPath = sc.nextLine();

		File path = new File(strPath);

		System.out.println("getName: " + path.getName());
		System.out.println("getParent: " + path.getParent());
		System.out.println("getPath: " + path.getPath());

		sc.close();
	}
}
