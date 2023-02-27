package listaexerciciosvariaveis;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o número de eleitores do município: ");
		double totalEleitores = teclado.nextDouble();
		System.out.println("Informe o número de votos em branco: ");
		double votosBrancos = teclado.nextDouble();
		System.out.println("Informe o número de votos nulos: ");
		double votosNulos = teclado.nextDouble();
		System.out.println("Informe o número de votos válidos: ");
		double votosValidos = teclado.nextDouble();
		
		double percentualValidos = (votosValidos/totalEleitores) * 100;
		double percentualBrancos = (votosBrancos/totalEleitores) * 100;
		double percentualNulos = (votosNulos/totalEleitores) *100;
		
		System.out.println("Percentual de votos validos: " +percentualValidos);
		System.out.println("Percentual de votos brancos: " +percentualBrancos);
		System.out.println("Percentual de votos nulos: " +percentualNulos);
		teclado.close();
	}

}
