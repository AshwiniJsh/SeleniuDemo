package Seledemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumDem {
    public static void main(String args[]) throws InterruptedException{
        SeleniumDem sd=new SeleniumDem();

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        Actions action=new Actions(driver);
        driver.get("https://standard02.bytephaserecovery.com/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(2000);
       WebElement login= driver.findElement(By.xpath("(//input[@class='dx-texteditor-input'])[1]"));//.sendKeys("ashw.ini.bytephase@gmail.com");
     Thread.sleep(3000);
       sd.Entertxt(login,"ashw.ini.bytephase@gmail.com");
       WebElement psd= driver.findElement(By.xpath("(//input[@class='dx-texteditor-input'])[2]"));//.sendKeys("1234");
        sd.Entertxt(psd,"1234");
        WebElement btn=driver.findElement(By.xpath("(//span[@class='text-white ms-2'])"));//.click();
//driver.quit();
        sd.ClickButton(btn);
        Thread.sleep(2000);
        WebElement custmr=driver.findElement(By.xpath("(//span[@class='ng-tns-c136-0 ng-star-inserted'])[6]"));
        sd.ClickButton(custmr);
WebElement plusbtn=driver.findElement(By.xpath("(//i[@class='dx-icon dx-icon-plus'])"));
sd.ClickButton(plusbtn);
/*WebElement cler=driver.findElement(By.xpath("(//span[@class='dx-icon dx-icon-clear'])"));
sd.ClickButton(cler);
WebElement drop=driver.findElement(By.xpath("(//input[@class='dx-texteditor-input'])[1]"));
        //Select s=new Select(drop);
       // s.selectByIndex(1);
        sd.ClickButton(drop);

        drop.sendKeys("Corporate User");
        sd.ClickButton(drop);*/

        WebElement custNm=driver.findElement(By.xpath("(//input[@class='dx-texteditor-input'])[2]"));
        sd.Entertxt(custNm,"Kanika D Joshi");
        Thread.sleep(2000);
WebElement mb=driver.findElement(By.xpath("(//input[@class='dx-texteditor-input'])[3]"));
sd.Entertxt(mb,"9836856389");
WebElement email=driver.findElement(By.xpath("(//input[@class='dx-texteditor-input'])[4]"));
sd.Entertxt(email,"kanika1@ggj.com");
        WebElement phno=driver.findElement(By.xpath("(//input[@class='dx-texteditor-input'])[5]"));
        sd.Entertxt(phno,"0212-6879865");
        Thread.sleep(2000);
        WebElement gst=driver.findElement(By.xpath("(//input[@class='dx-texteditor-input'])[6]"));
        sd.Entertxt(gst,"18AABCU9603R1ZM");
        WebElement mailchk=driver.findElement(By.xpath("//span[@class='dx-checkbox-icon']"));
        sd.ClickButton(mailchk);
        WebElement cret=driver.findElement(By.xpath("//span[@class='text-white ms-2']"));
        sd.ClickButton(cret);





    }
    public void ClickButton(WebElement element)
    {
        element.click();
    }
    public void Entertxt(WebElement element,String str){
        element.sendKeys(str);
    }
}
