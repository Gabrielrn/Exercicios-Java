package ExerciciosLacosRepeticao;

import java.util.Scanner;

public class Ex4_While_aula {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//fp = fator psicológico
		int idade,genero,p=1,fp,contpc=0,contmn=0,contha=0,contoc=0,contpn40=0,contpc18=0;
		
		while(p<=5) {
			System.out.println("\nEntre com a sua idade: ");
			idade = sc.nextInt();
			System.out.println("\nEntre com seu gênero: \n1 - Feminino \n2 - Masculino \n3 - Binários");
			genero = sc.nextInt();
			System.out.println("\nEntre com o fator psicológico: \n1 - Calma \n2 - Nervosa \n3 - Agressiva");
			fp = sc.nextInt();
			
			if(fp==1) {
				contpc++;
			}
			if(genero == 1 && fp == 2) {
				contmn++;//mulher nervosa
			}
			if(genero == 2 && fp == 3) {
				contha++;
			}
			if(genero == 3 && fp == 1) {
				contoc++;
			}
			if(fp == 2 && idade > 40) {
				contpn40++;
			}
			if(fp == 1 && idade < 18) {
				contpc18++;
			}
			p++;//para sair do loop infinito, senão o número de pessoas nunca vai sair de 1
		}
		System.out.println("\nNúmero de pessoas calmas: "+contpc);
		System.out.println("\nNúmero de mulheres nervosas: "+contmn);
		System.out.println("\nNúmero de homens agressivos: "+contha);
		System.out.println("\nNúmero de pessoas binárias calmas: "+contoc);
		System.out.println("\nNúmero de pessoas nervosas com mais de 40 anos: "+contpn40);
		System.out.println("\nNúmero de pessoas calmas com menos de 18 anos: "+contpc18);
	}
}
