package HerançaPolimorfismo;

public class Preguica extends animal {
	
	public Preguica(String nome, int idade) {
			super(nome, idade);
	}
	
	@Override
	public void emitirSom() {
		System.out.println(".....ÂNW");
	}
	
	public void subirArvore() {
			System.out.println("Subindo Árvores!");
	}
}
