package ExerciciosLacosDecisoes;

import java.util.Scanner;

/*
 * 4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.
 */

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número qualquer: ");
		int num = sc.nextInt();	
		
		if(num % 2 == 0) {
			System.out.printf("\nO número %d é par!",num);
			double raiz = Math.sqrt(num);
			System.out.printf("\nO número %d tem a raíz quadrada de: %.2f",num,raiz);
		}
		else {
			System.out.printf("\nO número %d é ímpar!",num);
			double potencia = Math.pow(num,2);
			System.out.printf("\nO número %d elevado ao quadrado é: %.2f",num,potencia);
		}
		
		sc.close();
	}

}
