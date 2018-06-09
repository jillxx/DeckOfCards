package com.cards.Cards.model;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Card {
	 private String value;
	 private String suit;
	 private String[] images;
	 private String image;
	 private String code;
	 
	 
	public Card() {
		// TODO Auto-generated constructor stub
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
//	public String[] getImages() {
//		return images;
//	}
//	public void setImages(String[] images) {
//		this.images = images;
//	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
//	@Override
//	public String toString() {
//		return "Card [value=" + value + ", suit=" + suit + ", images=" + Arrays.toString(images) + ", image=" + image
//				+ ", code=" + code + "]";
//	}

	 
}
