
public class ImpostoRenda {

	public static void main(String[] args) {
		
		double salario = 3550.0;
		
		if (salario < 2500) {
			System.out.println("A sua aliquota � de 15%");
			System.out.println("Voc� pode deduzir at� R$ 350.00");
		} else if (salario < 3500){ 
			System.out.println("A sua aliquota � de 23%");
			System.out.println("Voc� pode deduzir at� R$ 630.00");
		} else {
			System.out.println("A sua aliquota � de 28%");
			System.out.println("Voc� pode deduzir at� R$ 750.00");
		}

	}

}

