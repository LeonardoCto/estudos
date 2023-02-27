package listaexerciciorepeticao;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int valor = 0;
		
		do {
			System.out.println("Digite um número inteiro entre 1 e 10 : ");
			valor = teclado.nextInt();
		if(valor > 10 || valor < 1) {
			System.out.println("Número invalido!");
		}
		} while(valor < 1 || valor > 10); 
		for(int i = 1; i <= 10; i++ ) {
			System.out.println(valor + " x " + i + " = " + (valor * i));
		}
		teclado.close();
		}
}
