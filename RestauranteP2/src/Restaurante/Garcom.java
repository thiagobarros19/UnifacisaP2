package Restaurante;

import java.util.ArrayList;

public class Garcom extends Funcionario {
	
	private double comissao;
	private String senha;
	private ArrayList<Mesa> mesa;
	
	public Garcom(String nome, String matricula) {
		super.setNome(nome);
		super.setMatricula(matricula);
		super.setSalario(1500.00);
	}
	
	private addPedido(String senha, Mesa mesa, Item item) {
		
	}
	
	public void removePedido(String senha, Mesa mesa, Item item) {
		
	}
	
	public void alteraPedido(String senha, Mesa mesa, Item itemAntigo, Item novoItem) {
		
	}
	
	public void fecharPedido(String senha, Mesa mesa) {
		
	}
	
	public double getComissao() {
		return comissao;
	}
	
	

}
