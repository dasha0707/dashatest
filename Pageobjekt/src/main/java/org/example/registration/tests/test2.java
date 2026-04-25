package org.example.registration.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.registration.pageobjectregistrationform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        pageobjectregistrationform object = new pageobjectregistrationform(driver);
        object.cliksait();
        object.puse();
        object.clikregistr();
        object.puse();
        object.reitfirstnam("1");
        object.puse();
        object.reitpassword("3");
        object.puse();
        object.reitusernam("5");
        object.puse();
        object.clicreg();
    }
}
