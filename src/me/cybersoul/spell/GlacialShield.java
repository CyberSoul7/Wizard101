package me.cybersoul.spell;

import me.cybersoul.Battlefield;
import me.cybersoul.Caster;
import me.cybersoul.School;
import me.cybersoul.Spell;
import me.cybersoul.SpellName;
import me.cybersoul.Target;

public class GlacialShield extends Spell {

	public GlacialShield(Target target, Caster caster, Battlefield battlefield) {
		super(SpellName.GLACIALSHIELD, School.FIRE, 8, 100, 0, target, caster, battlefield);
	}
	
}
