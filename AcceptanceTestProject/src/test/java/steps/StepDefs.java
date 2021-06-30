package steps;

import cucumber.api.java8.En;
import pages.Page;

public class StepDefs extends Page implements En  {

    public StepDefs() {
        Given("I go to url (.*)$", (final String url) ->  getUrl(url));

   
    
    When("^I click on signin menu$", () -> {
       
    	clickOnsignin();
    });
    Then("^I enter the username \"([^\"]*)\" and password \"([^\"]*)\" and click on signin button$", (String username, String password) -> {
        clickOnsigninbutton(username, password);
    });
    }
}
