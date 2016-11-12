package fr.zefire.scandicraft.commands.essentials;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GamemodeCommand implements CommandExecutor{
	
	
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		
		if(sender instanceof Player){
			Player p = (Player) sender;
			String essentials = "§8[§3§lS§fEssentials§8] §b";
			

		    if (cmd.getName().equalsIgnoreCase("gm")) {
		    	
		    	if(p.hasPermission("splugin.essentials.gamemode")){
		    		
		    		if(args.length == 0){
		                p.sendMessage(essentials + "/gm <0/1/2>");
		                return true;
		    		}else if(args.length == 1){
		    			if(args[0].equalsIgnoreCase("0") && p.getGameMode() != GameMode.SURVIVAL){
		    				p.setGameMode(GameMode.SURVIVAL);
		    		    	p.sendMessage(essentials + "Vous êtes passé en Gamemode Survie.");
		    			}else if(args[0].equalsIgnoreCase("1") && p.getGameMode() != GameMode.CREATIVE){
		    				p.setGameMode(GameMode.CREATIVE);
		    		    	p.sendMessage(essentials + "Vous êtes passé en Gamemode Créatif.");
		    			}else if(args[0].equalsIgnoreCase("2") && p.getGameMode() != GameMode.ADVENTURE){
		    				p.setGameMode(GameMode.ADVENTURE);
		    		    	p.sendMessage(essentials + "Vous êtes passé en Gamemode Aventure.");		    				
		    			}
		    			
		    		}
		    		
		    	}
		    	
		    }
		    
		}		
		return true;		
	}
	
}
