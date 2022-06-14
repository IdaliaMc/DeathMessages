package fr.ayato.deathmessages;

import fr.ayato.deathmessages.listeners.DeathListener;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public static Main getInstance() {
        return JavaPlugin.getPlugin(Main.class);
    }

    @Override
    public void onEnable() {
        System.out.println(ChatColor.WHITE + "--------------------");
        System.out.println(ChatColor.AQUA + "[" + ChatColor.YELLOW + "Idalia" + ChatColor.AQUA + "]" + ChatColor.GREEN + " DeathMessages is now enabled !");
        System.out.println(ChatColor.WHITE + "--------------------");
        saveDefaultConfig();
        getServer().getPluginManager().registerEvents(new DeathListener(), this);
    }

    @Override
    public void onDisable() {
        System.out.println(ChatColor.WHITE + "--------------------");
        System.out.println(ChatColor.AQUA + "[" + ChatColor.YELLOW + "Idalia" + ChatColor.AQUA + "]" + ChatColor.RED + " DeathMessages is now disabled !");
        System.out.println(ChatColor.WHITE + "--------------------");
    }
}
