package me.cybersoul.spell;

import me.cybersoul.Battlefield;
import me.cybersoul.Caster;
import me.cybersoul.School;
import me.cybersoul.Spell;
import me.cybersoul.SpellName;
import me.cybersoul.Target;

public class MegaTranquilize extends Spell {

	public MegaTranquilize(int pips, Target target, Caster caster, Battlefield battlefield) {
		super(SpellName.MEGATRANQUILIZE, School.FIRE, 50, 100, pips, target, caster, battlefield);
	}
	
}
