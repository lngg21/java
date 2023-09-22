public class pesquisa  {
    public static void main(String[] args){
        int[] vet = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int procurado = 90;
        
        int r = buscaMelhorada(vet, procurado );

        if(r == -1){
            System.out.println("O elemento não está presente no vetor");
        }else{
            System.out.println("O elemento " + procurado + " presente na posição " + (r + 1));
        }
    
    }
    /*public static int buscaSequencial (int vet[ ], int procurado){
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
    }*/

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
}
    
