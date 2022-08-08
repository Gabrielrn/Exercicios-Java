package ExerciciosLacosDecisoes;

import java.util.Scanner;

/*
 * 4- Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.
 */

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um n�mero qualquer: ");
		double num = sc.nextDouble();	
		
		if(num % 2 == 0) {
			System.out.printf("\nO n�mero %.2f � par!",num);
			double raiz = Math.sqrt(num);
			System.out.printf("\nO n�mero %.2f tem a ra�z quadrada de: %.2f",num,raiz);
		}
		else {
			System.out.printf("\nO n�mero %.2f � �mpar!",num);
			double potencia = Math.pow(num,2);
			System.out.printf("\nO n�mero %.2f elevado ao quadrado �: %.2f",num,potencia);
		}
		
		sc.close();
	}

}
