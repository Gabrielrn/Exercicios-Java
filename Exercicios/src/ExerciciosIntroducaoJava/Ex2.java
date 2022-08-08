package ExerciciosIntroducaoJava;

/*
 * 2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias. 
 */

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua idade em dias: ");
		int dias = sc.nextInt();
		
		int anos = dias / 365;
		int meses = (dias % 365) / 30;
		int dia = (dias % 365) % 30;
		
		System.out.printf("\nVocê tem %d anos de idade ",anos);
		System.out.printf("%d meses",meses);
		System.out.printf(" %d dias",dia);
		
		sc.close();

	}

}
