import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppArquivo4 {
	public static void main(String[] args) throws Exception {

		String[] lines = new String[] { "Bom dia", "Boa tarde", "Boa noite" };

		String path = "C:\\Users\\renat\\OneDrive\\Documentos\\programacao\\Aulas\\JAVA\\Curso UDEMY\\projeto_estudo_java\\java_estudo\\bin\\arquivos\\arquivo2.txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line :  lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
