package me.cybersoul.spell;

import me.cybersoul.Battlefield;
import me.cybersoul.Caster;
import me.cybersoul.School;
import me.cybersoul.Spell;
import me.cybersoul.SpellName;
import me.cybersoul.SpellType;
import me.cybersoul.Target;

public class Global extends Spell {
	
	private final int effect;
	
	public Global(SpellName name, School school, int level, int accuracy, int pips, Target target, Caster caster, Battlefield battlefield, int effect) {
		super(name, SpellType.GLOBAL, school, level, accuracy, pips, target, caster, battlefield);
		this.effect = effect;
	}
	
	
	
}
