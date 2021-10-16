import java.util.Scanner;

public class calculaMediaAlunos {

	public static void main(String[] args) {
		/* 
		 * Calcular m�dia de X alunos.
		 * Notas v�lidas: entre 0 e 10
		 * Contar quantas notas v�lidas foram digitadas
		 * Usu�rio deve digitar -1 para sair do programa e ser informado da sua m�dia e quantidade de notas
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int qtdeNotas = 0;
		double total = 0.0;
		double nota = 0.0;
		
		while(nota != -1) {
			System.out.println("Informe a pr�xima Nota ou (-1) para sair ?");
			nota = sc.nextDouble();
			
			if( nota >= 0 && nota <=10) {
				qtdeNotas ++;
				total =+ nota;
			} else if (nota == -1) {
				System.out.println("\nEncerrando o programa \n ");
				System.out.println("O total de notas v�lidas digitadas foram :: "+qtdeNotas);
				System.out.printf("A m�dia das notas dos alunos � de %.2f" ,total);
			} else {
				System.out.println("Nota inv�lida! Informe valores entre 0 e 10");
			}
		}
		
		sc.close();
	}
		
}
