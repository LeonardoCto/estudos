package listaexerciciorepeticao;

import java.util.Scanner;

public class Exercicio05 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double contador = 0;
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite um número: ");
			double numero = teclado.nextDouble();
			if(numero < 0) {
				contador++;
			}
		}
			System.out.println("Quantidade de números negativos: " + contador);
			
			teclado.close();
		}

	}


