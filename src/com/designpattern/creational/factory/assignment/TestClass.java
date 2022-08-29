package com.designpattern.creational.factory.assignment;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var action1 = TheMagicianActionFactory.Action(ActionType.FLY);
		System.out.println(action1.getAction());
		
		var action2 = TheMagicianActionFactory.Action(ActionType.PUNCH);
		System.out.println(action2.getAction());
		
		var action3 = TheMagicianActionFactory.Action(ActionType.DISAPPEAR);
		System.out.println(action3.getAction());
	}

}
