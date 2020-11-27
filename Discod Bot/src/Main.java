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
           jda = JDABuilder.createDefault("NzgxNjc0NTQ1NjcyMzU1ODgw.X8BFJg.90VrPrDzgFKcDA_Gp05Qnsi2c6w").build();
           jda.getPresence().setStatus(OnlineStatus.ONLINE);
          jda.getPresence().setActivity(Activity.playing("doing le weird stuff with saud"));


        jda.addEventListener(new commands());
            
  }



}
