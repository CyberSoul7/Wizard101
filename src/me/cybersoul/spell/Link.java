package me.cybersoul.spell;

import me.cybersoul.Battlefield;
import me.cybersoul.Caster;
import me.cybersoul.School;
import me.cybersoul.Spell;
import me.cybersoul.SpellName;
import me.cybersoul.Target;

public class Link extends Spell {

	public Link(Target target, Caster caster, Battlefield battlefield) {
		super(SpellName.LINK, School.FIRE, 12, 75, 2, target, caster, battlefield);
	}
	
}
