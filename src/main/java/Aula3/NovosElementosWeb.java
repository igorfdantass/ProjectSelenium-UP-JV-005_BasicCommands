package Aula3;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NovosElementosWeb {
    ChromeDriver driver;

    public NovosElementosWeb(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        novosElementos();
    }

    public void revisao(){
        String urlGoogle = "https://www.google.com.br/";
        driver.get(urlGoogle);
        Assertions.assertEquals("Google", driver.getTitle());
        Assertions.assertEquals(urlGoogle, driver.getCurrentUrl());
    }

    public void novosElementos(){
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

    }
}
