/*
 * package com.stepdef.amazon.tv;
 * 
 * import java.util.ArrayList; import java.util.Collections; import
 * java.util.List; import java.util.stream.Collectors;
 * 
 * import com.generic.code.BaseLogin; import com.generic.code.LoginValidation;
 * import com.utility.Highlighter; import com.utility.SeleniumUtil;
 * 
 * import cucumber.api.java.en.Given; import cucumber.api.java.en.Then; import
 * cucumber.api.java.en.When;
 * 
 * public class StepDefAmazonTV extends BaseLogin {
 * 
 * List<Double> price = new ArrayList<>(); List<Double> NoduplicatePrice = new
 * ArrayList<>();
 * 
 * @Given("^Login$") public void login() {
 * 
 * super.login(); }
 * 
 * @Then("^Validate login$") public void validate_login() {
 * LoginValidation.getLoginValidation(driver);
 * 
 * }
 * 
 * @When("^search tv$") public void search_tv() {
 * 
 * pf.getSearchBox().sendKeys("tv"); pf.getSearchBox().submit();
 * 
 * }
 * 
 * @When("^Click tv checkbox$") public void click_tv_checkbox() {
 * 
 * pf.getSamsungTvcheckbox().get(0).click(); }
 * 
 * @When("^Sort high to low price$") public void sort_high_to_low_price() {
 * 
 * pf.getSorting().click(); pf.getSortingDropOptions().get(1).click(); }
 * 
 * @When("^All tv name$") public void all_tv_name() {
 * 
 * pf.getLaptopename().size();// 19
 * 
 * for (int i = 0; i < pf.getLaptopename().size(); i++) {
 * 
 * new Highlighter(driver).drawBorder(pf.getLaptopename().get(i), "green");
 * 
 * System.out.println(pf.getLaptopename().get(i).getText());
 * 
 * }
 * 
 * }
 * 
 * @When("^All tv price$") public void all_tv_price() {
 * pf.getLaptopprice().size();// 19
 * 
 * for (int i = 0; i < pf.getLaptopprice().size(); i++) {
 * 
 * new Highlighter(driver).drawBorder(pf.getLaptopprice().get(i), "red");
 * 
 * String eachPrice = pf.getLaptopprice().get(i).getAttribute("innerText");//
 * gettext()
 * 
 * double doublePrice = Double.parseDouble(eachPrice.replace("$",
 * "").replace(",", "")); price.add(doublePrice);// double } NoduplicatePrice=
 * price.stream().distinct().collect(Collectors.toList());
 * 
 * System.out.println(NoduplicatePrice); }
 * 
 * @When("^Find the highest  price$") public void find_the_highest_price() {
 * System.out.println("max no::" + Collections.max(NoduplicatePrice));
 * 
 * }
 * 
 * @When("^find out (\\d+)nd highest price$") public void
 * find_out_nd_highest_price(int arg1) {
 * 
 * }
 * 
 * @When("^Find the lowest price$") public void find_the_lowest_price() {
 * 
 * System.out.println("min no::" + Collections.min(NoduplicatePrice)); }
 * 
 * @When("^find out (\\d+)nd lowest price$") public void
 * find_out_nd_lowest_price(int arg1) {
 * 
 * }
 * 
 * @When("^Add one tv to cart$") public void add_one_tv_to_cart() {
 * 
 * pf.getLaptopename().get(0).click();
 * 
 * new SeleniumUtil(driver).explicitClick(pf.getAddToCart().get(0));
 * pf.getAddToCart().get(0).click();
 * 
 * try { Thread.sleep(3000); System.out.println(pf.getAddNoCoverage().size());
 * //new SeleniumUtil(driver).conditionActionClick(pf.getAddNoCoverage().get(0),
 * pf.getCart()); new
 * SeleniumUtil(driver).javScriptClick(pf.getAddNoCoverage().get(0));
 * Thread.sleep(3000); new
 * SeleniumUtil(driver).javScriptClick(pf.getCart().get(0)); Thread.sleep(3000);
 * 
 * } catch (Exception e) { new
 * SeleniumUtil(driver).explicitClick(pf.getViewCart().get(0));
 * pf.getViewCart().get(0).click();
 * 
 * } }
 * 
 * @When("^Procedd for payment$") public void procedd_for_payment() {
 * 
 * if (pf.getProceedBtn().size() > 0) { new
 * SeleniumUtil(driver).explicitClick(pf.getProceedBtn().get(0));
 * pf.getProceedBtn().get(0).click(); } else { new
 * SeleniumUtil(driver).explicitClick(pf.getMainCart().get(0));
 * pf.getMainCart().get(0).click(); try { Thread.sleep(3000); new
 * SeleniumUtil(driver).explicitClick(pf.getProceedBtn().get(0));
 * pf.getProceedBtn().get(0).click(); } catch (InterruptedException e) { } }
 * 
 * new SeleniumUtil(driver).explicitClick(pf.getDeliverAddressBtn().get(0));
 * pf.getDeliverAddressBtn().get(0).click(); new SeleniumUtil(driver).loader();
 * try { new SeleniumUtil(driver).explicitClick(pf.getPass());
 * pf.getPass().sendKeys(objmap.getConfig("pass")); pf.getPass().submit(); }
 * catch (Exception e) { }
 * 
 * new SeleniumUtil(driver).conditionActionClick(pf.getContinueBtn().get(0),
 * pf.getNameOnCard());
 * 
 * }
 * 
 * @When("^use invalide card$") public void use_invalide_card() {
 * 
 * new SeleniumUtil(driver).actionClick(pf.getNameOnCard());
 * pf.getNameOnCard().get(0).sendKeys("Student"); new
 * SeleniumUtil(driver).actionClick(pf.getCardNumber());
 * pf.getCardNumber().get(0).sendKeys("90876543212"); try { new
 * SeleniumUtil(driver).explicitClick(pf.getExpireDateYear().get(1)); } catch
 * (Exception e) { } pf.getExpireDateYear().get(1).click(); try { new
 * SeleniumUtil(driver).explicitClick(pf.getExpireYearDropDown().get(0)); }
 * catch (Exception e) { } pf.getExpireYearDropDown().get(3).click(); new
 * SeleniumUtil(driver).actionClick(pf.getAddCard()); }
 * 
 * @Then("^validate payement was failed$") public void
 * validate_payement_was_failed() { try { new SeleniumUtil(driver).loader(); new
 * SeleniumUtil(driver).explicitClick(pf.getFailedPayementVaidation().get(0)); }
 * catch (Exception e) { } if
 * (pf.getFailedPayementVaidation().get(0).getAttribute("innerText").
 * contains("Card number is not correct")) {
 * 
 * } else {
 * 
 * }
 * 
 * }
 * 
 * }
 */