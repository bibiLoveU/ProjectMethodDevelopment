package model;

public interface IBoard {
	ICandy getSelectedCandy();
	ICandy getSwappedCandy();
	void setSelectedCandy(ICandy selectedCandy);
	void setSwappedCandy(ICandy swappedCandy);
	
	void swap(ICandy selectedCandy, ICandy swappedCandy);
	boolean isValidSwap(ICandy selectedCandy, ICandy swappedCandy);
	boolean fill();
	boolean horizontalAligned();
	boolean verticalAligned();
	
}
