package com.designpattern.creational.factory.example1;

public class EmailNotification implements Notification {

	@Override
	public void notifyUser() {
		System.out.println("Sending Email Notification");
	}

}
