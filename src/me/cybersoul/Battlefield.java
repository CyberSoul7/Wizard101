package me.cybersoul;

import java.util.ArrayList;

import org.bukkit.Location;

public class Battlefield {
	
	private final Location field;
	private final Location player1Loc;
	private final Location player2Loc;
	private final Location player3Loc;
	private final Location player4Loc;
	private final Location enemy1Loc;
	private final Location enemy2Loc;
	private final Location enemy3Loc;
	private final Location enemy4Loc;
	private final Wizard player1;
	private Wizard player2;
	private Wizard player3;
	private Wizard player4;
	private final Enemy enemy1;
	private Enemy enemy2;
	private Enemy enemy3;
	private Enemy enemy4;
	
	public Battlefield(Location field, Wizard wizard, Enemy enemy) {
		this.field = field;
		this.player1Loc = field;
		this.player2Loc = field;
		this.player3Loc = field;
		this.player4Loc = field;
		this.enemy1Loc = field;
		this.enemy2Loc = field;
		this.enemy3Loc = field;
		this.enemy4Loc = field;
		
		this.player1Loc.setZ(this.player1Loc.getZ() - 4);
		
		this.player2Loc.setX(this.player2Loc.getX() + 3);
		this.player2Loc.setZ(this.player2Loc.getZ() - 3);
		
		this.player3Loc.setX(this.player3Loc.getX() + 4);
		
		this.player4Loc.setX(this.player4Loc.getX() + 3);
		this.player4Loc.setZ(this.player4Loc.getZ() + 3);
		
		this.enemy1Loc.setZ(this.enemy1Loc.getZ() + 4);
		
		this.enemy2Loc.setX(this.enemy2Loc.getX() - 3);
		this.enemy2Loc.setZ(this.enemy3Loc.getZ() + 3);
		
		this.enemy3Loc.setX(this.enemy3Loc.getX() - 4);
		
		this.enemy4Loc.setX(this.enemy4Loc.getX() - 3);
		this.enemy4Loc.setZ(this.enemy4Loc.getZ() - 4);
		
		this.player1 = wizard;
		this.enemy1 = enemy;
	}
	
	public void addPlayer(Wizard wizard) {
		if (player2 == null) {
			player2 = wizard;
		} else if (player3 == null) {
			player3 = wizard;
		} else if (player4 == null) {
			player4 = wizard;
		}
	}
	
	public void addEnemy(Enemy enemy) {
		if (enemy2 == null) {
			enemy2 = enemy;
		} else if (enemy3 == null) {
			enemy3 = enemy;
		} else if (enemy4 == null) {
			enemy4 = enemy;
		}
	}
	
	public ArrayList<Wizard> getWizards() {
		ArrayList<Wizard> players = new ArrayList<Wizard>();
		players.add(player1);
		players.add(player2);
		players.add(player3);
		players.add(player4);
		return players;
	}
	
	public boolean getWizard(Wizard player) {
		if (player1 == player || player2 == player || player3 == player || player4 == player) {
			return true;
		}
		return false;
	}
	
	public boolean getEnemy(Enemy enemy) {
		if (enemy1 == enemy || enemy2 == enemy || enemy3 == enemy || enemy4 == enemy) {
			return true;
		}
		return false;
	}
	
	public ArrayList<Enemy> getEnemies() {
		ArrayList<Enemy> enemies = new ArrayList<Enemy>();
		enemies.add(enemy1);
		enemies.add(enemy2);
		enemies.add(enemy3);
		enemies.add(enemy4);
		return enemies;
	}
	
	public Location getLocation() {
		return field;
	}
	
}
