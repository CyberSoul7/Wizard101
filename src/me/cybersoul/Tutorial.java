package me.cybersoul;

import org.bukkit.Location;

public class Tutorial {
	
	private final Location tutLocation;
	private final int tutInt;
	
	public Tutorial(Location tutLocation, int tutInt) {
		this.tutLocation = tutLocation;
		this.tutInt = tutInt;
	}
	
	public Location getTutLocation() {
		return tutLocation;
	}
	
	public int getTutInt() {
		return tutInt;
	}
	
}
