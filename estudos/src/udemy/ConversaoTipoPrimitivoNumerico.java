package udemy;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		double a = 1;//implicita
		System.out.println(a);
		
		float b = (float) 1.12345678;//explicita (CAST)
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c;
		System.out.println(d);
		
		double e = 1.999999; //explicita (CAST)
		int f = (int) e;
		System.out.println(f);
	}

}
