package ExerciciosLacosRepeticao;

import java.util.Scanner;

/*
 * 3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)
 */

public class Ex3_While {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade=0,idade21=0,idade50=0;
		
		System.out.println("Digite sua idade: ");
		idade = sc.nextInt();
		while(idade != -99) {
			if(idade < 21) {
				idade21++;
			}
			else if(idade > 50){
				idade50++;
			}
			System.out.println("\nDigite outra idade: ");
			idade = sc.nextInt();
		}
		System.out.printf("\nTotal de pessoas com menos de 21 anos: %d \nTotal de pessoas com mais de 50 anos: %d",idade21,idade50);
	}

}
