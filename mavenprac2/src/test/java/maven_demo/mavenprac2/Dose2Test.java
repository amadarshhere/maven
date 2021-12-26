package maven_demo.mavenprac2;

import org.testng.annotations.Test;

public class Dose2Test {
	@Test
	public void hollywoodActor() {
		System.out.println("jamesbond");
	}

	@Test(groups= {"smoke"})
	public void hollywoodActress() {
		System.out.println("anjelina");

	}
	@Test
	public void hollywodDirector()
	{
		System.out.println("james horgan");
	}

}
