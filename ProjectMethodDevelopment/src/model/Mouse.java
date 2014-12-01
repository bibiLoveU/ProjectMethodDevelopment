package model;

import java.awt.event.MouseEvent;

import control.CandyCrushMain;

public class Mouse implements IDevice{
	
	public Mouse() {
	}

	@Override
	public void mouseMoved(MouseEvent e, CandyCrushMain ccm) {
        // on bouge la souris : récupérer les coordonnées de la deuxième case
        if(ccm.getBoard().getSelectedCandy() != null) {
            //swappedX = e.getX() / 32;
            //swappedY = e.getY() / 32;
            // si l'échange n'est pas valide, on cache la deuxième case
            //if(!isValidSwap(selectedX, selectedY, swappedX, swappedY)) {
            //    swappedX = swappedY = -1;
            //}
            if(!ccm.getBoard().isValidSwap(ccm.getBoard().getSelectedCandy(), ccm.getBoard().getSwappedCandy())) {
            	ccm.getBoard().setSelectedCandy(null);
            	ccm.getBoard().setSwappedCandy(null);
            }
        }
        //repaint();
	}

	@Override
	public void mousePressed(MouseEvent e, CandyCrushMain ccm) {
        // on appuie sur le bouton de la souris : récupérer les coordonnées de la première case
        //selectedX = e.getX() / 32;
        //selectedY = e.getY() / 32;
        //repaint();
	}

	@Override
	public void mouseReleased(MouseEvent e, CandyCrushMain ccm) {
        // lorsque l'on relâche la souris il faut faire l'échange et cacher les cases
        if(ccm.getBoard().getSelectedCandy() != null && ccm.getBoard().getSwappedCandy() != null) {
        	ccm.getBoard().swap(ccm.getBoard().getSelectedCandy(), ccm.getBoard().getSwappedCandy());
        }
        //selectedX = selectedY = swappedX = swappedY = -1;
        //repaint();
        ccm.getBoard().setSelectedCandy(null);
    	ccm.getBoard().setSwappedCandy(null);
	}
}
