package fr.zefire.scandicraft.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HelpCommand
  implements CommandExecutor
{
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
  {
    if ((sender instanceof Player))
    {
      Player p = (Player)sender;
      if (cmd.getName().equalsIgnoreCase("help"))
      {
        p.sendMessage("");
        p.sendMessage("§6    Vous avez besoin d'aide ?");
        p.sendMessage("");
        p.sendMessage("§f        §b/site");
        p.sendMessage("§f        §b/vote");
        p.sendMessage("§f        §b/boutique");
        p.sendMessage("§f        §b/forum");
        p.sendMessage("§f        §b/ts");
        p.sendMessage("§f        §b/menu");
        p.sendMessage("");
      }
    }
    return true;
  }
}
