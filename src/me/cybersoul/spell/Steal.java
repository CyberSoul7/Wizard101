package me.cybersoul.spell;

import me.cybersoul.Battlefield;
import me.cybersoul.Caster;
import me.cybersoul.School;
import me.cybersoul.Spell;
import me.cybersoul.SpellName;
import me.cybersoul.SpellType;
import me.cybersoul.Target;

public class Steal extends Spell {
	
	private final double damage;
	private final double health;
	
	public Steal(SpellName name, School school, int level, int accuracy, int pips, Target target, Caster caster, Battlefield battlefield, double damage) {
		super(name, SpellType.STEAL, school, level, accuracy, pips, target, caster, battlefield);
		this.damage = damage;
		health = Math.floor(damage / 2);
	}
	
}
