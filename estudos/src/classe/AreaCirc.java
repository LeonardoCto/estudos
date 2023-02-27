package classe;

public class AreaCirc {

	double raio;
	static final double PI = 3.1415; //STATIC SERVE PARA O ATRIBUTO PERTENCER A CLASSE
									//FINAL SERVE PARA NÃO PODER SER ALTERADO			
	 AreaCirc(double raioInicial){ 
		 raio = raioInicial;
		 
	}
	 
	 double area() {
		 return PI * Math.pow(raio, 2); //FUNCÃO PARA ELEVAR ATRIBUTO (RAIO ELEVADO A 2) = RAIO * RAIO
	 }
	 
	 static double areaA(double raio) {
		 return PI * Math.pow(raio, 2);
	 }

}


