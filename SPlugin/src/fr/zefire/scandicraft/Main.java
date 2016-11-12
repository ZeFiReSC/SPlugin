package fr.zefire.scandicraft;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import fr.zefire.scandicraft.commands.HelpCommand;
import fr.zefire.scandicraft.commands.LinkCommand;
import fr.zefire.scandicraft.commands.essentials.BroadcastCommand;
import fr.zefire.scandicraft.commands.essentials.GamemodeCommand;
import fr.zefire.scandicraft.commands.essentials.SpawnCommand;

public class Main extends JavaPlugin implements Listener {
	
	//https://www.youtube.com/watch?v=BH4OqYHoHC0 eclipse to github
	

public void onEnable(){
    System.out.println("Plugin SPlugin activé !");

    Bukkit.getServer().getPluginManager().registerEvents(new PlayerEvent(), this);
    
    getCommand("help").setExecutor(new HelpCommand());
    
    getCommand("broadcast").setExecutor(new BroadcastCommand());
    getCommand("gm").setExecutor(new GamemodeCommand());
    
    getCommand("vote").setExecutor(new LinkCommand());
    getCommand("site").setExecutor(new LinkCommand());
    getCommand("boutique").setExecutor(new LinkCommand());
    getCommand("forum").setExecutor(new LinkCommand());
    getCommand("ts").setExecutor(new LinkCommand());
    
    getCommand("spawn").setExecutor(new SpawnCommand(this));
    
    getConfig().options().copyDefaults(true);
    saveConfig();
  }
  
  public void onDisable()
  {
    System.out.println("Plugin SPlugin désactivé !");
  }
}
