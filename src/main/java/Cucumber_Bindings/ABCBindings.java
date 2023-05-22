package Cucumber_Bindings;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ABCBindings {
	
//	@Given("I am A {string}")
//	public void i_am_a(String string) {
//	    System.out.println("Data is"+string);
//	}
//
//
//
//    @When("^I do B$")
//    public void i_do_b() {
//    	System.out.println("I do B");
//        
//    }
//
//    @Then("^I get C$")
//    public void i_get_c() {
//    	System.out.println("I get C");
//        
//    }
	@Given("^I am reading name$")
    public void i_am_reading_name(DataTable dataTable) {
		List<List<String>> data = dataTable.asLists(String.class);
		System.out.println(data.get(0).get(0));
		System.out.println(data.get(1).get(0));
    }

    @When("^I entered the above provided name$")
    public void i_entered_the_above_provided_name() {
    }

}
