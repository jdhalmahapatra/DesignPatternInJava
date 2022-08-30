package com.designpattern.creational.builder.example1;

public final class TheRevenger {
	private final String name;
	private final String suitType;
	private final String weapon;
	private final String eyeColor;
	private final int numberOfActions;
	
	private TheRevenger(Builder builder) {
		this.name = builder.name;
		this.suitType=builder.suitType;
		this.weapon = builder.weapon;
		this.eyeColor = builder.eyeColor;
		this.numberOfActions = builder.numberOfActions;
	}
	
	public String getName() {
		return name;
	}
	public String getSuitType() {
		return suitType;
	}
	public String getWeapon() {
		return weapon;
	}
	public String getEyeColor() {
		return eyeColor;
	}
	public int getNumberOfActions() {
		return numberOfActions;
	}
	
	
	//Builder Pattern implementation
	//Builder pattern implemented using Static inner class
	public static class Builder{
		private String name;
		private String suitType;
		private String weapon;
		private String eyeColor;
		private int numberOfActions;
		
		public Builder() {
			super();
		}
		public TheRevenger build() {
			return new TheRevenger(this);
		}
		
		public Builder name(String name) {
			this.name = name;
			return this;
		}
		
		public Builder suitType(String suitType) {
			this.suitType = suitType;
			return this;
		}
		
		public Builder weapon(String weapon) {
			this.weapon = weapon;
			return this;
		}
		
		public Builder eyeColor(String eyeColor) {
			this.eyeColor = eyeColor;
			return this;
		}
		
		public Builder numberOfActions(int numberOfActions) {
			this.numberOfActions = numberOfActions;
			return this;
		}
		
	}
	
}
