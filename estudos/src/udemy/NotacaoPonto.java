package udemy;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		String s = "Bom dia X";
		s = s.replace("X", "Senhora"); //susbtitui uma palavra por outra 
		
		s = s.toUpperCase();//converte string toda em letra maiuscula
		
		s = s.concat("!!!"); //concatenar
		
		s = s.toLowerCase();//converte string toda em letra minuscula 
		
		System.out.println(s);
		
		System.out.println("Leo".toUpperCase());
		
		//Mesma coisa de cima armazenando em uma variavel
		
		String x = "Leo".toUpperCase();
		System.out.println(x);
		
		// 
		
		String y = "Bom dia X".replace("X" , "Gui").toUpperCase().concat("!!!");
		System.out.println(y);
		
		//Tipos Primitivos n�o recebem o operador "."
		
		

	}

}
