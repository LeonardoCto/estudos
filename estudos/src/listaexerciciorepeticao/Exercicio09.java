package listaexerciciorepeticao;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("N�meros a serem lidos: ");
		double qtdNumeros = teclado.nextDouble();
		double acumulador = 0;
		double maior = 0;
		double menor = 0;
		
		for (int i = 0; i < qtdNumeros; i++) {
			System.out.println("Informe o n�mero: ");
			double numero = teclado.nextDouble();
			acumulador += numero;
			
			if(numero > maior || i == 0) {
				maior = numero; 
			}
			if(numero < menor || i == 0) {
				menor = numero;
			}
		}
		
		
		double media = acumulador / qtdNumeros;
		
		System.out.println("Maior n�mero: " + maior);
		System.out.println("Menor n�mero: " + menor );
		System.out.println("M�dia dos n�meros: " + media );
		
		
		teclado.close();
	}
}
