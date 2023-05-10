package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Web.Login;

public class LoginSteps {
    @Steps
    Login login;



    @Given("I am on the login page")
    public void onTheLoginPage(){
        login.openUrl("https://alta-shop.vercel.app/auth/login");
        login.logBtnAppear();
    }
    @When("I enter valid email")
    public void enterValidEmail(){
        login.inputEmail("rimzynh@mail.com");
    }
    @And("I enter password")
    public void enterValidPassword(){
        login.inputPassword("@Apaaja123");
    }
    @And("I click login button")
    public void clickLoginButton(){
        login.ClickLoginButton();
    }
    @Then("I successfully login")
    public void onTheHomePage(){
        login.onDashboard();
    }

    @Given("I am on login page")
    public void onLoginPage(){
        login.openUrl("https://alta-shop.vercel.app/auth/login");
        login.logBtnAppear();
    }
    @When("I not enter valid email")
    public void notEnterValidEmail(){
        login.inputEmail("");
    }
    @And("I not enter password")
    public void notEnterValidPassword(){
        login.inputPassword("");
    }
    @And("I click the login button")
    public void clickTheLoginButton(){
        login.ClickLoginButton();
    }
    @Then("I fail to login")
    public void loginFail(){
        login.allertAppear();
    }

    @Given("I am on login web page")
    public void onLoginWebPage(){
        login.openUrl("https://alta-shop.vercel.app/auth/login");
        login.logBtnAppear();
    }
    @When("Email field is empty")
    public void EmailEmpty(){
        login.inputEmail("");
    }
    @And("I enter valid password")
    public void EnterValidPassword(){
        login.inputPassword("Apaaja123");
    }
    @And("I clicking the login button")
    public void clickingTheLoginButton(){
        login.ClickLoginButton();
    }
    @Then("I failed to login")
    public void loginFailed(){
        login.allertAppear();
    }

    @Given("I am on the login web page")
    public void onTheLoginWebPage(){
        login.openUrl("https://alta-shop.vercel.app/auth/login");
        login.logBtnAppear();
    }
    @When("I filling email field")
    public void fillEmail(){
        login.inputEmail("rimzynh@mail.com");
    }
    @And("Password field is empty")
    public void passwordEMpty(){
        login.inputPassword("");
    }
    @And("I tap the login button")
    public void tapLoginButton(){
        login.ClickLoginButton();
    }
    @Then("The login is failed")
    public void failedToLogin(){
        login.allertAppear();
    }

    @Given("On the login web page")
    public void loginWebPage(){
        login.openUrl("https://alta-shop.vercel.app/auth/login");
        login.logBtnAppear();
    }
    @When("I filling email field with invalid email")
    public void fillWithInvalidEmail(){
        login.inputEmail("rimxynh@gmail.com");
    }
    @And("I filling password field")
    public void fillingPassword(){
        login.inputPassword("");
    }
    @And("I tap login button")
    public void tapingLoginButton(){
        login.ClickLoginButton();
    }
    @Then("The login is fail")
    public void failToLogin(){
        login.allertAppear();
    }
}
