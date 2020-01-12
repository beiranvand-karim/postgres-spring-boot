package com.sample.postgress.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class WebsiteCrawler {


    private WebDriver driver;

    public WebsiteCrawler() {
        // Define the location of the chromedriver
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        // Use headless mode for the ChromeDriver
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--no-sandbox");
        this.driver = new ChromeDriver(chromeOptions);
    }

    public void crawl(String url) {
        try {
            // Navigate to the specified directory
            driver.navigate().to(url);
            // Sleep for 5 seconds in case the website has not fully loaded
            Thread.sleep(5000);
            // Take the screenshot and copy to the specified directory
            File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
             FileUtils.copyFile(src, new File("./test-image.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void close() {
        // Close after completion
        driver.close();
    }

}
