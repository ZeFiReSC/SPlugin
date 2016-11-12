package fr.zefire.scandicraft.SPlugin.commands.essentials;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import fr.zefire.scandicraft.SPlugin.SPlugin;

public class BroadcastCommand implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player))
			return true;

		Player player = (Player) sender;

		if (args.length == 0) {
			player.sendMessage(SPlugin.getInstance().formatCommandSyntaxeDisplay("/broadcast <message>"));
			return true;
		}

		StringBuilder builder = new StringBuilder(SPlugin.getInstance().formatInfo(ChatColor.AQUA + args[0]));
		for (int i = 1; i < args.length; i++)
			builder.append(args[i]);
		player.getServer().broadcastMessage(builder.toString());

		return true;
	}
}
