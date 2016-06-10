package me.cybersoul.spell;

import me.cybersoul.Battlefield;
import me.cybersoul.Caster;
import me.cybersoul.School;
import me.cybersoul.Spell;
import me.cybersoul.SpellName;
import me.cybersoul.Target;

public class FirePrism extends Spell {

	public FirePrism(Target target, Caster caster, Battlefield battlefield) {
		super(SpellName.FIREPRISM, School.FIRE, 7, 100, 0, target, caster, battlefield);
	}
	
}
