package control;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import view.BoardPanel;
import model.IBoardStrategy;

public class Mouse extends MouseAdapter implements IDevice{
	
	private BoardPanel parent;
	
	
	public Mouse( BoardPanel parent){
		this.parent=parent;
	}
	
	
	public void mousePressed(MouseEvent e) { 
       if(parent!=null){
    	   parent.getBoard().setSelectedX( e.getX() / 32);
    	   parent.getBoard().setSelectedX (e.getY() / 32);
           parent.repaint();
       }
        
    }
    public void mouseMoved(MouseEvent e) { 
        // on bouge la souris : récupérer les coordonnées de la deuxième case
        if(parent.getBoard().getSelectedX() != -1 && parent.getBoard().getSelectedY() != -1) {
        	parent.getBoard().setSwappedX ( e.getX() / 32);
        	parent.getBoard().setSwappedY (e.getY() / 32);
            // si l'échange n'est pas valide, on cache la deuxième case
            if(!parent.getBoard().isValidSwap(parent.getBoard().getSelectedX(), parent.getBoard().getSelectedY(), parent.getBoard().getSwappedX(), parent.getBoard().getSwappedY())) {
            	parent.getBoard().setSwappedX(-1);
            	parent.getBoard().setSwappedY(-1);
            	// swappedX = swappedY = -1;
            }
        }
        parent.repaint();
    }
//    public void mouseReleased(MouseEvent e) {
//        // lorsque l'on relâche la souris il faut faire l'échange et cacher les cases
//        if(selectedX != -1 && selectedY != -1 && swappedX != -1 && swappedY != -1) {
//            swap(selectedX, selectedY, swappedX, swappedY);
//        }
//        selectedX = selectedY = swappedX = swappedY = -1;
//        repaint();
//    }

    // non implémentés
    public void mouseClicked(MouseEvent e) { }
    public void mouseEntered(MouseEvent e) { }
    public void mouseExited(MouseEvent e) { }
    public void mouseDragged(MouseEvent e) { mouseMoved(e); }

	
}
