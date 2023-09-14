public class lista1q3 {
    public static void main(String[] args) {
        int[] vetorA = { 1, 2, 3, 4, 5 };
        int[] vetorB = { 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        int[] vetorC = metodoRetornoVetorC(vetorA, vetorB);

        System.out.println("Elementos do vetor C são:");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }
    }

    public static int[] metodoRetornoVetorC(int[] vetorA, int[] vetorB) {
        int[] vetorC = new int[vetorA.length + vetorB.length];

        // Copiando os elementos do vetor A para o vetor C
        for (int i = 0; i < vetorA.length; i++) {
            vetorC[i] = vetorA[i];
        }

        // Copiando os elementos do vetor B para o vetor C, após os elementos de A
        for (int i = 0; i < vetorB.length; i++) {
            vetorC[vetorA.length + i] = vetorB[i];
        }

        return vetorC;
    }
}
