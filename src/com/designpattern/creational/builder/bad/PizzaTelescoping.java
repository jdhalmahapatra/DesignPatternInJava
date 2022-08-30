package com.designpattern.creational.builder.bad;

public class PizzaTelescoping {
	private String base;
	private String dressing;
	private String meat;
	
	
	public PizzaTelescoping(String base) {
		super();
		this.base = base;
	}
	public PizzaTelescoping(String base, String dressing) {
		this(base);
		this.dressing = dressing;
	}

	public PizzaTelescoping(String base, String dressing, String meat) {
		this(base, dressing);
		this.meat = meat;
	}

	
	public String getBase() {
		return base;
	}
	public String getDressing() {
		return dressing;
	}

	public String getMeat() {
		return meat;
	}
	
}
