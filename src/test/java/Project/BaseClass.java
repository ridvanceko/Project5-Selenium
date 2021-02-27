package Project;

import Pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;

public class BaseClass {

    @AfterClass

    public void tearDown(){
        // driver.close();
        // driver.quit();
    }



        /*
        Navigate to the "http://icehrm-open.gamonoid.com/login.php?" Enter username "admin"
        Enter password "admin"
        Click sign-in button
        Click Switch button
        Validate "Switch Employee" is displayed and text is matching,  Validate "Select The Employee to Switch Into" is displayed and text is matching
        Select "Lala Lamees"
        Click Switch button
        Validate "Lala Lamees" name is displayed and name is matching with selected name
        Validate "Changed to" text is correct
        Validate color of circle is brown (#8a6d3b)
         */

    WebDriver driver;
    HomePage homePage;
    SoftAssert softAssert;
    Select select;



    @BeforeClass
    public void setup(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        softAssert = new SoftAssert();
        // select = new Select(homePage.iceHrmDD);


    }



}
