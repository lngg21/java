public class pesquisa  {
    public static void main(String[] args){
        int[] vet = {27, 19, 37, 15, 20, 17, 21, 12};
        int procurado = 12;
        
        int r = buscaSequencial(vet, procurado );

        if(r == -1){
            System.out.println("O elemento não está presente no vetor");
        }else{
            System.out.println("O elemento " + procurado + " presente na posição " + (r + 1));
        }
    
    }
    public static int buscaSequencial (double v[ ], double procurado, int n){
        int  i;
        boolean  achou = false;
        for (i = 0; i < n; i++)  
        {if (v[i] == procurado)  {
            achou = true;break;
        }
    }
    if (achou == true){
        return i;     // retorna a posição onde encontrou a chave}   
     } else {
        return -1;  // retorna -1 indicando que não achou a chave}}
    }
    
}
    }
