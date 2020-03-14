package Restaurante;

public class Gerente extends Funcionario {
	
	private String senha;
	
	public Gerente(String nome, String matricula) {
		super.setNome(nome);
		super.setMatricula(matricula);
		super.setSalario(4000.00);
	}

	public void mudaSalario(String senha,double salario, Funcionario funcionario) {
		if(senha == this.senha) {
			funcionario.setSalario(salario);
		}
	}
	
	public void mudaSenha(String senhaAtual, String novaSenha) {
		if(senhaAtual == this.senha) {
			this.senha = novaSenha;
		}
	}
	
	public void removePedido(String senha, Mesa mesa, Item item) {
		
	}
	
	public void alteraPedido(String senha, Mesa mesa, Item itemAntigo, Item novoItem) {
		
	}
	
}
