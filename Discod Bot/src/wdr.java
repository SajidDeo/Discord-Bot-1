import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class wdr {

    int number = 5;

    public WebDriver init() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sajid\\IdeaProjects\\Discod Bot\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.chegg.com/auth?action=login&redirect=https%3A%2F%2Fwww.chegg.com%2F");
        //driver.get("https://www.google.com/");
        try {
            TimeUnit.SECONDS.sleep(15);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Done Waiting");
        return driver;
    }

}