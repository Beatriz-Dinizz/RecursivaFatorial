package view;

import controller.FatorialController;

public class Principal {

	public static void main(String[] args) {
		FatorialController fatorialController = new FatorialController();
		int n = 4;
		int resultado = fatorialController.calcularFatorial(n);
		
		System.out.println("O fatorial de " + n + " é: " + resultado);
	}
}
