import java.util.Scanner;

public class pesquisaPrefeitura {

	public static void main(String[] args) {
		/*
		 * 1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o sal�rio e n�mero de filhos. A prefeitura deseja saber:  
a) m�dia do sal�rio da popula��o;
b) m�dia do n�mero de filhos;
c) maior sal�rio;
d) percentual de pessoas com sal�rio at� R$100,00.
		 */
		
		double salario =0.00;
		int nFilhos = 0;
		double maiorSalario = 0;
		double totSalario = 0.00;
		int totFilhos = 0;
		int salarioAcima100 = 0;
		
		for (int i=1; i<=3; i++ ) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Salario da pessoa ?" +i);
			salario = sc.nextDouble();
			System.out.println("Numero de filhos da pessoa ?" +i);
			nFilhos = sc.nextInt();
			
			
			totSalario = totSalario + salario;
			
			totFilhos = totFilhos + nFilhos;
			
			if (salario <=100) {
				salarioAcima100 += 1;
			}
			
			
			if (salario > maiorSalario) {
				maiorSalario = salario;
			}
					
		}
		
		System.out.println("Media do salario � " + totSalario / 3);
		System.out.println("Media do numero de filhos  � " + totFilhos / 3);
		System.out.println("Maior salario " + maiorSalario);
		System.out.printf("Percentual de pessoas at� 100 �  %.2f %%" , (double)salarioAcima100 / 3 *100);
		
	}
	
}
