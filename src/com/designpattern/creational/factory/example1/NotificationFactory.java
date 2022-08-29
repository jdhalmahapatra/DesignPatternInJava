package com.designpattern.creational.factory.example1;

public class NotificationFactory {
	public static Notification createNotification(String channel) {
		switch (channel) {
			case "Email":
				return new EmailNotification();
			case "SMS":
				return new SMSNotification();
			case "Push":
				return new PushNotification();
				default:
					throw new IllegalArgumentException("Not a valid channel : " + channel );
		}
	}
}
