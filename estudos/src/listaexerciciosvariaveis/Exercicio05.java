package listaexerciciosvariaveis;

import java.util.Scanner;

public class Exercicio05 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o modelo do veículo: ");
		String modelo = teclado.nextLine();
		System.out.println("Custo de fábrica: ");
		double custoFabrica = teclado.nextDouble();
		
		double custoFinal = (custoFabrica + (custoFabrica * 0.28) + (custoFabrica * 0.45));
		
		System.out.println("Modelo do veículo: " + modelo);
		System.out.println("Custo final: " + custoFinal);
		teclado.close();
	}
}
