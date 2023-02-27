package listaexerciciorepeticao;

import java.util.Scanner;

public class Exercicio07 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o total de mercadorias em estoque: ");
		double mercadoriasEstoque = teclado.nextDouble();
		
		double acumulador = 0;
		for(int i = 1; i <= mercadoriasEstoque; i++) {
			System.out.println("Informe o valor da " + i + " mercadoria: ");
			double contadorValorMercadoria = teclado.nextDouble();
			acumulador += contadorValorMercadoria;
			
		}
		System.out.println("Valor total do estoque: " + acumulador );
		System.out.println("Valor médio do estoque: " + acumulador/mercadoriasEstoque);
		
		teclado.close();

	}

}
