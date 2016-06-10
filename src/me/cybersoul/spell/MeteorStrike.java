package me.cybersoul.spell;

import me.cybersoul.Battlefield;
import me.cybersoul.Caster;
import me.cybersoul.School;
import me.cybersoul.Spell;
import me.cybersoul.SpellName;
import me.cybersoul.Target;

public class MeteorStrike extends Spell {

	public MeteorStrike(Target target, Caster caster, Battlefield battlefield) {
		super(SpellName.METEORSTRIKE, School.FIRE, 22, 75, 4, target, caster, battlefield);
	}
	
}
