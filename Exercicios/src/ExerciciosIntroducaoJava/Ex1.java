package ExerciciosIntroducaoJava;

/*
 * 1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias.
 */

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int diasAno = 365, diasMes = 30;
		
		System.out.print("Digite sua idade no formato anos, meses e dias: ");
		System.out.print("\nAnos = ");
		int anos = sc.nextInt();
		System.out.print("\nMeses = ");
		int meses = sc.nextInt();
		System.out.println("\nDias = ");
		int dias = sc.nextInt();
		
		dias = dias + (anos * diasAno) + (meses * diasMes);
		System.out.println("\nIdade em dias = " + dias);
		
		sc.close();
	}

}
