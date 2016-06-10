package me.cybersoul;

public class Target {
	
	private final Wizard wizard;
	private final Enemy enemy;
	private final Caster caster;
	private final Spell spell;
	
	public Target(Wizard wizard, Enemy enemy, Caster caster, Spell spell) {
		this.wizard = wizard;
		this.enemy = enemy;
		this.caster = caster;
		this.spell = spell;
	}
	
	public Wizard getWizard() {
		return wizard;
	}
	
	public Enemy getEnemy() {
		return enemy;
	}
	
	public Caster getCaster() {
		return caster;
	}
	
	public Spell getSpell() {
		return spell;
	}
	
}