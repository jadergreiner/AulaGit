/*
 * Fa�a um programa que pede duas notas de um aluno. Em seguida ele deve calcular a m�dia do aluno e dar o seguinte resultado:
  A mensagem "Aprovado", se a m�dia alcan�ada for maior ou igual a sete;
  A mensagem "Reprovado", se a m�dia for menor do que sete;
  A mensagem "Aprovado com Distin��o", se a m�dia for igual a dez.
 */

import java.util.Locale;
import java.util.Scanner;

public class CalculaMedia {

	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("en", "US"));
		
		double nota1, nota2, media;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a primeiro nota");
		nota1 = sc.nextDouble();
		System.out.println("Digite a segunda nota");
		nota2 = sc.nextDouble();
		
		media = (nota1 + nota2) /2 ;
		
		if (media == 10) {
			System.out.printf("Aprovado com distin��o :: %.2f", media);
		} else if (media <7) {
			System.out.printf("Reprovado com media :: %.2f" ,media);
		} else {
			System.out.printf("Aprovado com m�dia :: %.2f", media);
		}
		sc.close();
	}

}
