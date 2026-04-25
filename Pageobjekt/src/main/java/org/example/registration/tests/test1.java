package org.example.registration.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.registration.pageobjectregistrationform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        pageobjectregistrationform object = new pageobjectregistrationform(driver);
        object.cliksait();
        object.puse();
        object.clikregistr();
        object.puse();
        object.reitfirstnam("232");
        object.puse();
        object.reitlastnam("242");
        object.puse();
        object.reitstreet("2");
        object.puse();
        object.reitcity("4");
        object.puse();
        object.reitstate("4");
        object.puse();
        object.reitcode("3");
        object.puse();
        object.reitphonenum("3");
        object.puse();
        object.reitssn("2");
        object.puse();
        object.reitusernam("892");
        object.puse();
        object.reitpassword("66");
        object.puse();
        object.reitrepeatpass("66");
        object.puse();
        object.clicreg();
    }
}
