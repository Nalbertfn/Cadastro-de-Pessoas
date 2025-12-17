import java.util.Scanner;

public class Revisao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int valor = sc.nextInt();

        int multiplicador = 1;

        while (multiplicador <= 10){
            int soma = valor * multiplicador;
            System.out.println(valor + " x " + multiplicador + " = " + soma);
            multiplicador ++;
        }
        sc.close();
    }
}
