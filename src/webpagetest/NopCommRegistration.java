package webpagetest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class NopCommRegistration {
    public WebDriver driver;
    @Before


        public void openBrowser() {
            String baseURL = "https://demo.nopcommerce.com/";
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.get(baseURL);

    }
    @Test
    public void registraionPage(){
        WebElement registrationLink;
        registrationLink = driver.findElement(By.xpath("//a[@class='ico-register']"));
        registrationLink.click();


        WebElement radioBtnSelect;
        radioBtnSelect = driver.findElement(By.xpath("//input[@id='gender-male']"));
        radioBtnSelect.click();

        WebElement firstNameField;
        firstNameField = driver.findElement(By.id("FirstName"));
        firstNameField.sendKeys("Ravibhai");

        WebElement lastNameField;
        lastNameField = driver.findElement(By.id("LastName"));
        lastNameField.sendKeys("Patel");

        WebElement dateOfBirthDayField;
        dateOfBirthDayField = driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
        dateOfBirthDayField.sendKeys("29");

        WebElement dateOfBirthMonthField;
        dateOfBirthMonthField = driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
        dateOfBirthMonthField.sendKeys("April");

        WebElement dateOfBirthYearField;
        dateOfBirthYearField = driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
        dateOfBirthYearField.sendKeys("1998");

        WebElement emailField;
        emailField = driver.findElement(By.xpath("//input[@id='Email']"));
        emailField.sendKeys("1234@yahoo.com");

        WebElement componyNameField;
        componyNameField = driver.findElement(By.id("Company"));
        componyNameField.sendKeys("Bova");

        WebElement selectField;
        selectField = driver.findElement(By.id("Newsletter"));
        selectField.click();

        WebElement passwordField;
        passwordField = driver.findElement(By.id("Password"));
        passwordField.sendKeys("Hanuman");

        WebElement confirmPasswordField;
        componyNameField = driver.findElement(By.id("ConfirmPassword"));
        componyNameField.sendKeys("Hanuman");

        WebElement registerField;
        registerField = driver.findElement(By.id("register-button"));
        registerField.click();

    }
    @After

    public void closeBrowers() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();

    }

}