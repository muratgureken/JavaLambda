package lambda;

public class Runner {

	public static void main(String[] args) {
		Runner test = new Runner();
		
		/*lambda operation:
		 * parameter -> expression body */
		MatematikselIslem toplam = (a,b) -> a+b;
		MatematikselIslem cikarma = (a,b) -> a-b;
		MatematikselIslem carpma = (a,b) -> {return a*b;};
		
		System.out.println("Toplama: "+test.calistir(10, 2, toplam));
		System.out.println("Cikarma: "+test.calistir(10, 2, cikarma));
		System.out.println("Carpma: "+test.calistir(10, 2, carpma));
	}
	
	interface MatematikselIslem
	{
		int islem(int a, int b);
	}
	
	private int calistir(int a, int b, MatematikselIslem matematikIslemi)
	{
		return matematikIslemi.islem(a, b);
	}
}
