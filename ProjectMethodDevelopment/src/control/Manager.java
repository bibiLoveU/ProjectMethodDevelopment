package control;

import model.Board;
import model.IBoardStrategy;

public class Manager {

	private static Manager instance;
	private IBoardStrategy board;
	
	private Manager(){
		board=new Board();
	}

	public static Manager getInstance(){
		if(instance==null)
			return new Manager();
		else 
			return instance;
	}
	
	public IBoardStrategy getBoard() {
		return board;
	}
	
	
}
