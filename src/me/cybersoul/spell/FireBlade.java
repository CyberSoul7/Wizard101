package me.cybersoul.spell;

import me.cybersoul.Battlefield;
import me.cybersoul.Caster;
import me.cybersoul.School;
import me.cybersoul.Spell;
import me.cybersoul.SpellName;
import me.cybersoul.Target;

public class FireBlade extends Spell {

	public FireBlade(Target target, Caster caster, Battlefield battlefield) {
		super(SpellName.FIREBLADE, School.FIRE, 2, 100, 0, target, caster, battlefield);
	}
	
}
