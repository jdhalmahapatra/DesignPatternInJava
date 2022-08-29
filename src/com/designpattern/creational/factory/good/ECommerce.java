package com.designpattern.creational.factory.good;

import com.designpattern.creational.factory.good.websitepages.CartPage;
import com.designpattern.creational.factory.good.websitepages.HomePage;
import com.designpattern.creational.factory.good.websitepages.SearchPage;

public class ECommerce extends Websites{

	@Override
	public void createWebsites() {
		// TODO Auto-generated method stub
		pages.add(new CartPage());
		pages.add(new HomePage());
		pages.add(new SearchPage());
	}

}
