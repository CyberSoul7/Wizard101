package me.cybersoul.spell;

import me.cybersoul.Battlefield;
import me.cybersoul.Caster;
import me.cybersoul.School;
import me.cybersoul.Spell;
import me.cybersoul.SpellName;
import me.cybersoul.Target;

public class Fuel extends Spell {

	public Fuel(Target target, Caster caster, Battlefield battlefield) {
		super(SpellName.FUEL, School.FIRE, 35, 100, 2, target, caster, battlefield);
	}
	
}
