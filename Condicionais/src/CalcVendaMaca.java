import java.util.Scanner;

/*
 * As ma�as custam R$ 0,30 cada se forem compradas menos do que uma d�zia
 * se forrem comprados ao menos 12, o valor unit�rio � de R$ 0,25
 * 
 * escreva um programa que leia o n�mero de ma�as compradas, calcule e escreva
 * o valor total da compra
 */
public class CalcVendaMaca {

	public static void main(String[] args) {
		
		int qtdMacas; // quantidade de ma�as compradas (informado no console)
		double totalCompra; // pre�o de venda1 (menor que 12) e pre�o de venda 2 (a partir de 12)
		
		double pv1 = 0.3;  // pre�o de venda1 (menor que 12)
		double pv2 = 0.25; // pre�o de venda2 (a partir de 12)
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informa a quantidade de ma�as que deseja comprar");
		qtdMacas = sc.nextInt();
		
		if ( qtdMacas >=12 ) {
			totalCompra = qtdMacas * pv2;
			System.out.println("Voc� est� comprando "+ qtdMacas + " ma�as");
			System.out.printf("Pela quantidade seu valor promocional � de R$ %.2f   e o total da compra � de R$ %.2f", pv2, totalCompra );
		} else {
			totalCompra = qtdMacas * pv1;
			System.out.println("Voc� est� comprando "+ qtdMacas + " ma�as");
			System.out.printf("Seu valor por unidade � de R$ %.2f e o total da compra � de R$ %.2f", pv1, totalCompra );
		}
		
		sc.close();

	}

}
