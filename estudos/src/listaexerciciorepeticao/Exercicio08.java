package listaexerciciorepeticao;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		double acumulador = 0;
		int opcao = 0;
		int contador = 0;

		do {
			contador++;
			System.out.println("Informe o valor da " + contador + " mercadoria: ");
			double valor = teclado.nextDouble();
			acumulador += valor;
			System.out.println("Deseja informar mais uma mercadoria? 1-Sim 2- Não");
			opcao = teclado.nextInt();

		} while (opcao == 1);
		System.out.println("Valor total em estoque " + acumulador);
		System.out.println("Valor médio do estoque " + (acumulador / contador));
		
		teclado.close();
	}

}
