package control;

import model.Board;
import model.IBoardStrategy;

public class Manager {

	private static Manager m;
	private IBoardStrategy board;
	
	private Manager(){
		board=new Board();
	}

	public static Manager getInstance(){
		if(m==null)
			return new Manager();
		else 
			return m;
	}
	
	public IBoardStrategy getBorad() {
		return board;
	}
	
	
}
