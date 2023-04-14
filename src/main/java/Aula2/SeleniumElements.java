package Aula2;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumElements {
    public ChromeDriver driver;

//Forma 4 - Hard Coded Location
//    public Aula2.SeleniumElements(){
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\igor.dantas\\Drivers\\bin\\chromedriver.exe");
//        ChromeDriver driver = new ChromeDriver();
//    }

//Forma 3 - The Path Enviroment Variable (Recomendado)
    public SeleniumElements(){
        driver = new ChromeDriver();
    }




}
