import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AppArquivo1 {
	public static void main(String[] args) throws Exception {

		File file = new File(
				"C:\\Users\\renat\\OneDrive\\Documentos\\programacao\\Aulas\\JAVA\\Curso UDEMY\\projeto_estudo_java\\java_estudo\\bin\\arquivos\\arquivo1.txt");

		Scanner sc = null;

		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}

	}

}
