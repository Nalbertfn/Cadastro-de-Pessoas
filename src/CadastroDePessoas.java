import java.util.Scanner;

public class CadastroDePessoas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pessoas = 5; // usei 5 pra testar
        String nome;
        String genero;
        int M = 0;
        int F = 0;

        for (int i = 0; i < pessoas; i++) {

            nome = sc.nextLine();
            genero = sc.nextLine();

            System.out.println(nome + " cadastrado(a).");

            if (genero.trim().equalsIgnoreCase("Masculino")) {
                M++;
            } else if (genero.trim().equalsIgnoreCase("Feminino")) {
                F++;
            }
        }

        System.out.println(M + " MASCULINO");
        System.out.println(F + " FEMININO");

        sc.close();
    }
}
