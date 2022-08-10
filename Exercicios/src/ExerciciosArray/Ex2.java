package ExerciciosArray;

import java.util.Scanner;

/*
 *2- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.


 */

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int [6];
		int numerosPares=0,somaPar=0,contImpar=0,numeroImpar=0,i,n;
		
		for(i=0;i<6;i++) {
			System.out.println("\nDigite um número inteiro: ");
			n = sc.nextInt();
			
			if(n % 2 == 0) {
				numerosPares++;
				somaPar += n;
			}
			else{
				System.out.println("\nNúmero impar: "+n+"\n");
				contImpar++;
			}
		}
		System.out.println("\nNúmeros pares digitados: "+numerosPares);
		System.out.println("\nSoma dos números pares: "+somaPar);
		System.out.println("\nQuantidade dos números ímpares: "+contImpar);
	}

}
