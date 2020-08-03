package com.tuna.spring.bean_post_processors;

public class VietnameseAlphabet {
	private String character1;
	private String character2;
	private String character3;
	private String character4;
	
	public VietnameseAlphabet() {
		super();
	}
	public VietnameseAlphabet(String character1, String character2, String character3, String character4) {
		super();
		this.character1 = character1;
		this.character2 = character2;
		this.character3 = character3;
		this.character4 = character4;
	}
	public String getCharacter1() {
		System.out.println("Character : " + character1);
		return character1;
	}
	public void setCharacter1(String character1) {
		this.character1 = character1;
	}
	public String getCharacter2() {
		System.out.println("Character : " + character2);
		return character2;
	}
	public void setCharacter2(String character2) {
		this.character2 = character2;
	}
	public String getCharacter3() {
		System.out.println("Character : " + character3);
		return character3;
	}
	public void setCharacter3(String character3) {
		this.character3 = character3;
	}
	public String getCharacter4() {
		System.out.println("Character : " + character4);
		return character4;
	}
	public void setCharacter4(String character4) {
		this.character4 = character4;
	}	
}
