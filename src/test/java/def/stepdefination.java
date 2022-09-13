package def;

import java.util.Date;

import io.cucumber.java.en.Given;

public class stepdefination {

	@Given("I want to write a {int} step with precondition")
	public void i_want_to_write_a_step_with_precondition(int value) throws InterruptedException {
	
		System.out.println(
				"before : " + value + " | time : " + new Date() + " | Thread ID : " + Thread.currentThread().getId());
		Thread.sleep(5000);
		System.out.println(
				"after : " + value + " | time : " + new Date() + " | Thread ID : " + Thread.currentThread().getId());

	}

}
