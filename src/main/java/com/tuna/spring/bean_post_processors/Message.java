package com.tuna.spring.bean_post_processors;

public class Message {
	
	private String message;
	
	
	public Message() {
		super();
	}

	public Message(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void init(){
		System.out.println("Bean is going through init.");
	}
	
	public void destroy(){
		System.out.println("Bean will destroy now.");
	}   
}
