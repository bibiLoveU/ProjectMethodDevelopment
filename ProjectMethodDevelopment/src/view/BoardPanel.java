package view;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;

import javax.swing.JPanel;

import model.Board;
import model.IBoardStrategy;
import control.IDevice;
import control.Manager;

public class BoardPanel extends JPanel implements Runnable{
	

	
	private IBoardStrategy board;
	
	public BoardPanel(){
		board=Manager.getInstance().getBoard();
		while(board.fill());
        // enlever les alignements existants
        while(board.removeAlignments()) {
        	board.fill();
        }
	}

	 public void run() {
	        while(true) {
	            // un pas de simulation toutes les 100ms
	            try { Thread.currentThread().sleep(100); } catch(InterruptedException e) { }

	            if(!board.fill()) {
	            	board.removeAlignments();
	            }

	            repaint();
	        }
	    }
    
    public void update(Graphics g) {
        paint(g);
    }
    

    // routine d'affichage : on fait du double buffering
    public void paint(Graphics g2) {
        if(board.getBuffer() == null) board.setBuffer(createImage(800, 600))  ;
        Graphics2D g = (Graphics2D) board.getBuffer().getGraphics();

        // fond
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());

        // afficher la grille vide
        g.setColor(Color.BLACK);
        for(int i = 0; i < 9; i++) {
            g.drawLine(32 * i, 0, 32 * i, 8 * 32 + 1); 
            g.drawLine(0, 32 * i, 8 * 32 + 1, 32 * i); 
        }

        // afficher la première case sélectionnée
        if(board.getSelectedCase()!=null) {
            g.setColor(Color.ORANGE);
            g.fillRect(board.getSelectedCase().getX() * 32 + 1, board.getSelectedCase().getY() * 32 + 1, 31, 31);
        }

        // afficher la deuxième case sélectionnée
        if(board.getSwappedCase()!=null) {
            g.setColor(Color.YELLOW);
            g.fillRect(board.getSwappedCase().getX() * 32 + 1, board.getSwappedCase().getY() * 32 + 1, 31, 31);
        }

        // afficher le contenu de la grille
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                g.setColor(Board.colors[board.getCases()[i][j].getCandy().getColor()]);
                g.fillOval(32 * i + 3, 32 * j + 3, 27, 27);
            }
        }

        // copier l'image à l'écran
        g2.drawImage(board.getBuffer(), 0, 0, null);
    }
 // taille de la fenêtre
    public Dimension getPreferredSize() {
        return new Dimension(32 * 8 + 1, 32 * 8 + 1);
    }


	
	public IBoardStrategy getBoard() {
		return board;
	}

}
