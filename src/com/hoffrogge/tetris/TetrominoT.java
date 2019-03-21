package com.hoffrogge.tetris;

import java.awt.Graphics;

import com.hoffrogge.lehreinheit01.Rechteck;

public class TetrominoT extends AllgemeinerTetromino {

	public void zeichnen(Graphics graphics) {

		Rechteck erstesRechteck = new Rechteck(50, 50);
		erstesRechteck.zeichnen(graphics);

		Rechteck zweitesRechteck = new Rechteck(100, 50);
		zweitesRechteck.zeichnen(graphics);

		Rechteck drittesRechteck = new Rechteck(100, 100);
		drittesRechteck.zeichnen(graphics);

		Rechteck viertesRechteck = new Rechteck(150, 50);
		viertesRechteck.zeichnen(graphics);
	}
}