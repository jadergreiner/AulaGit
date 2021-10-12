import java.util.Scanner;

/*
 * Fa�a um algoritmo que escreva as seguintes mensagens:
 * - Caso o n�mero de lados seja inferior a 3 escreva: N�O � UM POL�GONO;
 * - Caso o n�mero de lados seja superior a 5 escreva: POL�GONO N�O IDENTIFICADO;
 */
public class ContaLados {

	public static void main(String[] args) {
		
		int qtdLados;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe a quantidade de lados: ");
		qtdLados = sc.nextInt();
		
		//utilizando if ternario
		System.out.println(
				
				(qtdLados < 3 ) ? "N�O � UM POL�GONO" : (qtdLados > 5) ? "POL�GONO N�O IDENTIFICADO" : "VALOR INFORMADO INV�LIDO");
		
		sc.close();

	}

}
