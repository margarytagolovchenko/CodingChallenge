package step_defenitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.UsersPage;
import utilities.Driver;

import javax.xml.transform.sax.SAXSource;
import java.util.ArrayList;
import java.util.List;

public class testSteps {


    UsersPage page=new UsersPage();

    @Given("I am on a Way2Automation website")
    public void i_am_on_a_way2automation_website() throws InterruptedException {
        Driver.getDriver().get("http://www.way2automation.com/angularjs-protractor/webtables/");

    }


    @When("I click the Add User button")
    public void i_click_the_add_user_button() throws InterruptedException {

        page.addUser.click();
    }

    @Then("I enter {string}, {string}, {string},{string}, {string} ,  {string}, {string}, {string}")
    public void i_enter(String firstName, String lastName, String username, String password, String customer, String role, String email, String cellphone) throws InterruptedException {
        page.firstName.sendKeys(firstName);
        page.lastName.sendKeys(lastName);
        page.userName.sendKeys(username);
        page.password.sendKeys(password);
        page.custRadioBtn.click();
        Select dropdown = new Select( page.roleID);
        dropdown.selectByValue("1");

            page.email.sendKeys(email);
            page.cellPhone.sendKeys(cellphone);
        }

    @Then("I click Save button")
    public void i_click_save_button() throws InterruptedException {
        page.saveBtn.click();
    }

    @Then("I validate the user has been added to the table {string}, {string},{string}")
    public void i_validate_the_user_has_been_added_to_the_table(String firstName, String lastName, String username) {
        List <WebElement> actual=Driver.getDriver().findElements(By.xpath("//table[@class='smart-table table table-striped']/tbody/tr[1]/td"));
        List<String> expected = new ArrayList<>();
        expected.add(firstName);
        expected.add(lastName);
        expected.add(username);

        for (int i=0; i<expected.size(); i++){
            Assert.assertEquals(actual.get(i).getText(),expected.get(i));
        }
    }



    @When("I click Delete button for {string} and {string}")
    public void i_click_delete_button_for_and(String firstName, String lastName) throws InterruptedException {
        List <WebElement> actual2=Driver.getDriver().findElements(By.xpath("//table[@class='smart-table table table-striped']/tbody//td[1]"));
        List <WebElement> actual3=Driver.getDriver().findElements(By.xpath("//table[@class='smart-table table table-striped']/tbody//td[2]"));
        for (int i =0;i<actual2.size();i++){
            for (int j = 0; j<actual3.size();j++){
                if (actual2.get(i).getText().equalsIgnoreCase(firstName) && actual3.get(j).getText().equalsIgnoreCase(lastName)){
               Driver.getDriver().findElement(By.xpath("//table[@class='smart-table table table-striped']/tbody/tr[3]/td[11]/button")).click();
                break;
            }
        }}

    }

    @Then("I click OK button")
    public void i_click_ok_button() throws InterruptedException {
        WebElement element = Driver.getDriver().findElement(By.xpath("//button[@class='btn ng-scope ng-binding btn-primary']"));
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", element);
    }

    @Then("the User {string},{string} is removed from the table")
    public void the_user_is_removed_from_the_table(String firstName, String lastName) {
        List<WebElement> actual2 = Driver.getDriver().findElements(By.xpath("//table[@class='smart-table table table-striped']/tbody//td[1]"));
        List<WebElement> actual3 = Driver.getDriver().findElements(By.xpath("//table[@class='smart-table table table-striped']/tbody//td[2]"));
        for (int i = 0; i < actual2.size(); i++) {
            for (int j = 0; j < actual3.size(); j++) {
               Assert.assertFalse(actual2.contains(firstName));
               Assert.assertFalse(actual3.contains(lastName));
                break;
            }

        }


    }}
