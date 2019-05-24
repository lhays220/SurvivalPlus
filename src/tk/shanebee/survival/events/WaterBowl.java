package tk.shanebee.survival.events;

import tk.shanebee.survival.managers.Items;
import tk.shanebee.survival.util.Utils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ItemSpawnEvent;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import tk.shanebee.survival.Survival;

public class WaterBowl implements Listener {

	@EventHandler(priority = EventPriority.HIGHEST)
	private void onConsume(PlayerItemConsumeEvent event) {
		if (!Survival.settings.getBoolean("Mechanics.Thirst.Enabled")) {
			if (event.isCancelled()) return;
			if (event.getItem().getType() == Material.BEETROOT_SOUP) {
				event.setCancelled(true);
			}
		}
	}

	@EventHandler
	private void onDrop(ItemSpawnEvent event) {
		if (event.isCancelled()) return;
		if (!Survival.settings.getBoolean("Mechanics.Thirst.Enabled")) return;
		final Item itemDrop = event.getEntity();
		if (itemDrop.getItemStack().getType() == Material.BOWL) {
			final Runnable task = () -> {
				if (itemDrop.getItemStack().getAmount() != 1) return;
				Location itemLocation = itemDrop.getLocation();
				if (itemLocation.getBlock().getType() == Material.WATER) {
					itemDrop.remove();
					itemDrop.getWorld().dropItem(itemLocation, Items.get(Items.WATER_BOWL));
				}
			};
			Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Survival.instance, task, 20L);
		}
	}

}
