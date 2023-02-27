package listaexerciciosvariaveis;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a primeira nota do aluno: ");
		double nota1 = teclado.nextDouble();
		System.out.println("Digite a segunda nota do aluno: ");
		double nota2 = teclado.nextDouble();
		System.out.println("Digite a terceira nota do aluno: ");
		double nota3 = teclado.nextDouble();
		
		double media = (nota1 + nota2 + nota3 / 3);
		
		System.out.println("Média do aluno: " + media);
		teclado.close();
	}

}
