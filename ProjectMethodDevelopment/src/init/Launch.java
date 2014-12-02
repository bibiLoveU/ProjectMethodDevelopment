package init;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import view.Welcome;
import control.CandyCrushMain;

public class Launch extends Panel {

	public static void main(String[] args) {
		System.out.println("Lancement du jeu : mode console");
		System.out.println("Init controleur");
		CandyCrushMain cc = new CandyCrushMain();
		cc.getB().fill();
		
		Welcome w = new Welcome();
		w.drawGrid(cc.getB());
		
		Frame frame = new Frame("Miam, des bonbons !");
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent event) {
                System.exit(0);
            }
        });
        frame.add(w);
        frame.pack();
        frame.setVisible(true);
	}
	
    public void paint(Graphics g2, CandyCrushMain cc) {
		
    }
}
