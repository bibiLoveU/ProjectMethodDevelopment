package view;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class WelcomeFrame extends JFrame {

	private int hauteur;
	private int largeur;
	private BoardPanel boardPanel;

	public WelcomeFrame() {

		super("I love Candies !!");
		System.out.println("Lancement du jeu...");
		//MyMenu menu = new MyMenu();
		//setMenuBar(menu);
		hauteur = 32 * 8 + 1;
		largeur = 32 * 8 + 1;
		this.setSize(hauteur, largeur);
		boardPanel = new BoardPanel();
		this.add(boardPanel);
		new Thread(boardPanel).start();
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent ev) {
				System.exit(0);
			}
		});
		this.pack();
	}

}
;