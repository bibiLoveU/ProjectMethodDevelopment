package model;

import java.awt.Color;

public class Case implements ICase {
	private Candy candy;

	public Case() {
		candy = null;
	}

	public Case(Color c) {
		this.candy = new Candy(c);
	}

	public Candy getCandy() {
		return candy;
	}

	public void setCandy(Color c) {
		this.candy.setColor(c);
	}

	public boolean isEmpty() {
		return candy == null;
	}

	public void removeCandy() {
		this.candy = null;
	}

}
