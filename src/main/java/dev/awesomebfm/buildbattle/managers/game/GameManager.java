package dev.awesomebfm.buildbattle.managers.game;

import dev.awesomebfm.buildbattle.BuildBattle;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class GameManager {

    private final BuildBattle instance = BuildBattle.getInstance();

    private GameState state;

    public ArrayList<String> players = new ArrayList<>();

    public void joinPlayer(Player player) {
        if (players.size() >= 16) {
            player.sendMessage(instance.sendWarningMessage("Game is full!"));
            return;
        }
        if (state != GameState.LOBBY) {
            player.sendMessage(instance.sendWarningMessage("Game is already in progress!"));
            return;
        }
    }

}
