package fr.zefire.scandicraft.SPlugin;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerEvent implements Listener {
	
	FileConfiguration config;
	
	public PlayerEvent(){
		config = SPlugin.getInstance().getConfig();
	}

	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		Player p = event.getPlayer();
		if(config.getBoolean("messages.join-messages.join") == true){
			event.setJoinMessage("§8[§2§l+§8] " + ChatColor.BLUE + p.getName());
		}else if (config.getBoolean("messages.join-messages.join")  == false){
			event.setJoinMessage("");
		}
		if(config.getBoolean("messages.join-messages.first-join-message") == true){
			if (!event.getPlayer().hasPlayedBefore())
				p.getServer().broadcastMessage("§cBienvenue " + ChatColor.DARK_GRAY + p.getName() + " §csur le Serveur Faction de §4§lScandi§8§lCraft §c!");
			}
		}

	@EventHandler
	public void onLeave(PlayerQuitEvent event) {
		if(config.getBoolean("messages.join-messages.leave") == true){
			event.setQuitMessage("§8[§4§l-§8] " + ChatColor.BLUE + event.getPlayer().getName());
		}else if (config.getBoolean("messages.join-messages.leave")  == false){
			event.setQuitMessage("");
		}
	}
}
