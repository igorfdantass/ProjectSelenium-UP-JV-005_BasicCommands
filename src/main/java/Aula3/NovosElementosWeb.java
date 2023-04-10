package Aula3;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.chrome.ChromeDriver;

public class NovosElementosWeb {
    ChromeDriver driver;

    public NovosElementosWeb(){
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
