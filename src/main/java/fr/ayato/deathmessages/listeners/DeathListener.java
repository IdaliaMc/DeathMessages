package fr.ayato.deathmessages.listeners;

import fr.ayato.deathmessages.utils.Messages;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class DeathListener implements Listener {

    @EventHandler
    public void onDeath(PlayerDeathEvent e) {
        Player dead = e.getEntity().getPlayer();
        Player killer = e.getEntity().getKiller();
        String message;
        if (killer == null) {
            message = Messages.getNoKillerMessage().replace("%deadName%", dead.getName());
        } else {
            String deathMessage = Messages.getRandomMessage().replace("%deadName%", dead.getName());
            message = deathMessage.replace("%killerName%", killer.getName());
        }
        e.setDeathMessage(null);
        Bukkit.broadcastMessage(message);
    }
}
