package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {


        public HomePage(WebDriver driver) {
            PageFactory.initElements(driver, this);

        }

        @FindBy(id = "username")
        public WebElement username;


        @FindBy(id = "password")
        public WebElement password;

        @FindBy(xpath = "//*[@id='loginForm']/div[4]/button")
        public WebElement logIn;

        @FindBy(xpath = "//i[@class='glyphicon glyphicon-new-window']")
        public WebElement switchButton;

        @FindBy(id = "myModalLabel")
        public WebElement modalLable;

        @FindBy(xpath = "//p[text()='Select The Employee to Switch Into']")
        public WebElement selectEmployee;

        @FindBy(xpath = "//li[@class ='select2-results-dept-0 select2-result" +
                " select2-result-selectable'] //*[contains(text(), 'Lala Lamees')]")
        public WebElement iceHrmDD;

        @FindBy(xpath = "//div[@id='s2id_switch_emp']/a/span[contains(@class,'select2-arrow')]")
        public WebElement arrow;

        @FindBy(xpath = "//*[@id='profileSwitchModal']/div/div/div[3]/button[2]")
        public WebElement blueSwitchButton;


        @FindBy(xpath = "//i[@class='fa fa-circle text-warning']")
        public WebElement brownCircle;

    }

