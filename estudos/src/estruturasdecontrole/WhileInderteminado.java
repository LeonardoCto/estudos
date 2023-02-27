package estruturasdecontrole;

import java.util.Scanner;

public class WhileInderteminado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner teclado = new Scanner(System.in);
		
		String valor = "";
		
		while(!valor.equalsIgnoreCase("Sair")) {
			System.out.println("Voc� diz: ");
			valor = teclado.nextLine();
		}
		teclado.close();
	}



}
