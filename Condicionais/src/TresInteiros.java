/*
 * Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior e qual o menor. 
 * 
 */

import java.util.Scanner;

public class TresInteiros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro n�mero:");
		int primeiroNumero = sc.nextInt();
		
		System.out.println("Informe o segundo n�mero");
		int segundoNumero = sc.nextInt();
		
		System.out.println("Informe o terceiro n�mero");
		int terceiroNumero = sc.nextInt();
		
		if(primeiroNumero == segundoNumero && segundoNumero == terceiroNumero) {
			System.out.println("Os tr�s numeros s�o iguais");
		}
		
		else if (primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero) {
			System.out.println("O numero maior � > " +primeiroNumero);
			if (segundoNumero < terceiroNumero) {
				System.out.println("O numero menor � > "+segundoNumero);
			
			}else {
				System.out.println("O menor n�mero �  > "+ terceiroNumero);
			}
			
		}else if (segundoNumero > terceiroNumero) {
			System.out.println("O n�mero maior � > " +segundoNumero);
			if (primeiroNumero <terceiroNumero) {
				System.out.println("O numero menor � > "+primeiroNumero);
			} else {
				System.out.println("O menor n�mero � > "+ terceiroNumero);
			}
			
		}else {
			System.out.println("O maior n�mero �  > " +terceiroNumero);
			if (primeiroNumero < segundoNumero) {
				System.out.println("O menor numero �  > "+primeiroNumero);
			} else {
				System.out.println("O menor numero �  > "+segundoNumero);
			}
		}
		
		sc.close();
		}
		
}
