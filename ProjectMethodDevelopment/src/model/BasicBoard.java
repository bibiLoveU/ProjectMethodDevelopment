package model;

import java.util.HashMap;

public class BasicBoard implements IBoard {
	
	Integer length;
	Integer width;
	ICandy selectedCandy;
	ICandy swappedCandy;
	HashMap<Integer, ICandy> candy;
	HashMap<Integer, ICase> cases;
	
	
	public BasicBoard() {
	}


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


	public HashMap<Integer, ICandy> getCandy() {
		return candy;
	}

	public void setCandy(HashMap<Integer, ICandy> candy) {
		this.candy = candy;
	}


	public HashMap<Integer, ICase> getCases() {
		return cases;
	}

	public void setCases(HashMap<Integer, ICase> cases) {
		this.cases = cases;
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
		return false;
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
