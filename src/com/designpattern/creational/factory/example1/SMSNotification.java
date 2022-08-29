package com.designpattern.creational.factory.example1;

public class SMSNotification implements Notification {

	@Override
	public void notifyUser() {
		System.out.println("Sending an SMS notification");
	}

}
