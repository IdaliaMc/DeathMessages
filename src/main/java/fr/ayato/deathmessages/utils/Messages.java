package fr.ayato.deathmessages.utils;

import fr.ayato.deathmessages.Main;
import java.util.List;

public class Messages {

    public static String getRandomMessage() {
        Main plugin = Main.getInstance();
        List<String> msgList = plugin.getConfig().getStringList("messages");
        System.out.println("msgList.size() " + msgList.size());
        int random = (int) (Math.random() * msgList.size());
        System.out.println("random " + random);
        return msgList.get(random);
    }

    public static String getNoKillerMessage() {
        Main plugin = Main.getInstance();
        return plugin.getConfig().getString("noKillerMessage");
    }
}
