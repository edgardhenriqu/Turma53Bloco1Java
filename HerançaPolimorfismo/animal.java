package HerançaPolimorfismo;

public abstract class animal {
	
		private String nome;
		protected int idade;
		
		
		public animal(String nome, int idade) {
			
		}

		protected void Animal(String nome, int idade) {
				this.nome = nome;
				this.idade = idade;
		}
		
		protected String Nome() {
				return this.nome;
		}
		
		protected int Idade() {
				return this.idade;
		}
		
		public void emitirSom() {
		

}
}
