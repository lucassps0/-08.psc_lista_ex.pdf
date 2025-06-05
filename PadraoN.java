import java.util.Scanner;

public class PadraoN {
    public static void imprimirPadrao(int n) {
        for (int i = 1; i <= n; i++) {
            String linha = "";
            for (int j = 1; j <= i; j++) {
                linha += i + " ";
            }
            System.out.println(linha);
        }
    }

    public static void main(String[] args) {
        Scanner numeroScan = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n = numeroScan.nextInt();
        imprimirPadrao(n);
        numeroScan.close();
    }
}
