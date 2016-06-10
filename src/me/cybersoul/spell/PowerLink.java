package me.cybersoul.spell;

import me.cybersoul.Battlefield;
import me.cybersoul.Caster;
import me.cybersoul.School;
import me.cybersoul.Spell;
import me.cybersoul.SpellName;
import me.cybersoul.SpellType;
import me.cybersoul.Target;

public class PowerLink extends Spell {

	public PowerLink(Target target, Caster caster, Battlefield battlefield) {
		super(SpellName.POWERLINK, SpellType.DAMAGE,School.FIRE, 55, 75, 4, target, caster, battlefield);
	}
	
}
