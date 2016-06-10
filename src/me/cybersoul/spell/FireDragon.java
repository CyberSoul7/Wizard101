package me.cybersoul.spell;

import me.cybersoul.Battlefield;
import me.cybersoul.Caster;
import me.cybersoul.School;
import me.cybersoul.Spell;
import me.cybersoul.SpellName;
import me.cybersoul.Target;

public class FireDragon extends Spell {

	public FireDragon(Target target, Caster caster, Battlefield battlefield) {
		super(SpellName.FIREDRAGON, School.FIRE, 48, 75, 7, target, caster, battlefield);
	}
	
}
