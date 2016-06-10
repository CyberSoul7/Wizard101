package me.cybersoul.spell;

import me.cybersoul.Battlefield;
import me.cybersoul.Caster;
import me.cybersoul.School;
import me.cybersoul.Spell;
import me.cybersoul.SpellName;
import me.cybersoul.SpellType;
import me.cybersoul.Target;

public class Healing extends Spell {
	
private final double health;
	
	public Healing(SpellName name, School school, int level, int accuracy, int pips, Target target, Caster caster, Battlefield battlefield, double health) {
		super(name, SpellType.HEALING, school, level, accuracy, pips, target, caster, battlefield);
		this.health = health;
	}
	
}
