package fr.zefire.scandicraft.SPlugin;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerEvent implements Listener {

	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		e.setJoinMessage("§8[§2§l+§8] " + ChatColor.BLUE + p.getName());
		if (!e.getPlayer().hasPlayedBefore())
			p.getServer().broadcastMessage("§cBienvenue " + ChatColor.DARK_GRAY + p.getName() + " §csur le Serveur Faction de §4§lScandi§8§lCraft §c!");
	}

	@EventHandler
	public void onLeave(PlayerQuitEvent e) {
		e.setQuitMessage("§8[§4§l-§8] " + ChatColor.BLUE + e.getPlayer().getName());
	}
}
