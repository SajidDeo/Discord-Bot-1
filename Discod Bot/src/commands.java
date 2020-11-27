import it.grabz.grabzit.GrabzItClient;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.concurrent.TimeUnit;



public class commands extends ListenerAdapter {

    wdr driver1 = new wdr();

    WebDriver driver = driver1.init();

    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {




        String[] args = event.getMessage().getContentRaw().split(" ");
        if (args[0].equalsIgnoreCase(Main.prefix + "info")) {
            EmbedBuilder info = new EmbedBuilder();
            info.setTitle("Chegg Bot Information");
            info.setDescription("To use the bot do: !chegg chegglinkhere. I love you");
            info.setColor(0xf45642);
            info.setFooter("Created by Deo", event.getMember().getUser().getAvatarUrl());

            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(info.build()).queue();
            info.clear();
        }
        else if(args[0].equalsIgnoreCase(Main.prefix + "chegg")) {



            driver.get(args[1]);
            List<WebElement> listImages = driver.findElements(By.tagName("img"));
            System.out.println("No of images" + listImages.size());
            for (int m = 0; m< listImages.size();m++) {
                if(!(listImages.get(m).getAttribute("src").equals(""))&&!(listImages.get(m).getAttribute("src") == null)) {
                    System.out.println(listImages.get(m).getAttribute("src"));
                    String substr = "https://media";
                    String str1 = listImages.get(m).getAttribute("src").substring(0,13);
                    System.out.println(str1);
                    if (str1.compareTo(substr) == 0)
                    event.getChannel().sendMessage(listImages.get(m).getAttribute("src")).queue();
                }
            }


}
    }
}

