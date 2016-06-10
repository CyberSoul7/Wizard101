package me.cybersoul;

public class Caster {
	
	private final Wizard wizard;
	private final Enemy enemy;
	private final Target target;
	private final Spell spell;
	
	public Caster(Wizard wizard, Enemy enemy, Target target, Spell spell) {
		this.wizard = wizard;
		this.enemy = enemy;
		this.target = target;
		this.spell = spell;
	}
	
	public Wizard getWizard() {
		return wizard;
	}
	
	public Enemy getEnemy() {
		return enemy;
	}
	
	public Target getTarget() {
		return target;
	}
	
	public Spell getSpell() {
		return spell;
	}
	
}
