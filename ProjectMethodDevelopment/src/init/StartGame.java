package init;

import view.WelcomeFrame;



public class StartGame {

	private WelcomeFrame start;

	public StartGame() {

		start = new WelcomeFrame();

	}

	public void go() {
		start.setVisible(true);
	}

	public static void main(String[] args) {
		StartGame c = new StartGame();
		c.go();

	}

}
