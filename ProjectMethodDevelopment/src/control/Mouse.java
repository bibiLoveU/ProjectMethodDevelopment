package control;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import view.BoardPanel;
import model.IBoardStrategy;

public class Mouse implements MouseListener, MouseMotionListener {
	
	private BoardPanel parent;
	
	
	public Mouse( BoardPanel parent){
		this.parent=parent;
	}
	
	
	public void mousePressed(MouseEvent e) { 
		System.out.println("je clique"+e.getX() / 32 +"," +e.getY() / 32 );
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
            }
        }
        parent.repaint();
    }
    public void mouseReleased(MouseEvent e) {
    	System.out.println("je relache");
        // lorsque l'on relâche la souris il faut faire l'échange et cacher les cases
        if(parent.getBoard().getSelectedX()  != -1 && parent.getBoard().getSelectedY()  != -1 && parent.getBoard().getSwappedX() != -1 && parent.getBoard().getSwappedY() != -1) {
        	 parent.getBoard().swap(parent.getBoard().getSelectedX() , parent.getBoard().getSelectedY() , parent.getBoard().getSwappedX(), parent.getBoard().getSwappedY());
        }
        parent.getBoard().setSwappedX(-1);
    	parent.getBoard().setSwappedY(-1);
    	parent.getBoard().setSwappedX(-1);
    	parent.getBoard().setSwappedY(-1);
        parent.repaint();
    }

    // non implémentés
    public void mouseClicked(MouseEvent e) { }
    public void mouseEntered(MouseEvent e) { }
    public void mouseExited(MouseEvent e) { }
    public void mouseDragged(MouseEvent e) { mouseMoved(e); }

	
}
