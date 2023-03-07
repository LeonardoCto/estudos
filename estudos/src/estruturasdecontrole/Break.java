package estruturasdecontrole;

public class Break {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			
			if(i == 5 ) {
				break; //QUEBRA O FLUXO E SAI DA ESTRUTURA. //FAZ SENTIDO USALO EM UM LAÇO
			}
			System.out.println(i);
		}
			System.out.println("Fim!");
		}
	}


