package com.designpattern.creational.factory.assignment;

public class TheMagicianActionFactory {
	public static TheMagician Action(ActionType type) {
			switch(type) {
			case FLY:
				return new Fly();
			case PUNCH:
				return new Punch();
			case DISAPPEAR:
				return new Disappear();
			default:
				throw new IllegalArgumentException("Unknow action: " + type);
			}
	}
}
