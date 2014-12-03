package model;

import java.awt.Color;

public class Candy implements ICandy {

	private Color color;

	public Candy(Color c) {
		color = c;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

}
