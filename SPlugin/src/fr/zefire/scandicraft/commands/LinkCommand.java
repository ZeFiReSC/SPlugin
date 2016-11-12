package fr.zefire.scandicraft.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class LinkCommand
  implements CommandExecutor
{
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
  {
    if ((sender instanceof Player))
    {
      Player p = (Player)sender;
      if (cmd.getName().equalsIgnoreCase("vote"))
      {
        p.sendMessage(" ");
        p.sendMessage("§f§l  >>> §6Voter : §b§nhttp://www.ScandiCraft.net/vote");
        p.sendMessage(" ");
      }
      if (cmd.getName().equalsIgnoreCase("site"))
      {
        p.sendMessage(" ");
        p.sendMessage("§f§l  >>> §6Site : §b§nhttp://www.ScandiCraft.net");
        p.sendMessage(" ");
      }
      if (cmd.getName().equalsIgnoreCase("boutique"))
      {
        p.sendMessage(" ");
        p.sendMessage("§f§l  >>> §6Boutique : §b§nhttp://www.ScandiCraft.net/store");
        p.sendMessage(" ");
      }
      if (cmd.getName().equalsIgnoreCase("forum"))
      {
        p.sendMessage(" ");
        p.sendMessage("§f§l  >>> §6Forum : §b§nhttp://Scandi.Franceserv.com/Forum/index.php");
        p.sendMessage(" ");
      }
      if (cmd.getName().equalsIgnoreCase("ts"))
      {
        p.sendMessage(" ");
        p.sendMessage("§f§l  >>> §6TeamSpeak : §b§nTs.ScandiCraft.net:10203");
        p.sendMessage(" ");
      }
    }
    return true;
  }
}
