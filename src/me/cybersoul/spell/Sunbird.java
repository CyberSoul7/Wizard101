package me.cybersoul.spell;

import me.cybersoul.Battlefield;
import me.cybersoul.Caster;
import me.cybersoul.School;
import me.cybersoul.Spell;
import me.cybersoul.SpellName;
import me.cybersoul.Target;

public class Sunbird extends Spell {

	public Sunbird(Target target, Caster caster, Battlefield battlefield) {
		super(SpellName.SUNBIRD, School.FIRE, 10, 75, 3, target, caster, battlefield);
	}
	
}
