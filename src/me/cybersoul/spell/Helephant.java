package me.cybersoul.spell;

import me.cybersoul.Battlefield;
import me.cybersoul.Caster;
import me.cybersoul.School;
import me.cybersoul.Spell;
import me.cybersoul.SpellName;
import me.cybersoul.Target;

public class Helephant extends Spell {

	public Helephant(Target target, Caster caster, Battlefield battlefield) {
		super(SpellName.HELEPHANT, School.FIRE, 42, 75, 6, target, caster, battlefield);
	}
	
}
