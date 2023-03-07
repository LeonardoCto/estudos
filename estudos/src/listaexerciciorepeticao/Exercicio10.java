package listaexerciciorepeticao;

import java.util.Scanner;

public class Exercicio10 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		 int opcao = 0;
		 double acumuladorSalario = 0;
		 double maiorSalario = 0;
		 int contadorSalarioMenorMil = 0;
		 int contadorSalario = 0;
		 int acumuladorFilhos = 0;
		 int contadorFilhos = 0;
		 
		 do {
			 System.out.println("Informe o nome do habitante: ");
			 String nome = teclado.next();
			 
			 System.out.println("Informe o sal�rio de " + nome);
			 double salario = teclado.nextDouble();
			 acumuladorSalario += salario;
			 contadorSalario++;
			 if(salario > maiorSalario) {
				 maiorSalario = salario;
			 }
			 if(salario < 1000) {
				 contadorSalarioMenorMil++;
			 }
			 System.out.println("Informe a quantidade de filhos: ");
			 int qntdFilhos = teclado.nextInt();
			 acumuladorFilhos += qntdFilhos;
			 contadorFilhos++;
			 System.out.println("Deseja informar mais um habitante? 1-Sim 2- N�o ");
			 opcao =teclado.nextInt();
		 }while(opcao ==1 );
		 
		 double mediaSalario = acumuladorSalario/contadorSalario;
		 System.out.println("M�dia de sal�rios: "+ mediaSalario);
		 
		 double mediaFilhos = acumuladorFilhos/contadorFilhos;
		 System.out.println("M�dia de filhos: " + mediaFilhos);
		 
		 System.out.println("Maior sal�rio: " + maiorSalario);
		
		double percentualSalarioMenorMil = (contadorSalarioMenorMil * 100) / contadorSalario;
		System.out.println("Percentual sal�rio menor que mil : " + percentualSalarioMenorMil);
		
		teclado.close();
	}

}
