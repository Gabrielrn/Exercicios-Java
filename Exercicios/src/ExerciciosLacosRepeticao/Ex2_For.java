package ExerciciosLacosRepeticao;

import java.util.Scanner;

/*
 * 2- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.
 */

public class Ex2_For {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n,impar=0,par=0,i;
		
		for(i=1;i<=10;i++) {
			System.out.print("Digite um n�mero: ");
			n = sc.nextInt();
			if(n % 2 == 0) {
				par++;
			}
			else if(n % 2 == 1){
				impar++;
			}
		}
		System.out.printf("\nN�meros pares: %d \nN�meros �mpares: %d",par,impar);
	}

}
