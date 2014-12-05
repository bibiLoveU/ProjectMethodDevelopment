package init;

import control.CandyCrushMain;
import view.WelcomeFrame;



public class StartGame {

	//private WelcomeFrame start;
	private CandyCrushMain start;

	public StartGame() {
		start = new CandyCrushMain();
		//start = new WelcomeFrame();
	}

	public void go() {
		start.getFrames().get(EnumFrame.WELCOME.getValue()).setVisible(true);
		//start.setVisible(true);
	}

	public static void main(String[] args) {
		StartGame c = new StartGame();
		c.go();

	}

}
