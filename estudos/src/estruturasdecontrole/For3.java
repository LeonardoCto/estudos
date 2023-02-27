package estruturasdecontrole;

public class For3 {

	public static void main(String[] args) {
		
		
		//PARA PODER USAR A VARIAVEL DO FOR FORA DELE É NECESSÁRIO DECLARARA FORA DO LAÇO POR EXEMPLO.
		//INT I = 0;
		//for(; i < 10; i ++) { } LAÇO FECHADO AQUI
		// System.out.println(i); E AQUI AINDA CONSEGUIMOS PUXAR A VARIAVEL
		//
		for(int i =0; 	i < 10; i ++) {
			for(int j =0; j < 10; j++) {
				System.out.printf("[%d%d]", i , j);
			}
			System.out.println();//QUEBRA A LINHA 
		}

	}

}
