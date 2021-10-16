package animais;

public class Mamiferos extends Animais {
	
	
	@Override
	public void comunicar() {
		System.out.println("Os animais podem se comunicar por meio de v�rios sinais. Eles podem ser qu�micos ");
		System.out.println("que dependem do olfato e do paladar), ac�sticos (sons), visuais (cores, luminosidade e movimentos), t�teis (car�cias) e el�tricos!");
	}
	
	@Override
	public void movimentar() {
		System.out.println("Os mam�feros normalmente deslocam-se com o aux�lio dos seus membros!");
	}
	
	@Override
	public void apresentacao() {
		System.out.println("Apresenta��o dos Mamiferos \n");
		
		movimentar();
		comunicar();
	}
	
}
