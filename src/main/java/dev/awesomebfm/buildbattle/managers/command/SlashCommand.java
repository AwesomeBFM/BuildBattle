package dev.awesomebfm.buildbattle.managers.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public abstract class SlashCommand {
    public abstract String getName();
    public abstract String getDescription();
    public abstract String getPermission();
    public abstract void execute(CommandSender sender, Command command, String label, String[] args);
}
