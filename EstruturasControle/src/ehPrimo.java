import java.util.Scanner;

public class ehPrimo {

	public static void main(String[] args) {
		/*
		 * Criar um programa que receba um n�mero e diga se ele � um n�mero primo
		 */
		
		int proxNum = 0;
		
		Scanner sc = new Scanner (System.in);
		
			while ( proxNum != -999) {
				
				int resultado = 0;
					
				System.out.println("Informe o pr�ximo n�mero ou (-999 para SAIR):: ");
				proxNum = sc.nextInt();
				
				for (int i = 2; i <= proxNum /2; i++) {
					if (proxNum % i == 0) {
						resultado ++;
						break;
					}
				}
			
				if (proxNum == -999){
					System.out.println("Fim do programa");
				} else {
					System.out.println((resultado == 0) ? proxNum + " � um n�mero primo \n" : proxNum + " N�O � um n�mero primo \n");
				}
			
			}
			
		sc.close();
	}
			
}