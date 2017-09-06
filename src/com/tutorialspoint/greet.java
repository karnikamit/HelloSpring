package com.tutorialspoint;

public class greet {
	private String message;

	public void setMessage(String msg){
		message = msg;
	}

	public String getMessage(){
		return message;
	}

	public void init(){
		System.out.println("Greet Bean initialized!");
	}

	public void destroy(){
		System.out.println("Greet Bean Destroyed!");
	}
}
