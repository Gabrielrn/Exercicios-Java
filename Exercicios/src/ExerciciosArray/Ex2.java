package ExerciciosArray;

import java.util.Scanner;

/*
 *2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados.


 */

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int [6];
		int numerosPares=0,somaPar=0,contImpar=0,numeroImpar=0,i,n;
		
		for(i=0;i<6;i++) {
			System.out.println("\nDigite um n�mero inteiro: ");
			n = sc.nextInt();
			
			if(n % 2 == 0) {
				numerosPares++;
				somaPar += n;
			}
			else{
				System.out.println("\nN�mero impar: "+n+"\n");
				contImpar++;
			}
		}
		System.out.println("\nN�meros pares digitados: "+numerosPares);
		System.out.println("\nSoma dos n�meros pares: "+somaPar);
		System.out.println("\nQuantidade dos n�meros �mpares: "+contImpar);
	}

}
