package model;

import java.awt.Color;

public class Candy implements ICandy {

	private int color;

	public Candy(int c) {
	this.color=c;
	}


	public int getColor() {
		return color;
	}




	public void setColor(int color) {
		this.color = color;
	}




	@Override
	public boolean equals(Candy candy) {
		return (this.color== candy.color);
	}

	
}
