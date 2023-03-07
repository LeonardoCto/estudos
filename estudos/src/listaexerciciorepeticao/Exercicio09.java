package listaexerciciorepeticao;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Números a serem lidos: ");
		double qtdNumeros = teclado.nextDouble();
		double acumulador = 0;
		double maior = 0;
		double menor = 0;
		
		for (int i = 0; i < qtdNumeros; i++) {
			System.out.println("Informe o número: ");
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
		
		System.out.println("Maior número: " + maior);
		System.out.println("Menor número: " + menor );
		System.out.println("Média dos números: " + media );
		
		
		teclado.close();
	}
}
