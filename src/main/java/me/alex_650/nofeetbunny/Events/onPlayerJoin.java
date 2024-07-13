package me.alex_650.nofeetbunny.Events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.entity.Rabbit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class onPlayerJoin implements Listener {

    @EventHandler
    public void onPlayerJoin (PlayerJoinEvent event) {

        Player player = event.getPlayer();
        Inventory inv = player.getInventory();

        ItemStack stivali = inv.getItem(36);

        if (stivali != null) return;

        Rabbit rabbit = player.getWorld().spawn(player.getLocation(), Rabbit.class);

        rabbit.setRabbitType(Rabbit.Type.THE_KILLER_BUNNY);

    }

}
