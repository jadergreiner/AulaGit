package animais;

public class Aves extends Animais {
	
	
	@Override
	public void movimentar() {
		System.out.println("A maioria das aves se movimenta com as asas!");
	}
	
	@Override
	public void comunicar() {
		System.out.println("Atrav�s do canto elas se comunicam entre seu pr�prio grupo social ou com outras esp�cies! \n");
	}
	
	@Override
	public void apresentacao() {
		System.out.println("Apresenta��o das Aves \n");
		
		movimentar();
		comunicar();
	}
	
}

