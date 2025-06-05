import java.util.Scanner;

public class ConversorHorario {
    public static char determinarPeriodo(int hora, int[] horaFormato12) {
        if (hora == 0) {
            horaFormato12[0] = 12;
            return 'A';
        } else if (hora == 12) {
            horaFormato12[0] = 12;
            return 'P';
        } else if (hora > 12) {
            horaFormato12[0] = hora - 12;
            return 'P';
        } else {
            horaFormato12[0] = hora;
            return 'A';
        }
    }

    public static void mostrarHorario(int hora, int minutos, char periodo) {
        System.out.printf("Horário convertido: %d:%02d %s\n", hora, minutos, (periodo == 'A' ? "A.M." : "P.M."));
    }

    public static int obterEntrada(String mensagem, Scanner leitor) {
        System.out.print(mensagem);
        return leitor.nextInt();
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        char continuar;

        do {

            int hora = obterEntrada("Digite a hora: ", leitor);
            int minutos = obterEntrada("Digite os minutos: ", leitor);

            int[] horaFormato12 = new int[1];
            char periodo = determinarPeriodo(hora, horaFormato12);
            mostrarHorario(horaFormato12[0], minutos, periodo);

            System.out.print("Deseja converter outro horário? (S/N): ");
            continuar = leitor.next().charAt(0);
        } while (continuar == 'S' || continuar == 's');

        leitor.close();
    }
}
