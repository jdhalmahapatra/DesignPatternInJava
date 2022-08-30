package com.designpattern.creational.builder.example2;

public class ComputerDemoTest {

	public static void main(String[] args) {
		var builder = new Computer.ComputerBuilder("512GB", "8GB").setGraphicsAvailability(true).setBluetoothAvailability(true);
		Computer computer = builder.build();
		
		System.out.println(computer.getHDD());
		System.out.println(computer.getRAM());
		
		System.out.println(computer.getIsGraphicsCardAvailable());
		System.out.println(computer.getIsBluetoothAvailable());

	}

}
