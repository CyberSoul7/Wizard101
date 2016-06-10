package me.cybersoul.spell;

import me.cybersoul.Battlefield;
import me.cybersoul.Caster;
import me.cybersoul.School;
import me.cybersoul.Spell;
import me.cybersoul.SpellName;
import me.cybersoul.Target;

public class Scald extends Spell {

	public Scald(Target target, Caster caster, Battlefield battlefield) {
		super(SpellName.SCALD, School.FIRE, 0, 75, 5, target, caster, battlefield);
	}
	
}
