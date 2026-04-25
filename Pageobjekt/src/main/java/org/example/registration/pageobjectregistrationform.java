package org.example.registration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pageobjectregistrationform {
    private WebDriver driver;

    public pageobjectregistrationform(WebDriver driver){
        this.driver = driver;
    }
    public void cliksait(){
        driver.get("https://parabank.parasoft.com/parabank/index.htm;jsessionid=D969CC6FF1DB38FCF5F8B70DD0924555");
    }
    public void puse(){
        try{
            Thread.sleep(3958);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    public void clikregistr(){
        driver.findElement(By.xpath(".//a[text()='Register']")).click();
    }
    public void reitfirstnam(String tekst1){
        driver.findElement(By.xpath(".//input[@id='customer.firstName']")).sendKeys(tekst1);
    }
    public void reitlastnam(String tekst2){
        driver.findElement(By.xpath(".//input[@id='customer.lastName']")).sendKeys(tekst2);
    }
    public void reitstreet(String tekst3){
        driver.findElement(By.xpath(".//input[@id='customer.address.street']")).sendKeys(tekst3);
    }
    public void reitcity(String tekst4){
        driver.findElement(By.xpath(".//input[@id='customer.address.city']")).sendKeys(tekst4);
    }
    public void reitstate(String tekst5){
        driver.findElement(By.xpath(".//input[@id='customer.address.state']")).sendKeys(tekst5);
    }
    public void reitcode(String tekst6){
        driver.findElement(By.xpath(".//input[@id='customer.address.zipCode']")).sendKeys(tekst6);
    }
    public void reitphonenum (String tekst7){
        driver.findElement(By.xpath(".//input[@id='customer.phoneNumber']")).sendKeys(tekst7);
    }
    public void reitssn (String tekst8){
        driver.findElement(By.xpath(".//input[@id='customer.ssn']")).sendKeys(tekst8);
    }
    public void reitusernam (String user){
        driver.findElement(By.xpath(".//input[@id='customer.username']")).sendKeys(user);
    }
    public void reitpassword (String pass){
        driver.findElement(By.xpath(".//input[@id='customer.password']")).sendKeys(pass);
    }
    public void reitrepeatpass (String pass1){
        driver.findElement(By.xpath(".//input[@id='repeatedPassword']")).sendKeys(pass1);
    }
    public void clicreg (){
        driver.findElement(By.xpath(".//input[@value='Register']")).click();
    }
    public void cliclog (){
        driver.findElement(By.xpath(".//a[@href='logout.htm']")).click();
    }
    public void reituser (String user1){
        driver.findElement(By.xpath(".//input[@name='username']")).sendKeys(user1);
    }
    public void reitpass (String pass2){
        driver.findElement(By.xpath(".//input[@name='password']")).sendKeys(pass2);
    }
    public void cliclogin (){
        driver.findElement(By.xpath(".//input[@value='Log In']")).click();
    }
}
