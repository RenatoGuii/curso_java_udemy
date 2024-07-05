import java.util.Locale;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class AppSet {
	public static void main(String[] args) throws Exception {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println();

		Set<Integer> turmaA = new TreeSet<>();
		Set<Integer> turmaB = new TreeSet<>();
		Set<Integer> turmaC = new TreeSet<>();

		System.out.print("Quantos alunos para o curso A? ");
		int QntdAlunosCursoA = sc.nextInt();

		for (int i = 0; i < QntdAlunosCursoA; i++) {
			int x = sc.nextInt();
			turmaA.add(x);
		}

		System.out.print("Quantos alunos para o curso B? ");
		int QntdAlunosCursoB = sc.nextInt();

		for (int i = 0; i < QntdAlunosCursoB; i++) {
			int x = sc.nextInt();
			turmaB.add(x);
		}

		System.out.print("Quantos alunos para o curso C? ");
		int QntdAlunosCursoC = sc.nextInt();

		for (int i = 0; i < QntdAlunosCursoC; i++) {
			int x = sc.nextInt();
			turmaC.add(x);
		}

		Set<Integer> qntdAlunos = new TreeSet<>(turmaA);
		qntdAlunos.addAll(turmaB);
		qntdAlunos.addAll(turmaC);

		System.out.printf("Estudantes totais: %s", qntdAlunos.size());

		sc.close();
	}

}