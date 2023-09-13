public class lista1q1 
    {
        public static void main(String[] args) 
        {
         int[] vetorA = {1, 2 , 3, 4, 5, 6, 7, 8};
         
         int[] vetorB = metodovetor(vetorA);
         
         exibeVetor(vetorB);
        }
        public static int[] metodovetor(int[] vetorB){
            System.out.print("Os valores do vetor são:");
            
            for (int i = 0; i < vetorB.length; i++)
            vetorB[i] = 3 * vetorB[i];
            return vetorB;
        }
        public static void exibeVetor(int[] vetorB)
        {

            for (int i = 0; i < vetorB.length; i++)
            System.out.print(vetorB[i] + " ");
        }
    }
