package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data dt1 = new Data();
		
		dt1.dia = 24;
		dt1.mes = 10;
		dt1.ano = 2002;
		
		Data dt2 = new Data(03, 12, 2000);
		
		String dataformatada1 = dt1.obterDataFormatada();
		
		System.out.println(dataformatada1);
		System.out.println(dt2.obterDataFormatada());
	}

}
