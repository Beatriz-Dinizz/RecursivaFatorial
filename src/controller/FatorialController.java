package controller;

public class FatorialController {

	public FatorialController() {
		super();
	}
	
	public int calcularFatorial(int n) {
		// Condição de parada: quando o número for menor ou igual a 1 ou 0, o fatorial é 1
		if(n <= 1) {
			return 1;
		} else
		// Relação de chamada dos passos: se o número for maior que 1 chama a função calcularFatorial 
		// pois o fatorial de n é igual a n vezes o fatorial de (n - 1)
			return n * calcularFatorial(n - 1);
	}
}
