import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import classes.Funcionario2;

public class FuncionariosAumento {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionario2> lista = new ArrayList<>();

        System.out.println();
        System.out.print("Quantos funcionarios serao registrados? ");
        int n = sc.nextInt();
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.printf("Funcionario #%d%n", i + 1);

            System.out.print("Id: ");
            int id = sc.nextInt();

            while (hasId(lista, id)) {
                System.out.print("Esse id ja existe, tente outro: ");
                id = sc.nextInt();
            }
            
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Salario: ");
            Double salario = sc.nextDouble();
            System.out.println();

            lista.add(new Funcionario2(id, nome, salario));

        }

        System.out.print("Digite o id do empregado que deseja fazer um aumento: ");

        int id = sc.nextInt();

        Funcionario2 exe = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        if (exe == null) {
            System.out.println();
            System.out.println("Id não encontrado, abortar operação!");
        } else {
            System.out.print("Digite o percentual de aumento: ");
            Double percentual = sc.nextDouble();
            exe.aumento(percentual);
        }
        
        System.out.println();
        System.out.println("Lista de funcionarios:");
        
        for (Funcionario2 funcionario : lista) {
            System.out.println(funcionario);
        }

        System.out.println();
        
        sc.close();
    }

    public static boolean hasId(List<Funcionario2> list, int id) {
        Funcionario2 exe = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        return exe != null;
    }

}
