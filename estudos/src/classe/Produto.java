package classe;

public class Produto {
	
	String nome;
	double preco;
	static double desconto = 0.25;
	
	//CONSTRUTOR SEMPRE RECEBE O MESMO NOME DA CLASSE
	//CONSTRUTOR NÃO TEM RETORNO
	
	Produto() {    //CONTRUSTOR PADRÃO SEM PARAMETRO
	}
	
	Produto(String nomeInicial, double precoInicial){ //CONSTRUTOR COM PARAMETROS
		nome = nomeInicial;
		preco = precoInicial;

	}
	
	double precoComDesconto() {  //METODO
		return preco * (1- desconto);
	}
	
	double precoComDesconto(double descontoGerente) {
		return preco * (1 - desconto + descontoGerente);
	}
}
