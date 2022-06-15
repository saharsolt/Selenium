package testNGListener;

import org.testng.annotations.Test;

public class TimeOut {

	@Test
	public void timeTestOne() throws InterruptedException {      //Fails
		Thread.sleep(1000);
		System.out.println("Time test method one");
	}

	@Test
	public void timeTestTwo() throws InterruptedException {      //Passes
		Thread.sleep(400);
		System.out.println("Time test method two");
	}
}
