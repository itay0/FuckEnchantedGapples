package me.itay.fuckenchantedgapples;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;

public class InteractionListener implements Listener {

    @EventHandler
    public void onInteract(PlayerItemConsumeEvent e) {
        Player p = e.getPlayer();
        if (e.getItem().getType() == Material.ENCHANTED_GOLDEN_APPLE) {
            e.getPlayer().sendMessage(ChatColor.DARK_PURPLE + "WARN: " + ChatColor.LIGHT_PURPLE + "You can't eat that.");
            e.setCancelled(true);
        }
    }
}
