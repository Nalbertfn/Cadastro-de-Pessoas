import java.util.Scanner;

public class CadastroDePessoas {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        int pessoas = 2;
        String nome;
        String genero;
        int M = 0;
        int F = 0;

        for (int i = 0; i < pessoas; i++) {
            nome = sc.next();
            genero = sc.next();

            System.out.println(nome + " cadastrado(a). ");
            if(genero.equals("masculino")){
                M++;
            }
            else if (genero.equals("feminino")){
                F++;
            }
        }

        System.out.println(M + " Masculino");
        System.out.println(F + " Feminino");

        sc.close();
    }
}
