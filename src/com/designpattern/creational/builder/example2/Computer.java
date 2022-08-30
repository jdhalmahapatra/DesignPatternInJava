package com.designpattern.creational.builder.example2;

public final class Computer {
	//Required Parameters
	private final String HDD;
	private final String RAM;
	
	//Optional Parameters
	private final boolean isGraphicsCardAvailable;
	private final boolean isBluetoothAvailable;
	
	private Computer(ComputerBuilder builder) {
		this.HDD = builder.HDD;
		this.RAM = builder.RAM;
		this.isGraphicsCardAvailable = builder.isGraphicsCardAvailable;
		this.isBluetoothAvailable = builder.isBluetoothAvailable;
	}

	public String getHDD() {
		return HDD;
	}

	public String getRAM() {
		return RAM;
	}

	public boolean getIsGraphicsCardAvailable() {
		return isGraphicsCardAvailable;
	}

	public boolean getIsBluetoothAvailable() {
		return isBluetoothAvailable;
	}
	
	
	//Builder Pattern Implementation
	
	public static class ComputerBuilder{
		//Required Parameters
		private String HDD;
		private String RAM;
		
		//Optional Parameters
		private boolean isGraphicsCardAvailable;
		private boolean isBluetoothAvailable;
		
		
		public ComputerBuilder(String HDD, String RAM) {
			this.HDD = HDD;
			this.RAM = RAM;
		}
		
		public ComputerBuilder setGraphicsAvailability(boolean isGraphicsCardAvailable) {
			this.isGraphicsCardAvailable = isGraphicsCardAvailable;
			return this;
		}
		public ComputerBuilder setBluetoothAvailability(boolean isBluetoothAvailable) {
			this.isBluetoothAvailable = isBluetoothAvailable;
			return this;
		}
		
		public Computer build() {
			return new Computer(this);
		}
	}
	
}
