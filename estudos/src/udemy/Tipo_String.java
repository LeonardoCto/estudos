package udemy;

public class Tipo_String {

	public static void main(String[] args) {
		
		System.out.println("Bom dia".charAt(1)); //comando para pegar letras dentro da frase
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));//adiciona algo ao final da String
		
		System.out.println(s.startsWith("Boa"));//V OU F palavra inicial String
		
		System.out.println(s.startsWith("boua"));
		
		System.out.println(s.endsWith("tarde"));
		
		System.out.println(s.length());//retorna tamanho da string
		
		System.out.println(s.equals("boa tarde"));//V OU F se a string é igual a frase digitada
		
		System.out.println(s.equalsIgnoreCase("boa tarde"));//ignorando letras maiusculas
		
		String nome = "Pedro";
		String sobrenome = "Santos";
		int idade = 33;
		double salario = 12345.987F;
		
		System.out.println("\nNome: " + nome +"\nSobrenome: " + sobrenome +
				"\nIdade: " + idade + "\nSalário: " + salario);
		 
		System.out.printf("%s %s tem %d anos e recebe R$%.2f reais por mês\n", nome, sobrenome, idade, salario); //% seguido letra inicial do tipo da variavel substitui texto
		
		System.out.println("Frase qualquer".contains("qual"));//se contem a palavra informada na varialvel
		System.out.println("Frase qualquer".indexOf("qual"));//informa posicao da palavra
		System.out.println("Frase qualquer".substring(6, 8));// controla resultado da string de 6 a 8 vai incluir ate caractere 7 sempre 1 a menos
		
		
	}

}
