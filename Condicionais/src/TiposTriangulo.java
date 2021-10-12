import java.util.Scanner;

class TiposTriangulo {
	
	/*
	 * Escreva um programa que leia o valor de 3 �ngulos de um tri�ngulo e escreva
	 * se o tri�ngulo � Acut�ngulo, Ret�ngulo ou Obsus�ngulo. Sendo que:
	 * 
	 * - Tri�ngulo ret�ngulo: possui um �ngulo reto (igual a 90 graus)
	 * - Tri�ngulo Obtus�ngulo: possui um �ngulo obtuso (maior que 90 graus)
	 * - Tri�ngulo Acut�ngulo: possui tr�s angulos agudos (menos que 90graus)
	 */
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int ang1, ang2, ang3;
			
		System.out.println("Angulo do retangulo 1?");
		ang1 = sc.nextInt();
		
		System.out.println("Angulo do retangulo 2?");
		ang2 = sc.nextInt();
		
		System.out.println("Angulo do retangulo 3?");
		ang3 = sc.nextInt();
		
		if ( ang1 == 90 || ang2 == 90 || ang3 == 90)  {
			System.out.println("Triangulo retangulo");
		} else if ( ang1 > 90 || ang2 > 90 || ang3 > 90 ) {
			System.out.println("Tri�ngulo Obtus�ngulo");
		} else if (  ang1 < 90 && ang2 < 90 && ang3 < 90) {
			System.out.println("Tri�ngulo Acut�ngulo");
		} else {
			System.out.println("N�o foi poss�vel determinar o tipo");
		}
		
		sc.close();

	}

}
