package fr.zefire.scandicraft.SPlugin.commands.essentials;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import fr.zefire.scandicraft.SPlugin.SPlugin;

public class GamemodeCommand implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		if (!(sender instanceof Player))
			return true;

		Player player = (Player) sender;

		if (args.length == 0) {
			player.sendMessage(SPlugin.getInstance().formatCommandSyntaxeDisplay("/gm <0/1/2>"));
			return true;
		} else if (args.length == 1) {
			switch (args[0].toLowerCase()) {
			case "0":
				player.setGameMode(GameMode.SURVIVAL);
				break;
			case "1":
				player.setGameMode(GameMode.CREATIVE);
				break;
			case "2":
				player.setGameMode(GameMode.ADVENTURE);
				break;
			default:
				player.sendMessage(SPlugin.getInstance().formatCommandSyntaxeDisplay("/gm <0/1/2>"));
				return true;
			}
			player.sendMessage(SPlugin.getInstance().formatInfo("Vous êtes passé en Gamemode " + player.getGameMode().toString().toLowerCase() + "."));
		}
		return true;
	}

}
