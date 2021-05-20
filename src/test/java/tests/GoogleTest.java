package tests;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class GoogleTest {

    private static WebDriver driver;

    @BeforeAll
    public static void init(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
         driver = new ChromeDriver(options);
    }

    @Test
    public void test1() {
        driver.get("http://google.com");
        driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("Калькулятор", Keys.ENTER);
        WebElement element = driver.findElement(By.xpath(".//div[text()='(']"));element.click();
        WebElement elementq = driver.findElement(By.xpath(".//div[text()='1']"));elementq.click();
        WebElement elementw = driver.findElement(By.xpath(".//div[text()='+']"));elementw.click();
        WebElement elemente = driver.findElement(By.xpath(".//div[text()='2']"));elemente.click();
        WebElement elementr = driver.findElement(By.xpath(".//div[text()=')']"));elementr.click();
        WebElement elementt = driver.findElement(By.xpath(".//div[text()='×']"));elementt.click();
        WebElement elementy = driver.findElement(By.xpath(".//div[text()='3']"));elementy.click();
        WebElement elementu = driver.findElement(By.xpath(".//div[text()='−']"));elementu.click();
        WebElement elementi = driver.findElement(By.xpath(".//div[text()='4']"));elementi.click();
        WebElement elemento = driver.findElement(By.xpath(".//div[text()='0']"));elemento.click();
        WebElement elementp = driver.findElement(By.xpath(".//div[text()='÷']"));elementp.click();
        WebElement elementa = driver.findElement(By.xpath(".//div[text()='5']"));elementa.click();
        WebElement elements = driver.findElement(By.xpath(".//div[text()='=']"));elements.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement elementb = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.fB3vD")));

    }


    @Test
    public void test2() {
        driver.get("http://google.com");
        driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("Калькулятор", Keys.ENTER);
        WebElement element = driver.findElement(By.xpath(".//div[text()='6']"));element.click();
        WebElement elementq = driver.findElement(By.xpath(".//div[text()='÷']"));elementq.click();
        WebElement elemento = driver.findElement(By.xpath(".//div[text()='0']"));elemento.click();
        WebElement elements = driver.findElement(By.xpath(".//div[text()='=']"));elements.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement elementj = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.fB3vD")));


    }


    @Test
    public void test3() {
        driver.get("http://google.com");
        driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("Калькулятор", Keys.ENTER);
        WebElement element = driver.findElement(By.xpath(".//div[text()='sin']"));element.click();
        WebElement elements = driver.findElement(By.xpath(".//div[text()='=']"));elements.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement elementl = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.fB3vD")));


    }
    @AfterAll
    public static void teardown(){
        driver.quit();

    }
}
