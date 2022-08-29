package com.designpattern.creational.factory.good;

import com.designpattern.creational.factory.good.websitepages.AboutPage;
import com.designpattern.creational.factory.good.websitepages.CommentPage;
import com.designpattern.creational.factory.good.websitepages.ContactPage;

public class Blogs extends Websites{

	@Override
	public void createWebsites() {
		pages.add(new ContactPage());
		pages.add(new AboutPage());
		pages.add(new CommentPage());
	}

}
