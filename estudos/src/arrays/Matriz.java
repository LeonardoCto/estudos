package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Quantos alunos? ");
		int qtdAlunos = teclado.nextInt();

		System.out.println("Quantos notas por aluno? ");
		int qtdNotas = teclado.nextInt();

		double[][] notasDaTurma = new double[qtdAlunos][qtdNotas];// CRIANDO ARRAY

		double total = 0;
		for (int a = 0; a < notasDaTurma.length; a++) { // PERCORRE OS ALUNOS (ARRAY EXTERNO)
			for (int n = 0; n < notasDaTurma[a].length; n++) {// PERCORRE AS NOTAS (ARRAY INTERNO)

				System.out.printf("Informe a nota %d do aluno %d: ", n + 1, a + 1);// N+1 E A+1 PARA O SYSOUT PERGUNTAR
																					// PELA NOTA DO ALUNO 1 E NÃO DO
																					// ALUNO 0
				notasDaTurma[a][n] = teclado.nextDouble(); // ALUNO E NOTA RECEBE O VALOR QUE FOI DIGITADO
				total += notasDaTurma[a][n];

			}

		}
		double media = total / (qtdAlunos * qtdNotas);
		System.out.println("Média da turma é " + media);

		for (double[] notasDoAluno : notasDaTurma) {
			System.out.println(Arrays.toString(notasDoAluno));

			teclado.close();

		}
	}
}
