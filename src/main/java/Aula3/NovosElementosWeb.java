package Aula3;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NovosElementosWeb {
    ChromeDriver driver;

    public NovosElementosWeb(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        desafio();
    }

    public void revisao(){
//        String urlGoogle = "https://www.google.com.br/";
//        driver.get(urlGoogle);
//        Assertions.assertEquals("Google", driver.getTitle());
//        Assertions.assertEquals(urlGoogle, driver.getCurrentUrl());
    }

    public void novosElementos(){
       driver.get("https://www.amazon.com.br");
       driver.findElement(By.className("dwaAq"));
    }

    public void desafio(){
        driver.get("https://cps-check.com/pt/click-counter");
        WebElement botaoAcrescimo = driver.findElement(By.id("click-plus"));
        for (int i = 0; i < 10; i++) {
            botaoAcrescimo.click();
        }
        WebElement input = driver.findElement(By.id("count"));
        Assertions.assertEquals("10", input.getAttribute("value"));
    }

    //LOCATORS
    //Botão "Para empresas"
//    Css selector -> "#__next > div > section.sc-86ca6303-0.lfVMJc > div.sc-86ca6303-1.iApUqk > span:nth-child(4) > a"
//    FullXpath -> "/html/body/div/div/section[1]/div[1]/span[4]/a"
//    Xpath -> "//*[@id="__next"]/div/section[1]/div[1]/span[4]/a"
//    ClassName -> "dwaAq"
//    name -> "range_input" (/html/body/form/input[3])
//    id ->















}
