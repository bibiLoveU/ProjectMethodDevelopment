package control;

import java.awt.event.MouseEvent;

public class Mouse implements IDevice{
	
	public Mouse() {
	}

	@Override
	public void mouseMoved(MouseEvent e, CandyCrushMain ccm) {
        // on bouge la souris : récupérer les coordonnées de la deuxième case
        if(ccm.getB().getSelectedCandy() != null) {
            //swappedX = e.getX() / 32;
            //swappedY = e.getY() / 32;
            // si l'échange n'est pas valide, on cache la deuxième case
            //if(!isValidSwap(selectedX, selectedY, swappedX, swappedY)) {
            //    swappedX = swappedY = -1;
            //}
            if(!ccm.getB().isValidSwap(ccm.getB().getSelectedCandy(), ccm.getB().getSwappedCandy())) {
            	ccm.getB().setSelectedCandy(null);
            	ccm.getB().setSwappedCandy(null);
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
        if(ccm.getB().getSelectedCandy() != null && ccm.getB().getSwappedCandy() != null) {
        	ccm.getB().swap(ccm.getB().getSelectedCandy(), ccm.getB().getSwappedCandy());
        }
        //selectedX = selectedY = swappedX = swappedY = -1;
        //repaint();
        ccm.getB().setSelectedCandy(null);
    	ccm.getB().setSwappedCandy(null);
	}
}
