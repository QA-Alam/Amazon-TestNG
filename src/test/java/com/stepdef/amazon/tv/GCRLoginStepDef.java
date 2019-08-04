/*
 * package com.stepdef.amazon.tv;
 * 
 * import java.util.List;
 * 
 * import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * org.openqa.selenium.support.PageFactory; import org.testng.Assert;
 * 
 * import com.generic.code.MasterPageFactory;
 * 
 * import cucumber.api.DataTable; import cucumber.api.java.en.Given; import
 * cucumber.api.java.en.Then; import cucumber.api.java.en.When;
 * 
 * public class GCRLoginStepDef {
 * 
 * WebDriver driver; MasterPageFactory pf;
 * 
 * @Given("^User able to open any browser$") public void
 * user_able_to_open_any_browser() {
 * 
 * System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
 * driver = new ChromeDriver();// upcasting driver.manage().window().maximize();
 * 
 * }
 * 
 * @Given("^Put URL and go to login page$") public void
 * put_URL_and_go_to_login_page(DataTable table) { List<List<String>> list =
 * table.raw(); driver.get(list.get(1).get(0)); }
 * 
 * @When("^User able to click my account$") public void
 * user_able_to_click_my_account() { pf = PageFactory.initElements(driver,
 * MasterPageFactory.class); pf.getMyAccount().get(0).click();
 * 
 * }
 * 
 * @When("^User able to use valid userName$") public void
 * user_able_to_use_valid_userName(DataTable table) {
 * 
 * List<List<String>> list = table.raw();
 * pf.getGcrEmail().get(0).sendKeys(list.get(2).get(0));
 * 
 * }
 * 
 * @When("^User able to put valid password$") public void
 * user_able_to_put_valid_password(DataTable table) {
 * 
 * List<List<String>> list = table.raw();
 * pf.getGcrPassword().get(0).sendKeys(list.get(2).get(0)); }
 * 
 * @When("^User able to click submit button$") public void
 * user_able_to_click_submit_button() { pf.getGcrSignin().get(0).click(); }
 * 
 * @Then("^User able to validate Login status$") public void
 * user_able_to_validate_Login_status() {
 * 
 * Assert.assertTrue(pf.getGcrLogout().size() == 1); }
 * 
 * @Then("^close the browser$") public void close_the_browser() { driver.quit();
 * 
 * }
 * 
 * }
 */