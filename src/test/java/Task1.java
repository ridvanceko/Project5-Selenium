import Project.BaseClass;
import org.testng.annotations.Test;



    public class Task1 extends BaseClass {

        @Test

        public void test1() throws InterruptedException {
            driver.get("https://icehrm-open.gamonoid.com/login.php?");
            homePage.username.sendKeys("admin");
            homePage.password.sendKeys("admin");
            homePage.logIn.click();
            homePage.switchButton.click();
            softAssert.assertEquals("Switch Employee", homePage.modalLable.getText());
            Boolean isDisplayed1 = homePage.modalLable.isDisplayed();

            softAssert.assertEquals("Select The Employee to Switch Into", homePage.selectEmployee.getText());
            Boolean isDisplayed2 = homePage.selectEmployee.isDisplayed();
            System.out.println(isDisplayed1);
            System.out.println(isDisplayed2);

            Thread.sleep(2000);

            homePage.arrow.click();
            Thread.sleep(500);
            homePage.iceHrmDD.click();
            homePage.blueSwitchButton.click();

            Boolean circle = homePage.brownCircle.isDisplayed();
            System.out.println(circle);


            // softAssert.assertEquals("#8a6d3b",homePage.brownCircle.getCssValue());
            //System.out.println(homePage.brownCircle);


//        Actions actions = new Actions(driver);
//        WebElement listOfEmployee = homePage.iceHrmDD;
//
//        Thread.sleep(3000);
//        actions.moveToElement(listOfEmployee);
//
//
//        List<WebElement> empOptions = driver.findElements(By.id("s2id_switch_emp"));
//        for(WebElement opt: empOptions) {
//            if(opt.getText().contains("Lala")) {
//                Thread.sleep(2000);
//                opt.click();
//            }
//        }
//       // select.selectByVisibleText("Lal");

        }


    }

