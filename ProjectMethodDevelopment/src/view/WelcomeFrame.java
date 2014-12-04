package view;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

import control.IDevice;
import control.Mouse;

public class WelcomeFrame extends JFrame {

	private int hauteur;
	private int largeur;
	private BoardPanel boardPanel;
	private MouseListener mouseListenner;

	public WelcomeFrame() {

		super("I love Candies !!");
		System.out.println("Lancement du jeu...");
		//MyMenu menu = new MyMenu();
		//setMenuBar(menu);
		hauteur = 32 * 8 + 1;
		largeur = 32 * 8 + 1;
		this.setSize(hauteur, largeur);
		boardPanel = new BoardPanel();
		mouseListenner=new Mouse(boardPanel);
		boardPanel.addMouseListener(mouseListenner);
		boardPanel.addMouseMotionListener((MouseMotionListener) mouseListenner);
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