package stepdefinitions;

import io.cucumber.java.en.*;
import hooks.Hooks;
import pages.LoginPage;

public class LoginSteps {
 LoginPage login;

 @Given("the user opens the login page")
 public void open(){
  login = new LoginPage(Hooks.page);
 }

 @When("the user enters valid credentials")
 public void enter(){ login.login(); }

 @Then("the user should land on the dashboard")
 public void verify(){
  if(!Hooks.page.url().contains("inventory")){
   throw new RuntimeException("Login failed");
  }
 }
}
