package me.cybersoul.spell;

import java.util.Random;

import me.cybersoul.Battlefield;
import me.cybersoul.Caster;
import me.cybersoul.School;
import me.cybersoul.Spell;
import me.cybersoul.SpellName;
import me.cybersoul.SpellType;
import me.cybersoul.Target;

public class Damage extends Spell {
	
	private final double damage;
	
	public Damage(SpellName name, School school, int level, int accuracy, int pips, Target target, Caster caster, Battlefield battlefield, int minDamage, int maxDamage) {
		super(name, SpellType.DAMAGE, school, level, accuracy, pips, target, caster, battlefield);
		Random rand = new Random();
		this.damage = (double) rand.nextInt((maxDamage - minDamage) + 1) + maxDamage;
	}
	
}
