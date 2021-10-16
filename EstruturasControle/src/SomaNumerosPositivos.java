
import java.util.Scanner;

public class SomaNumerosPositivos {

	public static void main(String[] args) {
		
		/*
		 *  Criar um programa que, enquanto estiver recebendo n�meros positivos,
		 *  imprime no console a soma dos n�meros inseridos, caso receba um
		 *  n�mero negativo, encerre o programa
		 */ 

		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		int soma = 0;
		
		while(i >=0) {
			
			System.out.println("Informe um n�mero inteiro para somar ou um n�mero negativo para SAIR");
			i = sc.nextInt();
			
			if ( i >= 0) {
				soma += i;
				System.out.println("A soma acumulada � " + soma);
			} else {
				System.out.println("SAIU DO PROGRAMA");
			}
			
		}
		
		sc.close();
	}
}
