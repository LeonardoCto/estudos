package listaexerciciosvariaveis;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe um número inteiro: ");
		int numero = teclado.nextInt();
		
		System.out.println("Número sucessor: " + (numero +1));
		System.out.println("Número antecessor: " + (numero -1));
		teclado.close();

	}

}
