package ExerciciosLacosDecisoes;

import java.util.Scanner;
/*
 * 1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
 */
public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero inteiro: ");
		int n1 = sc.nextInt();
		System.out.print("\nDigite o segundo n�mero inteiro: ");
		int n2 = sc.nextInt();
		System.out.print("\nDigite o terceiro n�mero inteiro: ");
		int n3 = sc.nextInt();
		
		if(n1 > n2 && n1 > n3) {
			System.out.printf("\n%d � o maior valor!",n1);
		}
		else if(n2 > n1 && n2 > n3) {
			System.out.printf("\n%d � o maior valor!",n2);
		}
		else {
			System.out.printf("\n%d � o maior valor!",n3);
		}
		
		sc.close();

	}

}
