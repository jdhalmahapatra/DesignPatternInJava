package com.designpattern.creational.factory.good;

public class WebSitesFactory {
	public static Websites getWebsite(String type) {
        switch (type) {
            case "Blog": {
                return new Blogs();
            }

            case "ECommerce": {
                return new ECommerce();
            }

            default: {
                return null;
            }
        }
    }
}
