package model;

import java.awt.event.MouseEvent;

import control.CandyCrushMain;

public interface IDevice {

	void mouseReleased(MouseEvent e, CandyCrushMain ccm);
	void mousePressed(MouseEvent e, CandyCrushMain ccm);
	void mouseMoved(MouseEvent e, CandyCrushMain ccm);
}
