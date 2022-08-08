package ExerciciosLacosDecisoes;

import java.util.Scanner;
/*
 * 1- Faça um programa que receba três inteiros e diga qual deles é o maior.
 */
public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número inteiro: ");
		int n1 = sc.nextInt();
		System.out.print("\nDigite o segundo número inteiro: ");
		int n2 = sc.nextInt();
		System.out.print("\nDigite o terceiro número inteiro: ");
		int n3 = sc.nextInt();
		
		if(n1 > n2 && n1 > n3) {
			System.out.printf("\n%d é o maior valor!",n1);
		}
		else if(n2 > n1 && n2 > n3) {
			System.out.printf("\n%d é o maior valor!",n2);
		}
		else {
			System.out.printf("\n%d é o maior valor!",n3);
		}
		
		sc.close();

	}

}
