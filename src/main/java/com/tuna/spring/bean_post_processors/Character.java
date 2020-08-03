package com.tuna.spring.bean_post_processors;

public class Character {
	private String character1;
	private String character4;
	
	public Character(String character1, String character4) {
		super();
		this.character1 = character1;
		this.character4 = character4;
	}
	public Character() {
		super();
	}
	public String getCharacter1() {
		System.out.println("Character : " + character1);
		return character1;
	}
	public void setCharacter1(String character1) {
		this.character1 = character1;
	}
	public String getCharacter4() {
		 System.out.println("Character : " + character4);
		return character4;
	}
	public void setCharacter4(String character4) {
		this.character4 = character4;
	}
}
