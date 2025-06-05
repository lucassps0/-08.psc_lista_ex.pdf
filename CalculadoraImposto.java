import java.util.Scanner;
public class CalculadoraImposto {
    public static double calcularPrecoComImposto(double taxaImposto, double precoBase) {
        return precoBase + (precoBase * taxaImposto / 100);
    }

    public static double obterEntrada(String mensagem, Scanner leitor) {
        System.out.print(mensagem);
        return leitor.nextDouble();
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double taxaImposto = obterEntrada("Digite a taxa de imposto (%): ", leitor);
        double precoBase = obterEntrada("Digite o preço do item antes do imposto: ", leitor);
        double precoFinal = calcularPrecoComImposto(taxaImposto, precoBase);
        System.out.println("O custo final do item com imposto é: " + precoFinal);

        leitor.close();
    }
}
