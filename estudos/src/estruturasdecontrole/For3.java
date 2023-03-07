package estruturasdecontrole;

public class For3 {

	public static void main(String[] args) {
		
		
		//PARA PODER USAR A VARIAVEL DO FOR FORA DELE …â NECESS√ÅRIO DECLARARA FORA DO LA«O POR EXEMPLO.
		//INT I = 0;
		//for(; i < 10; i ++) { } LA«O FECHADO AQUI
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
