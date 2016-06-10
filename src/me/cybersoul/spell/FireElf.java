package me.cybersoul.spell;

import me.cybersoul.Battlefield;
import me.cybersoul.Caster;
import me.cybersoul.School;
import me.cybersoul.Spell;
import me.cybersoul.SpellName;
import me.cybersoul.Target;

public class FireElf extends Spell {

	public FireElf(Target target, Caster caster, Battlefield battlefield) {
		super(SpellName.FIREELF, School.FIRE, 5, 75, 2, target, caster, battlefield);
	}
	
}
