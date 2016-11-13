package fr.zefire.scandicraft.SPlugin.commands.essentials;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import fr.zefire.scandicraft.SPlugin.SPlugin;

public class SpawnCommand implements CommandExecutor {
	FileConfiguration config;

	public SpawnCommand() {
		config = SPlugin.getInstance().getConfig();
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {
		if (!(sender instanceof Player))
			return true;

		Player player = (Player) sender;

		if (args.length == 0) {
			player.sendMessage(SPlugin.getInstance().formatInfo(config.getString("messages.essentials.teleport-spawn-message").replace("&", "§")));
			double x = config.getDouble("location.spawn.x");
			double y = config.getDouble("location.spawn.y");
			double z = config.getDouble("location.spawn.z");
			float yaw = (float) config.getDouble("location.spawn.yaw");
			float pitch = (float) config.getDouble("location.spawn.pitch");
			World world = Bukkit.getWorld(config.getString("location.spawn.worldName"));

			player.teleport(new Location(world, x, y, z, yaw, pitch));
		} else if (args.length == 1 && args[0].equalsIgnoreCase("set")) {
			if(!player.hasPermission("splugin.essentials.setspawn"))
				return true;
			player.sendMessage(SPlugin.getInstance().formatInfo(config.getString("messages.essentials.teleport-setspawn-message").replace("&", "§")));

			double x = player.getLocation().getX();
			double y = player.getLocation().getY();
			double z = player.getLocation().getZ();
			float yaw = player.getLocation().getYaw();
			float pitch = player.getLocation().getPitch();
			String world = player.getWorld().getName();

			config.set("location.spawn.x", x);
			config.set("location.spawn.y", y);
			config.set("location.spawn.z", z);
			config.set("location.spawn.yaw", yaw);
			config.set("location.spawn.pitch", pitch);
			config.set("location.spawn.worldName", world);
			SPlugin.getInstance().saveConfig();
		} else {
			player.sendMessage(SPlugin.getInstance().formatCommandSyntaxeDisplay("/spawn set"));
		}

		return true;
	}

}
