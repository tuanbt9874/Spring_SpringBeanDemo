package com.tuna.spring.bean_post_processors;

public class Text {
	private String text;

	public Text() {
		super();
	}

	public Text(String text) {
		super();
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public void init(){
		System.out.println("Bean Text is going through init.");
	}
	
	public void destroy(){
		System.out.println("Bean Text will destroy now.");
	}   
	
}
