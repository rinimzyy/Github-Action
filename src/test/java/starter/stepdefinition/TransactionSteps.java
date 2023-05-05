package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Web.Login;
import starter.Web.Logout;
import starter.Web.Product;
import starter.Web.Transactions;

public class TransactionSteps {
    @Steps
    Login login;

    @Steps
    Product product;

    @Steps
    Transactions trans;

    @Steps
    Logout logout;

    @Given("I am already login to web alta")
    public void loginIntoWeb(){
        login.openUrl("https://alta-shop.vercel.app/auth/login");
        login.inputEmail("rimzynh@mail.com");
        login.inputPassword("@Apaaja123");
        login.ClickLoginButton();
    }
    @When("I add some product to cart")
    public void chooseTheProduct(){
        product.addProduct();
    }
    @And("I go to user cart")
    public void goToUserCart(){
        product.cartProduct();
    }
    @And("I checking the product before paying")
    public void checkingOrder(){
        trans.increaseProduct();
        trans.increaseProduct();
    }
    @And("I click bayar button")
    public void clickBayar(){
        trans.payOrder();
    }
    @Then("I successfully pay the product")
    public void successPay(){
        trans.transactionList();
    }

    @Given("I am on web alta")
    public void intoWeb(){
        login.openUrl("https://alta-shop.vercel.app");
    }
    @When("I add some of product to cart")
    public void chooseSomeProduct(){
        product.addProduct();
    }
    @And("I go to the user cart")
    public void goToCart(){
        product.cartProduct();
    }
    @And("I checking product before paying")
    public void checkingTheOrder(){
        trans.increaseProduct();
        trans.increaseProduct();
    }
    @And("I click the bayar button")
    public void clickBayarButton(){
        trans.payOrder();
    }
    @Then("I failed pay the product and redirected to login page")
    public void failPay(){
        trans.loginDisplayed();
    }

    @Given("I am already login in web alta")
    public void alreadyInWebAlta(){
        login.openUrl("https://alta-shop.vercel.app/auth/login");
        login.inputEmail("rimzynh@mail.com");
        login.inputPassword("@Apaaja123");
        login.ClickLoginButton();
    }
    @When("I do a transaction")
    public void doTransaction(){
        product.addProduct();
        product.cartProduct();
        trans.increaseProduct();
        trans.payOrder();
    }
    @Then("I can see user transactions history")
    public void seeTransactionsHistory(){
        trans.transactionList();
    }

    @Given("I am already login in the web alta")
    public void alreadyInTheWebAlta(){
        login.openUrl("https://alta-shop.vercel.app/auth/login");
        login.inputEmail("rimzynh@mail.com");
        login.inputPassword("@Apaaja123");
        login.ClickLoginButton();
    }
    @When("I do a product transaction")
    public void doProductTransaction(){
        product.addProduct();
        product.cartProduct();
        trans.increaseProduct();
        trans.payOrder();
    }
    @And("I can see transactions history")
    public void seeTransaction(){
        trans.transactionList();
    }
    @And("I click ascending button")
    public void clickAscButton(){
        trans.activateAscending();
    }
    @Then("I can see view user transaction in ascending order")
    public void seeTransactionsInAscending(){

    }

    @Given("I am already login into web alta")
    public void alreadyIntoWebAlta(){
        login.openUrl("https://alta-shop.vercel.app/auth/login");
        login.inputEmail("rimzynh@mail.com");
        login.inputPassword("@Apaaja123");
        login.ClickLoginButton();
    }
    @When("I do some transaction")
    public void doSomeProductTransaction(){
        product.addProduct();
        product.cartProduct();
        trans.increaseProduct();
        trans.payOrder();
    }
    @And("I can view transactions history")
    public void viewTransaction(){
        trans.transactionList();
    }
    @And("I click descending button")
    public void clickDescButton(){
        trans.activateAscending();
        trans.activateDescending();
    }
    @Then("I can see view user transaction in descending order")
    public void seeTransactionsInDescending(){

    }

    //Scenario: WB0025 - Successfully set the number of transaction history per page
    @Given("I am already login the web alta")
    public void openWebAlta() {
        login.openUrl("https://alta-shop.vercel.app/auth/login");
        login.inputEmail("rimzynh@mail.com");
        login.inputPassword("@Apaaja123");
        login.ClickLoginButton();
    }

    @When("I do transaction")
    public void doingTransaction() {
        product.addProduct();
        product.cartProduct();
        trans.increaseProduct();
        trans.payOrder();
    }

    @And("I can view the transactions history")
    public void viewTransactionForSort() {
        logout.userButton();
        trans.getTransactionMenu();
    }

    @And("I choose sort by transaction")
    public void sortTransaction() {
//        trans.clickSort();
//        trans.clickProductSort();
    }

    @And("I set the number of items per page")
    public void setPageNumberTransaction() {
        trans.clickRowNumber();
        trans.clickRowNumber10();
    }

    @Then("I should see the history transaction items on the page")
    public void seeTransactionNumber() {

    }

}
