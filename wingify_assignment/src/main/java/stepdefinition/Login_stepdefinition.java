package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;

public class Login_stepdefinition {
	WebDriver driver;
	LoginPage login;
	HomePage home;

	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sakshingp.github.io/assignment/login.html");
		login = new LoginPage(driver);
		home = new HomePage(driver);
	}

	@When("user enters usernmae and password")
	public void user_enters_usernmae_and_password() {

		login.txtbox_username.sendKeys("amol");
		login.textbox_password.sendKeys("amol");

	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		login.btn_login.click();

	}

	@When("user click the AMOUNT header")
	public void user_click_the_amount_header() {
		home.amount_link.click();
	}

	@Then("transaction table values are sorted")
	public void transaction_table_values_are_sorted() {
		Assert.assertEquals(driver.findElement(By.xpath("//a[text()='Software']")).getText(), "Software");
	}

	@After
	public void browser_close() {
		driver.close();
	}

	
}
