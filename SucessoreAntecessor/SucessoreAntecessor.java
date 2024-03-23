import java.util.Scanner;

public class SucessoreAntecessor {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n,an,su;
        System.out.println("Digite o numero desejado: ");
        n = ler.nextInt();
        an = n - 1;
        su = n + 1;
        System.out.println("O antecessor do numero " + n + " é " + an + "e o sucessor é " + su);
    }
}
