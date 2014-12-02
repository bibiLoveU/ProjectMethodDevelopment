package model;

import java.awt.Color;

public interface IBoardStrategy {
	Color[] getColors();
	ICandy getSelectedCandy();
	ICandy getSwappedCandy();
	void setSelectedCandy(ICandy selectedCandy);
	void setSwappedCandy(ICandy swappedCandy);

	void swap(ICandy selectedCandy, ICandy swappedCandy);
	boolean isValidSwap(ICandy selectedCandy, ICandy swappedCandy);
	boolean fill();
	boolean horizontalAligned();
	boolean verticalAligned();
	
	public Integer getLength();
	public void setLength(Integer length);
	public Integer getWidth();
	public void setWidth(Integer width);
}
