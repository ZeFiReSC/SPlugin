package fr.zefire.scandicraft.SPlugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HelpCommand implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player))
			return true;

		Player player = (Player) sender;

		player.sendMessage("");
		player.sendMessage("§6    Vous avez besoin d'aide ?");
		player.sendMessage("");
		player.sendMessage("§f        §b/site");
		player.sendMessage("§f        §b/vote");
		player.sendMessage("§f        §b/boutique");
		player.sendMessage("§f        §b/forum");
		player.sendMessage("§f        §b/ts");
		player.sendMessage("§f        §b/menu");
		player.sendMessage("");
		return true;
	}
}
