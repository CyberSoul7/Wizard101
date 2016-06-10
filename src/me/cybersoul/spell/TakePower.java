package me.cybersoul.spell;

import me.cybersoul.Battlefield;
import me.cybersoul.Caster;
import me.cybersoul.School;
import me.cybersoul.Spell;
import me.cybersoul.SpellName;
import me.cybersoul.Target;

public class TakePower extends Spell {

	public TakePower(Target target, Caster caster, Battlefield battlefield) {
		super(SpellName.TAKEPOWER, School.FIRE, 25, 100, 1, target, caster, battlefield);
	}
	
}
