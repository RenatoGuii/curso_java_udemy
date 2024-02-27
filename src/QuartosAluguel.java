import java.util.Locale;
import java.util.Scanner;

import classes.QuartoAluguel;

public class QuartosAluguel {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        QuartoAluguel[] qt = new QuartoAluguel[9];

        System.out.println();
        System.out.print("Quantos quartos irão ser alugados? ");
        int n = sc.nextInt();
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.printf("Aluguel #%d", i + 1);
            
            System.out.println();
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Quarto: ");
            int numeroQuarto = sc.nextInt();
            System.out.println();

            for (int y = 0; y < qt.length; y++) {

                if (y == numeroQuarto && qt[y] == null) {
                    qt[y] = new QuartoAluguel(nome, email);
                } else if (y == numeroQuarto && qt[y] != null) {
                    System.out.println("Este quarto já esta ocupado!");
                }

            }

        }

        System.out.println("Busy rooms:");

        for (int z = 0; z < qt.length; z++) {

            if (qt[z] != null) {
                System.out.print(qt[z].toString(z));
                System.out.println();
            }

        }
        
        sc.close();
    }
}
