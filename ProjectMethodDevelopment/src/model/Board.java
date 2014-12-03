package model;

import java.awt.Color;
import java.awt.Image;
import java.util.Random;


public class Board implements IBoardStrategy{
	
	private Case[][] cases;
	private int selectedX, selectedY;
	private int swappedX, swappedY;
	private Image buffer;
//	private int length;
//	private int width;
	private Color[] colors = { Color.WHITE, Color.RED,
		Color.GREEN, Color.BLUE, Color.GRAY, Color.PINK, Color.CYAN };;

	public Board() {
//		length = 8;
//		width=8;
		cases = new Case[8][8];
		selectedX = -1;
		selectedY = -1;
		swappedX = -1;
		swappedY = -1;
		initBoard();

	}

	public Case[][] getCases() {
		return cases;
	}

	public void setCases(Case[][] cases) {
		this.cases = cases;
	}

	public int getSelectedX() {
		return selectedX;
	}

	public void setSelectedX(int selectedX) {
		this.selectedX = selectedX;
	}

	public int getSelectedY() {
		return selectedY;
	}

	public void setSelectedY(int selectedY) {
		this.selectedY = selectedY;
	}

	public int getSwappedX() {
		return swappedX;
	}

	public void setSwappedX(int swappedX) {
		this.swappedX = swappedX;
	}

	public int getSwappedY() {
		return swappedY;
	}

	public void setSwappedY(int swappedY) {
		this.swappedY = swappedY;
	}

	public Image getBuffer() {
		return buffer;
	}

	public void setBuffer(Image buffer) {
		this.buffer = buffer;
	}

	private void initBoard() {
		Random rand = new Random();
		for (int i = 0; i < 8; i++) {
			for (int j = 7; j >= 0; j--) {
				cases[i][j] = new Case(
						colors[1 + rand.nextInt(colors.length - 1)]);
			}
		}

	}

//	public int getLength() {
//		return length;
//	}
//
//
//	public void setLength(int length) {
//		this.length = length;
//	}


//	public int getWidth() {
//		return width;
//	}
//
//	public void setWidth(int width) {
//		this.width = width;
//	}




	public void swap(ICandy selectedCandy, ICandy swappedCandy) {
	}


	public boolean isValidSwap(int x1, int y1, int x2, int y2) {
		return false;
	}


	public boolean fill() {
		return false;
	}


	public boolean horizontalAligned() {
		return false;
	}

	public boolean verticalAligned() {
		return false;
	}
}
