package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.*;

public class TestNGExample {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        this.driver = new FirefoxDriver();
        this.driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        this.driver.quit();
    }

    @Test
    public void blazedemoTitleIsRight() throws Exception {
        this.driver.get("http://blazedemo.com/");
        Assert.assertEquals(this.driver.getTitle(), "BlazeDemo");
        WebDriver wd = this.driver;

        if (!wd.findElement(By.xpath("//div[3]/form/select[1]//option[3]")).isSelected()) {
            wd.findElement(By.xpath("//div[3]/form/select[1]//option[3]")).click();
        }
        if (!wd.findElement(By.xpath("//div[3]/form/select[2]//option[6]")).isSelected()) {
            wd.findElement(By.xpath("//div[3]/form/select[2]//option[6]")).click();
        }
        wd.findElement(By.cssSelector("input.btn.btn-primary")).click();
/*
        // click on chosen flight
        Thread.sleep(1000);
        wd.findElement(By.cssSelector("input.btn.btn-small")).click();

	// Fill form
        wd.findElement(By.id("inputName")).sendKeys("FirstName LastName");
        wd.findElement(By.id("address")).sendKeys("123 Beautiful st.");
        wd.findElement(By.id("city")).sendKeys("Santa Clara");
        wd.findElement(By.id("state")).sendKeys("CA");
        wd.findElement(By.id("zipCode")).sendKeys("12345");
        wd.findElement(By.id("creditCardNumber")).sendKeys("1234 5678 8765 4321");
        wd.findElement(By.id("nameOnCard")).sendKeys("FirstName LastName");

	// click Purchase
        wd.findElement(By.cssSelector("input.btn.btn-primary")).click();
*/
        Thread.sleep(3000);

    }

}
