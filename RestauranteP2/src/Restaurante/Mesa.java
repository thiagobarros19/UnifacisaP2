package Restaurante;

import java.util.ArrayList;

public class Mesa {
	
	private int numero;
	private Arraylist<Item> pedidos;
	private boolean reserva;
	
	public Mesa(int numero) {
		this.numero = numero;
		this.reserva = false;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public boolean isReserva() {
		return reserva;
	}

	public void setReserva(boolean reserva) {
		this.reserva = reserva;
	}
	
	
	

}
