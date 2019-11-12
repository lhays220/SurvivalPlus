package tk.shanebee.survival.commands;

import com.google.common.collect.ImmutableList;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.StringUtil;
import tk.shanebee.survival.Survival;
import tk.shanebee.survival.managers.ItemManager;
import tk.shanebee.survival.managers.Items;
import tk.shanebee.survival.util.Lang;
import tk.shanebee.survival.util.Utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings("NullableProblems")
public class GiveItem implements CommandExecutor, TabCompleter {

    private Lang lang;

    public GiveItem(Survival plugin) {
        this.lang = plugin.getLang();
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        String prefix = Utils.getColoredString(lang.prefix);
        if (args.length < 2) return true;
        Player player = Bukkit.getPlayer(args[0]);
        if (player != null) {
            Items itemName;
            int amount = 1;
            try {
                if (args.length == 3) {
                    amount = Integer.valueOf(args[2]);
                }
            } catch (IllegalArgumentException ignore) {}
            try {
                itemName = Items.valueOf(args[1].toUpperCase());
                ItemStack item = ItemManager.get(itemName);
                item.setAmount(amount);

                Location loc = player.getLocation();
                loc.setY(loc.getY() + 1);

                if (player.getInventory().addItem(item).size() != 0) {
                    player.getWorld().dropItem(loc, item);
                }
                if (sender instanceof Player) {
                    Utils.sendColoredMsg(sender, prefix + "&6You gave &b" + itemName + " &6to &b" + player.getName());
                } else {
                    Utils.sendColoredMsg(sender, prefix + "&6CONSOLE gave &b" + itemName + " &6to &b" + player.getName());
                }
            } catch (IllegalArgumentException ignore) {
                Utils.sendColoredMsg(sender, prefix + "&b" + args[1] + "&c is not an item");
            }
        } else {
            Utils.sendColoredMsg(sender, prefix + "&b" + args[0] + " &cis not online");
        }
        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String s, String[] args) {
        if (args.length == 0 || args.length >= 4) {
            return ImmutableList.of();
        }
        if (args.length <= 1) return null;
        if (args.length == 2) {
            ArrayList<String> matches = new ArrayList<>();
            for (Items name : Items.values()) {
                if (StringUtil.startsWithIgnoreCase(name.toString(), args[1])) {
                    matches.add(name.toString());
                }
            }
            return matches;
        } else {
            return Collections.singletonList("<amount>");
        }
    }

}