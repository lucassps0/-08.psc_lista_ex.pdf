import java.util.Scanner;

public class PradraoN2 {
    public static void imprimirPadrao(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner nScan = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n = nScan.nextInt();
        imprimirPadrao(n);
        nScan.close();
    }
}
