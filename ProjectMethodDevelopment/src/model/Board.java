package model;

import java.awt.Color;
import java.util.Random;

public class Board implements IBoardStrategy{
    Color colors[] = {Color.WHITE, Color.RED, Color.GREEN, Color.BLUE, Color.GRAY, Color.PINK, Color.CYAN};

	Integer length;
	Integer width;
	ICandy selectedCandy;
	ICandy swappedCandy;
	ICandy[][] candy;
	ICase[][] cases;
	
	public Board() {}


	public Integer getLength() {
		return length;
	}


	public void setLength(Integer length) {
		this.length = length;
	}


	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}


	public ICandy getSelectedCandy() {
		return selectedCandy;
	}


	public void setSelectedCandy(ICandy selectedCandy) {
		this.selectedCandy = selectedCandy;
	}

	public ICandy getSwappedCandy() {
		return swappedCandy;
	}


	public void setSwappedCandy(ICandy swappedCandy) {
		this.swappedCandy = swappedCandy;
	}

	@Override
	public void swap(ICandy selectedCandy, ICandy swappedCandy) {
	}


	@Override
	public boolean isValidSwap(ICandy selectedCandy, ICandy swappedCandy) {
		return false;
	}


	@Override
	public boolean fill() {
		Random rand = new Random();
		candy = new ICandy[length][width];
		cases = new ICase [length][width];
		
        boolean modified = false;
        for(int i = 0; i < length; i++) {
            for(int j = width; j >= 0; j--) {
            	if(cases[i][j] != null && cases[i][j].getActiv()){
            		 candy[i][j] = new Candy();
            		 if(j == 0) candy[i][j].setColor(1 + rand.nextInt(colors.length - 1));
                     else {
                    	 candy[i][j] = candy[i][j - 1];
                    	 candy[i][j - 1] = new Candy();
                     }
                     modified = true;
            	}
            }
        }
        return modified;
	}

	public Color[] getColors() {
		return colors;
	}


	public void setColors(Color[] colors) {
		this.colors = colors;
	}


	public ICandy[][] getCandy() {
		return candy;
	}


	public void setCandy(ICandy[][] candy) {
		this.candy = candy;
	}


	public ICase[][] getCases() {
		return cases;
	}


	public void setCases(ICase[][] cases) {
		this.cases = cases;
	}


	@Override
	public boolean horizontalAligned() {
		return false;
	}


	@Override
	public boolean verticalAligned() {
		return false;
	}
}
