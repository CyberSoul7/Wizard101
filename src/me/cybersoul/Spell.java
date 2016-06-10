package me.cybersoul;

import java.util.Random;

public class Spell {
	
	private final SpellName name;
	private final SpellType type;
	private final School school;
	private final int level;
	private final int accuracy;
	private final int pips;
	private final Target target;
	private final Caster caster;
	private final Battlefield battlefield;
	private boolean fizzle = fizzle();
	
	public Spell(SpellName name, SpellType type, School school, int level, int accuracy, int pips, Target target, Caster caster, Battlefield battlefield) {
		this.name = name;
		this.type = type;
		this.school = school;
		this.level = level;
		this.accuracy = accuracy;
		this.pips = pips;
		this.target = target;
		this.caster = caster;
		this.battlefield = battlefield;
	}
	
	public boolean getFizzle() {
		return fizzle;
	}
	
	public SpellName getName() {
		return name;
	}
	
	public SpellType getType() {
		return type;
	}
	
	public School getSchool() {
		return school;
	}
	
	public int getLeve() {
		return level;
	}
	
	public int getAccuracy() {
		return accuracy;
	}
	
	public int getPips() {
		return pips;
	}
	
	public Target getTarget() {
		return target;
	}
	
	public Caster getCaster() {
		return caster;
	}
	
	public Battlefield getBattlefield() {
		return battlefield;
	}
	
	Random rand;
	
	public boolean fizzle() {
		int test = rand.nextInt(100);
		if (test <= accuracy || test == 100) {
			return true;
		} else {
			return false;
		}
	}
	
}
