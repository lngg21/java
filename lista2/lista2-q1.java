import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de notas: ");
        int quantidadeNotas = scanner.nextInt();

        // Inicialize um array para armazenar as notas
        double[] notas = new double[quantidadeNotas];

        // Ler as notas e verificar se estão no intervalo de 0 a 10
        double soma = 0;
        int notasValidas = 0;

        for (int i = 0; i < quantidadeNotas; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            double nota = scanner.nextDouble();

            if (nota >= 0 && nota <= 10) {
                notas[i] = nota;
                soma += nota;
                notasValidas++;
            } else {
                System.out.println("Nota inválida. Digite uma nota entre 0 e 10.");
                i--; // Para pedir novamente a nota inválida
            }
        }

        scanner.close();

        // Calcular a média
        double media = soma / notasValidas;

        // Exibir notas maiores e menores que a média
        System.out.println("Média das notas: " + media);
        System.out.print("Notas maiores que a média: ");
        for (int i = 0; i < quantidadeNotas; i++) {
            if (notas[i] > media) {
                System.out.print(notas[i] + " ");
            }
        }
        System.out.println(); // Pular uma linha

        System.out.print("Notas menores que a média: ");
        for (int i = 0; i < quantidadeNotas; i++) {
            if (notas[i] < media) {
                System.out.print(notas[i] + " ");
            }
        }
        System.out.println(); // Pular uma linha
    }
}
