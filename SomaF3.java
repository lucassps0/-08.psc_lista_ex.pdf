import java.util.Scanner;

public class SomaF3 {
    public static int somar(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Scanner somaScan = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = somaScan.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = somaScan.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = somaScan.nextInt();

        int resultado = somar(num1, num2, num3);
        System.out.println("A soma dos três números é: " + resultado);

        somaScan.close();
    }
}
