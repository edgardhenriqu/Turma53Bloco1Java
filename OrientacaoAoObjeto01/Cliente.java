package OrientacaoAoObjeto01;

import java.util.Date;

public class Cliente {
	
	public static void main(String args[])
	{
	System.out.println("\n\nO Cliente está escolhendo o produto");
	}
	
	private String nome, email;
	private Date dtNascimento;
	private Integer cpf;
	
	public String getNome( ) {
			return nome;
	}
	
	public void setNome(String nome) {
			this.nome = nome;
	}
	
	public String getEmail( ) {
		return email;
	}
	
	public void setEmail(String email) {
			this.email = email;
	}
	
	public Date getDtNascimento( ) {
			return dtNascimento;
	}
	
	public void getDtNascimento(Date date) {
			this.dtNascimento = date;
	}
	
	public Integer getCpf( ) {
			return cpf;
	}
	
	public void setCpf(Integer cpf) {
			this.cpf = cpf;
	}
	

}
