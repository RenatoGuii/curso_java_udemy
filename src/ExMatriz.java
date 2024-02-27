
import java.util.Locale;
import java.util.Scanner;

public class ExMatriz {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println();
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] mat = new int[m][n];

        for (int i = 0; i < mat.length; i++) {

            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }

        }

        System.out.println();
        System.out.print("Digite um numero da relacao: ");
        int x = sc.nextInt();
        System.out.println();

        for (int k = 0; k < mat.length; k++) {
            for (int l = 0; l < mat[k].length; l++) {
                if (mat[k][l] == x) {
                    System.out.printf("Posicao %d,%d:%n", k, l);

                    if (l > 0 ) {
                        System.out.printf("Esquerda: %d%n", mat[k][l - 1]);
                    }

                    if (k > 0 ) {
                        System.out.printf("Acima: %d%n", mat[k - 1][l]);
                    }

                    if (l < mat[k].length - 1 ) {
                        System.out.printf("Direita: %d%n", mat[k][l + 1]);
                    }
                  
                    if (k < mat.length - 1 ) {
                        System.out.printf("Abaixo: %d%n", mat[k + 1][l]);
                    }

                    System.out.println();
                }
            }
        }

        sc.close();
    }

}
