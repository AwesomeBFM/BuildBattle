package dev.awesomebfm.buildbattle;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class BuildBattle extends JavaPlugin {

    private static BuildBattle instance;
    public String prefix = ChatColor.translateAlternateColorCodes('&', "&8[&bBuild&Battle&8] &r");

    @Override
    public void onEnable() {
        instance = this;

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static BuildBattle getInstance() {
        return instance;
    }

    public String getPrefix() {
        return prefix;
    }

    public String sendErrorMessage(String message) {
        return prefix + ChatColor.RED + "ERROR: " + message;
    }

    public String sendWarningMessage(String message) {
        return prefix + ChatColor.YELLOW + "WARNING: " + message;
    }
}
