package listaexerciciosvariaveis;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe quantos KG tem o saco de ração: ");
		double sacoRacaoKg = teclado.nextDouble();
		System.out.println("Informe em gramas a quantidade de ração dada para o Caramelo: ");
		double racaoCaramelo = teclado.nextDouble();
		System.out.println("Informe em gramas a quantidade de ração dada para o Frajola: ");
		double racaoFrajola = teclado.nextDouble();
		
		double consumoDiario = racaoCaramelo + racaoFrajola;
		double kgRestante = (sacoRacaoKg * 1000) - (consumoDiario*5);
		System.out.println("Após 5 dias ainda resta " + kgRestante + "KG de ração");
		teclado.close();
		
	}

}
