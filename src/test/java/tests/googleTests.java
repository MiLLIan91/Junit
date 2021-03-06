package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleTests{

    private static WebDriver driver;

    @BeforeAll
    public static void inid() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();


    }

    @Test
    public void test1() {
        driver.get("https://google.com");
        driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("калькулятор", Keys.ENTER);
        driver.findElement(By.xpath("//div[@jsname='j93WEe']")).click();
        driver.findElement(By.xpath("//div[@jsname='N10B9']")).click();
        driver.findElement(By.xpath("//div[@jsname='XSr6wc']")).click();
        driver.findElement(By.xpath("//div[@jsname='lVjWed']")).click();
        driver.findElement(By.xpath("//div[@jsname='qCp9A']")).click();
        driver.findElement(By.xpath("//div[@jsname='YovRWb']")).click();
        driver.findElement(By.xpath("//div[@jsname='KN1kY']")).click();
        driver.findElement(By.xpath("//div[@jsname='pPHzQc']")).click();
        driver.findElement(By.xpath("//div[@jsname='xAP7E']")).click();
        driver.findElement(By.xpath("//div[@jsname='bkEvMb']")).click();
        driver.findElement(By.xpath("//div[@jsname='WxTTNd']")).click();
        driver.findElement(By.xpath("//div[@jsname='Ax5wH']")).click();
        driver.findElement(By.xpath("//div[@jsname='Pt8tGc']")).click();
    }
    @Test
    public void test2() {
        driver.get("https://google.com");
        driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("калькулятор", Keys.ENTER);
        driver.findElement(By.xpath("//div[@jsname='abcgof']")).click();
        driver.findElement(By.xpath("//div[@jsname='WxTTNd']")).click();
        driver.findElement(By.xpath("//div[@jsname='bkEvMb']")).click();
        driver.findElement(By.xpath("//div[@jsname='Pt8tGc']")).click();

    }
    @Test
    public void test3() {
        driver.get("https://google.com");
        driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("калькулятор", Keys.ENTER);
        driver.findElement(By.xpath("//div[@jsname='aN1RFf']")).click();
        driver.findElement(By.xpath("//div[@jsname='Pt8tGc']")).click();


    }

    @AfterAll
    public static void teardown() {
        driver.quit();

    }
}

