package me.cybersoul;

import java.util.List;

public class Deck {
	
	private List<Card> cards;
	private final Wizard wizard;
	
	public Deck(Wizard wizard) {
		this.wizard = wizard;
	}
	
	public List<Card> getCards() {
		return cards;
	}
	
	public void addCard(Card card) {
		cards.add(card);
	}
	
	public boolean containsCard(Card card) {
		return cards.contains(card);
	}
	
	public boolean removeCard(Card card) {
		if (cards.contains(card)) {
			cards.remove(card);
			return true;
		}
		return false;
	}
	
	public Wizard getWizard() {
		return wizard;
	}
	
}
