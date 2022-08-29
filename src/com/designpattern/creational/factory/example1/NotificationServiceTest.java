package com.designpattern.creational.factory.example1;

public class NotificationServiceTest {

	public static void main(String[] args) {
		var service1 = NotificationFactory.createNotification("Push");
		var service2 = NotificationFactory.createNotification("SMS");
		var service3 = NotificationFactory.createNotification("Email");
		
		service1.notifyUser();
		service2.notifyUser();
		service3.notifyUser();

	}

}
