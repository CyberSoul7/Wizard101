package me.cybersoul;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerListener implements Listener {
	
	Wizard101 configGetter;
	
	public PlayerListener(Wizard101 plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
		configGetter = plugin;
	}
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		
		Player player = e.getPlayer();
		
		e.setJoinMessage(null);
		
		if (!player.hasPlayedBefore()) {
			
			player.teleport(new Location(Bukkit.getServer().getWorld("world"), -340, 52, 412));
			
			configGetter.isInTutorial.put(player.getName(), true);
			
			player.sendMessage(ChatColor.BOLD + "MERLE AMBROSE: " + ChatColor.RESET + "My vision seems to be failing me. Are you a " + ChatColor.BLUE + "boy" + ChatColor.RESET + " or a " + ChatColor.RED + "girl" + ChatColor.RESET + "?");
			player.sendMessage(ChatColor.ITALIC + "Please type \"/boy\" if you are a boy or \"/girl\" if you are girl");
			
		} else {
			player.sendMessage(ChatColor.DARK_RED + "Welcome back " + player.getName() + ".");
		}
		
		player.sendMessage(ChatColor.ITALIC + "Please accept the resource pack");
		
	}
	
	@EventHandler
	public void onHunger(FoodLevelChangeEvent e) {
		
		if (e.getEntity() instanceof Player) {
			e.setCancelled(true);
		}
		
	}
	
}
