package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UsersPage {
    WebDriver driver;

    public UsersPage() {
        driver= Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".btn.btn-link.pull-right")
    public WebElement addUser;

    @FindBy(xpath = "//*[@name='FirstName']")
    public WebElement firstName;

    @FindBy(xpath = "//*[@name='LastName']")
    public WebElement lastName;

    @FindBy(xpath = "//*[@name='UserName']")
    public WebElement userName;

    @FindBy(xpath = "//*[@name='Password']")
    public WebElement password;

    @FindBy(xpath = "//*[@class='radio ng-scope ng-binding'][1]")
    public WebElement custRadioBtn;

    @FindBy(xpath = "//*[@name='RoleId']")
    public WebElement roleID;

    @FindBy(xpath = "//*[@name='Email']")
    public WebElement email;

    @FindBy(xpath = "//*[@name='Mobilephone']")
    public WebElement cellPhone;

    @FindBy(css = ".btn.btn-success")
    public WebElement saveBtn;



}
