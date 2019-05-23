package demo;

import java.util.Scanner;

public class DemoTranslation {
	/**
	 * run this program using the console pauser or add your own getch, system("pause") or input loop
	 */
	public static void main(String[] args) {
		int i = 0;
		int tam = 9;
		int[] vetor = new int[tam];
		int soma = 0;
		System.out.println("digite 9 digitos:");

		while(i < tam) {
			vetor[i] = STDIN_SCANNER.nextInt();
			i++;
		}
		i = 0;
		while(i < tam) {
			if(vetor[i] % 2 == 0) {
				System.out.println("numero pares:" + vetor[i]);
				soma = vetor[i] + soma;
			} else {
				System.out.println("numero impares:" + vetor[i]);
			}
			i++;
		}
		System.out.println("soma: " + soma);
	}

	public final static Scanner STDIN_SCANNER = new Scanner(System.in);
}
