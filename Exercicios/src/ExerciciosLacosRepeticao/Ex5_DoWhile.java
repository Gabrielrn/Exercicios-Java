package ExerciciosLacosRepeticao;

import java.util.Scanner;

/*
 * 5- Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.
 */

public class Ex5_DoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n=0,soma=0;
		
		do {
			System.out.printf("\nDigite um n�mero: ");
			n = sc.nextInt();
			soma += n;
		}while(n != 0);
		System.out.printf("\nSoma dos n�meros diferentes de 0: %d",soma);
	}

}
