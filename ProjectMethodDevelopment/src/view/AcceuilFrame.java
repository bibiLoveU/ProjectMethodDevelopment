package view;

import init.EnumFrame;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import control.CandyCrushMain;

public class AcceuilFrame extends Frame implements WindowListener,ActionListener {
	private static final long serialVersionUID = 1L;

	private Image img;

	public Dimension getPreferredSize() {
		return new Dimension(274, 295);
	}

	public AcceuilFrame() {
		super("I love Candies !!");
		System.out.println("Lancement du jeu...");
		setLocationRelativeTo(null);

		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent ev) {
				System.exit(0);
			}
		});

		img = Toolkit.getDefaultToolkit().createImage("C:\\Users\\SSD\\Pictures\\1.jpeg");
		
		Panel p = new Panel();
		p.setSize(274,295);
		p.setLayout(new BorderLayout());
		p.add(makeButton(new Dimension (100, 100), "Next Step"), BorderLayout.LINE_START);
		p.add(makeMenuBar(new Dimension (100,100)), BorderLayout.PAGE_START);
		this.add(p);
		
		//this.add((), BorderLayout.PAGE_START);
		//this.add(, BorderLayout.LINE_START);

		// affiche la fenetre  
		this.pack();
	}

	public void paint(Graphics g){
		g.drawImage(img, 0, 0, null);
	}

	private Button makeButton(Dimension d, String name) {
		Button b = new Button(name);
		b.addActionListener(this);
		b.setSize(d);
		return b;
	}

	private JMenuBar makeMenuBar(Dimension d) {
		JMenuBar menuBar = new JMenuBar();
		// Define and add two drop down menu to the menubar
		JMenu fileMenu = new JMenu("File");
		JMenu editMenu = new JMenu("Edit");
		menuBar.add(fileMenu);
		menuBar.add(editMenu);

		// Create and add simple menu item to one of the drop down menu
		JMenuItem newAction = new JMenuItem("New");
		newAction.addActionListener(this);

		JMenuItem openAction = new JMenuItem("Open");
		openAction.addActionListener(this);

		JMenuItem exitAction = new JMenuItem("Exit");
		exitAction.addActionListener(this);

		JMenuItem cutAction = new JMenuItem("Cut");
		cutAction.addActionListener(this);

		JMenuItem copyAction = new JMenuItem("Copy");
		copyAction.addActionListener(this);

		JMenuItem pasteAction = new JMenuItem("Paste");
		pasteAction.addActionListener(this);

		fileMenu.add(newAction);
		fileMenu.add(openAction);
		fileMenu.addSeparator();
		fileMenu.add(exitAction);
		editMenu.add(cutAction);
		editMenu.add(copyAction);
		editMenu.add(pasteAction);
		//editMenu.addSeparator();

		menuBar.setSize(d);
		return menuBar;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("actionPerformed : "+arg0);
		if(arg0.getActionCommand().equals("Next Step")){
			CandyCrushMain.getInstance().getFrames().get(EnumFrame.MENU.getValue()).setVisible(true);
			this.setVisible(false);
		}else if (arg0.getActionCommand().equals("Exit")){
			System.exit(0);
		}
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
