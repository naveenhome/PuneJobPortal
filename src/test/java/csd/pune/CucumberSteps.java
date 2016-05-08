package csd.pune;

import junit.framework.TestCase;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberSteps extends TestCase{
	JobSeeker obj = new JobSeeker();
	
	@Given("^Jobseekers enter all valid data$")
	public void Jobseekers_enter_all_valid_data() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		obj.setName("Naveen");
		obj.setCity("Pune");
		obj.setEmail("naveenhome@gmail.com");
		obj.setPhone("9810547500");
		
	}

	@When("^click on \"([^\"]*)\"$")
	public void click_on(String button) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
	}

	@Then("^System send a confirmation mail$")
	public void System_send_a_confirmation_mail() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		
		
	}

	@Then("^display success message \"([^\"]*)\"$")
	public void display_success_message(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		RegistrationBLL register = new RegistrationBLL();
		assertEquals(arg1, register.process(obj));
		
	}
	@Then("^System Clear all field$")
	public void System_Clear_all_field() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}


}
