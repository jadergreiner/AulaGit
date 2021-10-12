import java.util.Scanner;

/*
 * Escreva um programa que leia as medidas dos lados de um tri�ngulo e escreva
 * se ele � Equil�tero, Is�sceles ou Escaleno. Sendo que:
 * 
 *  Tri�ngulo equil�tero: possui os tr�s lados iguais;
 *  Tri�ngulo Is�scele: possui 2 lados iguais
 *  Tri�ngulo Escaleno: possui 3 lados diferentes
 */

public class MedidasLado {

	public static void main(String[] args) {
		
		int ladoA, ladoB, ladoC;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe a medida do lado A");
		ladoA = sc.nextInt();
		
		System.out.println("Informe a medida do lado B");
		ladoB = sc.nextInt();
		
		System.out.println("Informe a medida do lado C");
		ladoC = sc.nextInt();
		
		if ( ladoA != ladoB && ladoB != ladoC && ladoA != ladoC ) {
				System.out.println("Tri�ngulo escaleno - possui1 os tr�s lados diferentes >> " + ladoA + " - " + ladoB + " - " + ladoC);
		} else if  ( (ladoA == ladoB || ladoB == ladoC || ladoA == ladoC) && ( ladoA != ladoB || ladoB != ladoC || ladoA != ladoC ) ) {
				System.out.println("Tri�ngulo Is�scele - possui dois lados iguais >> " + ladoA + " - " + ladoB + " - "+  ladoC);
		} else if (ladoB == ladoC) {
			System.out.println("Tri�ngulo equilatero - possui os tr�s lados iguais >> " + ladoA + " - " + ladoB + " - "+  ladoC);
		} else {
			System.out.println("Outra coisa >> "  + ladoA + " - " + ladoB + " - "+  ladoC);
		}
			
		
		sc.close();

	}

}
