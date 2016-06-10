package me.cybersoul.spell;

import me.cybersoul.Battlefield;
import me.cybersoul.Caster;
import me.cybersoul.School;
import me.cybersoul.SpellName;
import me.cybersoul.Target;

public class FireCat extends Damage {

	public FireCat(Target target, Caster caster, Battlefield battlefield) {
		super(SpellName.FIRECAT, School.FIRE, 1, 75, 1, target, caster, battlefield, 80, 120);
	}
	
}
