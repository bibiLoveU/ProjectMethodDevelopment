package control;

import java.awt.Frame;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

import view.AcceuilFrame;
import view.BoardPanel;
import view.IGameMode;
import view.ITerminal;
import view.IWindows;
import view.WelcomeFrame;
import model.Board;
import model.IBoardStrategy;
import model.IPlay;

public class CandyCrushMain {
	private IBoardStrategy b;
	private Integer countdown;
	private IDevice gameListener;
	private IGameMode gameMode;
	private List<IPlay> play;
	private ITerminal screen;
	private IWindows window;
	private IDevice windowListener;
	private Integer x;
	private Integer y;
	private List<Frame> frames;
	

	private static CandyCrushMain instance = null;


	public CandyCrushMain() {
		b = new Board();
		frames = new ArrayList<Frame>();
		frames.add(new AcceuilFrame());
		frames.add(new WelcomeFrame());
		//		b.setLength(8);
		//		b.setWidth(8);
		b.fill();
	}

	public static CandyCrushMain getInstance() {
		if(instance == null) {
			instance = new CandyCrushMain();
		}
		return instance;
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

	public List<Frame> getFrames() {
		return frames;
	}

	public void setFrames(List<Frame> frames) {
		this.frames = frames;
	}
	
	

}
