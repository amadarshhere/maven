package maven_demo.mavenprac2;

import org.testng.annotations.Test;

public class Dose3Test {
	@Test
	public void bollywoodActor() {
		System.out.println("shrrok kan");

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
