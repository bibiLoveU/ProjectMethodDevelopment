package control;

import java.util.List;

import view.IGameMode;
import view.ITerminal;
import view.IWindows;
import model.Board;
import model.IBoardStrategy;
import model.IPlay;

public class CandyCrushMain {
	IBoardStrategy b;
	Integer countdown;
	IDevice gameListener;
	IGameMode gameMode;
	List<IPlay> play;
	ITerminal screen;
	IWindows window;
	IDevice windowListener;
	Integer x;
	Integer y;
	
	
	public CandyCrushMain() {
		b = new Board();
		b.setLength(8);
		b.setWidth(8);
		b.fill();
	}


	public IBoardStrategy getB() {
		return b;
	}


	public void setB(IBoardStrategy b) {
		this.b = b;
	}


	public Integer getCountdown() {
		return countdown;
	}


	public void setCountdown(Integer countdown) {
		this.countdown = countdown;
	}


	public IDevice getGameListener() {
		return gameListener;
	}


	public void setGameListener(IDevice gameListener) {
		this.gameListener = gameListener;
	}


	public IGameMode getGameMode() {
		return gameMode;
	}


	public void setGameMode(IGameMode gameMode) {
		this.gameMode = gameMode;
	}


	public List<IPlay> getPlay() {
		return play;
	}


	public void setPlay(List<IPlay> play) {
		this.play = play;
	}


	public ITerminal getScreen() {
		return screen;
	}


	public void setScreen(ITerminal screen) {
		this.screen = screen;
	}


	public IWindows getWindow() {
		return window;
	}


	public void setWindow(IWindows window) {
		this.window = window;
	}


	public IDevice getWindowListener() {
		return windowListener;
	}


	public void setWindowListener(IDevice windowListener) {
		this.windowListener = windowListener;
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
