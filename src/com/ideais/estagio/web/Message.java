package com.ideais.estagio.web;

public class Message {
	private String text;
	private String owner;
	
	public Message(String text, String owner) {
		this.text = text;
		this.owner = owner;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public String getText() {
		return text;
	}
}
