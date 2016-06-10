package me.cybersoul.spell;

import me.cybersoul.Battlefield;
import me.cybersoul.Caster;
import me.cybersoul.School;
import me.cybersoul.Spell;
import me.cybersoul.SpellName;
import me.cybersoul.Target;

public class FireShield extends Spell {

	public FireShield(Target target, Caster caster, Battlefield battlefield) {
		super(SpellName.FIRESHIELD, School.FIRE, 10, 100, 0, target, caster, battlefield);
	}
	
}
