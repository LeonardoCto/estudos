package arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {
		double[] notasAlunoA = new double[4];
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;

		// ARRAYS CLASSE

		System.out.println(Arrays.toString(notasAlunoA)); // IMPRIMINDO ARRAY
		System.out.println(notasAlunoA[0]);// IMPRIMINDO INDICE 0 DO ARRAY

		double totalAlunoA = 0;
		for (int i = 0; i < notasAlunoA.length; i++) { // .LENGHT ATRIBUTO QUE PEGA O COMPRIMENTO INTEIRO
			totalAlunoA += notasAlunoA[i];
		}

		System.out.println(totalAlunoA / notasAlunoA.length); // MEDIA NOTAS A

		double notaArmazenada = 5.9; // VARIAVEL DENTRO DO ARRAY
		double[] notasAlunoB = { 6.9, 8.9, notaArmazenada, 10 }; // ARRAY COM DADOS JA LANÇADOS

		double totalAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];

		}
		System.out.println(totalAlunoB / notasAlunoB.length);

	}

}
