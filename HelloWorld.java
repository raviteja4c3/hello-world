package com.tpoint;

public class HelloWorld {
	
	public String message;

	public String getMessage() {
		System.out.println("Message is: " + message);
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void initMe(){
		System.out.println("bean is now Initilizing...");
	}

	public void destroyMe(){
		System.out.println("bean is destroying now...");
	}

}
