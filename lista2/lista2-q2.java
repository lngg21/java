

/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    int[] vet = {20, 30, 18, 9, 7, 10};
	    vet = inverteVetor(vet);
	    
		System.out.println("\nVetor inverso");
		
		exibeVetor(vet);
	}
	 
	 public static int[] inverteVetor(int [] vet){
	     int[] temp = new int[vet.length];
	     
	     for(int i = 0; i < vet.length; i++){
	         temp[i] = vet[vet.length - i - 1];
	     }
	     return(temp);
	     
	 }
	 public static void exibeVetor(int [] vet){
	   System.out.print("\nOs elementos do vetor são:");
	     for(int i = 0; i< vet. length; i++){
	         System.out.print(vet[i] + " ");
	     }
	 }
	
}
