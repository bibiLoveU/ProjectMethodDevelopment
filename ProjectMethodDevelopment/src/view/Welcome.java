package view;
import java.awt.Color;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Panel;

import model.Board;

public class Welcome extends Panel{
	
	public Welcome(){}
	
	public void drawGrid(Board b){
		Image buffer = null;
		if(buffer == null) buffer = createImage(800, 600);
        Graphics2D g = (Graphics2D) buffer.getGraphics();
        
        // fond
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, b.getLength()*32, b.getWidth()*32);
        
        // afficher la grille vide
        g.setColor(Color.BLACK);
        for(int i = 0; i < 9; i++) {
            g.drawLine(32 * i, 0, 32 * i, 8 * 32 + 1); 
            g.drawLine(0, 32 * i, 8 * 32 + 1, 32 * i); 
        }
		
		for(int i = 0; i < b.getLength(); i++){
			for(int j = 0; j < b.getWidth(); j++){
		        // afficher le contenu de la grille
		        g.setColor(b.getColors()[i]);
		        g.fillOval(32 * i + 3, 32 * j + 3, 27, 27);
			}
		}

        // copier l'image à l'écran
        g.drawImage(buffer, 0, 0, null);	
	}
}
