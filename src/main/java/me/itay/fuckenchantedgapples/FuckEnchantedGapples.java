package me.itay.fuckenchantedgapples;

import org.bukkit.plugin.java.JavaPlugin;

public final class FuckEnchantedGapples extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new InteractionListener(), this);
        // Plugin startup logic
    }
    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
