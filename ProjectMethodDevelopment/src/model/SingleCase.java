package model;

public class SingleCase implements ICase {
	boolean activ;
	Integer x;
	Integer y;
	
	public SingleCase() {
	}

	public boolean getActiv() {
		return activ;
	}

	public void setActiv(Boolean activ) {
		this.activ = activ;
	}

	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public Integer getY() {
		return y;
	}

	public void setY(Integer y) {
		this.y = y;
	}
}
