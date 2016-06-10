package me.cybersoul.spell;

import me.cybersoul.Battlefield;
import me.cybersoul.Caster;
import me.cybersoul.School;
import me.cybersoul.SpellName;
import me.cybersoul.Target;

public class Immolate extends Damage {

	public Immolate(Target target, Caster caster, Battlefield battlefield) {
		super(SpellName.IMMOLATE,School.FIRE, 0, 100, 4, target, caster, battlefield, 600, 600);
	}
	
}
