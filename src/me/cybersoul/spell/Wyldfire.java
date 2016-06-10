package me.cybersoul.spell;

import me.cybersoul.Battlefield;
import me.cybersoul.Caster;
import me.cybersoul.School;
import me.cybersoul.Spell;
import me.cybersoul.SpellName;
import me.cybersoul.Target;

public class Wyldfire extends Spell {

	public Wyldfire(Target target, Caster caster, Battlefield battlefield) {
		super(SpellName.WYLDFIRE, School.FIRE, 0, 80, 2, target, caster, battlefield);
	}
	
}
