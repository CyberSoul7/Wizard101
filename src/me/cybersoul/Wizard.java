package me.cybersoul;

import me.cybersoul.backpack.Amulet;
import me.cybersoul.backpack.Athame;
import me.cybersoul.backpack.Backpack;
import me.cybersoul.backpack.Boots;
import me.cybersoul.backpack.Hat;
import me.cybersoul.backpack.Ring;
import me.cybersoul.backpack.Robe;
import me.cybersoul.backpack.Wand;

public class Wizard {
	
	private final String player;
	private double health;
	private double maxHealth;
	private double mana;
	private double maxMana;
	private final School school;
	private int level;
	private Backpack backpack;
	private Hat hat;
	private Robe robe;
	private Boots boots;
	private Wand wand;
	private Athame athame;
	private Amulet amulet;
	private Ring ring;
	private Pet pet;
	private Mount mount;
	private Deck deck;
	
	private Access unicornWay = new Access(Accessable.UNICORNWAY);
	
	public Wizard(String playerName, School school) {
		this.player = playerName;
		maxHealth = health();
		health = maxHealth;
		maxMana = mana();
		mana = maxMana;
		this.school = school;
	}
	
	public Hat getHat() {
		return hat;
	}
	
	public void equipHat(Hat hat) {
		this.hat = hat;
	}
	
	public void unequipHat() {
		hat = null;
	}
	
	public Robe getRobe() {
		return robe;
	}
	
	public void equipRobe(Robe robe) {
		this.robe = robe;
	}
	
	public void unequipRobe() {
		robe = null;
	}
	
	public Boots getBoots() {
		return boots;
	}
	
	public void equipBoots(Boots boots) {
		this.boots = boots;
	}
	
	public void unequipBoots() {
		boots = null;
	}
	
	public Wand getWand() {
		return wand;
	}
	
	public void equipWand(Wand wand) {
		this.wand = wand;
	}
	
	public void unequipWand() {
		wand = null;
	}
	
	public Athame getAthame() {
		return athame;
	}
	
	public void equipAthame(Athame athame) {
		this.athame = athame;
	}
	
	public void unequipAthame() {
		athame = null;
	}
	
	public Amulet getAmulet() {
		return amulet;
	}
	
	public void equipAmulet(Amulet amulet) {
		this.amulet = amulet;
	}
	
	public void unequipAmulet() {
		amulet = null;
	}
	
	public Ring getRing() {
		return ring;
	}
	
	public void equipRing(Ring ring) {
		this.ring = ring;
	}
	
	public void unequipRing() {
		ring = null;
	}
	
	public Pet getPet() {
		return pet;
	}
	
	public void equipPet(Pet pet) {
		this.pet = pet;
	}
	
	public void unequipPet() {
		pet = null;
	}
	
	public Mount getMount() {
		return mount;
	}
	
	public void equipMount(Mount mount) {
		this.mount = mount;
	}
	
	public void unequipMount() {
		mount = null;
	}
	
	public Deck getDeck() {
		return deck;
	}
	
	public void equipDeck(Deck deck) {
		this.deck = deck;
	}
	
	public void unequipDeck() {
		deck = null;
	}
	
	public Backpack getBackpack() {
		return backpack;
	}
	
	public String getPlayerName() {
		return player;
	}
	
	public void sendDeath() {
		
	}
	
	public double getHealth() {
		return health;
	}
	
	public double getMaxHealth() {
		return maxHealth;
	}
	
	public double getMana() {
		return mana;
	}
	
	public double getMaxMana() {
		return maxMana;
	}
	
	public void setHealth(double health) {
		this.health = health;
		if (this.health > maxHealth) {
			this.health = maxHealth;
		}
	}
	
	public void takeDamage(double damage) {
		this.health -= damage;
		if (this.health <= 0) {
			sendDeath();
		}
	}
	
	public School getSchool() {
		return school;
	}
	
	public double health() {
		double tempHealth;
		switch (school) {
		case FIRE:
			tempHealth = 403 + (22 * level);
			break;
		case ICE:
			tempHealth = 469 + (31 * level);
			break;
		case BALANCE:
			tempHealth = 453 + (27 * level);
			break;
		case DEATH:
			tempHealth = Math.floor(425.3 + (24.5 * level));
			break;
		case LIFE:
			tempHealth = Math.floor(432.7 + (27.3 * level));
			break;
		case MYTH:
			tempHealth = 403 + (22 * level);
			break;
		case STORM:
			tempHealth = Math.floor(383.7 + (16.3 * level));
			break;
		default:
			tempHealth = 0;
		}
		
		return tempHealth;
	}
	
	public double mana() {
		return Math.floor(12.779 + (2.15 * level));
	}
	
}
