package dev.awesomebfm.buildbattle.managers.command;

import dev.awesomebfm.buildbattle.BuildBattle;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.ArrayList;

public class CommandManager implements CommandExecutor {
    private final BuildBattle instance = BuildBattle.getInstance();
    private ArrayList<SlashCommand> commands = new ArrayList<>();

    public CommandManager() {
        instance.getCommand("buildbattle").setExecutor(this);
    }

    public void registerCommand(SlashCommand command) {
        commands.add(command);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        for (SlashCommand slashCommand : commands) {
            if (slashCommand.getName().equalsIgnoreCase(command.getName())) {
                if (sender.hasPermission(slashCommand.getPermission())) {
                    slashCommand.execute(sender, command, label, args);
                    return true;
                } else {
                    sender.sendMessage(instance.getPrefix() + ChatColor.RED + "ERROR: You do not have permission to use this command!");
                    return true;
                }
            }
        }
        return true;
    }
}
