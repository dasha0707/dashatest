package org.example.registration.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.registration.pageobjectregistrationform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test3 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        pageobjectregistrationform object = new pageobjectregistrationform(driver);
        object.cliksait();
        object.puse();
        object.reituser("892");
        object.puse();
        object.reitpass("66");
        object.puse();
        object.cliclogin();
    }
}
