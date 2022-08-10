package ExerciciosArray;

import java.util.Scanner;

/*
 * 3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
 */

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] valores = new int[3][3];
		int contNumMaior=0,i,j;
		
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				System.out.println("\nEntre com um número: ");
				valores[i][j] = sc.nextInt();
				
				if(valores[i][j] > 10) {
					contNumMaior++;
				}
			}
		}
		System.out.println("\nQuantidade de números maiores que 10: "+contNumMaior);
	}

}
