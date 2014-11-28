package model;

public class Candy implements ICandy{
	IColor color;
	Integer column;
	Integer line;
	
	public Candy() {
	}

	public IColor getColor() {
		return color;
	}

	public void setColor(IColor color) {
		this.color = color;
	}

	public Integer getColumn() {
		return column;
	}

	public void setColumn(Integer column) {
		this.column = column;
	}

	public Integer getLine() {
		return line;
	}

	public void setLine(Integer line) {
		this.line = line;
	}
}
