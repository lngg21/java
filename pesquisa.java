public class pesquisa  {
    public static void main(String[] args){
        //int[] vet = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        final int TAM = 3000;
        int[] vet = new int[TAM];

        int[] vet = vetorAleatorio(vet,50);

        vet= metodoBolha(vet);


        int procurado = 20;

        System.out.println("Vetor gerado: ");
        exibeVetor(vet);

        
        //int r = buscaMelhorada(vet, procurado );


        if(r == -1){
            System.out.println("O elemento não está presente no vetor");
        }else{
            System.out.println("O elemento " + procurado + " presente na posição " + (r + 1));
        }
    
    }
    public static int buscaSequencial (int vet[ ], int procurado){
        int  i;
        boolean  achou = false;
        for (i = 0; i < vet.length; i++)  
        {if (vet[i] == procurado)  {
            achou = true;
            break;
        }
    }
    if (achou == true){
        return i;     // retorna a posição onde encontrou a chave}   
     } else {
        return -1;  // retorna -1 indicando que não achou a chave}}
    }
}

public static int buscaMelhorada (int vet[ ], int procurado){
    int i;
    boolean achou = false;
    for (i = 0; i < vet.length; i++)  {
        if (vet[i] == procurado)  {
            achou = true;
            break;
            }
        else if (vet[i] > procurado) {
            break;
            }
         }
    if (achou == true) {
        return i;     // retorna a posição onde encontrou a chave
        } 
        else {
    return -1;  // retorna -1 indicando que não achou a chave}
   }
    }
    public static int buscaBinaria(int[]v, double chave, int procurado){
        int inicio = 0, meio, fim = vet.length -1;
         boolean achou = false;
        while(<= fim){
            meio = (inicio + fim)/2;
                if (v[meio] == chave){
                    achou = true;
                    break;
                }
            }
            else if(v[meio] > chave){
                fim = meio - 1;
            }
            else{
                inicio = meio + 1;
            }
        
        if(achou == true){
            return meio; //retorna a posição onde encontrou a chave
        }
            else{
                return - 1 //retorna -1 inidicando que não achou a chave
            }
        }
public static int[] metodoBolha (int[] vet){
    int i = vet.length;  while (i >= 2){for(int j = 0; j < i-1; j++){
        if(vet[j] > vet[j+1])
        {
            int temp = vet[j];
            vet[j] = vet[j+1];
            vet[j+1] = temp;
        }
    }
    i = i -1;
}
  return(vet);
}
public static void exibirVetor(int[] vet) {
    for (int i = 0; i < vetor.length; i++) {
        System.out.print(vetor[i] + " ");
    }
    System.out.println();
}
}


    
