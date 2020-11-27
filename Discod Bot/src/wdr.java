import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class wdr {

    public WebDriver init() {

        System.setProperty("webdriver.chrome.driver", filepath);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        try {
            TimeUnit.SECONDS.sleep(15);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Done Waiting");
        return driver;
    }

}
