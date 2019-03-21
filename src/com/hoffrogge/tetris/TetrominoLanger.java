package com.hoffrogge.tetris;

import java.awt.Graphics;

import com.hoffrogge.lehreinheit01.Rechteck;

public class TetrominoLanger extends AllgemeinerTetromino {

	public void zeichnen(Graphics graphics) {

		Rechteck erstesRechteck = new Rechteck(400, 50);
		erstesRechteck.zeichnen(graphics);

		Rechteck zweitesRechteck = new Rechteck(400, 100);
		zweitesRechteck.zeichnen(graphics);

		Rechteck drittesRechteck = new Rechteck(400, 150);
		drittesRechteck.zeichnen(graphics);

		Rechteck viertesRechteck = new Rechteck(400, 200);
		viertesRechteck.zeichnen(graphics);
	}
}