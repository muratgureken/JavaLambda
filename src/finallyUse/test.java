package finallyUse;

public class test {
	public int testEt()
	{
		//bir sekilde sistemden cikildiginda, JVM durdugunda, ya da paralel baska bir thread calisirken bu
		//thread durdurulursa, finally calismaz.
		
		try
		{
			System.out.println("Murat");
			System.exit(0);
		}
		finally
		{
			System.out.println("Gureken");
		}
		
		try
		{
			return 0;
		}
		finally
		{
			return 1;
		}
	}
}
