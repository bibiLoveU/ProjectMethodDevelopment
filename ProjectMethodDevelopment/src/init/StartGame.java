package init;

import control.CandyCrushMain;
import view.WelcomeFrame;



public class StartGame {

	private CandyCrushMain start;

	public StartGame() {
		start = new CandyCrushMain();
	}

	public void go() {
		start.getFrames().get(EnumFrame.WELCOME.getValue()).setVisible(true);
	}

	public static void main(String[] args) {
		StartGame c = new StartGame();
		c.go();

	}

}
