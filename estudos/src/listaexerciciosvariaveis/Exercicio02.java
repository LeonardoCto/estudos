package listaexerciciosvariaveis;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe a idade em anos, meses e dias ");
		System.out.println("Informe os anos: ");
		int anos = teclado.nextInt();
		System.out.println("Informe os meses: ");
		int meses = teclado.nextInt();
		System.out.println("Informe os dias: ");
		int dias = teclado.nextInt();
		
		int tempoVida= (anos *360) + (meses *30) + dias;
		System.out.println("O tempo de vida da pessoa vivida em dias é de: " + tempoVida);
		teclado.close();
				
	}

}
