import java.util.Scanner;

public class VerificarP {
    public static char verificarNumero(int numero) {
        return (numero > 0) ? 'P' : 'N';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = scanner.nextInt();

        char resultado = verificarNumero(num);
        System.out.println("O resultado é: " + resultado);

        scanner.close();
    }
}
