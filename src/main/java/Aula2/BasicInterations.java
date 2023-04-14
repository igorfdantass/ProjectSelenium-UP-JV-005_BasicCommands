package Aula2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicInterations {

    FirefoxDriver driver;

    public BasicInterations(){
        driver = new FirefoxDriver();
    }

    public void fazInteracoesBasicas(){
        driver.get("https://www.google.com.br/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.className("gNO89b")).click();
        driver.findElement(By.className("gLFyf")).sendKeys("Ada Tech");
    }

    @Test
    public void testInterations(){
        driver.get("https://www.google.com.br/");
        Assertions.assertEquals("Google", driver.getTitle());
        driver.findElement(By.className("gNO89b")).click();
    }
}
