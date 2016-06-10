package me.cybersoul.spell;

import me.cybersoul.Battlefield;
import me.cybersoul.Caster;
import me.cybersoul.School;
import me.cybersoul.Spell;
import me.cybersoul.SpellName;
import me.cybersoul.Target;

public class BrimstoneRevenant extends Spell {

	public BrimstoneRevenant(Target target, Caster caster, Battlefield battlefield) {
		super(SpellName.BRIMSTONEREVENANT, School.FIRE, 0, 75, 4, target, caster, battlefield);
	}
	
}
