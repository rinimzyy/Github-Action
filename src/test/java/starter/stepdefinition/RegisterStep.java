package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;
import starter.Web.Register;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;


public class RegisterStep {
    @Steps
    Register register;

//    Scenario: [Positive] - Register with valid data
//    @Given("I am on the register page")
//    public void onTheRegisterPage() {
//        getDriver().manage().window().maximize();
//        register.openUrl("https://alta-shop.vercel.app/auth/register");
//        register.validateOnRegisterPage();
//    }
//    @When("I enter valid user name")
//    public void enterValidFullName() {
//        register.inputFullName("Rini Muzayanah");
//    }
//    @And("I enter user email")
//    public void enterValidEmail() {
//        register.inputEmail("hahaa@gmail.com");
//    }
//    @And("I enter user password")
//    public void enterValidPassword() {
//        register.inputPassword("apaaja");
//    }
//    @And("I click register button")
//    public void clickRegisterButton() {
//        register.clickRegisterButton();
//    }
//    @Then("I successfully register")
//    public void onTheHomePage(){
//        register.redirectedToLoginPage();
//    }

    //Scenario: [Negative] - Register with invalid full name
    @Given("I am go to register page")
    public void onTheRegisterPage2() {
        getDriver().manage().window().maximize();
        register.openUrl("https://alta-shop.vercel.app/auth/register");
        register.validateOnRegisterPage();
    }
    @When("Username is empty")
    public void enterInvalidFullName() {
        register.inputFullName("");
    }
    @And("Email is empty")
    public void enterValidEmail2() {
        register.inputEmail("");
    }
    @And("Password is empty")
    public void enterValidPassword2() {
        register.inputPassword("");
    }
    @And("I click the register button")
    public void clickRegisterButton2() {
        register.clickRegisterButton();
    }
    @Then("I fail register")
    public void failedRegisterandRedirectedInHomepage2() {
        register.allertAppear();
    }

    //Scenario: [Negative] - Register with invalid email
    @Given("I am go into register page")
    public void onTheRegisterPage3() {
        getDriver().manage().window().maximize();
        register.openUrl("https://alta-shop.vercel.app/auth/register");
        register.validateOnRegisterPage();
    }
    @When("I entering valid user name")
    public void enterValidFullName3() {
        register.inputFullName("Rini Muzayanah");
    }
    @And("I entering user email")
    public void enterInvalidEmail() {
        register.inputEmail("rimzynh@gmail.com");
    }
    @And("I entering user password")
    public void enterValidPassword3() {
        register.inputPassword("apaaja");
    }
    @And("I clicking the register button")
    public void clickRegisterButton3() {
        register.clickRegisterButton();
    }
    @Then("I failed register")
    public void failedRegisterandRedirectedInHomepage3() {
        register.allertAppear();
    }
}
