package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class FacebookTestingApp {

    private static final String XPATH_COOKIES = "//button[contains(string(), 'Allow essential and optional cookies')]";
    private static final String XPATH_NEW_ACCOUNT = "//div[contains(@class, \"_6ltg\")]/a";
    private static final String XPATH_FIRSTNAME = "//input[contains(@name, \"firstname\")]";
    private static final String XPATH_LASTNAME = "//input[contains(@name, \"lastname\")]";
    private static final String XPATH_MAIL = "//input[contains(@name ,\"reg_email__\")]";
    private static final String XPATH_PASS = "//input[contains(@name ,\"reg_passwd__\")]";
    private static final String XPATH_MONTH = "//select[contains(@id, \"month\")]";
    private static final String XPATH_DAY = "//select[contains(@id, \"day\")]";
    private static final String XPATH_YEAR = "//select[contains(@id, \"year\")]";
    private static final String XPATH_GENDER = "//input[contains(@name, \"sex\")] and contains(@Value, \"2\")";

    public static void main(String[] args) {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        driver.findElement(By.xpath(XPATH_COOKIES)).click();
        driver.findElement(By.xpath(XPATH_NEW_ACCOUNT)).click();

        WebElement firstname = driver.findElement(By.xpath(XPATH_FIRSTNAME));
        firstname.sendKeys("John");

        WebElement lastname = driver.findElement(By.xpath(XPATH_LASTNAME));
        lastname.sendKeys("Smith");

        WebElement mail = driver.findElement(By.xpath(XPATH_MAIL));
        mail.sendKeys("test@test.com");

        WebElement password = driver.findElement(By.xpath(XPATH_PASS));
        password.sendKeys("testpass");

        WebElement month = driver.findElement(By.xpath(XPATH_MONTH));
        Select selectMonth = new Select(month);
        selectMonth.selectByIndex(4);

        WebElement day = driver.findElement(By.xpath(XPATH_DAY));
        Select selectDay = new Select(day);
        selectDay.selectByIndex(15);

        WebElement year = driver.findElement(By.xpath(XPATH_YEAR));
        Select selectYear = new Select(year);
        selectYear.selectByValue("1995");

        driver.findElement(By.xpath(XPATH_GENDER)).click();
    }
}
