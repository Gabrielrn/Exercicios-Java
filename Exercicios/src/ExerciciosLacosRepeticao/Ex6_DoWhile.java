package ExerciciosLacosRepeticao;

import java.util.Scanner;

/*
 * Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
0(zero).
 */

public class Ex6_DoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n,soma=0,cont=0;
		double media=0;
		System.out.println("Este programa receber� v�rios n�meros inteiros, e mostrar� a m�dia dos n�meros multiplos de 3, para sair digite 0");
		do {
			System.out.println("\nDigite um n�mero: ");
			n = sc.nextInt();
			if(n % 3 == 0) {
				soma += n;
				cont++;
			}
		}while(n != 0);
		cont -=1;
		System.out.println("\nM�dia dos n�meros multiplos de 3: "+soma/cont);
	}
	
}
