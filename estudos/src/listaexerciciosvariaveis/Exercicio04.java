package listaexerciciosvariaveis;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o salário do funcionário: ");
		double salario = teclado.nextDouble();
		System.out.println("Informe o Data base: ");
		double dataBase = teclado.nextDouble();
		double novoSalario = salario + (salario * (dataBase/100));
		System.out.println("O salário atual é " + salario);
		System.out.println("O novo salário é " + novoSalario);
		teclado.close();

	}

}
