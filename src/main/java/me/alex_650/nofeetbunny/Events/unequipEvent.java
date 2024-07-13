package me.alex_650.nofeetbunny.Events;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.entity.Rabbit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;

public class unequipEvent implements Listener {

    @EventHandler
    public void unequipEvent (InventoryClickEvent event) {

        if(!event.getSlotType().equals(InventoryType.SlotType.ARMOR)) return;

        if (event.getSlot() != 36) return;

        Player player = (Player) event.getWhoClicked();

        Rabbit rabbit = player.getWorld().spawn(player.getLocation(), Rabbit.class);

        rabbit.setRabbitType(Rabbit.Type.THE_KILLER_BUNNY);

    }
}
