package ExerciciosLacosRepeticao;

import java.util.Scanner;

/*
 *4 - Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 o número de pessoas calmas;
 o número de mulheres nervosas;
 o número de homens agressivos;
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;
 o número de pessoas calmas com menos de 18 anos.
 */

public class Ex4_While {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade,pCalma=0,fNervoso=0,hAgressiva=0,oCalmo=0,oNervoso=0,oAgressiva=0,pessoas=1,temperamento=0,pNervosa=0,pCalma1=0;
		String sexo;
		
		while(pessoas <= 3) {
			System.out.println("Digite sua idade: ");
			idade = sc.nextInt();
			System.out.println("\nQual seu sexo? 1-feminino / 2-masculino / 3-Outros");
			sexo = sc.next();
			System.out.println("\nTemperamento: 1 - se a pessoa era calma; 2 - se a pessoa era nervosa; 3 - se a pessoa era agressiva: ");
			temperamento = sc.nextInt();
			
			if(temperamento == 1 && sexo == "feminino" || temperamento == 1 && sexo == "masculino") {
				pCalma1++;
			}
			else if(temperamento == 2 && sexo == "feminino" || temperamento == 2 && sexo == "masculino") {
				fNervoso++;
			}
			else if(temperamento == 3 && sexo == "feminino" || temperamento == 3 && sexo == "masculino") {
				hAgressiva++;
			}
			else if(temperamento == 1 && sexo == "outro") {
				oCalmo++;
			}
			else if(temperamento == 2 && sexo == "outro") {
				oNervoso++;
			}
			else if(temperamento == 3 && sexo == "outro") {
				oAgressiva++;
			}
			if(idade > 40) {
				pNervosa++;
			}
			else if(idade < 18) {
				pCalma1++;
			}
			pessoas++;
		}
		System.out.println("\nNúmero de pessoas calmas: "+pCalma1);
		System.out.println("\nNúmero de mulheres nervosas: "+fNervoso);
		System.out.println("\nNúmero de homens agressivos: "+hAgressiva);
		System.out.println("\nNúmero de outros calmos: "+oCalmo);
		System.out.println("\nO número de pessoas nervosas com mais de 40 anos: "+pNervosa);
		System.out.println("\nO número de pessoas calmas com menos de 18 anos: "+pCalma1);
	}

}
