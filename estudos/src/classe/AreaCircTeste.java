package classe;

public class AreaCircTeste {

	public static void main(String[] args) {
		
		AreaCirc a1 = new AreaCirc(10);
		a1.raio = 10; 
		System.out.println(a1.area());
		
		AreaCirc a2 = new AreaCirc(5);
		a2.raio = 20;
		System.out.println(a2.area());
		
		System.out.println(AreaCirc.areaA(100));
		
	}
}