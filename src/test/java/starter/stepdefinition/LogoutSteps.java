package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Web.Login;
import starter.Web.Logout;


public class LogoutSteps {
    @Steps
    Login login;

    @Steps
    Logout logout;

    @Given("I am already login")
    public void onTheLoginPage(){
        login.openUrl("https://alta-shop.vercel.app/auth/login");
        login.inputEmail("rimzynh@mail.com");
        login.inputPassword("@Apaaja123");
        login.ClickLoginButton();
    }
    @When("I click user button")
    public void clickUserButton(){
        logout.userButton();
    }
    @And("I click logout button")
    public void clickLogoutButton(){
        logout.logoutButton();
    }
    @Then("I successfully logout")
    public void logoutSuccess(){
        logout.LoginButtonDisplayed();
    }
}
