package com.fattymieo.survival.commands;

import com.fattymieo.survival.Survival;
import com.fattymieo.survival.managers.Items;
import com.google.common.collect.ImmutableList;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.StringUtil;

import java.util.ArrayList;
import java.util.List;

public class GiveItem implements CommandExecutor, TabCompleter {

    private String prefix = ChatColor.translateAlternateColorCodes('&', "&7[&3SurvivalPlus&7] ");

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (args.length != 2) return true;
        OfflinePlayer player = Bukkit.getPlayer(args[0]);
        Items itemName;
        if (player != null) {
            try {
                itemName = Items.valueOf(args[1].toUpperCase());
                ItemStack item = new ItemStack(Items.get(itemName));
                Bukkit.getWorld(((Player) player).getWorld().getName()).dropItem(((Player) player).getLocation(), item);

                if (sender instanceof Player) {
                    Survival.sendColoredMessage((Player) sender, prefix + "&6You gave &b" + itemName + " &6to &b" + player.getName());
                } else {
                    Survival.sendColoredConsoleMsg(prefix + "&6CONSOLE gave &b" + itemName + " &6to &b" + player.getName());
                }
            } catch (IllegalArgumentException ignore) {
                if (sender instanceof Player)
                    Survival.sendColoredMessage((Player) sender, prefix + "&b" + args[1] + "&c is not an item");
                else
                    Survival.sendColoredConsoleMsg(prefix + "&b" + args[1] + "&c is not an item");
            }
        } else {
            if (sender instanceof Player)
                Survival.sendColoredMessage((Player) sender, prefix + "&b" + args[0] + " &cis not online");
            else
                Survival.sendColoredConsoleMsg(prefix + "&b" + args[0] + " &cis not online");
        }
        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String s, String[] args) {
        if (args.length == 0 || args.length >= 3) {
            return ImmutableList.of();
        }
        StringBuilder builder = new StringBuilder();
        for (String arg : args) {
            builder.append(arg + " ");
        }
        if (args.length <= 1) return null;
        String arg = builder.toString().trim();
        ArrayList<String> matches = new ArrayList<>();
        for (Items name : Items.values()) {
            if (StringUtil.startsWithIgnoreCase(name.toString(), args[1])) {
                matches.add(name.toString());
            }
        }
        return matches;
    }

}