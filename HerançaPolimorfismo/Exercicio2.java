package HerançaPolimorfismo;

public class Exercicio2 {
	
	public static void main(String[] args) {
		Cachorro pinscher = new Cachorro("Max, 16,", 0);
		Cavalo mangalarga = new Cavalo("Furioso, 35,", 0);
		Preguica bentinho = new Preguica("Chucky, 10", 0);
		
		emitirSom(pinscher);
		emitirSom(mangalarga);
		emitirSom(bentinho);
		
	}

	public static void emitirSom(animal obj) {
			obj.emitirSom();
	}
}
