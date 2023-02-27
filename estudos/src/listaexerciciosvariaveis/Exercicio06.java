package listaexerciciosvariaveis;

import java.util.Scanner;

public class Exercicio06 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe a quantidade de carros vendidos: ");
		double carrosVendidos = teclado.nextDouble();
		System.out.println("Informe o valor total se vendas: ");
		double totalVendas = teclado.nextDouble();
		System.out.println("Informe o salário fixo do vendedor: ");
		double salarioFixo = teclado.nextDouble();
		System.out.println("Informe o valor por carro vendido: ");
		double valorPorCarro = teclado.nextDouble();
		
		double salarioFinal = (salarioFixo + (valorPorCarro*carrosVendidos) + (totalVendas * 0.05));
		
		System.out.println("O salário final do vendedor é de: " + salarioFinal);
		teclado.close();
	}
}
