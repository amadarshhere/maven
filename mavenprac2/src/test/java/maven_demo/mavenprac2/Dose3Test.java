package maven_demo.mavenprac2;

import org.testng.annotations.Test;

public class Dose3Test {
	@Test
	public void bollywoodActor() {
		System.out.println("shrrok kan");

	}
	public void updated() {
		System.out.println("muthapa");

	}
	public void relocated() {
		System.out.println("sukran");

	}

	@Test(groups= {"smoke"})
	public void bollywoodActress()

	{
		System.out.println("depika padakone");
	}

	@Test
	public void bollywoodDirector() {
		System.out.println("kinnakaran");
	}
}
