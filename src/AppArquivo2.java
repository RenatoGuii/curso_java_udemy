import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AppArquivo2 {
	public static void main(String[] args) throws Exception {

		String path = "C:\\Users\\renat\\OneDrive\\Documentos\\programacao\\Aulas\\JAVA\\Curso UDEMY\\projeto_estudo_java\\java_estudo\\bin\\arquivos\\arquivo1.txt";

		FileReader fr = null;
		BufferedReader br = null;

		try {
			// br = new BufferedReader(new FileReader(path));
			fr = new FileReader(path);
			br = new BufferedReader(fr);

			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			try {
				if (br != null) {
					br.close();
				}

				if (fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
