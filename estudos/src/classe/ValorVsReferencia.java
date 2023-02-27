package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
	
		double a = 2;
		double b = a;// atribuição por valor (Tipo primitivo)

		a++;
		b--;

		System.out.println(a + " " + b);

		Data dt1 = new Data(1, 6, 2022);
		Data dt2 = dt1; // atribuição por referencia (Objeto)

		dt1.dia = 31;
		dt2.mes = 12;

		System.out.println(dt1.obterDataFormatada());
		System.out.println(dt2.obterDataFormatada());

		voltarDataParaValorPadrao(dt1); // Metodo

		System.out.println(dt1.obterDataFormatada());
		System.out.println(dt2.obterDataFormatada());

		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);
	}

	static void voltarDataParaValorPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}

	static void alterarPrimitivo(int a) {
		a++;

	}

}
