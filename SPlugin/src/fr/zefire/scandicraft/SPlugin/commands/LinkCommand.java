package fr.zefire.scandicraft.SPlugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class LinkCommand implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player))
			return true;
		
		Player p = (Player) sender;
		p.sendMessage(" ");
		switch (cmd.getName().toLowerCase()) {
		case "vote":
			p.sendMessage("§f§l  >>> §6Voter : §b§nhttp://www.ScandiCraft.net/vote");
			break;
		case "site":
			p.sendMessage("§f§l  >>> §6Site : §b§nhttp://www.ScandiCraft.net");
			break;
		case "boutique":
			p.sendMessage("§f§l  >>> §6Boutique : §b§nhttp://www.ScandiCraft.net/store");
			break;
		case "forum":
			p.sendMessage("§f§l  >>> §6Forum : §b§nhttp://Scandi.Franceserv.com/Forum/index.php");
			break;
		case "ts":
			p.sendMessage("§f§l  >>> §6TeamSpeak : §b§nTs.ScandiCraft.net:10203");
			break;
		}
		p.sendMessage(" ");
		return true;
	}
}
