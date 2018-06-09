package com.cards.Cards.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Deck {

	private boolean success;
	private boolean shuffled;
	@JsonProperty("cards")
	private List<Card> card;
	@JsonProperty("deck_id")
	private String deckId;
	private int remaining;
	
	public Deck() {
		// TODO Auto-generated constructor stub
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public boolean isShuffled() {
		return shuffled;
	}

	public void setShuffled(boolean shuffled) {
		this.shuffled = shuffled;
	}

	
	
	public List<Card> getCard() {
		return card;
	}

	public void setCard(List<Card> card) {
		this.card = card;
	}

	public String getDeckId() {
		return deckId;
	}

	public void setDeckId(String deckId) {
		this.deckId = deckId;
	}

	public int getRemaining() {
		return remaining;
	}

	public void setRemaining(int remaining) {
		this.remaining = remaining;
	}
	
	
}
