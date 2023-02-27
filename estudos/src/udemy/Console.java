package udemy;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		System.out.print("Digite seu nome: ");
		String nome = teclado.nextLine();
	
		System.out.print("Digite seu Sobrenome: ");
		String sobrenome = teclado.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = teclado.nextInt();
		
		System.out.println("Digite seu salário: ");
		double salario = teclado.nextDouble();
		
 
		System.out.printf ("%s %s tem %d anos e recebe R$%.2f reais por mes", nome, sobrenome, idade, salario );
		
	
	 teclado.close();
}
	

}
