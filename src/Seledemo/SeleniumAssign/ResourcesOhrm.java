package Seledemo.SeleniumAssign;

import net.bytebuddy.pool.TypePool;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.text.Utilities;

public class ResourcesOhrm {
    public static void main(String args[]) throws InterruptedException {
        ResourcesOhrm ro = new ResourcesOhrm();
        WebDriver driver = null;

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        Actions action = new Actions(driver);
        driver.manage().window().maximize();

        driver.get("http://www.orangehrm.com");
        Thread.sleep(5000);
        WebElement Resource = driver.findElement(By.xpath("(//a[@class='link'])[3]"));
        action.moveToElement(Resource).perform();
        WebElement Guide = driver.findElement(By.xpath("//a[@href='orangehrm-resources/e-books/guide-to-choosing-the-best-free-hr-software']"));
        ro.ClickButton(Guide);
        WebElement FirstNm = driver.findElement(By.xpath("//input[@name='FirstName']"));
        ro.Entertxt(FirstNm, "Deepa");
        WebElement LastNm = driver.findElement(By.xpath("//input[@name='LastName']"));
        ro.Entertxt(LastNm, "Agrawal");
        WebElement Emal = driver.findElement(By.xpath("//input[@name='Email']"));
        ro.Entertxt(Emal, "abc@xyz.com");
        WebElement CompanyNm = driver.findElement(By.xpath("//input[@name='CompanyName']"));
        ro.Entertxt(CompanyNm, "Mahindra");
        WebElement Countrycod = driver.findElement(By.xpath("//select[@name='Country']"));
        Select s1 = new Select(Countrycod);
        ro.ClickButton(Countrycod);
        s1.selectByValue("India");
        WebElement StateNm = driver.findElement(By.xpath("//select[@name='State']"));
        Select s2 = new Select(StateNm);
        s2.selectByValue("Maharashtra");
        WebElement iFrame = driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']"));
        driver.switchTo().frame(iFrame);
        Thread.sleep(5000);
        WebElement recaptchaCheckbx = driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']"));
        //Thread.sleep(5000);
        ro.ClickButton(recaptchaCheckbx);
        driver.switchTo().defaultContent();
        WebElement Downld = driver.findElement(By.xpath("//input[@name='action_request']"));
        ro.ClickButton(Downld);
        Thread.sleep(2000);
        //driver.get("http://www.orangehrm.com");
        Thread.sleep(2000);
        WebElement Resource1 = driver.findElement(By.xpath("(//a[@class='link'])[3]"));
    action.moveToElement(Resource1).perform();
        WebElement   Workforce = driver.findElement(By.xpath("//a[@href='orangehrm-resources/e-books/building-a-happier-workforce']"));
        ro.ClickButton(Workforce);
        WebElement FirstNm1 = driver.findElement(By.xpath("//input[@name='FirstName']"));
        ro.Entertxt(FirstNm1, "Deepa");
        WebElement LastNm1 = driver.findElement(By.xpath("//input[@name='LastName']"));
        ro.Entertxt(LastNm1, "Agrawal");
        WebElement Emal1 = driver.findElement(By.xpath("//input[@name='Email']"));
        ro.Entertxt(Emal1, "abc@xyz.com");
        WebElement CompanyNm1 = driver.findElement(By.xpath("//input[@name='CompanyName']"));
        ro.Entertxt(CompanyNm1, "Mahindra");
        WebElement Countrycod1 = driver.findElement(By.xpath("//select[@name='Country']"));
        Select s3 = new Select(Countrycod1);
        ro.ClickButton(Countrycod1);
        s3.selectByValue("India");
        WebElement StateNm1 = driver.findElement(By.xpath("//select[@name='State']"));
        Select s4 = new Select(StateNm1);
        s4.selectByValue("Maharashtra");
        WebElement iFrame1 = driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']"));
        driver.switchTo().frame(iFrame1);
        Thread.sleep(5000);
        WebElement recaptchaCheckbx1 = driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']"));
        //Thread.sleep(5000);
        ro.ClickButton(recaptchaCheckbx1);
        driver.switchTo().defaultContent();
        WebElement Downld1 = driver.findElement(By.xpath("//input[@name='action_request']"));
        ro.ClickButton(Downld1);
        //driver.navigate().refresh();
        WebElement Resource2 = driver.findElement(By.xpath("(//a[@class='link'])[3]"));
        action.moveToElement(Resource2).perform();
        WebElement Datadr=driver.findElement(By.xpath("//a[@href='orangehrm-resources/e-books/data-driven-decision-making-in-hr']"));
        ro.ClickButton(Datadr);
        //driver.navigate().back();
        WebElement Resource3 = driver.findElement(By.xpath("(//a[@class='link'])[3]"));
        action.moveToElement(Resource3).perform();
        WebElement ebook=driver.findElement(By.xpath("//a[@href='orangehrm-resources/e-books/']"));
        ro.ClickButton(ebook);
        //driver.navigate().back();
        WebElement Resource4 = driver.findElement(By.xpath("(//a[@class='link'])[3]"));
        Thread.sleep(9000);
        action.moveToElement(Resource4).perform();
        WebElement starter=driver.findElement(By.xpath("//a[@href='assets/Documents/pdf/Starter-Overview.pdf']"));
        ro.ClickButton(starter);
        Thread.sleep(9000);
        driver.navigate().back();

        WebElement Resource5 = driver.findElement(By.xpath("(//a[@class='link'])[3]"));
        action.moveToElement(Resource5).perform();
        WebElement advance=driver.findElement(By.xpath("//a[@href='assets/Documents/pdf/Platform-Overview.pdf']"));
        ro.ClickButton(advance);
        Thread.sleep(9000);
        driver.navigate().back();

        WebElement Resource6 = driver.findElement(By.xpath("(//a[@class='link'])[3]"));
        action.moveToElement(Resource6).perform();
        WebElement roi=driver.findElement(By.xpath("//a[@href='assets/Documents/pdf/OrangeHRM-ROI.pdf']"));
        ro.ClickButton(roi);
        Thread.sleep(9000);
        driver.navigate().back();

        WebElement Resource7 = driver.findElement(By.xpath("(//a[@class='link'])[3]"));
        action.moveToElement(Resource7).perform();
        WebElement version=driver.findElement(By.xpath("//a[@href='blog/orangehrm-releases-version-7-4']"));
        ro.ClickButton(version);
       // driver.navigate().back();
        WebElement Resource8 = driver.findElement(By.xpath("(//a[@class='link'])[3]"));
        action.moveToElement(Resource8).perform();
        WebElement free=driver.findElement(By.xpath("//a[@href='blog/how-can-free-hr-management-software-help-your-company']"));
        ro.ClickButton(free);
       // driver.navigate().back();
        WebElement Resource9 = driver.findElement(By.xpath("(//a[@class='link'])[3]"));
        action.moveToElement(Resource9).perform();
        WebElement talent=driver.findElement(By.xpath("//a[@href='blog/how-can-an-hris-help-retain-the-best-talent']"));
        ro.ClickButton(talent);
      //  driver.navigate().back();
        WebElement Resource10 = driver.findElement(By.xpath("(//a[@class='link'])[3]"));
        action.moveToElement(Resource10).perform();
        WebElement blog=driver.findElement(By.xpath("//a[@href='blog/']"));
        ro.ClickButton(blog);
        //driver.navigate().back();
        WebElement Resource11 = driver.findElement(By.xpath("(//a[@class='link'])[3]"));
        action.moveToElement(Resource11).perform();
        WebElement security=driver.findElement(By.xpath("//a[@href='assets/Documents/pdf/OrangeHRM-Data-Security.pdf']"));
        ro.ClickButton(security);
        driver.navigate().back();
        WebElement Resource12 = driver.findElement(By.xpath("(//a[@class='link'])[3]"));
        action.moveToElement(Resource12).perform();
        WebElement forum=driver.findElement(By.xpath("//a[@href='https://forum.orangehrm.com/']"));
        ro.ClickButton(forum);
        driver.navigate().back();
        WebElement Resource13 = driver.findElement(By.xpath("(//a[@class='link'])[3]"));
        action.moveToElement(Resource13).perform();
        WebElement api=driver.findElement(By.xpath("//a[@href='api-docs']"));
        ro.ClickButton(api);

    }
       public void ClickButton(WebElement element)
        {

            element.click();
        }
        public void Entertxt(WebElement element,String str)
        {
        element.sendKeys(str);

        }


    }

