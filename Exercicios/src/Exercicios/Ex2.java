package ExerciciosLacosDecisoes;

import java.util.Scanner;

/*
 * 2- Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
 */

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o primeiro n�mero: ");
		int n1 = sc.nextInt();
		System.out.print("Entre com o segundo n�mero: ");
		int n2 = sc.nextInt();
		System.out.print("Entre com o terceiro n�mero: ");
		int n3 = sc.nextInt();
		
		if(n1 <= n2 && n2 <= n3) {
			System.out.printf("\nA ordem crescente fica: %d %d %d",n1,n2,n3);
		}
		else if(n1 <= n3 && n3 <= n2) {
			System.out.printf("\nA ordem crescente fica: %d %d %d",n1,n3,n2);
		}
		else if(n2 <= n1 && n1 <= n3) {
			System.out.printf("\nA ordem crescente fica: %d %d %d",n2,n1,n3);
		}
		else if(n2 <= n3 & n3 <= n1) {
			System.out.printf("\nA ordem crescente fica: %d %d %d",n2,n3,n1);
		}
		else if(n3 <= n1 && n1 <= n2) {
			System.out.printf("\nA ordem crescente fica: %d %d %d",n3,n1,n2);
		}
		else {
			System.out.printf("\nA ordem crescente fica: %d %d %d",n3,n2,n1);
		}
		
		sc.close();

	}

}
