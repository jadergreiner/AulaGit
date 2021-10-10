/*
 * Escreva um programa para ler o ano de nascimento de uma pessoa e 
 * escrever uma mensagem que diga se ela poder� ou n�o votar este ano 
 * (n�o	�	necess�rio	considerar	o	m�s	em	que	ela nasceu).
 */

import java.util.Scanner;

public class VerificaIdadeVotacao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int ano;
		
		System.out.println("Escreva seu ano de nascimneto: ");
		ano = sc.nextInt();
		
		if (2021 - ano >=16 && 2021 - ano <=17) {
			System.out.println("Seu voto � facultativo! ");
		} else if (2021 - ano >=18) {
			System.out.println("O voto � obrigat�rio");
		} else if (2021 - ano < 0) {
			System.out.println("Mas voc� nem nasceu ainda");
		} else {
			System.out.println("Voc� N�o pode votar");
		}
		
		sc.close();
	}

}
