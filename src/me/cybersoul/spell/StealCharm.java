package me.cybersoul.spell;

import me.cybersoul.Battlefield;
import me.cybersoul.Caster;
import me.cybersoul.School;
import me.cybersoul.Spell;
import me.cybersoul.SpellName;
import me.cybersoul.Target;

public class StealCharm extends Spell {

	public StealCharm(Target target, Caster caster, Battlefield battlefield) {
		super(SpellName.STEALCHARM, School.FIRE, 0, 80, 1, target, caster, battlefield);
	}
	
}
