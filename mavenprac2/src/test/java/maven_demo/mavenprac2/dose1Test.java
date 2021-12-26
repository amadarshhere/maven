package maven_demo.mavenprac2;

import org.testng.annotations.Test;

public class dose1Test {
	@Test
	public void mollywoodActor()
	{
	System.out.println("lalettan");	
	}
	@Test(groups= {"smoke"})
	public void mollywoodActress()
	{
		System.out.println("aishu");
		System.out.println("moonisra");
	}
	@Test
	public void mollywoodDirector()
	{
		System.out.println("lijo jose");
		System.out.println("lpole");
	}

}
