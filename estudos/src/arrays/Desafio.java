package arrays;

import java.util.Scanner;

public class Desafio {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Quantas notas você deseja informar?");
		int qtdNotas = teclado.nextInt();

		double[] notas = new double[qtdNotas];// CRIANDO ARRAY DE NOTAS

		for (int i = 0; i < notas.length; i++) { // FOR PARA PERGUNTAR A NOTA E INSERILO DENTRO DO ARRAY
			System.out.println("Informe a nota " + (i + 1) + ": ");
			notas[i] = teclado.nextDouble();

		}
		double total = 0;
		for (double nota : notas) {
			total += nota; // SOMANDO TODAS AS NOTAS
		}

		double media = total / notas.length;
		System.out.println("A média é " + media);

		teclado.close();

	}
}