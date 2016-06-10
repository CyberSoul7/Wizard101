package me.cybersoul.spell;

import me.cybersoul.Battlefield;
import me.cybersoul.Caster;
import me.cybersoul.School;
import me.cybersoul.Spell;
import me.cybersoul.SpellName;
import me.cybersoul.SpellType;
import me.cybersoul.Target;

public class Choke extends Spell {

	public Choke(Target target, Caster caster, Battlefield battlefield) {
		super(SpellName.CHOKE, SpellType.MANIPULATION, School.FIRE, 0, 80, 2, target, caster, battlefield);
	}
	
}
