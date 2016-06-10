package me.cybersoul.spell;

import me.cybersoul.Battlefield;
import me.cybersoul.Caster;
import me.cybersoul.School;
import me.cybersoul.Spell;
import me.cybersoul.SpellName;
import me.cybersoul.Target;

public class SmokeScreen extends Spell {

	public SmokeScreen(Target target, Caster caster, Battlefield battlefield) {
		super(SpellName.SMOKESCREEN, School.FIRE, 38, 100, 1, target, caster, battlefield);
	}
	
}
