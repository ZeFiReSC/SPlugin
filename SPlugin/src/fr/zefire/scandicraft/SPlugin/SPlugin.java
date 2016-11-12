package fr.zefire.scandicraft.SPlugin;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import fr.zefire.scandicraft.SPlugin.commands.HelpCommand;
import fr.zefire.scandicraft.SPlugin.commands.LinkCommand;
import fr.zefire.scandicraft.SPlugin.commands.essentials.BroadcastCommand;
import fr.zefire.scandicraft.SPlugin.commands.essentials.GamemodeCommand;
import fr.zefire.scandicraft.SPlugin.commands.essentials.SpawnCommand;

public class SPlugin extends JavaPlugin implements Listener {
	static SPlugin instance;

	public void onEnable() {
		instance = this;
		Bukkit.getServer().getPluginManager().registerEvents(new PlayerEvent(), this);

		getCommand("help").setExecutor(new HelpCommand());
		getCommand("broadcast").setExecutor(new BroadcastCommand());
		getCommand("gm").setExecutor(new GamemodeCommand());
		getCommand("vote").setExecutor(new LinkCommand());
		getCommand("site").setExecutor(new LinkCommand());
		getCommand("boutique").setExecutor(new LinkCommand());
		getCommand("forum").setExecutor(new LinkCommand());
		getCommand("ts").setExecutor(new LinkCommand());
		getCommand("spawn").setExecutor(new SpawnCommand());

		getConfig().options().copyDefaults(true);
		saveConfig();
	}

	public static SPlugin getInstance() {
		return instance;
	}

	public String formatCommandSyntaxeDisplay(String command) {
		return "§8[§3§lS§fEssentials§8] §b" + command;
	}
	
	public String formatInfo(String info){
		return "§8[§3§lS§fInfo§8] §b" + info;
	}
}
