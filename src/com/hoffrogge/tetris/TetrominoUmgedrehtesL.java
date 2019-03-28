package com.hoffrogge.tetris;

import java.awt.Graphics;

import com.hoffrogge.lehreinheit01.Rechteck;

public class TetrominoUmgedrehtesL extends AllgemeinerTetromino {

	private int koordinateY;
	private int koordinateX;

	public TetrominoUmgedrehtesL(int x, int y) {
		koordinateX = x;
		koordinateY = y;
	}

	public void zeichnen(Graphics graphics) {

		Rechteck erstesRechteck = new Rechteck(koordinateX, koordinateY + 2 * Rechteck.getKantenlaenge());
		erstesRechteck.zeichnen(graphics);

		Rechteck zweitesRechteck = new Rechteck(koordinateX + 50, koordinateY + 50);
		zweitesRechteck.zeichnen(graphics);

		Rechteck drittesRechteck = new Rechteck(koordinateX + 50, koordinateY + 100);
		drittesRechteck.zeichnen(graphics);

		Rechteck viertesRechteck = new Rechteck(koordinateX + 50, koordinateY);
		viertesRechteck.zeichnen(graphics);
	}
}