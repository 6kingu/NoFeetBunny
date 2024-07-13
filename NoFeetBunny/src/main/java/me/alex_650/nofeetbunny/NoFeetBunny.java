package me.alex_650.nofeetbunny;

import me.alex_650.nofeetbunny.Events.onPlayerJoin;
import org.bukkit.plugin.java.JavaPlugin;

public final class NoFeetBunny extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new onPlayerJoin(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
