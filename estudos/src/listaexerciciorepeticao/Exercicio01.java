package listaexerciciorepeticao;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o primeiro número: ");
		double numero1 = teclado.nextDouble();
		double numero2 = 0;
		
		do {
			System.out.println("Informe o segundo número: ");
			numero2  = teclado.nextDouble();
		if(numero2 == 0) {
				System.out.println("Número inválido!");
		
			}
		} 
		while (numero2 ==0);
		
		double media = (numero1/numero2);
		System.out.println("Resultado: " + media);
		teclado.close();
		
	}
}