package com.ideais.estagio.web;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	private Message message = new Message("", "Struts");

	public String execute(){
		this.message = new Message("Hello World", "Struts");
		return SUCCESS;
	}
	
	public Message getMessage() {
		return message;
	}
}
