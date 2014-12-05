package view;

import init.EnumFrame;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import control.CandyCrushMain;

public class AcceuilFrame extends Frame implements WindowListener,ActionListener {
	private static final long serialVersionUID = 1L;
	private int hauteur;
	private int largeur;

	public AcceuilFrame() {
		super("I love Candies !!");
		System.out.println("Lancement du jeu...");
		hauteur = 32 * 8 + 1;
		largeur = 32 * 8 + 1;
		this.setSize(hauteur, largeur);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent ev) {
				System.exit(0);
			}
		});
		
		Button b = new Button("next step");
		b.addActionListener(this); 
		this.add(b);
		this.pack();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("actionPerformed : "+arg0);
		CandyCrushMain.getInstance().getFrames().get(EnumFrame.MENU.getValue()).setVisible(true);;
		this.setVisible(false);
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		System.out.println("windowActivated : "+arg0);
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		System.out.println("windowClosed : "+arg0);
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		System.out.println("windowClosing : "+arg0);
		
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		System.out.println("windowDeactivated : "+arg0);
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		System.out.println("windowDeiconified : "+arg0);
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		System.out.println("windowIconified : "+arg0);
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		System.out.println("windowOpened : "+arg0);
		
	}
}
