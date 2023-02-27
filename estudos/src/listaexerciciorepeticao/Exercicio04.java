package listaexerciciorepeticao;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double acumulador = 0;
		for(int i = 0; i < 3; i++) {
			System.out.println("Digite um número: ");
			double numero = teclado.nextDouble();
			acumulador += numero;
		}
		double media = acumulador / 10;
		System.out.println("Média: " + media);
		teclado.close();
	}

}
