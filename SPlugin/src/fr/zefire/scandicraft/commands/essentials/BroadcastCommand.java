package fr.zefire.scandicraft.commands.essentials;

import com.google.common.base.Joiner;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BroadcastCommand
  implements CommandExecutor
{
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
  {
    if ((sender instanceof Player))
    {
      Player p = (Player)sender;
      String essentials = "§8[§3§lS§fEssentials§8] §b";
      String info = "§8[§3§lS§fInfo§8] §b";
      if (cmd.getName().equalsIgnoreCase("broadcast")) {
        if (p.hasPermission("splugin.essentials.broadcast"))
        {
          if (args.length == 0)
          {
            p.sendMessage(essentials + "/broadcast <message>");
            return true;
          }
          p.getServer().broadcastMessage(info + ChatColor.AQUA + Joiner.on(" ").join(args));
        }
        else
        {
          p.sendMessage(essentials + "§cTu n'as pas la permission d'effectuer cette commande.");
        }
      }
    }
    return true;
  }
}
