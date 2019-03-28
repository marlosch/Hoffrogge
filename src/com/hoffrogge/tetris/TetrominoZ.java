package com.hoffrogge.tetris;

import java.awt.Graphics;

import com.hoffrogge.lehreinheit01.Rechteck;

public class TetrominoZ extends AllgemeinerTetromino {

	private int koordinateY;
	private int koordinateX;

	public TetrominoZ(int x, int y) {
		koordinateX = x;
		koordinateY = y;
	}

	public void zeichnen(Graphics graphics) {

		Rechteck erstesRechteck = new Rechteck(koordinateX, koordinateY);
		erstesRechteck.zeichnen(graphics);

		Rechteck zweitesRechteck = new Rechteck(koordinateX, koordinateY + erstesRechteck.getKantenlaenge());
		zweitesRechteck.zeichnen(graphics);

		Rechteck drittesRechteck = new Rechteck(koordinateX + erstesRechteck.getKantenlaenge(),
				koordinateY + erstesRechteck.getKantenlaenge());
		drittesRechteck.zeichnen(graphics);

		Rechteck viertesRechteck = new Rechteck(koordinateX + erstesRechteck.getKantenlaenge(),
				koordinateY + 2 * erstesRechteck.getKantenlaenge());
		viertesRechteck.zeichnen(graphics);
	}
}