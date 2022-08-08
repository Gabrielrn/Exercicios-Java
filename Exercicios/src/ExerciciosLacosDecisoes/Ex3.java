package ExerciciosLacosDecisoes;

import java.util.Scanner;

/*
 * 3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto
 */

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual sua idade: ");
		int idade = sc.nextInt();
		
		if(idade >= 10 && idade <= 14) {
			System.out.printf("\nSua idade é %d, você está na categoria Infantil!",idade);
		}
		else if(idade >= 15 && idade <= 17) {
			System.out.printf("\nSua idade é %d, você está na categoria Juvenil!",idade);
		}
		else if(idade >= 18 && idade <= 25) {
			System.out.printf("\nSua idade é %d, você está na categoria Adulto!",idade);
		}
		else {
			System.out.printf("\nSua idade é %d, ERRO CATEGORIA NÃO ENCONTRADA!",idade);
		}
		
		sc.close();

	}

}
