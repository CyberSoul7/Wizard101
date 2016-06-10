package me.cybersoul.spell;

import me.cybersoul.Battlefield;
import me.cybersoul.Caster;
import me.cybersoul.School;
import me.cybersoul.Spell;
import me.cybersoul.SpellName;
import me.cybersoul.Target;

public class Quench extends Spell {

	public Quench(Target target, Caster caster, Battlefield battlefield) {
		super(SpellName.QUENCH, School.FIRE, 22, 100, 2, target, caster, battlefield);
	}
	
}
