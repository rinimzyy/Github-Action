package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Web.Login;
import starter.Web.Product;


public class ProductSteps {
    @Steps
    Login login;

    @Steps
    Product product;

    //Scenario: WB0020 - Successfully select category
    @Given("I am already the web page")
    public void openWeb(){
        login.openUrl("https://alta-shop.vercel.app/");
    }
    @When("I click on the transaction button in the navigation menu")
    public void shopButton(){

    }
    @And("I select the sort by category from the dropdown menu")
    public void selectCategory(){
        product.categoryList();
        product.clickOneCategory();
    }
    @Then("I should be taken to a page displaying all the available clothing items for sale")
    public void displayPage(){

    }

    //Scenario: WB0021 - Successfully clear category
    @Given("I am already web page")
    public void openedWeb() {
        login.openUrl("https://alta-shop.vercel.app/");
    }

    @When("I click select category")
    public void clickCategory() {
        product.categoryList();
    }

    @And("I choose category")
    public void chooseCategory() {
        product.clickOneCategory();
    }

    @And("I click on the clear button next to the category dropdown menu")
    public void clearCategory() {
        product.clickClearCategory();
    }

    @Then("I should be taken back to the homepage of the website")
    public void getClearCategory() {

    }

    @Given("I am already login to web page")
    public void login(){
        login.openUrl("https://alta-shop.vercel.app/auth/login");
        login.inputEmail("rimzynh@mail.com");
        login.inputPassword("@Apaaja123");
        login.ClickLoginButton();
    }
    @When("I choose a product")
    public void chooseProduct(){

    }
    @And("I click beli button")
    public void clickBeliButton(){
        product.addProduct();
    }
    @And("I click cart button")
    public void clickCartButton(){
        product.cartProduct();
    }
    @Then("I successfully add product to cart")
    public void successAddCart(){
        product.bayarButtonDisplayed();
    }

    @Given("I am already login in web page")
    public void loginInWeb(){
        login.openUrl("https://alta-shop.vercel.app/auth/login");
        login.inputEmail("rimzynh@mail.com");
        login.inputPassword("@Apaaja123");
        login.ClickLoginButton();
    }
    @When("I choose product")
    public void chooseAProduct(){

    }
    @And("I click detail button")
    public void clickDetailButton(){
        product.detailButton();
    }
    @Then("I successfully view product detail")
    public void successViewDetail(){
        product.theDetailProduct();
    }

    @Given("I am already login into web page")
    public void loginIntoWeb(){
        login.openUrl("https://alta-shop.vercel.app/auth/login");
        login.inputEmail("rimzynh@mail.com");
        login.inputPassword("@Apaaja123");
        login.ClickLoginButton();
    }
    @When("I choose the product")
    public void chooseTheProduct(){

    }
    @And("I click the detail button")
    public void clickTheDetailButton(){
        product.detailButton();
    }
    @And("I click 5 star")
    public void click5Star(){
        product.giveRating();
    }
    @Then("I successfully give rating to product")
    public void successRating(){

    }

    @Given("I am already in web page")
    public void goIntoWeb(){
        login.openUrl("https://alta-shop.vercel.app/");
    }
    @When("I choose 1 product")
    public void choose1Product(){

    }
    @And("I click the beli button")
    public void clickTheBeliButton(){
        product.addProduct();
    }
    @And("I click the cart button")
    public void clickTheCartButton(){
        product.cartProduct();
    }
    @Then("I successfully add product to cart without login")
    public void successAddToCart(){
        product.bayarButtonDisplayed();
    }

    @Given("I am already in the web page")
    public void inWeb(){
        login.openUrl("https://alta-shop.vercel.app/");
    }
    @When("I choose some product")
    public void chooseSomeProduct(){

    }
    @And("I click a detail button")
    public void clickDetailButtonn(){
        product.detailButton();
    }
    @Then("I successfully view product detail without login")
    public void successViewDetailWLogin(){
        product.theDetailProduct();
    }

    @Given("I am already go to web page")
    public void intoWeb(){
        login.openUrl("https://alta-shop.vercel.app/");
    }
    @When("I choose 1 or more product")
    public void choose1orMoreProduct(){

    }
    @And("I click detail buttonn")
    public void clickADetailButton(){
        product.detailButton();
    }
    @And("I click 5 stars")
    public void click5Stars(){
        product.giveRating();
    }
    @Then("I successfully give rating to product without login")
    public void successRatingWLogin(){

    }
}
