package model;

import java.awt.Color;
import java.awt.Image;
import java.util.Random;

public class Board implements IBoardStrategy {

	private Case[][] cases;

	private boolean[][] marked;
	private int selectedX, selectedY;
	private int swappedX, swappedY;
	private Image buffer;
	private int length;
	private int width;
	public static final Color[] colors = { Color.WHITE, Color.RED, Color.GREEN,
			Color.BLUE, Color.GRAY, Color.PINK, Color.CYAN };;

	public Board() {
		length = 8;
		width = 8;
		cases = new Case[8][8];
		marked = new boolean[8][8];
		selectedX = -1;
		selectedY = -1;
		swappedX = -1;
		swappedY = -1;
		initBoard();

	}

	public Case[][] getCases() {
		return cases;
	}

	public void setCases(Case[][] cases) {
		this.cases = cases;
	}

	public int getSelectedX() {
		return selectedX;
	}

	public void setSelectedX(int selectedX) {
		this.selectedX = selectedX;
	}

	public int getSelectedY() {
		return selectedY;
	}

	public void setSelectedY(int selectedY) {
		this.selectedY = selectedY;
	}

	public int getSwappedX() {
		return swappedX;
	}

	public void setSwappedX(int swappedX) {
		this.swappedX = swappedX;
	}

	public int getSwappedY() {
		return swappedY;
	}

	public void setSwappedY(int swappedY) {
		this.swappedY = swappedY;
	}

	public Image getBuffer() {
		return buffer;
	}

	public void setBuffer(Image buffer) {
		this.buffer = buffer;
	}


	public void swap(int x1, int y1, int x2, int y2) {
		Case tmp = new Case(cases[x1][y1].getCandy().getColor());
		cases[x1][y1].setCandy(cases[x2][y2].getCandy().getColor());
		cases[x2][y2].setCandy(tmp.getCandy().getColor());
	}

	public boolean isValidSwap(int x1, int y1, int x2, int y2) {
		if (x1 == -1 || x2 == -1 || y1 == -1 || y2 == -1)
			return false;
		if (Math.abs(x2 - x1) + Math.abs(y2 - y1) != 1)
			return false;

		if (cases[x1][y1].getCandy().equals(cases[x2][y2].getCandy()))
			return false;

		swap(x1, y1, x2, y2);

		boolean newAlignment = false;
		for (int i = 0; i < 3; i++) {
			newAlignment |= horizontalAligned(x1 - i, y1);
			newAlignment |= horizontalAligned(x2 - i, y2);
			newAlignment |= verticalAligned(x1, y1 - i);
			newAlignment |= verticalAligned(x2, y2 - i);
		}

		swap(x1, y1, x2, y2);
		return newAlignment;
	}

	public boolean fill() {
		Random rand = new Random();
		boolean modified = false;
		for (int i = 0; i < 8; i++) {
			for (int j = 7; j >= 0; j--) {
				if (cases[i][j].isEmpty()) {
					if (j == 0)
						cases[i][j] = new Case(
								1 + rand.nextInt(colors.length - 1));
					else {
						cases[i][j] = new Case(cases[i][j - 1].getCandy()
								.getColor());
						cases[i][j - 1].removeCandy();
					}
					modified = true;
				}
			}
		}
		return modified;
	}

	public boolean removeAlignments() {
		// passe 1 : marquer tous les alignements
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (!cases[i][j].isEmpty() && horizontalAligned(i, j)) {
					marked[i][j] = marked[i + 1][j] = marked[i + 2][j] = true;
				}
				if (!cases[i][j].isEmpty() && verticalAligned(i, j)) {
					marked[i][j] = marked[i][j + 1] = marked[i][j + 2] = true;
				}
			}
		}
		// passe 2 : supprimer les cases marquées
		boolean modified = false;
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (marked[i][j]) {
					cases[i][j].removeCandy();
					marked[i][j] = false;
					modified = true;
				}
			}
		}
		return modified;
	}

	// if(grid[i][j] == grid[i + 1][j] && grid[i][j] == grid[i + 2][j]) return
	// true;
	public boolean horizontalAligned(int i, int j) {
		if (i < 0 || j < 0 || i >= 6 || j >= 8)
			return false;
		if (cases[i][j].getCandy().equals(cases[i + 1][j].getCandy())
				&& cases[i][j].getCandy().equals(cases[i + 2][j].getCandy()))
			return true;
		return false;
	}

	// if(grid[i][j] == grid[i][j + 1] && grid[i][j] == grid[i][j + 2]) return
	// true;
	public boolean verticalAligned(int i, int j) {
		if (i < 0 || j < 0 || i >= 8 || j >= 6)
			return false;
		if (cases[i][j].getCandy().equals(cases[i][j + 1].getCandy())
				&& cases[i][j].getCandy().equals(cases[i][j + 2].getCandy()))
			return true;
		return false;
	}

	private void initBoard() {
		Random rand = new Random();
		for (int i = 0; i < length; i++) {
			for (int j = width - 1; j >= 0; j--) {
				cases[i][j] = new Case(1 + rand.nextInt(colors.length - 1));
			}
		}

	}

}
