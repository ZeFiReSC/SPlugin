package fr.zefire.scandicraft.commands.essentials;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import fr.zefire.scandicraft.Main;

public class SpawnCommand implements CommandExecutor {

	private FileConfiguration config;
	private Main pl;
	
	public SpawnCommand(Main main) {
		this.pl = main;
		this.config = pl.getConfig();
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {
		
		if(sender instanceof Player){
			Player p = (Player) sender;
			String essentials = "§8[§3§lS§fEssentials§8] §b";
			
			if(args.length == 0){
				p.sendMessage(essentials+config.getString("teleport-spawn-message").replace("&", "§"));		
				
				double x = config.getDouble("location.spawn.x");
				double y = config.getDouble("location.spawn.y");
				double z = config.getDouble("location.spawn.z");
				float yaw = (float) config.getDouble("location.spawn.yaw");
				float pitch = (float) config.getDouble("location.spawn.pitch");
				String monde = config.getString("location.spawn.worldName");
				World world = Bukkit.getWorld(monde);
				p.teleport(new Location(world, x, y, z, yaw, pitch));
			}
			
			if(args.length == 1){
				if(args[0].equalsIgnoreCase("set")){
					p.sendMessage(essentials+config.getString("teleport-setspawn-message").replace("&", "§"));
					
					double x = p.getLocation().getX();
					double y = p.getLocation().getY();
					double z = p.getLocation().getZ();
					float yaw = p.getLocation().getYaw();
					float pitch = p.getLocation().getPitch();
					String monde = p.getWorld().getName();
					
					config.set("location.spawn.x", x);
					config.set("location.spawn.y", y);
					config.set("location.spawn.z", z);
					config.set("location.spawn.yaw", yaw);
					config.set("location.spawn.pitch", pitch);
					config.set("location.spawn.worldName", monde);
					pl.saveConfig();
				}
				
			}
			
			
			
		}
		
		
		
		
		
		return true;
	}

}
