package me.cybersoul.spell;

import me.cybersoul.Battlefield;
import me.cybersoul.Caster;
import me.cybersoul.School;
import me.cybersoul.Spell;
import me.cybersoul.SpellName;
import me.cybersoul.Target;

public class Tranquilize extends Spell {

	public Tranquilize(Target target, Caster caster, Battlefield battlefield) {
		super(SpellName.TRANQUILIZE, School.FIRE, 15, 100, 2, target, caster, battlefield);
	}
	
}
