package com.designpattern.creational.factory.good;

public class FactoryGoodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Websites sites = WebSitesFactory.getWebsite("ECommerce");
		System.out.println(sites.getPages());
		
		sites = WebSitesFactory.getWebsite("Blog");
		System.out.println(sites.getPages());
	}

}
