package me.cybersoul.spell;

import me.cybersoul.Battlefield;
import me.cybersoul.Caster;
import me.cybersoul.School;
import me.cybersoul.Spell;
import me.cybersoul.SpellName;
import me.cybersoul.SpellType;
import me.cybersoul.Target;

public class Ward extends Spell {
	
	private final WardType wardType;
	
	public Ward(SpellName name, School school, int level, int accuracy, int pips, Target target, Caster caster, Battlefield battlefield, WardType wardType) {
		super(name, SpellType.WARD, school, level, accuracy, pips, target, caster, battlefield);
		this.wardType = wardType;
	}
	
	
	
}
