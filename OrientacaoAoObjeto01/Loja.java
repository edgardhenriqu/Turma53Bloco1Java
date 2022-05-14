package OrientacaoAoObjeto01;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Loja {
	public static void main(String[] args) throws ParseException, InterruptedException {
		
		Scanner ler = new Scanner(System.in);
		Cliente cliente = new Cliente();
		
		cabecalho();
		entradados(cliente, ler);
		imprimir(cliente);
	}

	
	public static void cabecalho(){
		
		System.out.println("----");
		System.out.println("Loja do Edi");
		System.out.println("Bem Vindo");
		System.out.println("---");
		System.out.println("Cadastre seus dados");
	}
	
		
		public static void imprimir(Cliente cliente) throws InterruptedException {
			
			System.out.println("\n\n----");
			System.out.println("Confirme os dados do cliente");
			System.out.println("====");
			System.out.println();
			
			Thread.sleep(1000);
			
			System.out.println("Nome: "+ cliente.getNome());
			System.out.println("Email: "+ cliente.getEmail());
			System.out.println("CPF: " + cliente.getCpf());
			
			Date dataAtual = cliente.getDtNascimento();
			String dataFormat = new SimpleDateFormat("dd/MM/yyyy").format(dataAtual);
			System.out.println("Data de Nascimento: " + dataFormat);
			
		}
		
		public static void entradados(Cliente cliente, Scanner ler) throws ParseException {
			
			SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
			
			System.out.print("Nome: ");
			cliente.setNome(ler.nextLine());
			
			System.out.print("Email: ");
			cliente.setEmail(ler.nextLine());
			
			System.out.print("CPF [Apenas numeros] ");
			cliente.setCpf(ler.nextInt());
			
			System.out.print("Data de nascimento: ");
			cliente.getDtNascimento(formatador.parse(ler.next()));
		}
}
