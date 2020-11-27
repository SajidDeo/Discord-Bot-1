import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import javax.security.auth.login.LoginException;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;



public class Main {

  public static JDA jda;
    public static String prefix ="!";

    public static void main(String[] args) throws LoginException, InterruptedException {
           jda = JDABuilder.createDefault("discord token bot here").build();
           jda.getPresence().setStatus(OnlineStatus.ONLINE);
          jda.getPresence().setActivity(Activity.playing("status message"));


        jda.addEventListener(new commands());
            
  }



}
