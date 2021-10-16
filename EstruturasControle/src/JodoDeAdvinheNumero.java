
import java.util.Random;
import java.util.Scanner;

public class JodoDeAdvinheNumero {

	public static void main(String[] args) {
		
		/*
		 * 1. Jogo da adivinha��o: Tentar adivinhar um n�mero entre 0 - 100.
		 * Armazene um n�mero aleat�rio em uma vari�vel. O jogador tem 10
		 * tentativas para adivinhar o n�mero gerado. Ao final de cada tentativa,
		 * imprima a quantidade de tentativas restantes, e imprima se o n�mero
		 * inserido � maior ou menor do que o n�mero armazenado.
		 */ 
		
		Random random = new Random();
		
		int numOculto = random.nextInt(100);
		
		for (int i=1; i<=10 ; i ++) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Informe um n�mero entre 0 e 100");
			int numInformado = sc.nextInt();
			
			if (numInformado == numOculto) {
				System.out.println("PARAB�NS! Voc� acertou na tentativa n�mero "+i);
			} else if (i <=10) {
				
				// i � o numero de tentativas
				System.out.println("Que pena!! Voc� errou..");
				System.out.println("Voc� ainda tem " + (10 - i) + "tentativas \n");
				System.out.println((numInformado > numOculto) ? "O n�mero oculto � menor \n" : "O n�mero oculto � maior \n");
				
			} else {
				System.out.println("Que pena! Chegou ao fim do jogo sem revelar o n�mero oculto");
			}
		
			sc.close();
		
		}

	}

}
