package classe;

public class Usuario {
	
	String nome;
	String email;

	
	public boolean equals(Object objeto) { //METODO EQUALS 
		
		if(objeto instanceof Usuario) { //INSTANCEOF COMPARA SE O OBJETO É UMA INSTANCIA DE USUARIO
		Usuario outro = (Usuario) objeto;
		boolean nomeIgual = outro.nome.equals(this.nome);
		boolean emailIgual = outro.email.equals(this.email);
		
		return nomeIgual && emailIgual;
	}else {
		return false;
	}

	} 
}
