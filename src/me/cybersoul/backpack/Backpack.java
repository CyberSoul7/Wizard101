package me.cybersoul.backpack;

import java.util.List;

import me.cybersoul.Wizard;

public class Backpack {
	
	private List<Object> objects;
	private final Wizard wizard;
	
	public Backpack(Wizard wizard) {
		this.wizard = wizard;
	}
	
	public List<Object> getAllItems() {
		return objects;
	}
	
	public void addItem(Object item) {
		objects.add(item);
	}
	
	public boolean removeItem(Object item) {
		if (objects.contains(item)) {
			objects.remove(item);
			return true;
		}
		return false;
	}
	
	public void removeAllItems() {
		objects.clear();
	}
	
	public Wizard getWizard() {
		return wizard;
	}
	
}
