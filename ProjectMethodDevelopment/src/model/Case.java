package model;

import java.awt.Color;

public class Case implements ICase {
	private Candy candy;

	public Case(int couleur) {
		this.candy = new Candy(couleur);
	}

	public Candy getCandy() {
		return candy;
	}

	public void setCandy(int couleur) {
		this.candy.setColor(couleur);
	}

	public boolean isEmpty() {
		return candy.getColor() == 0;
	}

	public void removeCandy() {
		this.candy.setColor(0);
	}

}
