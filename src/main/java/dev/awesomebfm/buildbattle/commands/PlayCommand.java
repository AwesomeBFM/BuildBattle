package dev.awesomebfm.buildbattle.commands;

import dev.awesomebfm.buildbattle.BuildBattle;
import dev.awesomebfm.buildbattle.managers.command.SlashCommand;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PlayCommand extends SlashCommand {

    private final BuildBattle instance = BuildBattle.getInstance();

    @Override
    public String getName() {
        return "play";
    }

    @Override
    public String getDescription() {
        return "Join the game";
    }

    @Override
    public String getPermission() {
        return "buildbattle.play";
    }

    @Override
    public void execute(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(instance.getPrefix() + ChatColor.RED + "ERROR: You must be a player to use this command!");
            return;
        }
        Player player = (Player) sender;
    }
}
