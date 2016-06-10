package me.cybersoul.spell;

import me.cybersoul.Battlefield;
import me.cybersoul.Caster;
import me.cybersoul.School;
import me.cybersoul.Spell;
import me.cybersoul.SpellName;
import me.cybersoul.Target;

public class FireTrap extends Spell {

	public FireTrap(Target target, Caster caster, Battlefield battlefield) {
		super(SpellName.FIRETRAP, School.FIRE, 16, 100, 0, target, caster, battlefield);
	}
	
}
