package model;

import java.awt.Image;

public interface IBoardStrategy {
	
	void swap(int x1, int y1, int x2, int y2) ;
	boolean isValidSwap(int x1, int y1, int x2, int y2);
	boolean fill();
	boolean horizontalAligned(int i, int j);
	boolean verticalAligned(int i, int j);
	public boolean removeAlignments();
	
//	public int getLength();
//	public void setLength(int length);
//	public int getWidth();
//	public void setWidth(int width);
	public Image getBuffer();
	int getSelectedX();
	int getSwappedX();
	int getSwappedY();
	int getSelectedY();
	ICase[][] getCases();
	void setBuffer(Image img);
	void setSelectedX(int i);
	void setSwappedX(int i);
	void setSwappedY(int i);
	
}
