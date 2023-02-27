package udemy;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
		//Tipos num�ricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;//usar letra L para informar que n�o � mais um inteiro e sim um long
		
		//Tipos n�mericos reais (flutuantes)
		float salario = 11_445.44F; //colocar F para indicar que � um float
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipo booleano
		 boolean estaDeFerias = false; //or true
		 
		 //Tipo caractere
		 char status = 'A'; // ativo
		 
		 //Dias de empresa 
		 System.out.println(anosDeEmpresa * 365);
		 
		 //N�mero de viagens 
		 System.out.println(numeroDeVoos / 2);
		 
		 //Pontos por real
		 System.out.println(pontosAcumulados / vendasAcumuladas);
		 
		 System.out.println(id + ": ganha ->" + salario);
		 System.out.println("F�rias?" + estaDeFerias);
		 System.out.println("Status : " + status);
		 
		 
				
		
		
		
		
	}

}
