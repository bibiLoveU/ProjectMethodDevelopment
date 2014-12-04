package model;

import java.awt.Image;

public interface IBoardStrategy {
	
	void swap(ICase case1, ICase case2) ;
	boolean isValidSwap(ICase case1, ICase case2);
	boolean fill();
	boolean horizontalAligned(int i, int j);
	boolean verticalAligned(int i, int j);
	public boolean removeAlignments();
	
	public Case getSelectedCase();

	public void setSelectedCase(int x, int y) ;

	public Case getSwappedCase() ;

	public void setSwappedCase(int x, int y);
	
//	public int getLength();
//	public void setLength(int length);
//	public int getWidth();
//	public void setWidth(int width);
	public Image getBuffer();
//	int getSelectedX();
//	int getSwappedX();
//	int getSwappedY();
//	int getSelectedY();
	/*int getSelectedX();
	int getSwappedX();
	int getSwappedY();
	int getSelectedY();
	ICase[][] getCases();
	void setBuffer(Image img);

	void setSelectedX(int i);
	void setSwappedX(int i);
	void setSwappedY(int i);*/
	
}
