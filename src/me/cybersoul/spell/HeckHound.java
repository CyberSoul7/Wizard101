package me.cybersoul.spell;

import me.cybersoul.Battlefield;
import me.cybersoul.Caster;
import me.cybersoul.School;
import me.cybersoul.Spell;
import me.cybersoul.SpellName;
import me.cybersoul.Target;

public class HeckHound extends Spell {

	public HeckHound(Target target, Caster caster, int pips, Battlefield battlefield) {
		super(SpellName.CHOKE, School.FIRE, 0, 80, pips, target, caster, battlefield);
	}
	
}
