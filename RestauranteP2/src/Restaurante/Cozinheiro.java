package Restaurante;

import java.util.ArrayList;

public class Cozinheiro extends Funcionario {
	
	private ArrayList<Item> pedidos;
	
	public Cozinheiro(String nome, String matricula) {
		super.setNome(nome);
		super.setMatricula(matricula);
		super.setSalario(2000.00);
	}
	
	public void addPedido(Item item) {
		
	}

}
